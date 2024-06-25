package m2.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListExample {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<Integer>();

    Random rand = new Random();

    int size = 5 + rand.nextInt(10);
    for (int i = 0; i <= size; i++) {
      list.add(rand.nextInt(100));
    }

    // inserts at a location
    list.add(rand.nextInt(list.size()), rand.nextInt(100));

    list.set(rand.nextInt(list.size()), rand.nextInt(100));

    list.remove(rand.nextInt(list.size()));

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ", ");
    }
    System.out.println(list.get(list.size() - 1));

  }

}

// Match the
// Map implementation
// with the
// appropriate key
// order.

// Key Order
// Map Implementation

// Natural (e.g. alphabetical) or Custom
// TreeMap

// Inserted (e.g. first key is the first inserted)
// LinkedHashMap

// Random
// HashMap

// Key order could be important if you have to frequently search existing keys to prevent over-writing.