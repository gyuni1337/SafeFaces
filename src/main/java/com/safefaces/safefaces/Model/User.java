package com.safefaces.safefaces.Model;

public class User {
    private int userID;
    private String name;
    private String imagePath;
    private String username;
    private String password;
    private Role role;

    public User(int userID, String name, String imagePath,
                String username, String password, Role role) {
        this.userID = userID;
        this.name = name;
        this.imagePath = imagePath;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getUserID() {
        return userID;
    }
    public String getName() {
        return name;
    }
    public String getImagePath() {
        return imagePath;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public Role getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(Role role) {
        this.role = role;
    }
}
