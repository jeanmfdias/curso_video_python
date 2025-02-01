import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.reset();
        System.out.print("Digite o nome de uma cidade: ");
        String cidade = leitor.nextLine();

        if (cidade.toLowerCase().startsWith("santo")) {
            System.out.println("Cidade começa com a palavra SANTO");
        } else {
            System.out.println("Cidade NÃO começa com a palavra SANTO");
        }
    }
}
