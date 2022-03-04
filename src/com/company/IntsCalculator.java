package com.company;

public class IntsCalculator implements Ints{
    protected final Calculator target;
    public IntsCalculator() {
        this.target = new Calculator();
    }
    @Override
    public int sum(int arg0, int arg1) {
        this.target.newFormula();
    }

    @Override
    public int mult(int arg0, int arg1) {
        this.target.newFormula();
    }

    @Override
    public int pow(int a, int b) {
        this.target.newFormula();
    }
}
