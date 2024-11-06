package javafiles;

import javafiles.controllers.*;
import javafiles.devices.*;
import javafiles.users.*;

public class Main {
        public static void main(String[] args) {
            System.out.println("=== Smart Home System Initialization ===\n");

            // Initialize Controllers
            HomeController homeController = new HomeController();
            DeviceController deviceController = new DeviceController();

            // Create users (both admin and regular)
            Admin admin = new Admin("Aditya", "admin123", "aditya@smarthome.com");
            RegularUser user = new RegularUser("Akshat", "user123", "akshat@smarthome.com");

            // Add users to the system using HomeController
            System.out.println("--- Adding Users to System ---");
            homeController.addAdmin(admin);
            homeController.addUser(user);
            homeController.listUsers();

            // Create different types of devices
            Light livingRoomLight = new Light("Living Room Light");
            Thermostat mainThermostat = new Thermostat("Main Floor Thermostat", 20.0);
            SecurityCamera frontDoorCamera = new SecurityCamera("Front Door Security Camera");

            // Add devices to the system using HomeController
            System.out.println("\n--- Adding Devices to System ---");
            homeController.addDevice(livingRoomLight);
            homeController.addDevice(mainThermostat);
            homeController.addDevice(frontDoorCamera);
            homeController.listDevices();

            // Demonstrate admin capabilities
            System.out.println("\n--- Admin Operations ---");
            admin.performAction();
            admin.manageDevices();
            admin.manageUsers();

            // Demonstrate regular user capabilities
            System.out.println("\n--- Regular User Operations ---");
            user.performAction();
            user.controlDevice("Living Room Light");

            // Demonstrate device operations using DeviceController
            System.out.println("\n--- Device Controller Operations ---");
        
            // Light operations
            System.out.println("\nLight Operations:");
            deviceController.turnOnDevice(livingRoomLight);
            deviceController.adjustLightBrightness(livingRoomLight, 75);
            deviceController.checkDeviceStatus(livingRoomLight);
            deviceController.turnOffDevice(livingRoomLight);

            // Thermostat operations
            System.out.println("\nThermostat Operations:");
            deviceController.turnOnDevice(mainThermostat);
            deviceController.adjustThermostat(mainThermostat, 24.5);
            deviceController.checkDeviceStatus(mainThermostat);
            deviceController.turnOffDevice(mainThermostat);

            // Security Camera operations
            System.out.println("\nSecurity Camera Operations:");
            deviceController.controlCameraRecording(frontDoorCamera, true);
            deviceController.checkDeviceStatus(frontDoorCamera);
            deviceController.controlCameraRecording(frontDoorCamera, false);

            // Demonstrate user management
            System.out.println("\n--- User Management Operations ---");
            homeController.promoteUserToAdmin(user);
            homeController.listUsers();

            // Remove a device and user
            System.out.println("\n--- Removal Operations ---");
            homeController.removeDevice(livingRoomLight);
            homeController.removeUser(admin);
        
            // Final system status
            System.out.println("\n--- Final System Status ---");
            homeController.listDevices();
            homeController.listUsers();
            System.out.println("Total devices in the system: " + Device.getDeviceCount());
        }
}