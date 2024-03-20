package com.flexion.unitconversion.conversion;

public enum VolumeUnit {
    LITERS,
    TABLESPOONS,
    CUBIC_INCHES,
    CUPS,
    CUBIC_FEET,
    GALLONS;

    public static double convertToLiters(double value, VolumeUnit unit) {
        switch (unit) {
            case LITERS:
                return value;
            case TABLESPOONS:
                return value * 0.0147868;
            case CUBIC_INCHES:
                return value * 0.0163871;
            case CUPS:
                return value * 0.236588;
            case CUBIC_FEET:
                return value * 28.3168;
            case GALLONS:
                return value * 3.78541;
            default:
                throw new IllegalArgumentException("Unknown volume unit");
        }
    }
}
