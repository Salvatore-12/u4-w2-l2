package Es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero causale da 1 a 100");
        int numberChoose = scanner.nextInt();

        List<Integer> listaCasual = new ArrayList<>();
        generaListaCasuale(listaCasual, numberChoose);

        List<Integer> listaNumeriInvertiti = new ArrayList<>(listaCasual);
        crealistaNumeriInvertiti(listaNumeriInvertiti);
    }

    private static void crealistaNumeriInvertiti(List<Integer> listaNumeriInvertiti) {
    }

    private static void generaListaCasuale(List<Integer> listaCasual, int numberChoose) {
        Random random = new Random();

        for (int i = 0; i < numberChoose; i++) {
            listaCasual.add(random.nextInt(101));
        }
        System.out.println("Lista casuale:" + listaCasual);}
}
