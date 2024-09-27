#include "User.h"
#include "SmartDevice.h"
#include <iostream>
using namespace std;

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

    // Create an array of SmartDevice objects
    SmartDevice devices[3] = {
        SmartDevice("Living Room Light", "Philips", "Hue"),
        SmartDevice("Speaker", "Boat", "One"),
        SmartDevice("Front Door Lock", "Godrej", "Smart Lock Pro")
    };

    // Interact with the devices in the array
    for (int i = 0; i < 3; i++) {
        devices[i].turnOn();
        devices[i].connectToNetwork();
        devices[i].displayInfo();
        cout << endl;
    }

    // Compare battery levels of two devices
    devices[0].compareBatteryLevel(devices[1]);

    return 0;
}
