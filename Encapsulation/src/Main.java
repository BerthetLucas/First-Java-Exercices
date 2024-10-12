import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<VideoGame> games = new ArrayList<>();

        VideoGame vg1 = new VideoGame("Mario Bros", 255.8,"Jeu de plateforme");
        VideoGame vg2 = new VideoGame("Pokémon", 399.99,"RPG");
        VideoGame vg3 = new VideoGame("Dragon Ball", 544.9,"Versus Fighting");

        games.add(vg1);
        games.add(vg2);
        games.add(vg3);

        for (VideoGame game : games) {
            System.out.println(game.toString());
        }

        System.out.println("PROMO !!");

        for (VideoGame game : games) {
            game.setPrice(100);
            System.out.println(game.toString());
        }

    }
}