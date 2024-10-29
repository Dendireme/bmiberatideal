/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author GF
 */
public class bmiBeraksi {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("masukan tinggi badan anda : ");
        double Tinggi = inputan.nextDouble();
        System.out.print("masukan berat badan anda : ");
        double beratBadan = inputan.nextDouble();
        bmi BMI = new bmi(Tinggi , beratBadan);
        System.out.printf("bmi anda : %.1f%n",BMI.rumus());
        System.out.println("status anda : "+ BMI.status());
    }
}
