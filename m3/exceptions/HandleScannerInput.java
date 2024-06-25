package m3.exceptions;

import java.util.Scanner;

public class HandleScannerInput {

  public static void main(String[] args) {

    getInteger();

  }

  public static int getInteger() {
    try {
      final Scanner scanner = new Scanner(System.in);
      System.out.print("Enter integer => ");
      return Integer.parseInt(scanner.nextLine());
    } catch (NumberFormatException wrongInput) {
      System.out.println("Invalid input! Please enter an integer.");
      return getInteger();
    } finally {
      scanner.close(); // we always call .close()
    }
  }

}
