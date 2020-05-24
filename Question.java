public class Question<T> {
    private int numero=0;
    private String theme; ///CHANGER STRING EN THEME LORSQUE LA CLASSE SERA CREEE
    private int niveau;
    private T type;


    public Question (String theme, int niveau, T type) {
        numero = numero+1;
        this.theme = theme;
        this.niveau = niveau;
        this.type = type;



    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void Afficher(){
        if (niveau ==1){
            System.out.println("Le niveau de la question est : Facile");
            System.out.println(type.toString());
        }
        if(niveau ==2) {
            System.out.println("Le niveau de la question est : Moyen");
            System.out.println(type.toString());

        }
        if(niveau ==3) {
            System.out.println("Le niveau de la question est : Difficile");
            System.out.println(type.toString());

        }
    }

}
