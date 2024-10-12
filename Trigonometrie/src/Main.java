//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Formula cosinus = new Cosinus();
        System.out.println("côté adjacent/hypothénuse" + " " + cosinus.compute(8, 0, 11));


        Formula sinus = new Sinus();
        System.out.println("côté opposé/hypothénuse" + " " + sinus.compute(0, 5, 11));

        Formula tangent = new Tangent();
        System.out.println("côté opposé/côté adjacent" + " " + tangent.compute(8, 5, 0));

    }
}