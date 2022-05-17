package homework8.task2_3_4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        Monitor monitor = new Monitor();
        System.out.println(device.toString());
        System.out.println(monitor.toString());
        System.out.println("Monitor hashCode = ");
        System.out.println(device.hashCode());
        System.out.println("device aequals monitor = ");
        System.out.println(device.equals(monitor));
        System.out.println("Device hashCode = ");
        System.out.println(monitor.hashCode());
    }
}
class Device {
    String manufacturer = "Samsung";
    float price = 120;
    String serialNumber = "AB1234567CD";

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer= " + manufacturer +
                ", price= " + price +
                ", serialNumber= " + serialNumber
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (!manufacturer.equals(device.manufacturer)) return false;
        return serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + serialNumber.hashCode();
        return result;
    }
}
class Monitor extends Device{
int resolutionX = 1280;
int resolutionY = 1024;

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: " +
                "manufacturer= " + manufacturer +
                ", price= " + price +
                ", serialNumber= " + serialNumber +
                ", resolutionX= " + resolutionX +
                ", resolutionY= " + resolutionY ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        int result = resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}
class EthernetAdapter extends Device{
 int speed;
 String mac;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed) return false;
        return mac.equals(that.mac);
    }

    @Override
    public int hashCode() {
        int result = speed;
        result = 31 * result + mac.hashCode();
        return result;
    }
}