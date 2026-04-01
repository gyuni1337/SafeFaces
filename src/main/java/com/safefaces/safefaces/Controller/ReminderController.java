package com.safefaces.safefaces.Controller;

import com.safefaces.safefaces.Model.Reminder;
import com.safefaces.safefaces.Service.ReminderService;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ReminderController {

    private ReminderService reminderService;

    @FXML
    private TextField messageField;

    @FXML
    private TextField descriptionField;

    @FXML
    private DatePicker startDate;

    @FXML
    private DatePicker endDate;

    private int currentUserId = 1;


    public ReminderController(ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    @FXML
    private void handleCreateReminder() {

        Reminder reminder = new Reminder(messageField.getText(), descriptionField.getText(),
                startDate.getValue().atStartOfDay(), endDate.getValue().atStartOfDay(), currentUserId);

        reminderService.createReminder(reminder, currentUserId );

    }
}
