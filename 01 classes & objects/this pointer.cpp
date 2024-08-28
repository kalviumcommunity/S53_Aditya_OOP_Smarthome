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
        // cout << "Making an object from class User" << endl;
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

    int compareAge(User user){
        return this->age > user.age;
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

    void compareBatteryLevel(SmartDevice device){
        if(this->batteryLevel > device.batteryLevel){
            cout << this->name + " have more battery" << endl;
        }
        else if(this->batteryLevel < device.batteryLevel){
            cout << device.name + " have more battery" << endl;
        }
        else {
            cout << "Both have same battery level" << endl;
        }
    }
};

int main() {
    User Aditya("Aditya Raj Pourush", 20, "Admin");  // User 1

    User Akshat("Akshat Raj Piyush", 18, "User");    // User 2

    if(Aditya.compareAge(Akshat)){
        cout << "Aditya is older that Akshat" << endl;
    } else {
        cout << "Aditya is younger than Akshat" << endl;
    }

    SmartDevice Television("Samsung TV", "Samsung", "QN90B");  // Device 1

    SmartDevice AirConditioner("Voltas AC", "VOLTAS", "ACIT56");  // Device 2

    Television.compareBatteryLevel(AirConditioner);

    Television.batteryLevel = 90;
    AirConditioner.batteryLevel = 80;

    Television.compareBatteryLevel(AirConditioner);
    
    return 0;
}


// Output
// Aditya is older that Akshat
// Both have same battery level
// Samsung TV have more battery