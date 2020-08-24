package com.company;

    public class PKlass {

        public static void main(String[] args) {

            int a = 7;

            String s = "asd";

            Person p = new Person("bb1", 6);

            method1(a);

            method2(s);

            method3(p);

            System.out.println(method4(a));


            System.out.println(a); // 7

            System.out.println(a);

            System.out.println(s); // asd

            System.out.println(p); // qwerty 6

        }

        public static void method1(int a) {

            ++a;

            a++;

        }

        public static int method4(int a) {

            ++a;

            a++;
            return a;

        }

        public static void method2(String s) {

            s = "bfr";

        }

        public static void method3(Person p) {

            p.setName("qwerty");

        }

    }



    class Person {

        private String name;

        private int age;

        public Person(String name, int age) {

            this.name = name;

            this.age = age;

        }

        @Override

        public String toString() {

            return name + " " + age;

        }

        public void setName(String name) {

            this.name = name;

        }

    }



