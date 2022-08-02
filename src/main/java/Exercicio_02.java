import javax.swing.*;

public class Exercicio_02 {
    static String palavraDigitadas;

    public static void main(String[] args) {

        palavraDigitadas = JOptionPane.showInputDialog("Digite uma palavra");
        System.out.println ("O usuário digitou: " + palavraDigitadas);
    }

}
