package com.company;

public class Main {

    public static void main(String[] args) {
        OpenHashMap openHashMap=new OpenHashMap(10);
        openHashMap.put(2,33);
        openHashMap.put(11,33);
        openHashMap.put(1,33);
        openHashMap.put(3,456);

        System.out.println(openHashMap.get(3));

        System.out.println(openHashMap.getSize());
    }
}
