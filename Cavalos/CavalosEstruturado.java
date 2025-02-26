package Cavalos;

import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa para determinar a quantidade de cavalos necessários 
    para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos. 
    Considere cavalos = (m * h / t) / 745,6999

    TODO: 1 - javac -d . Cavalos/CavalosEstruturado.java
    TODO: 2 - java Cavalos.CavalosEstruturado
*/

public class CavalosEstruturado {
    private static final double FATOR_CONVERSAO = 745.6999;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Solicita e valida a massa
        double massa = lerValor(entrada, "massa em kg");

        // Solicita e valida a altura
        double altura = lerValor(entrada, "altura em metros");

        // Solicita e valida o tempo
        double tempo = lerValor(entrada, "tempo em segundos");

        // Calcula a quantidade de cavalos
        double cavalos = calcularCavalos(massa, altura, tempo);

        // Exibe o resultado formatado
        System.out.printf(Locale.US,"A quantidade de cavalos necessários é %.2f%n", cavalos);

        entrada.close();
    }

    // Método para ler e validar entradas numéricas
    public static double lerValor(Scanner entrada, String descricao) {
        double valor;
        do {
            System.out.printf("Digite a %s: ", descricao);
            valor = entrada.nextDouble();
            if (valor <= 0) {
                System.out.println("O valor deve ser maior que zero. Tente novamente.");
            }
        } while (valor <= 0);
        return valor;
    }

    // Método para calcular a quantidade de cavalos
    public static double calcularCavalos(double massa, double altura, double tempo) {
        return (massa * altura / tempo) / FATOR_CONVERSAO;
    }
}
