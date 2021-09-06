package com.section3.classmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class LoginController {

    String cUsername, cPassword;

//    public Stage stage = new Stage();
    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginBtn;

    public Stage stage;
    // Handles relations to the database
    private DataBaseController databaseController;

    public LoginController(Stage stage, DataBaseController dataBaseController) {
        this.stage = stage;
        this.databaseController = dataBaseController;
    }
    @FXML
    void login(ActionEvent event) throws IOException, SQLException {
        SectionController sectionController = new SectionController(this.stage, this.databaseController);
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
        this.stage.show();
    }


}