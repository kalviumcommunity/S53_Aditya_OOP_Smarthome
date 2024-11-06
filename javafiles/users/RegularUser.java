package javafiles.users;

// RegularUser.java
public class RegularUser extends User {

    public RegularUser(String username, String password, String email) {
        super(username, password, email, false); // Pass false to indicate non-admin status
    }

    // Override the performAction method for regular user-specific behavior
    @Override
    public void performAction() {
        System.out.println("User " + getUsername() + " is interacting with the system.");
    }

    // Regular user-specific method to control a specific device
    public void controlDevice(String deviceName) {
        System.out.println("User " + getUsername() + " is controlling device: " + deviceName);
    }
}

