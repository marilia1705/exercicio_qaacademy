import javax.swing.*;

public class Exercicio_9 {

    static int numDigitado, i=1, resultado;

    public static void main(String[] args) {
        numDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite umm número para ser multiplicado: "));

        while (i <= 10){
            resultado = numDigitado * i;
            System.out.println(numDigitado + "x" + i + "=" + resultado);
            i++;
        }
    }

}
