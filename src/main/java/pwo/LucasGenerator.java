package pwo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class LucasGenerator {

    public static void main(String[] args) {
        // Ścieżka do pliku wyjściowego
        String outputPath = "lucas_sequence.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            BigInteger a = BigInteger.valueOf(2);
            BigInteger b = BigInteger.valueOf(1);
            for (int i = 1; i <= 100; i++) {
                // Zapisywanie wyrazu ciągu Lucasa do pliku
                writer.write("Wyraz " + i + ": " + a + "\n");
                
                // Obliczenie kolejnego wyrazu ciągu
                BigInteger next = a.add(b);
                a = b;
                b = next;
            }
            System.out.println("100 pierwszych wyrazów ciągu Lucasa zostało zapisanych do " + outputPath);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania do pliku: " + e.getMessage());
        }
    }
}
