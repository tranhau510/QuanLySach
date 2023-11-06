package utils;

import java.io.BufferedReader;
import java.io.IOException;

public class Validator {
    public static String getString(BufferedReader br, String prompt) {
        String value = "";
        boolean isChecked = false;
        do {
            try {
                System.out.println(prompt);
                value = br.readLine().trim();
                isChecked = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!isChecked);
        return value;
    }

    public static int getInt(BufferedReader br, String prompt) {
        int value = 0;
        boolean isChecked = false;
        do {
            try {
                System.out.println(prompt);
                value = Integer.parseInt(br.readLine().trim());
                isChecked = true;
            } catch (IOException e) {
                System.out.println(e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid number, try again");
            }
        } while (!isChecked);
        return value;
    }

}

