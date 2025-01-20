import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 4 nomes: ");
        for (int i = 0; i < 4; i++) {
            scanner.reset();
            String nome = scanner.nextLine().trim();
            nomes.add(nome);
        }
        Exercicio19Modulo modulo = new Exercicio19Modulo();
        String nomeSorteado = modulo.nomeSorteado(nomes);
        System.out.println("O nome sorteado foi: %s".formatted(nomeSorteado));
    }
}
