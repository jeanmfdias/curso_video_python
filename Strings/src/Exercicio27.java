import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.reset();
        System.out.print("Digite um nome completo: ");
        String nomeCompleto = leitor.nextLine();

        String[] nomeSeparado = nomeCompleto.split(" ");
        System.out.println("Primeiro nome: %s".formatted(nomeSeparado[0]));
        System.out.println("Último nome: %s".formatted(nomeSeparado[nomeSeparado.length - 1]));
    }
}
