package javafiles.controllers;

// DeviceController.java
import javafiles.devices.Device;
import javafiles.devices.Light;
import javafiles.devices.SecurityCamera;
import javafiles.devices.Thermostat;

public class DeviceController {

    // Turn a device on
    public void turnOnDevice(javafiles.devices.Device device) {
        device.turnOn();
        System.out.println(device.getName() + " turned ON.");
    }

    // Turn a device off
    public void turnOffDevice(Device device) {
        device.turnOff();
        System.out.println(device.getName() + " turned OFF.");
    }

    // Adjust thermostat temperature
    public void adjustThermostat(Thermostat thermostat, double temperature) {
        thermostat.setTargetTemprature(temperature);
        System.out.println("Thermostat set to " + temperature + "°C.");
    }

    // Adjust light brightness
    public void adjustLightBrightness(Light light, int brightness) {
        light.setBrightness(brightness);
        System.out.println("Light brightness set to " + brightness + "%.");
    }

    // Turn on/off security camera recording
    public void controlCameraRecording(SecurityCamera camera, boolean record) {
        if (record) {
            camera.turnOn();
            System.out.println("Security camera recording started.");
        } else {
            camera.turnOff();
            System.out.println("Security camera recording stopped.");
        }
    }

    // Check device status
    public void checkDeviceStatus(Device device) {
        System.out.println(device.getName() + " is " + (device.isOn() ? "ON" : "OFF"));
    }
}

