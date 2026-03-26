package com.safefaces.safefaces.Controller;

import com.safefaces.safefaces.Model.Contact;
import com.safefaces.safefaces.Model.Role;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.HashMap;

public class MainController {

    @FXML
    private TextField nameField;
    @FXML private TextField phoneField;
    @FXML private Label outputLabel;
    @FXML private ListView<String> contactListView;


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
    protected void handleContacts() {
        HashMap<String,String> contacts = contact.getAllContactList();
        ObservableList<String>items = FXCollections.observableArrayList();
        for(var entry : contacts.entrySet()){
            String name = entry.getKey();
            String phone = entry.getValue();
            Role role =contact.getRole(name);
            String displayText = name + ":" + phone +"("+role + ")";
            items.add(displayText);
        }

       contactListView.setItems(items);
        outputLabel.setText("Contact listed");
    }
}
