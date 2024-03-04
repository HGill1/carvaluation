package com.ho.carvaluation;

import com.ho.carvaluation.modal.CarDetails;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CarDetailsComparison {

    public List<String> compareCarDetails(String filePath, CarDetails carDetails) {
        List<String> mismatches = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            boolean matchFound = false;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].replaceAll("\\s+", "").equalsIgnoreCase(carDetails.getRegistration().replaceAll("\\s+", ""))) {
                    matchFound = true;
                    String fileMakeModel = parts[1].trim() + " " + parts[2].trim();
                    if (!fileMakeModel.equalsIgnoreCase(carDetails.getMakeAndModel().trim() + " " + carDetails.getAdditionalDetails().trim())) {
//                        mismatches.add("Mismatch found for " + carDetails.getRegistration() + ": Expected " + fileMakeModel + ", Found " + carDetails.getMakeAndModel() + " " + carDetails.getAdditionalDetails());
                    }
                    break;
                }
            }
            if (!matchFound) {
                mismatches.add("No match found for registration: " + carDetails.getRegistration());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mismatches;
    }
}

