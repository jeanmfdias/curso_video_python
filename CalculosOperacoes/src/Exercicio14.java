import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        double temperaturaEmCelsius = leitor.nextDouble();
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        String texto = String.format(
                "A temperatura %.2f em Fahrenheit é %.2f",
                temperaturaEmCelsius,
                temperaturaEmFahrenheit);
        System.out.println(texto);
    }
}
