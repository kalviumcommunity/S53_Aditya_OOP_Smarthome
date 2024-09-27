package javafiles;

public class User {
    private String username;
    private String password;
    public String name;
    public int age;
    public boolean is_admin;

    // Constructor
    public User(String name, int age, boolean is_admin) {
        this.name = name;
        this.age = age;
        this.is_admin = is_admin;
    }

    // Getters and setters for private attributes
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Display info about the user
    public void displayInfo() {
        System.out.println(name + " " + age + " " + (is_admin ? "Admin" : "User"));
    }

    // Other methods
    public void changePassword(String newPassword) {
        password = newPassword;
    }

    public void increaseAge() {
        age += 1;
    }

    public void compareAge(User user) {
        if (this.age > user.age) {
            System.out.println(user.name + " is younger than " + this.name);
        } else if (this.age < user.age) {
            System.out.println(this.name + " is younger than " + user.name);
        } else {
            System.out.println(this.name + " and " + user.name + " are of the same age.");
        }
    }
}
