#ifndef SMARTDEVICE_H
#define SMARTDEVICE_H

#include <string>
using namespace std;

class SmartDevice {
private:
    string manufacturer;
    string model;

public:
    string name;
    bool isOn;
    bool isConnected;
    int batteryLevel;

    // Constructor
    SmartDevice(string name, string manufacturer, string model);

    // Member functions
    void turnOn();
    void turnOff();
    void connectToNetwork();
    void disconnectFromNetwork();
    void displayInfo();
    void compareBatteryLevel(SmartDevice device);
};

#endif
