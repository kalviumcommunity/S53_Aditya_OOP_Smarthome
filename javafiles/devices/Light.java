package javafiles.devices;

public class Light extends Device implements SmartDeviceInterface{
    private int brightness;

    public Light(String name){
        super(name); // calling constructor of the super class(parent class) from a subclass
        this.brightness = 50; // default brightness
    }
    @Override
    public void turnOn() {
        System.out.println(getName() + "light is turned On.");
        this.brightness = 100;
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + "light is turned Off.");
    }

    // Polymorphism: Method Overloading for setting Brightness
    public void setBrightness(int brightness){
        this.brightness = brightness;
        System.out.println(getName() + " set to brightness " + brightness);
    }

    public void showBrightness() {
        System.out.println(getName() + " brightness: " + brightness);
    }

    public void setBrightness(String mode){
        switch(mode.toLowerCase()){
            case "dim":
                this.brightness = 30;
                break;
            case "bright":
                this.brightness = 100;
                break;
            default:
                this.brightness = 50;
        }
        System.out.println(getName() + " set to brightness " + mode);
    }
}
