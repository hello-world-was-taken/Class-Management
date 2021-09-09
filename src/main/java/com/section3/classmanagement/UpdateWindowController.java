package com.section3.classmanagement;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class UpdateWindowController {

    public DataBaseController databaseController;
    public Stage stage;
    @FXML // fx:id="dayComboBox"
    private ComboBox<String> dayComboBox; // Value injected by FXMLLoader

    @FXML // fx:id="startHourComboBox"
    private ComboBox<Integer> startHourComboBox; // Value injected by FXMLLoader

    @FXML // fx:id="startMinComboBox"
    private ComboBox<Integer> startMinComboBox; // Value injected by FXMLLoader

    @FXML // fx:id="EndHourComboBox"
    private ComboBox<Integer> EndHourComboBox; // Value injected by FXMLLoader

    @FXML // fx:id="endMinComboBox"
    private ComboBox<Integer> endMinComboBox; // Value injected by FXMLLoader

    @FXML // fx:id="commitBtn"
    private Button commitBtn; // Value injected by FXMLLoader

    public UpdateWindowController(Stage stage, DataBaseController dataBaseController) {
        this.stage = stage;
        this.databaseController = dataBaseController;
    }

    public void initUpdateWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UpdateWindow.fxml"));
        fxmlLoader.setController(this);
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        scene.getStylesheets().add(getClass().getResource(
                "/com/section3/classmanagement/SectionWindowCss.css").toExternalForm());
        this.stage.setTitle("Section");
        this.stage.setScene(scene);
        this.stage.show();
    }

    // Handle actions related to the commit button
    @FXML
    void commitBtn() {
        this.stage.close();
    }


}
