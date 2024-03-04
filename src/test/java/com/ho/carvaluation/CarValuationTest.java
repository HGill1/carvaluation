package com.ho.carvaluation;

import com.ho.carvaluation.modal.CarDetails;
import com.ho.carvaluation.pages.CarDetailsPage;
import com.ho.carvaluation.pages.ConsentPage;
import com.ho.carvaluation.pages.ValuationFormPage;
import com.ho.carvaluation.utils.Utils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CarValuationTest {

    private static WebDriver driver;
    private static final String INPUT_FILE_PATH = "car_input_v1.txt";
    private static final String OUTPUT_FILE_PATH = "car_output_v1.txt";

    @BeforeAll
    public static void setUp() {
        driver = Utils.createWebDriver("chrome");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void testCarValuation() throws Exception {
        // Read car registration numbers from input file
        List<String> registrationNumbers = InputFileReader.readRegistrationNumbers(INPUT_FILE_PATH);

        boolean consentClicked = false; // Flag to track if consent has been clicked

        // Loop through each registration number
        for (String registration : registrationNumbers) {
            // Access Cazoo car valuation page
            driver.get("https://www.cazoo.co.uk/value-my-car/");

            if (!consentClicked) {
                ConsentPage consentPage = new ConsentPage(driver);
                consentPage.clickAcceptAll();
                consentClicked = true; // Set flag to true after clicking consent
            }

            ValuationFormPage valuationFormPage = new ValuationFormPage(driver);
            valuationFormPage.submitFormWithRegistration(registration);

            CarDetailsPage carDetailsPage = new CarDetailsPage(driver);
            CarDetails carDetails = new CarDetails(carDetailsPage.getMakeAndModel(),
                    carDetailsPage.getRegistrationAndDetails(), carDetailsPage.getAdditionalDetails());

            CarDetailsComparison carDetailsComparison = new CarDetailsComparison();
            carDetailsComparison.compareCarDetails(OUTPUT_FILE_PATH, carDetails);
        }
    }


    private List<String> readExpectedDetails(String registration) throws Exception {
        // Implement logic to read expected details (make and model) for the given registration from the output file (car_output_v1.txt)
        // This can involve searching for the line containing the registration and splitting it based on the delimiter (",")
        // ...

        // Replace with actual implementation to return the expected details as a list
        return List.of("SKODA", "Superb"); // Placeholder for demonstration
    }
}

