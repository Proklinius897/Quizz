import java.util.*;
import java.util.TreeMap;

public class Themes {
    private String theme;
    private ArrayList<String> themes;




    public Themes() {
        this.themes = new ArrayList<String>();
    }

    public void add(String theme){
        if (themes.size()<9 && !themes.contains(theme)){
            this.themes.add(theme);
        }
        else{
            if (themes.size()>=9)
                System.out.println("Le nombre de thème est au max");
            if (themes.contains(theme))
                System.out.println("Ce thème est deja présent");
        }
    }

    public int SelectionnerTheme(String theme){
        if(!themes.contains(theme)){
            System.out.println("le theme n'existe pas! \n ");
        }
        return themes.indexOf(theme);

    }

    public HashMap<String,Integer> SelectionnerCinqThemes(String theme1,String theme2,String theme3, String theme4, String theme5){
        HashMap<String, Integer> themeIndex = new HashMap<String, Integer>(); /// On initialise HashMap pour stocker le theme et son index
        themeIndex.put(theme1,themes.indexOf(theme1));
        themeIndex.put(theme2,themes.indexOf(theme2));
        themeIndex.put(theme3,themes.indexOf(theme3));
        themeIndex.put(theme4,themes.indexOf(theme4));
        themeIndex.put(theme5,themes.indexOf(theme5));
        return themeIndex; /// Permet d'obtenir l'index de tout les themes selectionnées

    }

    ///AFFICHAGE
    @Override
    public String toString(){
        int i=0;
        HashMap<Integer, String> print = new HashMap<Integer, String>();
        for(i = 0; i<themes.size(); i++){
            print.put(i,themes.get(i));

        }
        return print.toString();
    }



    public void ModifierTheme(String theme1, String theme2){
        themes.remove(theme1);
        themes.add(theme2);
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public ArrayList<String> getThemes() {
        return themes;
    }

    public void setThemes(ArrayList<String> themes) {
        this.themes = themes;
    }

}
