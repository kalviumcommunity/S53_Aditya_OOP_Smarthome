package javafiles.devices;

public class SecurityCamera extends Device implements SmartDeviceInterface {
    private boolean isRecording;

    public SecurityCamera(String name) {
        super(name);
        this.isRecording = false;
    }

    @Override
    public void turnOn() {
        isRecording = true;
        System.out.println(getName() + " security camera is turned on now.");
    }

    @Override
    public void turnOff() {
        isRecording = false;
        System.out.println(getName() + " security camera is turned off now.");
        System.out.println(getName() + " has stopped recording.");
    }

    // method to check if recording
    public boolean isRecording() {
        return isRecording;
    }

    // Method to take a snapshot
    public void takeSnapshot() {
        if(isRecording){
            System.out.println(getName() + " took a snapshot.");
        } else {
            System.out.println(getName() + " cannot take a snapshot. The camera is off.");
        }
    }
}
