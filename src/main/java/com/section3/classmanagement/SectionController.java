package com.section3.classmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SectionController {

    // Handles relations to the database
    public DataBaseController dataBaseController;
    @FXML
    private Label section1;

    @FXML
    private Label section6;

    @FXML
    private Label section2;

    @FXML
    private Label section7;

    @FXML
    private Label section3;

    @FXML
    private Label section8;

    @FXML
    private Label section4;

    @FXML
    private Label section9;

    @FXML
    private Label section5;

    @FXML
    private Label section10;

    public Stage stage;

    public SectionController(Stage stage, DataBaseController dataBaseController) {
        this.stage = stage;
        this.dataBaseController = dataBaseController;
    }

    public void initSection() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SectionWindow.fxml"));
        fxmlLoader.setController(this);
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        scene.getStylesheets().add(getClass().getResource("/com/section3/classmanagement/SectionWindowCss.css").toExternalForm());
        this.stage.setTitle("Section");
        this.stage.setScene(scene);
        this.stage.show();
    }

}
