/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author GF
 */
public class bmi {

    double Tinggi;
    double Berat;

    public bmi(double Tinggi, double Berat) {
        this.Tinggi = Tinggi / 100;
        this.Berat = Berat;
    }

    public double rumus() {
        return Berat / (Tinggi * Tinggi);
    }

    public String status() {
        double bmi = rumus();
        if (bmi < 18.5) {
            return "kurus";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "kelebihan berat";
        } else {
            return "Obesitas";
        }
    }
}
