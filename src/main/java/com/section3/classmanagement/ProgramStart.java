package com.section3.classmanagement;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class ProgramStart extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        DataBaseController dataBaseController = new DataBaseController();
//        LoginWindowController loginController = new LoginWindowController(stage, dataBaseController);
//        loginController.initLogin();
//        UpdateWindow updateWindow = new UpdateWindow(stage, dataBaseController);
//        updateWindow.initUpdateWindow();
//        ScheduleController scheduleController = new ScheduleController(stage, dataBaseController);
//        scheduleController.initSchedule();
        SectionWindowController sectionController = new SectionWindowController(stage, dataBaseController);
        sectionController.initSection();
    }

    public static void main(String[] args) {
        launch();
    }
}