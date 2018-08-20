package lesson6.car;

public class Car {
    String manufacturer;
    String model;
    String color;
    int maxSpeed;
    int currentSpeed;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void accelerate() {
        if (canAccelerate() == true) {
            currentSpeed++;
        } else {
            System.out.println("can't accelerate more");
        }
    }

    public void slowDown() {
        if (isStopped() == false) {
            currentSpeed--;
        } else {
            System.out.println("can't slowDown more");
        }
    }

    public boolean canAccelerate() {
        if (currentSpeed >= maxSpeed) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isStopped() {
        if (currentSpeed == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDriving() {
        if (currentSpeed > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

}
