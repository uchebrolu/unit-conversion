package com.flexion.unitconversion.conversion;

public enum TemperatureUnit {
    CELSIUS,
    FAHRENHEIT,
    KELVIN,
    RANKINE;

    public static double convertToCelsius(double value, TemperatureUnit unit) {
        switch (unit) {
            case CELSIUS:
                return value;
            case FAHRENHEIT:
                return (value - 32) * 5 / 9;
            case KELVIN:
                return value - 273.15;
            case RANKINE:
                return (value - 491.67) * 5 / 9;
            default:
                throw new IllegalArgumentException("Unknown temperature unit");
        }
    }
}
