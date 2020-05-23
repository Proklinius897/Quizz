import java.util.ArrayList;
import java.util.Random;

public class Qcm {
    private String texte;
    private String repA;
    private String repB;
    private String repC;
    private String bonnerep;
    private ArrayList<String> randomize= new ArrayList<>(); ///va nous permettre de randomize l'affichage

    public Qcm(String texte, String repA, String repB, String repC, String bonnerep) {
        this.texte = texte;
        this.repA = repA;
        this.repB = repB;
        this.repC = repC;
        this.bonnerep = bonnerep;
        this.randomize.add(repA);
        this.randomize.add(repB);
        this.randomize.add(repC);
        this.randomize.add(bonnerep);

    }

    public void afficher(){ ///Permet de ne pas afficher la bonne rep en dernier
        System.out.println(this.texte + "\n"); ///afficher question
        int size;///taille de l'arraylist

        int i=0;
        while(i < 4){ ///On va afficher 4 reponses dont une bonne
            size = randomize.size();///on prends la taille de randomize
            int rand = new Random().nextInt(size);///on génère un entier au hasard (il se situe dans l'index)
            System.out.println("Réponse " + (i+1) +" : "+ randomize.get(rand)); ///on print la réponse
            randomize.remove(rand);///On enlève ce qui a été print
            i++;

        }



    }


}
