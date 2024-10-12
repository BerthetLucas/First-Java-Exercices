//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HttpHeader constructor1 = new HttpHeader();
        System.out.println("Constructeur 1: "+ constructor1.toString());

        HttpHeader constructor2 = new HttpHeader("HTTP/1.1", "200 OK");
        System.out.println("Constructeur 2: "+ constructor2.toString());

        HttpHeader constructor3 = new HttpHeader("www.ideva.com");
        System.out.println("Constructeur 3: "+ constructor3.toString());

        HttpHeader constructor4 = new HttpHeader("text/html,application/xml", "HTTP/1.1", "200 ok", "UTF-8", "test/HTML", 12, "www.ideva.com");
        System.out.println("Constructeur 4: "+ constructor4.toString());
    }
}