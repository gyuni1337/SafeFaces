package com.safefaces.safefaces.View;

import com.safefaces.safefaces.Controller.UserViewController;
import com.safefaces.safefaces.Model.Role;
import com.safefaces.safefaces.Model.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.imageio.IIOParam;
import java.io.IOException;


public class MainView extends Application {

        @Override
        public void start(Stage stage) throws IOException {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/safefaces/safefaces/UserView.fxml"));
            Parent root = loader.load();
            UserViewController controller = loader.getController();
            controller.setUser(
                    new User(1, "Henry", "oldmanexample.jpg", "henry1", "password", Role.USER)
            );


           // var url = getClass().getResource("/com/safefaces/safefaces/main-view.fxml");
           // FXMLLoader fxmlLoader = new FXMLLoader(url);


            Scene scene = new Scene(root, 400, 4000);
            stage.setTitle("SafeFaces");
            stage.setScene(scene);
            stage.show();
        }

        public static void main (String[]args){
            launch();
        }
}
