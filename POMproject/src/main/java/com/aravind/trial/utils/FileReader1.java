package com.aravind.trial.utils;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\aravi\\Desktop\\FilereadTest.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}