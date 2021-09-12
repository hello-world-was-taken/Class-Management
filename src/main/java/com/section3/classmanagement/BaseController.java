package com.section3.classmanagement;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
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

    // Returns a scene with a drop shadow for UNDECORATED, TRANSPARENT stage.
    public Scene getShadowScene(Parent parent, Scene scene) {
        AnchorPane outerAnchorPane = new AnchorPane();
        outerAnchorPane.getChildren().add( parent );
        outerAnchorPane.setPadding(new Insets(10.0d));
        outerAnchorPane.setBackground( new Background(new BackgroundFill( Color.rgb(0,0,0,0), new CornerRadii(0), new
                Insets(0))));

        parent.setEffect(new DropShadow());
        ((AnchorPane)parent).setBackground( new Background(new BackgroundFill( Color.WHITE, new CornerRadii(0), new Insets(0)
        )));

        scene = new Scene(outerAnchorPane);
        scene.setFill( Color.rgb(0,255,0,0) );
        return scene;
    }
}
