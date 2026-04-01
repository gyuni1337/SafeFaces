package com.safefaces.safefaces.Model;

import java.time.LocalDateTime;

public class Reminder {
    private String message;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean completed;
    private boolean recurring;

    private int ownerId;
    private int creatorId; // for caregivers that set reminders for others


    public Reminder(String message, String description, LocalDateTime startTime, LocalDateTime endTime, int ownerId) {
        this.message = message;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.ownerId = ownerId;
    }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public LocalDateTime getEndTime() { return endTime; }
    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }

    public int getCreatorId() { return creatorId; }
    public void setCreatorId(int creatorId) { this.creatorId = creatorId; }

    public int getOwnerId() { return ownerId;}
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }

}
