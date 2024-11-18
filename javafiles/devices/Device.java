package javafiles.devices;

// abstract class that represents a generic class
public abstract class Device {
    private String name;
    private boolean isOn;

    // static variable to keep track of total number of devices
    public static int deviceCount = 0;

    public Device(){
        name = "Device";
        isOn = false;
        deviceCount++;
    }

    public Device(String name){
        this.name = name;
        this.isOn = false;
        deviceCount++;  // Increment the count whenever a new Device is created.
    }

    // Encapsulation : Getter and Setter Methods for private members
    public boolean isOn(){
        return this.isOn;
    }

    public String getName(){
        return name;
    }

    public void changeName(String name){
        this.name = name;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void turnOn();
    public abstract void turnOff();

    public static int getDeviceCount(){
        return deviceCount;
    }
}
