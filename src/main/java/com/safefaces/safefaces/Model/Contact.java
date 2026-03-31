package com.safefaces.safefaces.Model;

public class Contact {
    private String name;
    private String phone;
    private Role role;

    public Contact(String name, String phone, Role role) {
        this.name = name;
        this.phone = phone;
        this.role = role;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public Role getRole() { return role; }

    public void setPhone(String phone) { this.phone = phone; }
    public void setRole(Role role) { this.role = role; }
}
