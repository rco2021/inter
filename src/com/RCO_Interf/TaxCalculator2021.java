package com.RCO_Interf;

public class TaxCalculator2021 implements TaxCalculator {
    private double taxableIncom;

    public TaxCalculator2021(double taxableIncome){
        this.taxableIncom = taxableIncome;
    }

    @Override
    public double calculateTax(){
        return  taxableIncom * 0.3;
    }
}
