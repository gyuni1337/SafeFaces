package com.safefaces.safefaces.Repository;

import com.safefaces.safefaces.Model.Reminder;

import java.util.List;

public interface ReminderRepository {
    Reminder save(Reminder reminder);

    List<Reminder> findByCreatorId(int creatorId);
//    List<Reminder> findByOwnerId(int ownerId);
}
