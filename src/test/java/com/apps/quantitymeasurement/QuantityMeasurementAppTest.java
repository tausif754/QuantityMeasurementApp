package com.apps.quantitymeasurement;

import com.apps.quantitymeasurment.QuantityMeasurementApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuantityMeasurementAppTest {

    // -------- FEET TESTS --------

    @Test
    void testFeetEquality_SameValue() {
        assertTrue(new QuantityMeasurementApp.Feet(1.0).equals(new QuantityMeasurementApp.Feet(1.0)));
    }

    @Test
    void testFeetEquality_DifferentValue() {
        assertFalse(new QuantityMeasurementApp.Feet(1.0).equals(new QuantityMeasurementApp.Feet(2.0)));
    }

    @Test
    void testFeetEquality_NullComparison() {
        assertFalse(new QuantityMeasurementApp.Feet(1.0).equals(null));
    }

    @Test
    void testFeetEquality_DifferentClass() {
        assertFalse(new QuantityMeasurementApp.Feet(1.0).equals("1.0"));
    }

    @Test
    void testFeetEquality_SameReference() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(f.equals(f));
    }

    // -------- INCHES TESTS --------

    @Test
    void testInchesEquality_SameValue() {
        assertTrue(new QuantityMeasurementApp.Inches(12.0).equals(new QuantityMeasurementApp.Inches(12.0)));
    }

    @Test
    void testInchesEquality_DifferentValue() {
        assertFalse(new QuantityMeasurementApp.Inches(12.0).equals(new QuantityMeasurementApp.Inches(13.0)));
    }

    @Test
    void testInchesEquality_NullComparison() {
        assertFalse(new QuantityMeasurementApp.Inches(12.0).equals(null));
    }

    @Test
    void testInchesEquality_DifferentClass() {
        assertFalse(new QuantityMeasurementApp.Inches(12.0).equals(12));
    }

    @Test
    void testInchesEquality_SameReference() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(12.0);
        assertTrue(i.equals(i));
    }
}
