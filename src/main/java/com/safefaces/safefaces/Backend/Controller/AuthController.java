package com.safefaces.safefaces.Backend.Controller;

import com.safefaces.safefaces.App.AppState;
import com.safefaces.safefaces.Backend.Model.User;
import com.safefaces.safefaces.Backend.Service.AuthService;

public class AuthController {

    AppState appState;
    public AuthController(AppState state) {
        appState = state;
    }

    public void login(String username, String pin) {
//        User currentUser = AuthService.login(username, pin);

    }
}
