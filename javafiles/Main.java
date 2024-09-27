package javafiles;

public class Main {
    public static void main(String[] args) {
        // Creating User objects
        User Aditya = new User("Aditya Raj", 20, true);
        User Akshat = new User("Akshat", 18, false);

        // Comparing age between two users
        Aditya.compareAge(Akshat);

        User users[] = new User[3];

        users[0] = new User("Aditya", 20, true);
        users[1] = new User("Addarsh", 19, false);
        users[2] = new User("Ankit", 19, false);

        // Usage of array of objects
        System.out.println("Displaying users data: ");
        for(User user : users){
            user.displayInfo();
        }

        // Modifying data via array
        users[1].increaseAge();

        users[1].displayInfo();
    }
}
