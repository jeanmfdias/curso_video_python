import java.util.List;
import java.util.Random;

public class Exercicio19Modulo {
    public String nomeSorteado(List<String> nomes) {
        Random random = new Random();
        int numeroSorteado = random.nextInt(4);
        return nomes.get(numeroSorteado);
    }
}
