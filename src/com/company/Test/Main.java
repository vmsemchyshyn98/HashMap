package com.company.Test;

public class Main {
    public static void main(String[] args) {
        Car car =new Car();
        Car car2 =new Car();
   car.setNum(2);
        System.out.println(car.get());
        System.out.println(car2.get());

        car2.setNum(10);

        System.out.println(car.get());
        System.out.println(car2.get());
    }
}
