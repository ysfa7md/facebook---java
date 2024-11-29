package com.mycompany.facebook;

public class Auth {

    public void setCookie(String key, String value) {
        // did i set cookie?
    }

    // (Done - tested)
    public void register(String name, String email, String password, String gender, String dateOfBirth) {
        // hash password
        String hashedPassword = String.valueOf(password.hashCode());

        // create user
        User user = new User(name, email, hashedPassword, gender, dateOfBirth);

        // save user
        FileHandler.saveUser(user);

        // set cookie
        setCookie("user", "blabla");
    }

    // (Done - tested)
    public void login(String email, String password) {

        // hash password
        String hashedPassword = String.valueOf(password.hashCode());


        String userSavedPassword = FileHandler.getUserPassword(email);

        if (userSavedPassword != null && userSavedPassword.equals(hashedPassword)) {

            // set cookie
            setCookie("user", "blabla");

        } else {

            // popup message
            System.out.println("Login failed");
        }
    }
}
