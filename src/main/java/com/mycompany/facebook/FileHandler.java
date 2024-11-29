package com.mycompany.facebook;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class FileHandler {

    // ------------------ Create ------------------
    
    // ------ User ------

    // (Done - tested)
    public static void saveUser(User user) {
        try (FileWriter writer = new FileWriter("users.txt", true)) {
            writer.write(user.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

    // ------------------ Read ------------------
    public static List<User> getAllDataFor(String fileName) {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                User user = new User(line);
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static User getUserByEmail(String email) {
        List<User> users = getAllDataFor("users.txt");
        for (User user : users) {
            if (user.email.equals(email)) {
                return user;
            }
        }
        return null;
    }

    public static String getUserPassword(String email) {
        User user = getUserByEmail(email);
        return user.password;
    }

    // ------------------ Update ------------------
    public static void updateUser(User user) {
        // logic to update user
        List<User> users = getAllDataFor("users.txt");
        for (User u : users) {
            if (u.email.equals(user.email)) {
                // update values here

            }
        }
    }

    // ------------------ Delete ------------------
    public static void deleteUser(String email) {
        List<User> users = getAllDataFor("users.txt");
        for (User u : users) {
            if (u.email.equals(email)) {
                // delete user
            }
        }
    }
    
}
