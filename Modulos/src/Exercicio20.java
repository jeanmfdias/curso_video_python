import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        System.out.println("Digite o nome de 4 alunos:");
        for (int i = 0; i < 4; i++) {
            scanner.reset();
            String nome = scanner.nextLine();
            nomes.add(nome);
        }
        Exercicio20Modulo modulo = new Exercicio20Modulo();
        List<String> nomesSorteados = modulo.retornarAlunosOrderSorteio(nomes);
        System.out.println("Nomes sorteados foram: ");
        nomesSorteados.stream().forEach(System.out::println);
    }
}
