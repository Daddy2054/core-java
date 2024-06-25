package m2.coding;

// FREEZE CODE BEGINS
import java.util.*;

public class Exercise1 {

  public static void main(String[] args) {

    List<String> groceries = Arrays.asList(args);
    // FREEZE CODE ENDS
    // groceries = ["orange", "orange", "banana", "apple"];
    Set<String> groceriesSet = new TreeSet<String>();
    groceriesSet.addAll(groceries);

    for (String grocery : groceriesSet) {
      System.out.println(grocery);
    }
    // WRITE YOUR CODE HERE

    // FREEZE CODE BEGINS
  }

}
// FREEZE CODE ENDS

// possible solution
// Set<String> fruits = new HashSet<String>();

// fruits.addAll(groceries);

// while(!fruits.isEmpty()) {
//   System.out.println(Collections.min(fruits));
//   fruits.remove(Collections.min(fruits));
// }