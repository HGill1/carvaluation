package com.ho.carvaluation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarDetailsPage {
    private WebDriver driver;

    // Locators
    private By makeAndModelLocator = By.cssSelector("h1.cui__sc-yrk414-0.top-headingstyles__MakeAndModel-sc-1vq5mld-1");
    private By registrationAndDetailsLocator = By.cssSelector("h2.cui__sc-yrk414-0.jHDwGZ:nth-of-type(2)");
    private By additionalDetailsLocator = By.cssSelector("p.cui__sc-1s9qsh9-0.dHVfnH");

    public CarDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMakeAndModel() {
        return driver.findElement(makeAndModelLocator).getText();
    }

    public String getRegistrationAndDetails() {
        return driver.findElement(registrationAndDetailsLocator).getText();
    }

    public String getAdditionalDetails() {
        return driver.findElement(additionalDetailsLocator).getText();
    }
}
