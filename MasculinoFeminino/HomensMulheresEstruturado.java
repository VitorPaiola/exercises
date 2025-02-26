package MasculinoFeminino;

import java.util.Scanner;

/*
    Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
    Fazer um algoritmo que calcule e escreva:
    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres.

    TODO: 1 - javac -d . MasculinoFeminino/HomensMulheresEstruturado.java
    TODO: 2 - java MasculinoFeminino.HomensMulheresEstruturado
*/

public class HomensMulheresEstruturado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(java.util.Locale.US);

        final int TOTAL_PESSOAS = 10;
        int qtdMulheres = 0, qtdHomens = 0;
        float somaAlturaHomens = 0, maiorAltura = Float.MIN_VALUE, menorAltura = Float.MAX_VALUE;

        for (int i = 0; i < TOTAL_PESSOAS; i++) {
            int sexo = lerSexo(entrada);
            float altura = lerAltura(entrada);

            if (sexo == 1) {
                qtdMulheres++;
            } else if (sexo == 2) {
                qtdHomens++;
                somaAlturaHomens += altura;
            }

            // Atualiza maior e menor altura corretamente
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        // Evita divisão por zero
        float mediaAlturaHomens = (qtdHomens > 0) ? somaAlturaHomens / qtdHomens : 0;

        exibirResultados(maiorAltura, menorAltura, mediaAlturaHomens, qtdMulheres);

        entrada.close();
    }

    public static int lerSexo(Scanner entrada) {
        int sexo;
        do {
            System.out.println("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
            sexo = entrada.nextInt();
            if (sexo != 1 && sexo != 2) {
                System.out.println("Opçao invalida! Digite 1 para Mulher ou 2 para Homem.");
            }
        } while (sexo != 1 && sexo != 2);
        return sexo;
    }

    public static float lerAltura(Scanner entrada) {
        float altura;
        do {
            System.out.println("Digite a altura (em metros, ex: 1.75): ");
            altura = entrada.nextFloat();
            if (altura <= 0) {
                System.out.println("A altura deve ser maior que zero. Tente novamente.");
            }
        } while (altura <= 0);
        return altura;
    }

    public static void exibirResultados(float maior, float menor, float mediaHomens, int qtdMulheres) {
        System.out.println("\nResultados:");
        System.out.printf("A maior altura do grupo e %.2f m, e a menor e %.2f m.%n", maior, menor);
        System.out.printf("A media de altura dos homens e %.2f m.%n", mediaHomens);
        System.out.printf("O numero de mulheres e %d.%n", qtdMulheres);
    }
}
