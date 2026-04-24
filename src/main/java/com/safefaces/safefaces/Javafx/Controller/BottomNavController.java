package com.safefaces.safefaces.Javafx.Controller;

import javafx.fxml.FXML;

public class BottomNavController {

    @FXML
    private void goHome() {
        System.out.println("home");
    }

    @FXML
    private void goContacts() {
        System.out.println("contacts");
    }

    @FXML
    private void goUser() {
        System.out.println("user");
    }
}
