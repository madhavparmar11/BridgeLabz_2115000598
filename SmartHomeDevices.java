class Device {
    int deviceId;
    boolean status;

    Device(int deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "On" : "Off"));
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(int deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(101, true, 24);
        thermostat.displayStatus();
    }
}
