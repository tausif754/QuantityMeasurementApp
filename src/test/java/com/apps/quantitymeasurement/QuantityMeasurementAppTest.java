package com.apps.quantitymeasurement;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void testEquality_SameValue() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        assertTrue(feet1.equals(feet2));
    }

    @Test
    void testEquality_DifferentValue() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(2.0);

        assertFalse(feet1.equals(feet2));
    }

    @Test
    void testEquality_NullComparison() {
        Feet feet = new Feet(1.0);

        assertFalse(feet.equals(null));
    }

    @Test
    void testEquality_SameReference() {
        Feet feet = new Feet(1.0);

        assertTrue(feet.equals(feet));
    }

    @Test
    void testEquality_DifferentType() {
        Feet feet = new Feet(1.0);
        String value = "1.0";

        assertFalse(feet.equals(value));
    }
}