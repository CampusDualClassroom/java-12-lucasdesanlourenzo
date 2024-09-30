package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", "Gasolina");


        myCar.showDetails();


        myCar.start();


        myCar.accelerate();
        myCar.accelerate();


        myCar.turnAngleOfWheels(30);


        myCar.brake();


        myCar.setReverse(true);


        myCar.brake();
        myCar.brake();
        myCar.setReverse(true);


        myCar.showDetails();


        myCar.stop();

    }

}