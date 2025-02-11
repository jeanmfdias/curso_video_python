import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        leitor.reset();
        String frase = leitor.nextLine();

        String[] letras = frase.toLowerCase().split("");
        int contA = 0;
        int posicaoDoPrimeiro = frase.toLowerCase().indexOf("a") + 1;
        int posicaoDoUltimo = frase.toLowerCase().lastIndexOf("a") + 1;
        for (String letra : letras) {
            if (letra.equals("a")) {
                contA++;
            }
        }
        String plural = contA > 1 ? "(s)" : "";
        System.out.println("A frase tem %d A%s".formatted(contA, plural));
        System.out.println("A posição do primeiro A é o %dº caracter".formatted(posicaoDoPrimeiro));
        System.out.println("A posição do último A é o %dº caracter".formatted(posicaoDoUltimo));
    }
}
