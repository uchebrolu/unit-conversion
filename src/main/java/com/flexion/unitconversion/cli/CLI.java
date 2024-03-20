package com.flexion.unitconversion.cli;

import com.flexion.unitconversion.grading.Grader;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Enter input numerical value: ");
            double inputNum = scanner.nextDouble();

            System.out.print("Enter input unit of measure: ");
            String inputUnit = scanner.next().toUpperCase();

            System.out.print("Enter target unit of measure: ");
            String targetUnit = scanner.next().toUpperCase();
            double studentResponse = 0.0;
            try {
                System.out.print("Enter student's numeric response: ");
                studentResponse = scanner.nextDouble();
                String result = Grader.gradeConversion(inputNum, inputUnit, studentResponse, targetUnit);
                System.out.println("Output: " + result);
            } catch (Exception e){
                System.out.println("Output: incorrect");
            }
            scanner.close();
        } catch (Exception e){
            System.out.println("Output: invalid");
        }
    }
}
