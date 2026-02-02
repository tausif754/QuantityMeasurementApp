package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Test
    void testFeetToFeet_SameValue() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(1.0, LengthUnit.FEET);
        assertEquals(q1, q2);
    }

    @Test
    void testFeetToFeet_DifferentValue() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(2.0, LengthUnit.FEET);
        assertNotEquals(q1, q2);
    }

    @Test
    void testInchToInch_SameValue() {
        Quantity q1 = new Quantity(12.0, LengthUnit.INCH);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);
        assertEquals(q1, q2);
    }

    @Test
    void testFeetToInch_EquivalentValue() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);
        assertEquals(q1, q2);
    }

    @Test
    void testFeetToInch_NotEquivalentValue() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(10.0, LengthUnit.INCH);
        assertNotEquals(q1, q2);
    }

    @Test
    void testNullComparison() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        assertNotEquals(q1, null);
    }

    @Test
    void testSameReference() {
        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        assertEquals(q1, q1);
    }
}