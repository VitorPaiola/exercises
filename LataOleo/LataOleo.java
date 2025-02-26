package LataOleo;

/*
    Calcular e apresentar o valor do volume de uma lata de óleo, 
    utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A 
    representam respectivamente o volume, o raio e a altura.
    Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as 
    variáveis de altura e de raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, 
    em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado.

    TODO: 1 - javac -d . LataOleo/LataOleo.java
    TODO: 2 - java LataOleo.LataOleo
*/

public class LataOleo {
    public static void main(String[] args) {
        double V, R, A;
        R = 3.2;
        A = 4.9;

        V = 3.14159 * R * R * A;
        System.out.println("O volume da lata de óleo é de " + V + " m³");
    }
}
