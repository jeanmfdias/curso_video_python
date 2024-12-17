import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = leitor.nextLine();

        if (texto.isEmpty()) {
            System.out.println("Está vazio");
        }

        if (!texto.isEmpty() && texto.matches("[A-Za-z]+")) {
            System.out.println("É Alfabetico");
        }

        if (!texto.isEmpty() && texto.matches("[0-9]+")) {
            System.out.println("É Numerico");
        }
    }
}
