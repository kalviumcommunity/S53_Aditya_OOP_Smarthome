#include "SmartDevice.h"
#include <iostream>

SmartDevice::SmartDevice(string name, string manufacturer, string model) {
    this->name = name;
    this->manufacturer = manufacturer;
    this->model = model;
    this->isOn = false;
    this->isConnected = false;
    this->batteryLevel = 100;
}

void SmartDevice::turnOn() {
    if (!isOn) {
        isOn = true;
    }
    cout << name << " is now turned on." << endl;
}

void SmartDevice::turnOff() {
    if (isOn) {
        isOn = false;
    }
    cout << name << " is now turned off." << endl;
}

void SmartDevice::connectToNetwork() {
    if (!isConnected) {
        isConnected = true;
    }
    cout << name << " is now connected to the network." << endl;
}

void SmartDevice::disconnectFromNetwork() {
    if (isConnected) {
        isConnected = false;
    }
    cout << name << " is now disconnected from the network." << endl;
}

void SmartDevice::displayInfo() {
    cout << "Device Information:" << endl;
    cout << "Name: " << name << endl;
    cout << "Manufacturer: " << manufacturer << endl;
    cout << "Model: " << model << endl;
    cout << "Status: " << (isOn ? "On" : "Off") << endl;
    cout << "Battery Level: " << batteryLevel << "%" << endl;
    cout << "Connected to Network: " << (isConnected ? "Yes" : "No") << endl;
}

void SmartDevice::compareBatteryLevel(SmartDevice device) {
    if (this->batteryLevel > device.batteryLevel) {
        cout << this->name + " has more battery" << endl;
    } else if (this->batteryLevel < device.batteryLevel) {
        cout << device.name + " has more battery" << endl;
    } else {
        cout << "Both have the same battery level" << endl;
    }
}
