package Es1;

import Es1.entities.User;

import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User marco= new User(10,"ciao");
        User luca= new User(11,"ciao1");
        User giovanni= new User(12,"ciao2");
Set<User> usersSet= new HashSet<>();
        usersSet.add(marco);
        usersSet.add(luca);
        usersSet.add(giovanni);
System.out.println("questo sono tutte le parole duplicate:"+" " +marco.getNparole()+ " " + marco.getNparole());
System.out.println("questo è il numero di parole distinte:"+ " "+usersSet.size());
System.out.println("questo sono tutte l'elenco di tutte le parole distinte:"+" "+marco.getNparole()+" "+luca.getNparole()+" "+giovanni.getNparole());
    }
}