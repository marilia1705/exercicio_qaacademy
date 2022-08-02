import javax.swing.*;

public class Exercicio_04 {

    static int numeroDigitado, resultado;

    public static void main(String[] args) {
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Insira um número que será multiplicado: "));
        resultado = numeroDigitado * 2;
        System.out.println ("O dobro do valor digitado é: " + resultado);
    }
}
