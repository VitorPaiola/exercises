/*
    Escreva um programa que, com base em uma temperatura em graus celsius, 
    a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
    seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
*/

import java.util.Locale;

public class TemperaturaEstruturado {
    public static void main(String[] args) {
        double celsius = 2.43;

        exibirTemperatura(celsius);
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusParaReaumur(double celsius) {
        return celsius * .8;
    }

    public static double celsiusParaRankine(double celsius) {
        return celsius * 1.8 + 32 + 459.67;
    }

    public static String formatarNumero(double valor) {
        return String.format(Locale.US, "%.2f", valor);
    }

    public static void exibirTemperatura(double celsius) {
        System.out.println("Temperatura em Fahrenheit: " + formatarNumero(celsiusParaFahrenheit(celsius)));
        System.out.println("Temperatura em Kelvin: " + formatarNumero(celsiusParaKelvin(celsius)));
        System.out.println("Temperatura em Reaumur: " + formatarNumero(celsiusParaReaumur(celsius)));
        System.out.println("Temperatura em Rankine: " + formatarNumero(celsiusParaRankine(celsius)));
    }
}
