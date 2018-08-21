package org;

public class qa {
    public static void main(String[] args) {
        int a = -1;
        float b = -1.5876f;
        --a;
        b=--b;
        System.out.println("число a =" + (a+b+(b+a)));
        System.out.println("число b ="+b);
    }

}
