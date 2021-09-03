package com.section3.classmanagement;

import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class ScheduleController {

    @FXML
    private Label monday0;

    @FXML
    private Label monday1;

    @FXML
    private Label monday2;

    @FXML
    private Label monday3;

    @FXML
    private Label tuesday0;

    @FXML
    private Label tuesday1;

    @FXML
    private Label tuesday2;

    @FXML
    private Label tuesday3;

    @FXML
    private Label wed0;

    @FXML
    private Label wed1;

    @FXML
    private Label wed2;

    @FXML
    private Label wed3;

    @FXML
    private Label thursday0;

    @FXML
    private Label thursday1;

    @FXML
    private Label thursday2;

    @FXML
    private Label thursday3;

    @FXML
    private Label fri0;

    @FXML
    private Label fri1;

    @FXML
    private Label fri2;

    @FXML
    private Label fri3;

    public Stage stage;
    public ScheduleController(Stage stage) {
        this.stage = stage;
    }

    public void initSchedule() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ScheduleWindow.fxml"));
        fxmlLoader.setController(this);
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        this.stage.setTitle("Schedule");
//         Centering the stage
//        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
//        this.stage.setX((primScreenBounds.getWidth() - this.stage.getScene().getWidth()) / 2);
//        this.stage.setY((primScreenBounds.getHeight() - this.stage.getScene().getHeight()) / 2);

        this.stage.setScene(scene);
        this.stage.show();
    }

}



