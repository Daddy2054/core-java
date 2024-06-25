package m2.implementing;

import java.util.function.Predicate;

public class ImplementingFunctionalInterfaces {

  public static void main(String args[]){

    // Anonymous class example of implementing Predicate
    final Predicate<Integer> isAdult = new Predicate<Integer>() {
        @Override
        public boolean test(final Integer age) {
            return age >= 18;
        }
    };
    final Predicate<Integer> isAdult2 = age -> age >= 18;


    final Predicate<Integer> someCheck = age -> {
      if (age >= 18) {
        return false;
      }
      if (age <= 90) {
        return false;
      }
      return true;
    };

    //using implemented Predicate Functional Interface
    System.out.println(isAdult.test(10));
    System.out.println(isAdult.test(20));
    System.out.println(isAdult2.test(10));
    System.out.println(isAdult2.test(20));

  }

}