package com.company;

public class Main {
    static int myMethod(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(5, 3);
        System.out.println(z);
    }
}
