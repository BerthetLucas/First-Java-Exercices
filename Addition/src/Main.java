//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Addition additionInt = new Addition();
    System.out.println(additionInt.add(4, 4, 4));

    Addition additionDouble = new Addition();
    System.out.println(additionDouble.add(8, 1.5));

    Addition additionFloat = new Addition();
    System.out.println(additionFloat.add(1.56, 1));

    Addition additionString = new Addition();
    System.out.println(additionString.add("chocolat", "chocolat", "chocolat"));

    }
}