package com.company.Test;

public class Car {
    private static int num;

    public Car() {
    }

    int get(){
        return num;
    }

    public static int getNum() {
        return num;
    }

    public void setNum(int num) {
        Car.num = num;
    }
}
