package com.ho.carvaluation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValuationFormPage {
    private WebDriver driver;

    // Locators
    private By registrationInputLocator = By.id("vrm");
    private By submitButtonLocator = By.xpath("//button[@type='submit']/span[text()='Get started']");

    public ValuationFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterRegistration(String registration) {
        WebElement registrationInput = driver.findElement(registrationInputLocator);
        registrationInput.clear();
        registrationInput.sendKeys(registration);
    }

    public void clickGetStarted() {
        WebElement submitButton = driver.findElement(submitButtonLocator);
        submitButton.click();
    }

    public void submitFormWithRegistration(String registration) {
        enterRegistration(registration);
        clickGetStarted();
    }
}

