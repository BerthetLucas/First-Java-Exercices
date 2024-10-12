import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int justePrix = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);

       System.out.println("Entrez un nombre pour deviner le juste prix");

       int prix = scanner.nextInt();

       while (prix != justePrix) {

           if (prix < justePrix) {
               System.out.println("Dommage c'est en dessous !");
           }

           if (prix > justePrix) {
               System.out.println("Dommage c'est au dessus !");
           }
           prix = scanner.nextInt();
       }

       if (prix == justePrix) {
           System.out.println("Congratulations");
       }
    }
}