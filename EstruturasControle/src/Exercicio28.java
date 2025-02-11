import java.util.Random;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Random sorteio = new Random();
        Scanner leitor = new Scanner(System.in);
        int numSorteado = sorteio.nextInt(0, 5);
        int numEscolhido = -1;
        leitor.reset();
        while (numEscolhido != numSorteado) {
            System.out.print("Escolha um número entre 0 e 5: ");
            numEscolhido = leitor.nextInt();
            if (numEscolhido != numSorteado) {
                System.out.println("Você errou!");
            }
        }
        System.out.println("Você acertou!");
    }
}
