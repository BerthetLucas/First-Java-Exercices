import java.util.Iterator;
import java.util.List;

public class Exo1ToCorrect {

	public static void main(String[] args) {
		List<String> names = null;
		names.add("Safinette");
		names.add("Benji");
		names.add("Camille");
		
		names.add(99);
		
		System.out.println("Premier nom de la liste: "+names.get(10));
		
		System.out.println("Affichage des éléments de la liste avec une boucle for");
		for(int i=0; i<=names.size();i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("Affichage des éléments de la liste avec un iterator");
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it);
		}

	}

}
