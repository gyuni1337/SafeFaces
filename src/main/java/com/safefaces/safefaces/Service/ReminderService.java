package com.safefaces.safefaces.Service;

import com.safefaces.safefaces.Model.Reminder;
import com.safefaces.safefaces.Repository.ReminderRepository;

import java.util.List;

public class ReminderService {


    private ReminderRepository reminderRepo;

    public ReminderService(ReminderRepository reminderRepo) {
        this.reminderRepo = reminderRepo;
    }

    public Reminder createReminder(Reminder reminder, int ownerId) {
        reminder.setOwnerId(ownerId);
        return reminderRepo.save(reminder);
    }


    public List<Reminder> getUserReminders(int createdBy) {
        return reminderRepo.findByCreatorId(createdBy);
    }


    // homeView: upcoming/reminders in time span. include at what time to take medications DAILY ( ONLY set by caregiver ) by default;
    // profileView aka Jag view: caregiver at top with call now button. underneath is each medication information like dosage, time to take, etc.
    // contactView: idk maybe see saved contacts and information about them - maybe personal note system

    // required objects:
    // Reminder
    // Contact, must have creatorIDs ( for database specifically only 1 table to pull from )
    // Caregiver extends User





//    REMINDER requiredFunctions:
//    - createReminder(userId, to save to database as ownerId of reminder);
//    - getUserReminders(userID == ownerId);



}
