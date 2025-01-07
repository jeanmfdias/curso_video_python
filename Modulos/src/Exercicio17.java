import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.reset();

        System.out.print("Digite o valor do cateto oposto: ");
        double catetoOposto = leitor.nextDouble();
        System.out.print("Digite o valor do cateto adjacente: ");
        double catetoAdjacente = leitor.nextDouble();

        Exercicio17Modulo modulo = new Exercicio17Modulo();
        double hipotenusa = modulo.retornaHipotenusa(catetoOposto, catetoAdjacente);
        System.out.println("A hipotenusa é: %.2f".formatted(hipotenusa));
    }
}
