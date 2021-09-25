package com.section3.classmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ScheduleWindowController extends BaseController{

    public DataBaseController dataBaseController;

    @FXML
    private Button monday0;

    @FXML
    private Button monday1;

    @FXML
    private Button monday2;

    @FXML
    private Button monday3;

    @FXML
    private Button tuesday0;

    @FXML
    private Button tuesday1;

    @FXML
    private Button tuesday2;

    @FXML
    private Button tuesday3;

    @FXML
    private Button wednesday0;

    @FXML
    private Button wednesday1;

    @FXML
    private Button wednesday2;

    @FXML
    private Button wednesday3;

    @FXML
    private Button thursday0;

    @FXML
    private Button thursday1;

    @FXML
    private Button thursday2;

    @FXML
    private Button thursday3;

    @FXML
    private Button firday0;

    @FXML
    private Button firday1;

    @FXML
    private Button firday2;

    @FXML
    private Button firday3;

    // I don't see the use for this btn yet. Might get deleted.
    @FXML
    private Button editBtn;

    // back button for the schedule window
    @FXML
    private Button backBtn;

    public Stage stage;

    public ScheduleWindowController(Stage stage, DataBaseController dataBaseController) {
        this.stage = stage;
        this.dataBaseController = dataBaseController;
    }

    // Initializes the schedule window
    public void initSchedule() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ScheduleWindow.fxml"));
        ScheduleWindowController scheduleController;
        fxmlLoader.setController(this);
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        this.stage.setTitle("Schedule");
        this.stage.setScene(getShadowScene(parent, scene));
        this.stage.show();
        moveStage(parent, stage);
    }

    // handles back button when pressed by going back to the section window.
    @FXML
    void goBack() throws IOException {
        SectionWindowController sectionController = new SectionWindowController(stage, dataBaseController);
        sectionController.initSection();
    }

    // Checks different SQL related things in order to be able to edit the schedule
    @FXML
    void editSchedule() throws IOException {
        LoginWindowController loginWindowController = new LoginWindowController(new Stage(),dataBaseController);
        loginWindowController.initLogin();
    }

    // Handle actions related to the schedule buttons
    // Don't forget to use the action events to get the source and update it accordingly
    @FXML
    void scheduleBtn(ActionEvent event) throws  IOException{
        UpdateWindowController updateWindowController = new UpdateWindowController(new Stage(), this.dataBaseController);
        updateWindowController.initUpdateWindow();
    }

    // Closes the current stage
    @FXML
    void closeStage(ActionEvent event) {
        this.stage.close();
    }

}



