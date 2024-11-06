package javafiles.users;

public class Admin extends User {
    
    public Admin(String username, String password, String email) {
        super(username, password, email, true); // Pass true to indicate admin status
    }

    // Override the method for specific admin actions
    @Override
    public void performAction() {
        System.out.println("Admin " + getUsername() + " is managing the system.");
    }

    // Admin-specific method
    public void manageDevices() {
        System.out.println("Admin " + getUsername() + " is managing smart home devices.");
    }

    // Admin-specific method
    public void manageUsers() {
        System.out.println("Admin " + getUsername() + " is managing system users.");
    }
}
