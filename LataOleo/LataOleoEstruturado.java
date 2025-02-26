package LataOleo;

import java.util.Locale;
import java.util.Scanner;

/*
    Calcular e apresentar o valor do volume de uma lata de óleo, 
    utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A 
    representam respectivamente o volume, o raio e a altura.
    Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as 
    variáveis de altura e de raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, 
    em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado.

    TODO: 1 - javac -d . LataOleo/LataOleoEstruturado.java
    TODO: 2 - java LataOleo.LataOleoEstruturado
*/

public class LataOleoEstruturado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Solicita e valida o raio
        double raio = lerMedida(entrada, "raio da base");

        // Solicita e valida a altura
        double altura = lerMedida(entrada, "altura da lata");

        // Calcula o volume
        double volume = calcularVolume(raio, altura);

        System.out.printf(Locale.US,"O volume da lata de óleo é de %.2f m³%n", volume);

        entrada.close();
    }

    // Método para ler e validar entradas numéricas
    public static double lerMedida(Scanner entrada, String descricao) {
        double valor;
        do {
            System.out.printf("Digite  o %s (em metros): ", descricao);
            valor = entrada.nextDouble();
            if (valor <= 0) {
                System.out.println("O valor deve ser maior que zero. Tente novamente.");
            }
        } while (valor <= 0);
        return valor;
    }

    public static double calcularVolume(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}
