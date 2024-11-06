package javafiles.users;

public abstract class User {
    private String username;
    private String password;
    private String email;
    private boolean isAdmin;

    public User(String username, String password, String email, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isAdmin = isAdmin;
    }

    // Encapsulation: Getters and Setters for the properties
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    // Abstract method to be implemented by subclasses (polymorphism)
    public abstract void performAction();

    // Method to display user details
    public void displayUserDetails() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Role: " + (isAdmin ? "Admin" : "Regular User"));
    }
}


// package javafiles.users;

// public class User {

//     private static int totalUsers = 0;

//     private String username;
//     private String password;
//     public String name;
//     public int age;
//     public boolean is_admin;

//     // Constructor
//     public User(String name, int age, boolean is_admin) {
//         this.name = name;
//         this.age = age;
//         this.is_admin = is_admin;
//         totalUsers++;
//     }

//     // Getters and setters for private attributes
//     public String getUsername() {
//         return username;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public void setUsername(String username) {
//         this.username = username;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }

//     // Display info about the user
//     public void displayInfo() {
//         System.out.println(name + " " + age + " " + (is_admin ? "Admin" : "User"));
//     }

//     // Other methods
//     public void changePassword(String newPassword) {
//         password = newPassword;
//     }

//     public void increaseAge() {
//         age += 1;
//     }

//     public void compareAge(User user) {
//         if (this.age > user.age) {
//             System.out.println(user.name + " is younger than " + this.name);
//         } else if (this.age < user.age) {
//             System.out.println(this.name + " is younger than " + user.name);
//         } else {
//             System.out.println(this.name + " and " + user.name + " are of the same age.");
//         }
//     }

//     public static int getTotalUsers() {
//         return totalUsers;
//     }
// }
