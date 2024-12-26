import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        var texto = leitor.nextLine();

        boolean ehVazio = texto.isEmpty();
        boolean ehAlfabetico = texto.matches("[A-Za-z]+");
        boolean ehNumerico = texto.matches("-?\\d+(\\.\\d+)?");
        boolean ehAlfanumerico = texto.matches("[A-Za-z0-9]+");
        boolean tudoMaiusculas = texto.equals(texto.toUpperCase());
        boolean tudoMinusculas = texto.equals(texto.toLowerCase());
        boolean estaCapitalizado = texto.equals(texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase());

        System.out.println("Está vazio: " + ehVazio);
        System.out.println("É Alfabético: " + ehAlfabetico);
        System.out.println("É Númerico: " + ehNumerico);
        System.out.println("É Alfanúmerico: " + ehAlfanumerico);
        System.out.println("Tudo em maiúsculas: " + tudoMaiusculas);
        System.out.println("Tudo em minúsculas: " + tudoMinusculas);
        System.out.println("Está capitalizado: " + estaCapitalizado);
        System.out.println("Java é tipado com isso o nextLine do Scanner sempre vai retornar " + texto.getClass());
    }
}
