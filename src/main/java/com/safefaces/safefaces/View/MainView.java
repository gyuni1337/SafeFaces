package com.safefaces.safefaces.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MainView extends Application {

        @Override
        public void start(Stage stage) throws IOException {
            var url = getClass().getResource("/com/safefaces/safefaces/main-view.fxml");
            System.out.println(" Path " +url);
            FXMLLoader fxmlLoader = new FXMLLoader(url);

            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("SafeFaces");
            stage.setScene(scene);
            stage.show();
        }

        public static void main (String[]args){
            launch();
        }
}
