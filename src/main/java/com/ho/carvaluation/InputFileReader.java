package com.ho.carvaluation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputFileReader {

    public static List<String> readRegistrationNumbers(String filePath) throws Exception {
        List<String> registrationNumbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        // Regex pattern for UK registration numbers (simple version, adjust as needed)
        Pattern pattern = Pattern.compile("[A-Z]{2}\\d{2}\\s?[A-Z]{3}");
        while ((line = reader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                registrationNumbers.add(matcher.group());
            }
        }
        reader.close();
        return registrationNumbers;
    }
}
