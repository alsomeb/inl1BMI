package com.alexlearnjava;
import javax.swing.*;
import java.text.DecimalFormat;

public class Bmi {
    private double weight;
    private double length;

    // Konstruktor 1
    public Bmi(double weight, double length) {
        this.weight = weight;
        this.length = length;
    }

    // Konstruktor 2 - pga man behövde en Dialog ruta för att ta input så gjorde 2 versioner av programmet
    // Inga param här för fångar upp dem med input rutor och använder setters på weight & length
    public Bmi() {
    }

    // Metod som räknar ut BMI sedan målar upp GUI på resultat
    public void calcAndPrintBmi() {
        DecimalFormat df = new DecimalFormat("###.#"); // För avrundning av resultatet

        String viktKlass = ""; // Initiarar en tom String som håller result texten från if satsen

        double resultBmi = weight / (length * length); // bara THIS i setters & getters & constructor
                                                        // kallar man parametern ngt annat så behövs ej this.variabel

        // Control Flow, Bestämmer Viktklass
        if (resultBmi < 18.5) {
            viktKlass = "Undervikt";
        } else if (resultBmi >= 18.5 && resultBmi <= 25) {
            viktKlass = "Normalvikt";
        } else if (resultBmi > 25 && resultBmi <= 30) {
            viktKlass = "Övervikt";
        } else if (resultBmi > 30 && resultBmi <= 35) {
            viktKlass = "Fetma Klass 1";
        } else if (resultBmi > 35 && resultBmi <= 40) {
            viktKlass = "Fetma Klass 2";
        } else {
            viktKlass = "Fetma klass 3";
        }

        // Ustkrift Vikt,längd, BMI GUI Med Swing
        String bmiRounded = df.format(resultBmi);   // Avrunda BMI till 1 Dec
        JOptionPane.showMessageDialog(null, "Vikt: " + weight + " Kg\n"
                + "Längd: " + length + "m\n"
                + "BMI avrundat: " + bmiRounded + "\n"
                + "BMI dec: " + resultBmi + "\n"
                + "Viktklass: " + viktKlass
        );
    }


    public void getUserWeightDialog() {
        while (true) {
            try {
                // Konvertera String till double primitiv variabel sedan med gettern ställa om
                double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter Weight (KGs)"));
                setWeight(weight);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Wrong input, enter numbers");
            }
        }
    }


    public void getUserHeightDialog() {
        while (true) {
            try {
                // Konvertera String till double primitiv variabel sedan med gettern ställa om
                double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height in Meters (with .)"));
                setLength(height);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Wrong input, enter numbers");
            }
        }
    }


    // Getters & Setters
    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getLength() {
        return length;
    }


    public void setLength(double length) {
        this.length = length;
    }

}
