# Car Valuation Selenium Test Suite

## Introduction
This Selenium test suite automates the process of extracting vehicle registration numbers, querying them on a car valuation website, and comparing the output with expected results. It is designed to be flexible and maintainable, utilizing design patterns and allowing easy addition of new input files.

## Prerequisites
- Java (JVM based language)
- Maven (for managing project dependencies and execution)
- Selenium WebDriver (for browser automation)
- Web browser (e.g., Chrome, Firefox, edge) and corresponding WebDriver installed

## Project Structure
- `src/main/java`: Application code including Page Objects and utility classes
- `src/test/java`: Test cases
- `car_input_v1.txt`: Example input file with vehicle registration numbers
- `car_output_v1.txt`: Expected output data for validation
- `pom.xml`: Maven configuration file

## How to Execute Tests
1. Ensure all prerequisites are installed and configured.
2. Place your input file(s) with vehicle registration numbers in the project root directory.
3. Update the `INPUT_FILE_PATH` and `OUTPUT_FILE_PATH` in the test class with the paths to your new files.
4. Navigate to the project root directory in the terminal or command prompt.
5. Run `mvn clean test` to execute the test suite.

## Adding More Input Files
To add more input files:
1. Save the new file in the project root directory.
2. Update the test class to loop through your input files or update the file path constants.
3. Ensure the format of new input files matches the expected pattern.

## Utilizing Design Patterns
- Page Object Model (POM) for organizing web interaction logic

## Note
1. The current configuration is set for a specific browser (e.g., Chrome). To use a different browser, update the WebDriver instance accordingly in the test setup method.
2. The `CarDetails` class is currently designed to capture general information about a car, such as its make and model, registration, and additional details. This class can be extended to include more specific attributes, like modal, fuel type, or transmission, to enhance the granularity of information captured during testing. To do so, additional fields can be added to the class, and methods can be modified to extract and store this information from the web pages or input files. Currently, its comparing only registration number. 


