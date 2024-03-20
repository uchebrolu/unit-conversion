# Unit Conversion Grading System

## Overview
The Unit Conversion Grading System is designed to help science teachers grade unit-conversion problems assigned to students. The system allows teachers to input conversion questions and students' responses, and it automatically grades the responses as correct, incorrect, or invalid based on predefined rules.

## Features
- Supports conversions between temperatures (Kelvin, Celsius, Fahrenheit, Rankine) and volumes (liters, tablespoons, cubic-inches, cups, cubic-feet, gallons).
- Grading based on rounding to the tenths place.
- Simple command-line interface (CLI) for input and grading.
- Optional continuous integration/continuous deployment (CI/CD) pipeline setup.

## Usage
1. **Installation**:
    - Clone the repository to your local machine.
    - Ensure you have Java installed (version 8 or higher).

2. **Running the Program**:
    - Navigate to the project directory.
    - Compile the Java files:
      ```bash
      javac -d bin src/com/flexion/unitconversion/*.java src/com/flexion/unitconversion/enums/*.java src/com/flexion/unitconversion/grading/*.java
      ```
    - Run the CLI:
      ```bash
      java -cp bin com.flexion.unitconversion.CLI
      ```

3. **Input Format**:
    - Provide input numerical value, input unit of measure, target unit of measure, and student's numeric response in the CLI as prompted.

4. **Output**:
    - The system will indicate if the student's response is correct, incorrect, or invalid.

## Development Tasks
Priority tasks for improving the solution:
1. Implement more unit conversions beyond temperatures and volumes.
2. Enhance the CLI interface for better user interaction.
3. Implement automated tests for the conversion and grading logic.
4. Improve error handling for invalid inputs.
5. Implement a web-based interface for easier access and usability.
L