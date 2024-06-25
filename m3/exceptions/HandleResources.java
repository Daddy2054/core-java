package m3.exceptions;

import java.util.Scanner;

public class HandleResources {

  public static void main(String[] args) {

    getInteger();

  }

  public static int getInteger() {
    final Scanner scanner = new Scanner(System.in);
    try (scanner) {
      System.out.print("Enter integer => ");
      return Integer.parseInt(scanner.nextLine());
    } catch (NumberFormatException wrongInput) {
      System.out.println("Invalid input! Please enter an integer.");
      return getInteger();
    } // JVM will close Scanner in auto way
  }

}
