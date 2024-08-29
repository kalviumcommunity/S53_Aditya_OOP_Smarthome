package javafiles;
import javafiles.classes_and_objects.User;

class array_of_objects {

    public static void main(String[] args) {

        User users[] = new User[3];

        users[0] = new User("Aditya", 20, true);
        users[1] = new User("Addarsh", 19, false);
        users[2] = new User("Ankit", 19, false);

        // Usage of array of objects
        System.out.println("Displaying users data: ");
        for(User user : users){
            user.display_info();
        }

        // Modifying data via array
        users[1].increaseAge();

        users[1].display_info();
    }
}