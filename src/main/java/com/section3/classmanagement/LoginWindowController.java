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
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class LoginWindowController {

    // The ownerStage is used to keep track of the owners stage in order to change the scene once the credentials are
    // verified.
    private Stage ownerStage;
    String cUsername, cPassword;

    // The new here is used to create the new window for the login and gets closed once the verification is complete
    private Stage stage;
    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginBtn;

    // Handles relations to the database
    private DataBaseController databaseController;

    // Here we used ownerStage instead of 'stage' to remind programmers that the input stage is the owner of the
    // login window that pops and acts as a modal. And the one named 'stage' is the stage the login is being displayed on.
    public LoginWindowController(Stage ownerStage, Stage stage, DataBaseController dataBaseController) {
        this.ownerStage = ownerStage;
        this.stage = stage;
        this.databaseController = dataBaseController;
    }
    @FXML
    void login(ActionEvent event) throws IOException, SQLException {
//        SectionWindowController sectionController = new SectionWindowController(this.ownerStage, this.databaseController);
//        sectionController.initSection();
        System.out.println("The credential is checked and the login window is closed");
        this.stage.close();
        //        databaseController.checkCredential();
    }

    public void initLogin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginWindow.fxml"));
        fxmlLoader.setController(this);
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        this.stage.setTitle("Login");
//        this.stage.centerOnScreen();  // the name is misleading and doesn't work as you might imagine
        this.stage.setResizable(false);
        this.stage.setScene(scene);
        this.stage.initModality(Modality.APPLICATION_MODAL);
        this.stage.showAndWait();
        this.stage.initOwner(this.ownerStage);
        // need to address the stages once this stage has been initialized.
    }

}