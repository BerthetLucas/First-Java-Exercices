import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Safia", "Gharbi");
        people.add(person1);
        Person person2 = new Student("Hugo", "Dupery", "987654");
        people.add(person2);
        Person person3 = new Person("Elodie", "Varlet");
        people.add(person3);
        Person person4 = new Student("Hector", "Dumas", "765432");
        people.add(person4);
        Person person5 = new Person("Eliott", "Batista");
        people.add(person5);


        for (Person person : people) {
            System.out.println(person.toString());
        }

    }
}