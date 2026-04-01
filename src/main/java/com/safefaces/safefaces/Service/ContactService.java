package com.safefaces.safefaces.Service;

import com.safefaces.safefaces.Model.Contact;
import com.safefaces.safefaces.Model.Role;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phone, Role role) {
        contacts.add(new Contact(name, phone, role));
    }

    public void removeContact(String name) {
        contacts.removeIf(c -> c.getName().equals(name));
    }

    public void updateContact(String name, String phone, Role role) {
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                c.setPhone(phone);
                c.setRole(role);
                return;
            }
        }
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public Contact getByName(String name) {
        return contacts.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}