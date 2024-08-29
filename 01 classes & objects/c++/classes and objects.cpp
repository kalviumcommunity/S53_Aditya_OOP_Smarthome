#include <iostream>
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

    // getters and setters for private attributes
    string getUsername() {
        return username;
    }
    string getPassword() {
        return password;
    }
    void setUsername(string username) {
        this->username = username;
    }
    void setPassword(string password) {
        this->password = password;
    }

    // Constructor for public attributes
    User(string name, int age, string role) {
        cout << "Making an object from class User" << endl;
        this->name = name;
        this->age = age;
        this->role = role;
    }

    // member function
    void displayInfo() {
        cout << "User Information:" << endl;
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Role: " << role << endl;
    }

    // member function
    void changePassword(string newPassword) {
        password = newPassword;
    }
    void increaseAge() {
        age++;
    }
};

class SmartDevice {
    private:
        string manufacturer;
        string model;
    public:
        string name;
        bool isOn;
        bool isConnected;
        int batteryLevel;
    
    SmartDevice(string name, string manufacturer, string model) {
        this->name = name;
        this->manufacturer = manufacturer;
        this->model = model;
        this->isOn = false;
        this->isConnected = false;
        this->batteryLevel = 100;
    }
    void turnOn() {
        if(!isOn){
            isOn = true;
        }
        cout << name << " is now turned on." << endl;
    }
    void turnOff() {
        if(isOn){
            isOn = false;
        }
        cout << name << " is now turned off." << endl;
    }

    void connectToNetwork() {
        if(!isConnected){
            isConnected = true;
        }
        cout << name << " is now connected to the network." << endl;
    }
    void disconnectFromNetwork() {
        if(isConnected){
            isConnected = false;
        }
        cout << name << " is now disconnected from the network. " << endl;
    }

    void displayInfo() {
        cout << "Device Information:" << endl;
        cout << "Name: " << name << endl;
        cout << "Manufacturer: " << manufacturer << endl;
        cout << "Model: " << model << endl;
        cout << "Status: " << (isOn ? "On" : "Off") << endl;
        cout << "Battery Level: " << batteryLevel << "%" << endl;
        cout << "Connected to Network: " << (isConnected ? "Yes" : "No") << endl;
    }
};

int main() {
    User Aditya("Aditya Raj Pourush", 20, "Admin");
    Aditya.displayInfo();
    Aditya.increaseAge();
    Aditya.displayInfo();
    cout << "Username: " << Aditya.getUsername() << endl;
    Aditya.setUsername("adityapourush");
    Aditya.setPassword("asdf1234");
    cout << "Username: " << Aditya.getUsername() << endl;
    cout << "Password: " << Aditya.getPassword() << endl;

    SmartDevice Television("Samsung TV", "Samsung", "QN90B");
    Television.turnOn();
    Television.connectToNetwork();
    Television.displayInfo();
    Television.turnOff();
    Television.displayInfo();
    return 0;
}