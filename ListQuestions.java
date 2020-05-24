import java.util.LinkedList;

public class ListQuestions {
    private String theme;
    private LinkedList <Question> list= new LinkedList<Question>();

    public ListQuestions(String theme) {
        this.theme = theme;
    }

    public ListQuestions(String theme, LinkedList<Question> list) {
        this.theme = theme;
        this.list = list;
    }

    public void AfficherListe(){
        System.out.println("Liste du theme : " + this.theme);
        list.forEach(question -> question.Afficher());
    }

    public void ajouter (Question question){
        list.add(question);
    }

    public void getElementbyNumber(int numero){

    }

    public void supprimer (int numero){
        int i;
        for(i=0;i<list.size();i++){
            if(list.get(i).getNumero()==numero)
                list.remove(i);
            else{
                System.out.println("Cette question n'existe pas monsieur!");
            }
        }
    }

}
