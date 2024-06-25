import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Helpers {

  public static void main(String args[]) {

    //create a random list of ints
    List<Integer> list = new ArrayList<Integer>();
    Random rand = new Random();
    int size = 5 + rand.nextInt(10);
    for(int i = 0; i < size; i++) {
      list.add(rand.nextInt(100));
    }
    System.out.println("The original list is: " + list);

    //create list to copy to
    List<Integer> copiedList = new ArrayList<Integer>(size);
    // adding dummy data so lists are same size
    for(int i = 0; i < size; i++) {
      copiedList.add(rand.nextInt(100));
    }
    //copy the original list
    Collections.copy(copiedList, list);

    //delete largest from copy
    copiedList.remove(Collections.max(copiedList));

    // print current largest which is the second largest
    System.out.println("Second largest number is: " + Collections.max(copiedList));

  }

}

// List<Integer> copiedList = new ArrayList<Integer>();
// for(int i = 0; i < existingList.size(); i++) {
//     copiedList.add(0);
// }
// Collections.copy(copiedList, existingList);
// Collections.reverse(copiedList);
// if(copiedList.size() > 1) {
//   secondLargest = copiedList.get(1);
// }
// else {
//   secondLargest = -1;
// }