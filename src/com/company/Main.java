package com.company;

public class Main {

    public static void main(String[] args) {
        OpenHashMap openHashMap=new OpenHashMap(10);
        openHashMap.put(2,33);
        openHashMap.put(11,33);
        openHashMap.put(1,33);
        openHashMap.put(3,456);
        openHashMap.put(9,456);
        openHashMap.put(9,4);
        openHashMap.put(5,456);
        System.out.println(openHashMap.get(3));

        System.out.println("Size: "+openHashMap.getSize());

        System.out.println("-------------");
        openHashMap.getResult();
        System.out.println(openHashMap.size);
        System.out.println("-------------");
//        int a=-100;
//        System.out.println(3 * a / 2);
//        System.out.println(Math.max(3 * a / 2, a));
//        System.out.println("size: "+openHashMap.size);
//        int h=openHashMap.hash(5364335);
//        System.out.println(openHashMap.hash(5364335));
//        System.out.println(openHashMap.index(h));
int u=5;
u++;
        System.out.println(u);
++u;
        System.out.println(u);
        System.out.println(u++);
        System.out.println(u);
        System.out.println(++u);
    }
}
