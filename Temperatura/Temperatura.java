/*
    Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
*/

import java.util.Locale;

public class Temperatura {
    public static void main(String[] args) {
        double C, K, Re, Ra, F;
        C = 2.43;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * .8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Fahrenheit: " + String.format(Locale.US ,"%.2f", F));
        System.out.println("A temperatura em Kelvin: " + String.format(Locale.US ,"%.2f", K));
        System.out.println("A temperatura em Réaumur: " + String.format(Locale.US ,"%.2f",Re));
        System.out.println("A temperatura em Rankine: " + String.format(Locale.US ,"%.2f",Ra));
    }
}
