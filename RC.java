public class RC {
    private String texte;
    private String bonnerep;

    public RC(String texte, String bonnerep) {
        this.texte = texte;
        this.bonnerep = bonnerep;
    }
    @Override
    public String toString(){
        return texte + "\n" + "Veuilliez entrez votre réponse";
        ///System.out.println(texte+"\n");
        ///System.out.println("Veuilliez entrez votre réponse");
    }
}
