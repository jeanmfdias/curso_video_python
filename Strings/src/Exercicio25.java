import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.reset();
        System.out.print("Digite o nome completo de uma pessoa: ");
        String nomeCompleto = leitor.nextLine();

        if (nomeCompleto.toLowerCase().contains("silva")) {
            System.out.println("Nome completo contém SILVA");
        } else {
            System.out.println("Nome completo NÃO contém SILVA");
        }
    }
}
