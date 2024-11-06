package javafiles.devices;

public class Thermostat extends Device implements SmartDeviceInterface{
    private double currentTemperature;
    private double targetTemperature;

    public Thermostat(String name, double initialTemprature){
        super(name);
        this.currentTemperature = initialTemprature;
        this.targetTemperature = 22.0;
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + " thermostat is turned On.");
        System.out.println("Heating to target temperature: " + targetTemperature + "°C.");
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + " thermostat is turned Off.");
    }

    // Method to set new temprature
    public void setTargetTemprature(double targetTemprature) {
        this.targetTemperature = targetTemprature;
        System.out.println("Target temperature for " + getName() + " set to: " + targetTemprature + "°C.");
    }

    // Method to adjust the current temperature (e.g., simulate real-time changes).
    public void adjustTemperature(double adjustment) {
        currentTemperature += adjustment;
        System.out.println(getName() + " adjusted to: " + currentTemperature + "°C.");
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }
}
