#include "User.h"
#include <iostream>

User::User(string name, int age, string role) {
    this->name = name;
    this->age = age;
    this->role = role;
    totalUsers++;
}

string User::getUsername() {
    return username;
}

string User::getPassword() {
    return password;
}

void User::setUsername(string username) {
    this->username = username;
}

void User::setPassword(string password) {
    this->password = password;
}

void User::displayInfo() {
    cout << "User Information:" << endl;
    cout << "Name: " << name << endl;
    cout << "Age: " << age << endl;
    cout << "Role: " << role << endl;
}

void User::changePassword(string newPassword) {
    password = newPassword;
}

void User::increaseAge() {
    age++;
}

int User::compareAge(User user) {
    return this->age > user.age;
}

int User::getTotalUsers(){
    return totalUsers;
}

int User::totalUsers = 0;