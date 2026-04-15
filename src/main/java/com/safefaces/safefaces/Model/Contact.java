package com.safefaces.safefaces.Model;

import java.util.HashMap;

public class Contact {
    private HashMap<String,String> contactList = new HashMap<>();
    private HashMap< String, Role> roles =new HashMap<>();

    public Contact(){

    }

    public void addContact( String name, String phoneNumber, Role role){
        contactList.put(name,phoneNumber);
        roles.put(name,role);


    }
    public void removeContact(String name){
        contactList.remove(name);
        roles.remove(name);
    }
    public void updateContact(String name,String phoneNumber, Role role){
        if(contactList.containsKey(name)){
            contactList.put(name, phoneNumber);
            roles.put(name,role);
        }else{
            System.out.println("The name does not exist" + name);
        }
    }
    public String getPhoneNumber(String name){
        return contactList.get(name);
    }
    public Role getRole(String name){
        return roles.get(name);
    }


    public HashMap<String, Role> getRole() {
        return roles;
    }

    public HashMap<String, String> getAllContactList() {

        return contactList;
    }
}
