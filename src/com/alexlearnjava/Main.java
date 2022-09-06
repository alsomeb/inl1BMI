package com.alexlearnjava;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Förbättring: kanske redan fråga om input i konstruktorn med dialogrutorna när objektet instansieras!

        // Allt med dialogrutor
        Bmi testBmi = new Bmi();
        testBmi.getUserWeightDialog();
        testBmi.getUserHeightDialog();
        testBmi.calcAndPrintBmi();

        // Manuella test cases utan användaren skriver in i dialogrutor (Annan Constructor)
        Bmi alexBmi = new Bmi(50, 1.60);
        alexBmi.calcAndPrintBmi();

        Bmi peterBmi = new Bmi(90, 1.80);
        peterBmi.calcAndPrintBmi();

    }
}
