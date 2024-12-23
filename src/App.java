import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        consonnes();
    }

    public static void consonnes() {
        int i, indice;
        char[] tirage_consonnes = new char[5]; // tableau qui va contenir les 5 consonnes tirées aléatoirement
        char[] consonnes1 = { 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W',
                'X', 'Z' }; // tableau des consonnes
        ArrayList<Character> consonnes2 = new ArrayList<Character>(); // On converti notre tableau consonnes1 en
                                                                      // ArrayList afin de pouvoir mélanger la liste de
                                                                      // manière aléatoire
        for (char c : consonnes1) {
            consonnes2.add(c);
        }
        java.util.Collections.shuffle(consonnes2); // On mélange la liste consonnes2 de manière aléatoire en utilisant
                                                   // la méthode shuffle de la classe Collections
        for (i = 0; i < 5; i++) {
            System.out.println("sélectionner un indice entre 0 et 19");// On demande à l'utilsateur de saisir un indice
                                                                       // entre 0 et 19 afin de choisir une consonne de
                                                                       // la liste
            indice = Lire.i();
            if (indice < 0 || indice > 19) { // On vérifie que l'indice saisi par l'utilisateur est bien compris entre 0
                                             // et 19
                System.out.println("L'indice doit être compris entre 0 et 19");
            }
            tirage_consonnes[i] = consonnes2.get(indice); // On ajoute la consonne choisie par l'utilisateur dans le
                                                          // tableau tirage_consonnes
            java.util.Collections.shuffle(consonnes2);// On remélamnge la liste consonnes2 de manière aléatoire
        }
        for (i = 0; i < 5; i++) {
            System.out.print(tirage_consonnes[i] + " "); // On affiche les 5 consonnes tirées aléatoirement
        }
    }
}