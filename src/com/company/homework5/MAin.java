package com.company.homework5;

public class MAin {
    public static void main(String[] args) {
        Convertor convertor = new Convertor();
        Farenhayt farenhayt = new Farenhayt();
        farenhayt.setTemp(25);
        double celsius = convertor.FarenhaytforCelsius(farenhayt);
        System.out.println("FarenheitToCelsius" + celsius);
        double kelvin = convertor.farenhaytForKelvin(farenhayt);
        System.out.println("FarenheitToKelvin" + kelvin);
        Celsius celsius1 = new Celsius();
        celsius1.setTemp(5);
        double celsius2 = convertor.CelsiusForFarenhayt(celsius1);
        System.out.println("CelsiusToFarenheit"+celsius2);
        double kelvin2 = convertor.CelsiusForKelvin(celsius1);
        System.out.println("CelsiusToKelvin"+kelvin2);
        kelvin kelvin1 = new kelvin();
        kelvin1.setTemp(5);
        double celsius3 = convertor.KelvinForCelsius(kelvin1);
        System.out.println("KelvinToCelsius"+celsius3);
        double farenhayt3= convertor.KelvinForFarenhayt(kelvin1);
        System.out.println("KelvinToFarenheit"+farenhayt3);
    }
}
