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
import javafx.stage.StageStyle;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.NumberFormat;

public class LoginWindowController extends BaseController{

    // The owner Stage is used to create a modality with the stage initialized prior to it.
    private final Stage ownerStage = null;
    String cUsername, cPassword;

    // The new here is used to create the new window for the login and gets closed once the verification is complete
    private Stage stage = null;
    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginBtn;

    // Handles relations to the database
    private DataBaseController databaseController = null;

    // Initializes the login window

    // Here the input stage is a newly initialized stage (from the ScheduleWindowController)
    public LoginWindowController(Stage stage, DataBaseController dataBaseController) {
//        this.ownerStage = ownerStage;
        this.stage = stage;
        this.stage.initStyle(StageStyle.UNDECORATED);
        this.stage.initStyle(StageStyle.TRANSPARENT);
        this.databaseController = dataBaseController;
    }

    public void initLogin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginWindow.fxml"));
        fxmlLoader.setController(this);
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent); // no need to create this scene but for some styles.
        this.stage.setTitle("Login");
//        this.stage.centerOnScreen();  // the name is misleading and doesn't work as you might imagine
        this.stage.setResizable(false);
        this.stage.setScene(getShadowScene(parent, scene));
        this.stage.initModality(Modality.APPLICATION_MODAL);
        this.stage.initOwner(this.ownerStage); // Can't be set an owner once the stage has been set visible
        this.stage.showAndWait();
    }

    @FXML
    void login(ActionEvent event){
        System.out.println("The credential is checked and the login window is closed");
        this.stage.close();
        try {
            databaseController.checkCredential();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Closes the current stage
    @FXML
    void closeStage(ActionEvent event) {
        this.stage.close();
    }

}