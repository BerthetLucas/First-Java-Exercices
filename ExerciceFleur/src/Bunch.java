import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bunch {

    private String name;
    private double price;
    private String theme;
    private List<Fleur> fleurs;


    public Bunch(String name, double price, String theme, List<Fleur> fleurs) {
        this.name = name;
        this.price = price;
        this.theme = theme;
        this.fleurs = fleurs;
    }

    public List<String> DisplayFlowerNameWithSameColor(String color){

        Set<String> flowerList = new HashSet<>();

        for (Fleur fleur : fleurs) {
            if (fleur.getColor().equals(color)) {
                flowerList.add(fleur.getName());
            }
        }
        return new ArrayList<>(flowerList);
    }

    public List<String> DisplayFlowerNameStartingWithSameLetter(String firstLetter){
        Set<String> flowerList = new HashSet<>();

        for (Fleur fleur : fleurs) {
            if ((fleur.getName()).charAt(0) == (firstLetter.charAt(0))) {
                flowerList.add(fleur.getName());
            }
        }

        return new ArrayList<>(flowerList);
    }

    public List<String> DisplayFlowerNameDependsOnNamesLength(int wordLength){
        Set<String> flowerList = new HashSet<>();

        for (Fleur fleur : fleurs) {
            if (fleur.getName().length() > wordLength) {
                flowerList.add(fleur.getName());
            }
        }
        return new ArrayList<>(flowerList);
    }
}
