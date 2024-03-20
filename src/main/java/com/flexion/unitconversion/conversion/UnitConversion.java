package com.flexion.unitconversion.conversion;

import java.util.Arrays;

public class UnitConversion {
    public static double convert(double inputNum, String inputUnit) {
        if (inputUnit.equalsIgnoreCase("CELSIUS") || inputUnit.equalsIgnoreCase("FAHRENHEIT") ||
                inputUnit.equalsIgnoreCase("KELVIN") || inputUnit.equalsIgnoreCase("RANKINE")) {
            return TemperatureUnit.convertToCelsius(inputNum, TemperatureUnit.valueOf(inputUnit.toUpperCase()));
        } else {
            return VolumeUnit.convertToLiters(inputNum, VolumeUnit.valueOf(inputUnit.toUpperCase()));
        }
    }

    public static boolean isSameUnit(String inputUnit, String targetUnit){
        boolean isVolume1 = Arrays.stream(VolumeUnit.values()).anyMatch(value -> value.name().equals(inputUnit.toUpperCase()));
        boolean isVolume2 = Arrays.stream(VolumeUnit.values()).anyMatch(value -> value.name().equals(targetUnit.toUpperCase()));
        boolean isTemparature1 = Arrays.stream(TemperatureUnit.values()).anyMatch(value -> value.name().equals(inputUnit.toUpperCase()));
        boolean isTemparature2 = Arrays.stream(TemperatureUnit.values()).anyMatch(value -> value.name().equals(targetUnit.toUpperCase()));
        return (isVolume1 && isVolume2) || (isTemparature1 && isTemparature2);
    }
}
