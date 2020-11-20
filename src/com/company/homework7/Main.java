package com.company.homework7;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Dram dram = new Dram();
        dram.setDram(9000);
        double dramForRubli = currencyConverter.DramForRubli(dram);
        double dramForDolar = currencyConverter.DramForDolar(dram);
        System.out.println("DramForRubli" + dramForRubli);
        System.out.println("DramForDolar" + dramForDolar);
        Rublli rublli = new Rublli();
        rublli.setRublli(1000);
        double RubliFORDram = currencyConverter.RubliForDram(rublli);
        double RubliFORDolar = currencyConverter.RubliForDolar(rublli);
        System.out.println("RubliForDram" + RubliFORDram);
        System.out.println("RubliForDolar" + RubliFORDolar);
        Dolar dolar = new Dolar();
        dolar.setDolar(500);
        double DolarFORDram = currencyConverter.DolarFromDram(dolar);
        double DolarFORRubli = currencyConverter.DolarFromRubli(dolar);
        System.out.println("DolarFromDram" + DolarFORDram);
        System.out.println("DolarFromRubli" + DolarFORRubli);
    }
}
