package Es2;

import java.util.*;

public class MainList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero causale da 1 a 100");
        int numberChoose = scanner.nextInt();

        List<Integer> listaCasual = new ArrayList<>();
        generaListaCasuale(listaCasual, numberChoose);

        List<Integer> listaNumeriInvertiti = new ArrayList<>(listaCasual);
        crealistaNumeriInvertiti(listaNumeriInvertiti);
    }

    private static void crealistaNumeriInvertiti(List<Integer> listaNumeriInvertiti) {
        Collections.reverse(listaNumeriInvertiti);
        listaNumeriInvertiti.addAll(new ArrayList<>(listaNumeriInvertiti));
        System.out.println("Lista numeri invertiti: " + listaNumeriInvertiti);
    }

    private static void generaListaCasuale(List<Integer> listaCasual, int numberChoose) {
        Random random = new Random();

        for (int i = 0; i < numberChoose; i++) {
            listaCasual.add(random.nextInt(101));
        }
        System.out.println("Lista casuale:" + listaCasual);
        numberP(listaCasual);
        Collections.sort(listaCasual);
        System.out.println("Lista ordinata" + listaCasual);
    }

    private static void numberP(List<Integer> listaCasual) {
        System.out.println("Ecco i numeri pari:");
        for (int i = 0; i < listaCasual.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(listaCasual.get(i));
            }
        }
    }
}
