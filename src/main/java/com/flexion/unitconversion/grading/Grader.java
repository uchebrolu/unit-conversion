package com.flexion.unitconversion.grading;

import com.flexion.unitconversion.conversion.UnitConversion;

import java.text.DecimalFormat;

public class Grader {
    public static String gradeConversion(double inputNum, String inputUnit, double studentResponse, String targetUnit) {
        boolean isSameUnit = UnitConversion.isSameUnit(inputUnit,targetUnit);
        if (!isSameUnit){
            return "invalid";
        }
        double authoritativeAnswer = roundToTenths(UnitConversion.convert(inputNum, inputUnit));
        double convertedStudentResponse = roundToTenths(UnitConversion.convert(studentResponse, targetUnit));

        if (Double.isNaN(authoritativeAnswer)) {
            return "invalid";
        } else if (Double.compare(convertedStudentResponse, authoritativeAnswer) == 0) {
            return "correct";
        } else {
            return "incorrect";
        }
    }

    private static double roundToTenths(double value) {
        DecimalFormat df = new DecimalFormat("#.#");
        return Double.parseDouble(df.format(value));
    }
}
