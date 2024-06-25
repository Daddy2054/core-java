package m2.list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

  public static void main(String[] args) {

    Map<String, String> animals = new HashMap<String, String>();

    animals.put("Muffin", "Cat");
    animals.put("Fido", "Dog");
    animals.put("Rover", "Dog");
    animals.put("Biscuit", "Hamster");

    System.out.print("Number of animals: ");
    System.out.println(animals.size());

    System.out.print("Muffin in map? ");
    System.out.println(animals.containsKey("Muffin"));
    System.out.print("What type of animal is Muffin? ");
    System.out.println(animals.get("Muffin"));
    animals.remove("Biscuit");

    animals.replace("Muffin", "Dog");

    System.out.print("Is the Map empty? ");
    System.out.println(animals.isEmpty());

    System.out.println(animals.keySet());
    System.out.println(animals.values());

    animals.clear();

  }

}