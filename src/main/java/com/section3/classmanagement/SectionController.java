package com.section3.classmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SectionController {

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

    public SectionController(Stage stage) {
        this.stage = stage;
    }

    public void initSection() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SectionWindow.fxml"));
        fxmlLoader.setController(this);
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        this.stage.setTitle("Section");
        this.stage.setScene(scene);
        this.stage.show();
    }

}
