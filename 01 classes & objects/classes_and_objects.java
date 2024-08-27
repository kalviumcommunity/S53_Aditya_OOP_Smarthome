public class classes_and_objects {
    
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
    }


    public static void main(String[] args) {
        User Aditya = new User("aditya", 20, true);
        Aditya.display_info();
        Aditya.setUsername("adityapourush");
        Aditya.changePassword("<PASSWORD>");
        System.out.println(Aditya.getUsername());
        System.out.println(Aditya.getPassword());
        Aditya.increaseAge();
        Aditya.display_info();
    }
}