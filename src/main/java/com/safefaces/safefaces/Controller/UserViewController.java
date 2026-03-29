package com.safefaces.safefaces.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import com.safefaces.safefaces.Model.User;

import java.util.Objects;

public class UserViewController {

    @FXML private Label profileNameLabel;
    @FXML private ImageView profileImage;
    @FXML private VBox contactListBox;

    private User activeUser;

    public void setUser(User user) {
        this.activeUser = user;
        updateProfile();
        loadExampleContacts();
    }

    private void updateProfile() {
        profileNameLabel.setText("Hello, " + activeUser.getName() + "!");

        try {
            Image image = new Image(
                    Objects.requireNonNull(getClass().getResourceAsStream("/com/safefaces/safefaces/images/" + activeUser.getImagePath())));
            profileImage.setImage(image);
        } catch (Exception e) {
            System.out.println("Could not load profile image");
        }
    }

    /* Skapade metoden bara som exempel för demon */
    private void loadExampleContacts() {

        String[][] demo = {
                {"Anna Anderson", "emptyavatar.jpg"},
                {"John Berger", "emptyavatar.jpg"},
                {"Leonore Smith", "emptyavatar.jpg"},
                {"Marie Schwartz", "emptyavatar.jpg"},
                {"Peter Parker", "emptyavatar.jpg"},
                {"Joanne Jo", "emptyavatar.jpg"},
                {"Oscar Nilsen", "emptyavatar.jpg"},
                {"Carl Carlson", "emptyavatar.jpg"},
                {"Dani Do", "emptyavatar.jpg"},
                {"Louis Lane", "emptyavatar.jpg"}
        };

        for (String[] c : demo) {
            HBox row = new HBox(15);
            row.setStyle("-fx-padding: 10; -fx-alignment: center-left;");

            ImageView imageView = new ImageView();
            imageView.setFitWidth(60);
            imageView.setFitHeight(60);
            imageView.setPreserveRatio(true);

            try {
                imageView.setImage(new Image(
                        Objects.requireNonNull(getClass().getResourceAsStream("/com/safefaces/safefaces/images/" + c[1]))));
            } catch (Exception ignored) {}

            Label label = new Label(c[0]);
            label.setStyle("-fx-font-size: 20;");

            row.getChildren().addAll(imageView, label);
            contactListBox.getChildren().add(row);
        }
    }
}
