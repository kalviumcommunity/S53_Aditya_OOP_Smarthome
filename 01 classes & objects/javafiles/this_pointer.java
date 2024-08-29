package javafiles;
public class this_pointer {

    public static class User{
        String username;
        String Password;
    
        public String name;
        public int age;
        public boolean is_admin;
    
        String getUsername(){
            return username;
        }
        String getPassword(){
            return Password;
        }
        void setUsername(String username){
            this.username = username;
        }
        void setPassword(String password){
            this.Password = password;
        }
    
        public User(String name, int age, boolean is_admin){
            this.name = name;
            this.age = age;
            this.is_admin = is_admin;
        }
    
        void display_info(){
            System.out.println(name + " " + age + " " + is_admin);
        }
    
        void changePassword(String newPassword){
            Password = newPassword;
        }
        void increaseAge(){
            age += 1;
        }

        void compareAge(User user){
            if(this.age > user.age){
                System.out.println(user.name + " is younger " + this.name);
            }
            else if(this.age < user.age){
                System.out.println(this.name + " is younger " + user.name);
            }
            else{
                System.out.println(this.name + " and " + user.name + " are of same age.");
            }
        }
    }
    public static void main(String[] args) {
        User Aditya = new User("Aditya Raj", 20, true);

        User Akshat = new User("Akshat", 18, false);

        Aditya.compareAge(Akshat);
    }
}

// output
// Akshat is younger Aditya Raj