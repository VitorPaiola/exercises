package MasculinoFeminino;

import java.util.Scanner;

/*
    Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
    Fazer um algoritmo que calcule e escreva:
    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres.
*/

public class HomensMulheres {
    public static void main(String[] args) {
        int sexo, qtdMulheres = 0, qtdHomens = 0;
        float altura, somaH = 0, mediaHomens = 0, maior = 0, menor = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha o sexo da pessoa(1-Mulher, 2-Homem): ");
            sexo = entrada.nextInt();

            System.out.println("Digite a altura: ");
            altura = entrada.nextFloat();

            if (sexo == 1) {
                qtdMulheres++;
            } else if (sexo == 2) {
                qtdHomens++;
                somaH += altura;
            } else {
                System.out.println("Opção sexo inválido!");
            }
            if (altura > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }
        }
        mediaHomens = somaH / qtdHomens;

        System.out.println("A maior altura do grupo é de " + maior + "m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediaHomens + " m");
        System.out.println("O número de mulheres é " + qtdMulheres);

        entrada.close();
    }
}
