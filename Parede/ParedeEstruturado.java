package Parede;

import java.util.Locale;
import java.util.Scanner;

/*
    Uma parede em formato retangular, cuja altura é hp (altura da parede) 
    e a largura lp (largura da parede) precisa ser coberta por azulejos 
    também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo)
    e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, 
    calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.

    TODO: 1 - javac -d . Parede/ParedeEstruturado.java
    TODO: 2 - java Parede.ParedeEstruturado
*/

public class ParedeEstruturado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Solicita as medidas da parede
        double hp = lerMedida(entrada, "altura da parede");
        double lp = lerMedida(entrada, "largura da parede");

        // Solicita as medidas do azulejo
        double ha = lerMedida(entrada, "altura do azulejo");
        double la = lerMedida(entrada, "largura do azulejo");

        // Calcula a quantidade necessária de azulejos
        double qtd = calcularQuantidadeAzulejos(hp, lp, ha, la);

        // Exibe o resultado
        System.out.printf("Quantidade de azulejos necessários para cobrir a parede: %.0f%n", qtd);

        entrada.close();
    }

    // Função para ler medidas e garantir que sejam positivas
    public static double lerMedida(Scanner entrada, String descricao) {
        double valor;
        do {
            System.out.printf("Digite a %s (em metros): ", descricao);
            valor = entrada.nextDouble();
            if (valor <= 0) {
                System.out.println("O valor deve ser maior que zero. Tente novamente.");
            }
        } while (valor <= 0);
        return valor;
    }

    // Função para calcular a quantidade de azulejos necessária
    public static double calcularQuantidadeAzulejos(double hp, double lp, double ha, double la) {
        return (hp * lp) / (ha * la);
    }
}
