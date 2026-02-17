package com.healthcare;

public class UserAccount {

    private int id;
    private String username;
    private String password;

    public UserAccount(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "User ID: " + id +
               ", Username: " + username +
               ", Password: " + password;
    }
}
