package com.section3.classmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class LoginWindowController {

    Stage ownerStage;
    String cUsername, cPassword;

    public Stage stage = new Stage();
    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginBtn;

//    public Stage stage;
    // Handles relations to the database
    private DataBaseController databaseController;

    public LoginWindowController(Stage ownerStage, DataBaseController dataBaseController) {
        this.ownerStage = stage;
        this.databaseController = dataBaseController;
    }
    @FXML
    void login(ActionEvent event) throws IOException, SQLException {
        SectionWindowController sectionController = new SectionWindowController(this.stage, this.databaseController);
        sectionController.initSection();
        databaseController.checkCredential();
    }

    public void initLogin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginWindow.fxml"));
        fxmlLoader.setController(this);
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        this.stage.setTitle("Login");
        this.stage.centerOnScreen();
        this.stage.setResizable(false);
        this.stage.setScene(scene);
        this.stage.initModality(Modality.APPLICATION_MODAL);
        this.stage.showAndWait();
        this.stage.initOwner(this.ownerStage);
        // need to address the stages once this stage has been initialized.
    }

}