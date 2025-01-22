import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Exercicio20Modulo {
    public List<String> retornarAlunosOrderSorteio(List<String> nomes) {
        List<String> nomesSorteados = new ArrayList<>();
        Random rand = new Random();
        int i = 0;
        while (i < 4) {
            int numSorteado = rand.nextInt(nomes.size());
            nomesSorteados.add(nomes.get(numSorteado));
            nomes.remove(numSorteado);
            i++;
        }
        return nomesSorteados;
    }
}
