package com.section3.classmanagement;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class BaseController {
    // Still working on how to implement this class
//    public static void closeStage(Stage stage) {
//        stage.close();
//    }

    private double xOffset = 0;
    private double yOffset = 0;

    // Moves the UNDECORATED stage when user tries to move the stage
    public void moveStage(Parent parent,Stage stage) {

        parent.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        parent.setOnMouseDragged(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });

    }
}
