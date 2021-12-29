package ClassTest.Car01;

public class Car {
    String color;
    String engine;
    int doorNumber;

}

class CarTest {

    static void changeDoor(Car car2, int doorNumberParametr) {
        car2.doorNumber = doorNumberParametr;
    }

    static void changeColor(Car car1, Car car2) {
        String temp = car2.color;
        car2.color = car1.color;
        car1.color = temp;
    }

    public static void main(String[] args) {
        Car car1 = new Car ();
        car1.color = "red";
        car1.engine = "v4";
        car1.doorNumber = 3;
        Car car2 = new Car ();
        car2.color = "black";
        car2.engine = "v9";
        car2.doorNumber = 1;


        System.out.println(car1.color + " " + car2.color);
        changeColor (car1, car2);
        System.out.println(car1.color + " " + car2.color);

        System.out.println();

        System.out.println(car2.doorNumber);
        changeDoor(car2, 9);
        System.out.println(car2.doorNumber);

    }
}