package task_2;

import java.util.Objects;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

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
        return "Monitor:" + " manufacturer = '" + this.getManufacturer() + "', price = " + this.getPrice() +
                ", serialNumber = '" + this.getSerialNumber() +
                "', resolutionX = " + this.resolutionX +
                ", resolutionY = " + this.resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return this.resolutionX == monitor.resolutionX && this.resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionX, resolutionY);
    }
}
