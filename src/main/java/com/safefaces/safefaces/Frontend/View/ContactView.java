package com.safefaces.safefaces.Frontend.View;
 import javafx.fxml.FXMLLoader;
 import javafx.scene.Parent;
 import java.io.IOException;

public class ContactView {

    public Parent getView() throws IOException{
        FXMLLoader loader = new FXMLLoader( getClass().getResource("com/safefaces/safefaces/View/ContactView.java")
        );
        return loader.load();
    }
}
