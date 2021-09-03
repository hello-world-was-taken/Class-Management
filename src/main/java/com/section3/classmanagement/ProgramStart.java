package com.section3.classmanagement;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class ProgramStart extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        LoginController loginController = new LoginController(stage);
        loginController.initLogin();
    }

    public static void main(String[] args) {
        launch();
    }
}