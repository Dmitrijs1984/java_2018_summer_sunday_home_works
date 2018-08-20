package lesson6.car;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.setManufacturer("vw");
        car.setCurrentSpeed(20);
        car.setMaxSpeed(50);

        while (car.canAccelerate() == true) {
            car.accelerate();
            System.out.println(car.toString());
        }

        while (car.isStopped() == false) {
            car.slowDown();
            System.out.println(car.toString());
        }
    }
}
