package com.ho.carvaluation.modal;

public class CarDetails {
    private String makeAndModel;
    private String registration;
    private String additionalDetails;

    // Constructor
    public CarDetails(String makeAndModel, String registration, String additionalDetails) {
        this.makeAndModel = makeAndModel;
        this.registration = registration;
        this.additionalDetails = additionalDetails;
    }

    // Getters
    public String getMakeAndModel() {
        return makeAndModel;
    }

    public String getRegistration() {
        return registration;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }
}
