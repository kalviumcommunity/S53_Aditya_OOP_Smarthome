#include "User.h"
#include "SmartDevice.h"
#include <iostream>

using namespace std;

int main() {

    User* user1 = new User("Aditya", 20, "Admin");
    User* user2 = new User("Akshat", 18, "User");

    user1->displayInfo();
    cout << endl;
    user2->displayInfo();
    cout << endl;

    cout << "Total Users: " << User::getTotalUsers() << endl;

    SmartDevice* devices = new SmartDevice[3]{
        SmartDevice("Living Room Light", "Philips", "Hue"),
        SmartDevice("Speaker", "Boat", "One"),
        SmartDevice("Front Door Lock", "Godrej", "Smart Lock Pro"),
    };

    // Interact with the devices in the array
    for (int i = 0; i < 3; i++) {
        devices[i].turnOn();
        devices[i].connectToNetwork();
        devices[i].displayInfo();
        cout << endl;
    }

    cout << "Total Devices: " << SmartDevice::getTotalDevices() << endl;

    delete[] devices;
    delete user1;
    delete user2;

    return 0;
}