package com.company;

public class Main {

    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        int arg0 = 56;
        int arg1 = 85;
        int result1 = calc.sum(arg0, arg1);
        System.out.println(result1);
        int result2 = calc.mult(arg0,arg1);
        System.out.println(result2);
    }
}
