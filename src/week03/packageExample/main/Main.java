package week03.packageExample.main;
import week03.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        week03.packageExample.pk2.Car pkCar = new week03.packageExample.pk2.Car();
        car.horn();
        pkCar.horn();
    }
}
