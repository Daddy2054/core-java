import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

  public static void main(String args[]) {

    Set<String> fruits = new HashSet<String>();

    fruits.add("banana");
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("orange");

    System.out.print("Number of fruits: ");
    System.out.println(fruits.size());

    System.out.print("Grapes in set? ");
    System.out.println(fruits.contains("grapes"));

    fruits.remove("banana");
    fruits.remove("orange");

    System.out.print("Is the set empty? ");
    System.out.println(fruits.isEmpty());

    fruits.clear();

  }

}

// Match the most appropriate Set implementation to the context below.

// Context Set Implementation
// Shopping cart where items need to be grouped in an order you specify (e.g.
// grocery store segmented by departments: produce, frozen, etc.)
// TreeSet

// Shopping cart where speed is the only thing that matters (e.g. startup with
// only 1 product that is going on SharkTank)
// HashSet

// Shopping cart where items need to be in the order they were added (e.g.
// clothing store)
// LinkedHashSet

// Even when building a common utility like a shopping cart, contextual nuances
// like the type of store can change the details of implementation.

// The nice part is that if the context changes (e.g. the start up which needed
// speed now has more products and wants insertion order preserved in the
// shopping cart) the fact that all of these options are implementations of the
// same interface means that swapping out the exact implementation is an easy
// task.

// Check It!