#ifndef USER_H
#define USER_H

#include <string>
using namespace std;

class User {
private:
    string username;
    string password;

public:
    string name;
    int age;
    string role;

    // Constructor
    User(string name, int age, string role);

    // Getters and Setters for private members
    string getUsername();
    string getPassword();
    void setUsername(string username);
    void setPassword(string password);

    // Other member functions
    void displayInfo();
    void changePassword(string newPassword);
    void increaseAge();
    int compareAge(User user);
};

#endif
