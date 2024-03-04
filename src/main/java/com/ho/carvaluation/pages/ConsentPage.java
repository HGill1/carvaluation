package com.ho.carvaluation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConsentPage {
    private WebDriver driver;

    // Locator for the "Accept All" button
    private By acceptAllButton = By.xpath("//button/span[text()='Accept All']");

    public ConsentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAcceptAll() {
        WebElement acceptButton = driver.findElement(acceptAllButton);
        if (acceptButton.isDisplayed() && acceptButton.isEnabled()) {
            acceptButton.click();
        }
    }
}

