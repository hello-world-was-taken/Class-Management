package com.section3.classmanagement;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.SQLException;

public class ProgramStart extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        DataBaseController dataBaseController = new DataBaseController();
        SectionWindowController sectionController = new SectionWindowController(stage, dataBaseController);
        sectionController.initSection();
//        LoginWindowController loginWindowController = new LoginWindowController(stage, dataBaseController);
//        loginWindowController.initLogin();
    }

    public static void main(String[] args) {
        launch();
    }
}