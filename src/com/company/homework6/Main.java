package com.company.homework6;

public class Main {
    public static void main(String[] args) {
        Convert convert = new Convert();
        metrs metrs = new metrs();
        metrs.setMETR(275590.5509);
        double metre = convert.MilsToMetrs(metrs);
        System.out.println("Metr To MIls " + metre);
        mils mils1 = new mils();
        mils1.setMILS(7);
        double mils = convert.metrsToMils(mils1);
        System.out.println("mils To metr " + mils);
    }
}
