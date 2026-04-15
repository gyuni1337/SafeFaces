package com.safefaces.safefaces.App;

import com.safefaces.safefaces.View.MainView;
import javafx.application.Application;

public class Launcher {
   static void main(String[] args) {
       AppState state = new AppState();
       Application.launch(MainView.class, args);
   }
}
