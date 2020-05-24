public class main {
    public static void main(String[] args) {
        Qcm qcm = new Qcm("Quel procédé effraie d'un seul coup?","Jon Bon Jovi","La crème","Le klaxon","Le screamer");
        VF vf = new VF("Frankenstein est sorti avant hamlet", false);


        /*qcm.afficher();*/
        /// test de question
        Question<VF> premiere = new Question("Horreur", 1, vf);
        Question<Qcm> second = new Question("Horreur", 2, qcm);
        premiere.Afficher();
        second.Afficher();

        ///Test Theme
        Themes themes = new Themes();
        themes.add(premiere.getTheme());
        themes.add("Drama");
        themes.add("Fantastic");
        themes.add("Policier");
        themes.add("Anime");
        themes.add("Solomon");
        themes.add("Anime");
        ///Test theme
        System.out.println(themes.getThemes());
        ///Selectionner faux theme
        System.out.println(themes.SelectionnerTheme("Dramo"));
        ///Selectionner 5 theme into HashMap
        System.out.println(themes.SelectionnerCinqThemes("Horreur","Drama","Fantastic","Policier","Anime"));
        ///Vérif toString
        System.out.println(themes.toString());

        System.out.println("test list question \n");
        ListQuestions horreur = new ListQuestions("Horreur");
        horreur.ajouter(premiere);
        horreur.ajouter(second);
        horreur.AfficherListe();
        horreur.supprimer(1);

        System.out.println("On reprint la liste pour tester \n\n");
        horreur.AfficherListe();




    }

}
