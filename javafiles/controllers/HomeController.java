package javafiles.controllers;

import javafiles.devices.Device;
import javafiles.users.Admin;
import javafiles.users.RegularUser;
import javafiles.users.User;

import java.util.ArrayList;
import java.util.List;

public class HomeController {
    private List<User> users;
    private List<Device> devices;

    // constructor
    public HomeController() {
        users = new ArrayList<>();
        devices = new ArrayList<>();
    }

    // adding a regular user
    public void addUser(RegularUser user){
        users.add(user);
        System.out.println("User " + user.getUsername() + " added");
    }

    // Add an admin to the system
    public void addAdmin(Admin admin) {
        users.add(admin);
        System.out.println("Admin " + admin.getUsername() + " added.");
    }

    // Promote a regular user to an admin
    public Admin promoteUserToAdmin(RegularUser user) {
        Admin newAdmin = new Admin(user.getUsername(), user.getPassword(), user.getEmail());
        users.remove(user); // Remove the regular user
        users.add(newAdmin); // Add the new admin
        System.out.println("User " + user.getUsername() + " has been promoted to Admin.");
        return newAdmin;
    }

    // Remove a user from the system
    public void removeUser(User user) {
        if (users.remove(user)) {
            System.out.println("User " + user.getUsername() + " removed.");
        } else {
            System.out.println("User " + user.getUsername() + " not found.");
        }
    }

    // Add a device to the system
    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("Device " + device.getName() + " added.");
    }

    // Remove a device from the system
    public void removeDevice(Device device) {
        if (devices.remove(device)) {
            System.out.println("Device " + device.getName() + " removed.");
        } else {
            System.out.println("Device " + device.getName() + " not found.");
        }
    }

    // List all users in the system
    public void listUsers() {
        System.out.println("Listing all users:");
        for (User user : users) {
            user.displayUserDetails();
        }
    }

    // List all devices in the system
    public void listDevices() {
        System.out.println("Listing all devices:");
        for (Device device : devices) {
            System.out.println(device.getName() + " is " + (device.isOn() ? "ON" : "OFF"));
        }
    }
}
