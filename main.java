public class main {
    public static void main(String[] args) {
        Qcm qcm = new Qcm("Quel est ce chiffre?","1","2","3","4");
        VF vf = new VF("C vrai ou faux?", true);


        /*qcm.afficher();*/
        /// test de question
        Question<VF> premiere = new Question("horreur", 1, vf);
        Question<Qcm> second = new Question("horreur", 2, qcm);
        premiere.Afficher();
        second.Afficher();


    }

}
