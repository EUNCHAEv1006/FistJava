package week03;

public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car();
//        Car car2 = new Car();
//
//        System.out.println(car1); // week03.Car@75b84c92 <= car1의 주소

        Car[] carArray = new Car[3];
        Car car1 = new Car();
        car1.changeGear('P');
        carArray[0] = car1;

        Car car2 = new Car();
        car2.changeGear('N');
        carArray[1] = car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArray[2] = car3;

        for (Car car: carArray) {
            System.out.println("car.gear = " + car.gear);
        }
    }
}
