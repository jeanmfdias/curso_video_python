import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.print("Digite um nome completo: ");
        String nome = scanner.nextLine();
        String[] textoSeparado = nome.split(" ");

        System.out.println("Maiusculas: %s".formatted(nome.toUpperCase()));
        System.out.println("Minusculas: %s".formatted(nome.toLowerCase()));
        System.out.println("Total de caracteres: %d".formatted(nome.replace(" ", "").length()));
        System.out.println("Tamanho primeiro nome: %d".formatted(textoSeparado[0].length()));

    }
}
