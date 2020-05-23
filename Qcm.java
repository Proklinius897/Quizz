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
        ///System.out.println(this.texte + "\n"); ///afficher question
        int size;///taille de l'arraylist
        ArrayList<String> maj = new ArrayList<>();
        int i=0;
        while(i < 4){ ///On va afficher 4 reponses dont une bonne
            size = randomize.size();///on prends la taille de randomize
            int rand = new Random().nextInt(size);///on génère un entier au hasard (il se situe dans l'index)
            //System.out.println("Réponse " + (i+1) +" : "+ randomize.get(rand)); ///on print la réponse
            maj.add(randomize.get(rand)); ///on met a jour le tableau maj
            randomize.remove(rand);///On enlève ce qui a été print
            i++;

        }
        /// System.out.println(maj); ///Ce tableau contient les réponse dans l'ordre après qu'elle ai été mélangé par afficher
        randomize = maj;/// on modifie randomize pour qu'il corresponde au reps


    }

    public String toString(){
        afficher();
        return texte + "\n" + "Réponse 1 : " + randomize.get(0)+ "\nRéponse 2 : " + randomize.get(1)+ "\nRéponse 3 : " + randomize.get(2) + "\nRéponse 4 : " + randomize.get(3);

    }



}
