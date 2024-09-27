package javafiles;

public class Main {
    public static void main(String[] args) {
        User user = new User("Aditya", 20, true);
        user.displayInfo();

        System.out.println(User.getTotalUsers());

        User user2 = new User("Ayush", 20, false);
        user2.displayInfo();

        System.out.println(User.getTotalUsers());

        // automatically deletes garbage value
    }
}
