package com.company;

public class Main {
    static void myMethod(String fname, int age){
    System.out.println(fname + " Is " + age);
}

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}
