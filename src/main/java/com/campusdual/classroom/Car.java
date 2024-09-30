package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer;
    public int tachometer;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){

    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void accelerate() {
        if (this.tachometer > 0 && !this.reverse) {
            if (this.speedometer < MAX_SPEED) {
                this.speedometer += 10;
                this.tachometer += 500;
                System.out.println("Acelerando. Velocidad: " + this.speedometer + " km/h");
            } else {
                System.out.println("Velocidad maxima alcanzada");
            }
        } else if (this.reverse) {
            System.out.println("No puedes acelerar en reversa");
        } else {
            System.out.println("Vehiculo apagado");
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 10;
            this.tachometer -= 500;
            System.out.println("Frenando. Velocidad: " + this.speedometer + " km/h");
        } else {
            System.out.println("Vehiculo detenido.");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle < -45) {
            this.wheelsAngle = -45;
            System.out.println("Angulo minimo permitido: -45 grados");
        } else if (angle > 45) {
            this.wheelsAngle = 45;
            System.out.println("Angulo maximo permitido: 45 grados");
        } else {
            this.wheelsAngle = angle;
            System.out.println("Angulo ajustado a: " + this.wheelsAngle + " grados");
        }
    }

    public String showSteeringwheelDetail() {
        return "";
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {
            this.reverse = reverse;
            if (reverse) {
                this.gear = "R";
            } else {
                this.gear = "N";
            }
            System.out.println("Reversa " + (reverse ? "activada" : "desactivada"));
        } else {
            System.out.println("No puedes cambiar a reversa mientras el coche está en movimiento.");
        }
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public void showDetails() {
    }

    public static void main(String[] args) {
    }
}