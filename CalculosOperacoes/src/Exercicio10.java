import javax.swing.*;

public class Exercicio10 {
    public static void main(String[] args) {
        double dinheiro = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Digite um valor em R$",
                "Exercicio 10",
                JOptionPane.QUESTION_MESSAGE));
        double emDolar = dinheiro * 6.04;
        JOptionPane.showMessageDialog(
                null,
                "R$ %.2f em dolar é US$ %.2f".formatted(dinheiro, emDolar),
                "Exercicio 10",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
