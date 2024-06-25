package m3.coding;

// FREEZE CODE BEGINS
import java.util.*;

public class Exercise2 {
  public static void main(String[] args) {
    sumNums();
  }

  public static void sumNums() {
    double sum = 0;
    double number = 0;
    // FREEZE CODE ENDS
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Enter number (0 to end) => ");
      try {
        number = scanner.nextDouble();
      } catch (InputMismatchException wrongInput) {
        System.out.println("Invalid input! Please enter a number.");
        break;

      }
      sum += number;
    } while (number != 0);

    scanner.close(); // we always call .close()
    // FREEZE CODE BEGINS
    System.out.println(sum);
  }
}
// FREEZE CODE ENDS

//possible solution
// try (Scanner scanner = new Scanner(System.in)) {
//   do {
//     System.out.print("Enter number (0 to end) => ");
//     number = scanner.nextDouble();
//     sum += number;
//   } while(number != 0);
// } catch (InputMismatchException wrongInput) {
//   System.out.println("Invalid input! Please enter a number.");
// }