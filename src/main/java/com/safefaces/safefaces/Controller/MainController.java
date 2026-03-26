package com.safefaces.safefaces.Controller;

import com.safefaces.safefaces.Model.Contact;
import com.safefaces.safefaces.Model.Role;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField nameField;
    @FXML private TextField phoneField;
    @FXML private Label outputLabel;

    private Contact contact= new Contact();

    @FXML
    public void initialize(){
        contact.addContact("Lisa", "0701", Role.RELATIVE);
        contact.addContact("Aisha","0702",Role.CAREGIVER);
        contact.addContact("John","0703",Role.RELATIVE);
        contact.addContact("Bart","0704",Role.CAREGIVER);
    }
    @FXML
private void handleAddContact(){
        String name = nameField.getText();
        String phone = phoneField.getText();

        if(name.isEmpty() || phone.isEmpty()){
            outputLabel.setText(" fill in name and phone number please");
            return;
        }
        contact.addContact(name,phone, Role.USER);
        outputLabel.setText( name +" has been registered");
        nameField.clear();
        phoneField.clear();
}



    @FXML
    protected void handleShowLisa() {

        String phone = contact.getPhoneNumber("Lisa");
        Role role = contact.getRole("Lisa");
        outputLabel.setText("Lisa: " + phone +" (" + role + ")");
    }
}
