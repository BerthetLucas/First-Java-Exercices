//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Création de la liste de fleurs
        List<Fleur> Fleurs = new ArrayList<Fleur>();
        Fleurs.add(new Fleur("Chrysanthème", "blanc"));
        Fleurs.add(new Fleur("Chrysanthème", "blanc"));
        Fleurs.add(new Fleur("Rose", "rouge"));
        Fleurs.add(new Fleur("Coquelicot", "rouge"));
        Fleurs.add(new Fleur("Pétunia", "violet"));
        Fleurs.add(new Fleur("Pédoncule", "vert"));


        // Création du bouquet
        Bunch bouquet = new Bunch("Fête des mères", 52.5, "Amour", Fleurs);

        // Affichage des fleurs de couleur 'blanc'
        System.out.println(bouquet.DisplayFlowerNameWithSameColor("rouge"));

        System.out.println(bouquet.DisplayFlowerNameStartingWithSameLetter("C"));
        System.out.println(bouquet.DisplayFlowerNameDependsOnNamesLength(10));
    }
}