package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity oneFoot = new Quantity(1.0, LengthUnit.FEET);
        Quantity twelveInch = new Quantity(12.0, LengthUnit.INCH);
//      Quantity oneYard = new Quantity(1.0, LengthUnit.YARD);

        System.out.println("1 ft == 12 inch ? " + oneFoot.equals(twelveInch));
        System.out.println("12 Inch==1 ft ? " + oneFoot.equals(twelveInch));


//     System.out.println("1 yd == 36 inch ? " + oneYard.equals(new Quantity(36.0, LengthUnit.INCH)));
    }
}