import javax.swing.*;

public class Exercicio_10_2 {
    static double valorjuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
    static int ano = 1;

    public static void main(String[] args) {
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Insira um número: "));

        while (ano <= 10) {
            valorjuros = valorJuros + (valorInvestimento * taxaJuros);
            ano++;
        }
        
    }
}
