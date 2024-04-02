/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyThings;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 *
 * @author Angela
 */
public class ml2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        WebView webView = new WebView();
        webView.getEngine().load("https://www.youtube.com/embed/o4n84M2F4XQ?autoplay=1");

        StackPane root = new StackPane();
        root.getChildren().add(webView);

        Scene scene = new Scene(root, 640, 480);

        primaryStage.setTitle("YouTube Player");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    Timeline timer = new Timeline(
            new KeyFrame(Duration.seconds(90), new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    // Close the current stage (ml2)
                    primaryStage.close();
                    // Open an instance of story.java
                    new story().setVisible(true);
                }
            })
        );
        // Start the timer
        timer.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
