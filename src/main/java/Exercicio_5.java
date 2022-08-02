import javax.swing.*;

public class Exercicio_5 {

    static int valor1, valor2, valor3, soma,subtracao, multiplicacao,divisaomedia;
    public static void main(String[] args) {
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));

        soma = valor1 + (valor2 + valor3);
        subtracao = valor1 - valor2 - valor3;
        multiplicacao = (valor1 * valor2) + valor3;
        divisaomedia = (soma/3);

        System.out.println("Valores: " + "\n Soma: " + soma + "\n Subtração: " + subtracao
        + "\n Miltiplocação: " + multiplicacao + "\n Média: " + divisaomedia);
    }
}
