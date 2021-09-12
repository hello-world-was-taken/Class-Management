package com.section3.classmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SectionWindowController extends BaseController {

    // Handles relations to the database
    public DataBaseController dataBaseController;

    // might be a good idea to put these sections in an ArrayList
    @FXML
    private Button section1;

    @FXML
    private Button section6;

    @FXML
    private Button section2;

    @FXML
    private Button section7;

    @FXML
    private Button section3;

    @FXML
    private Button section8;

    @FXML
    private Button section4;

    @FXML
    private Button section9;

    @FXML
    private Button section5;

    @FXML
    private Button section10;

    public Stage stage;

    // Initializes the section window
    public void initSection() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SectionWindow.fxml"));
        fxmlLoader.setController(this);
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent); // no need to create this scene but for some styles.
        scene.getStylesheets().add(getClass().getResource("/com/section3/classmanagement/SectionWindowCss.css").toExternalForm());
        this.stage.setTitle("Section");
        this.stage.setScene(getShadowScene(parent, scene));
        this.stage.show();
        moveStage(parent, this.stage);
    }

    public SectionWindowController(Stage stage, DataBaseController dataBaseController) {
        this.stage = stage;
        this.dataBaseController = dataBaseController;
    }

    // Handle actions taken when the different sections are pressed.
    @FXML
    void sectionBtn(ActionEvent event) throws IOException{
        ScheduleWindowController scheduleController = new ScheduleWindowController(stage, dataBaseController);
        scheduleController.initSchedule();
    }

    // Closes the current stage
    @FXML
    void closeStage(ActionEvent event) {
        this.stage.close();
    }

}
