package com.RCO_Interf;

public class TaxCalculator2022 implements TaxCalculator{
    private String message;

    public TaxCalculator2022(String message){
        this.message = message;
    }

    @Override
    public double calculateTax() {
        System.out.println(message);
        return 70;
    }
}
