package com.safefaces.safefaces.Controller;

import com.safefaces.safefaces.Model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class UserViewController {

    @FXML
    private Label nameLabel;
    @FXML private ImageView imageView;

    private User activeUser;

    public void setUser(User user) {
        this.activeUser = user;
        updateView();
    }

    private void updateView() {
        nameLabel.setText(activeUser.getName());

        if (activeUser.getImagePath() != null) {
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(activeUser.getImagePath())));
            imageView.setImage(image);
        }
    }
}
