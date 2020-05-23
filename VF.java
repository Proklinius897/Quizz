public class VF {
    String texte;
    boolean bonnerep;

    public VF(String texte, boolean bonnerep) {
        this.texte = texte;
        this.bonnerep = bonnerep;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public boolean isBonnerep() {
        return bonnerep;
    }

    public void setBonnerep(boolean bonnerep) {
        this.bonnerep = bonnerep;
    }
    @Override
    public String toString(){
        return texte+"\n"+"Vrai ou faux?";
        /*System.out.println(texte+"\n");
        System.out.println("Vrai ou faux?");*/
    }
}
