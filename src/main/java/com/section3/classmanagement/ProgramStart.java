package com.section3.classmanagement;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class ProgramStart extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        DataBaseController dataBaseController = new DataBaseController();
        LoginController loginController = new LoginController(stage, dataBaseController);
        loginController.initLogin();
    }

    public static void main(String[] args) {
        launch();
    }
}