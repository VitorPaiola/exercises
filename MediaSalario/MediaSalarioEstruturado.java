package MediaSalario;

import java.util.Locale;
import java.util.Scanner;

/* 
    Criar um programa que calcule a média de salários de uma empresa, 
    pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.

    TODO: 1 - javac -d . MediaSalario/MediaSalarioEstruturado.java
    TODO: 2 - java MediaSalario.MediaSalarioEstruturado
*/

public class MediaSalarioEstruturado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(java.util.Locale.US);

        System.out.println("Digite o número de funcionários: ");
        int totalFuncionarios = entrada.nextInt();

        if (totalFuncionarios <= 0) {
            System.out.println("O número de funcionários deve ser maior que zero.");
            return;
        }

        double somaSalarios = 0;
        for (int i = 1; i <= totalFuncionarios; i++) {
            somaSalarios += lerSalario(entrada, i);
        }

        double media = somaSalarios / totalFuncionarios;
        System.out.printf(Locale.US,"A média salarial da empresa é de R$ %.2f%n", media);

        entrada.close();
    }

    public static double lerSalario(Scanner entrada, int numeroFuncionario) {
        double salario;
        do {
            System.out.printf("Digite o salário do funcionário %d: R$ ", numeroFuncionario);
            salario = entrada.nextDouble();
            if (salario < 0) {
                System.out.println("O salário não pode ser negativo. Tente novamente.");
            }
        } while (salario < 0);
        return salario;
    }
}
