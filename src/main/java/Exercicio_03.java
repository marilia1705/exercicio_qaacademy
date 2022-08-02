import javax.swing.*;

public class Exercicio_03 {
    static int primeiroValor, segundoValor;
    public static void main(String[] args) {

        primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Valor: "));
        segundoValor = Integer.parseInt (JOptionPane.showInputDialog("Digite o segundo valor: "));

        System.out.println("Primeiro valor digitado: " + segundoValor);
        System.out.println("Segundo valor digitado:" + primeiroValor);
    }
}
