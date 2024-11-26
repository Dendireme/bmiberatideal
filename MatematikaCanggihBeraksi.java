/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari MatematikaCanggih
        MatematikaCanggih mathCanggih = new MatematikaCanggih();
        
        // Menggunakan metode pertambahan
        int a = 10;
        int b = 5;
        System.out.println("Pertambahan: " + mathCanggih.pertambahan(a, b));
        
        // Menggunakan metode perkalian
        System.out.println("Perkalian: " + mathCanggih.perkalian(a, b));
        
        // Menggunakan metode modulus
        System.out.println("Modulus: " + mathCanggih.modulus(a, b));
    }
}
