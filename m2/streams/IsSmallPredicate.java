package m2.streams;

import java.util.function.Predicate;

class IsSmallPredicate implements Predicate<String> {
    @Override
    public boolean test(final String line) {
        return line == null || line.length() < 10;
    }
}

// -----

System.out.println(new IsSmallPredicate().test("hello")); // true, line too small
System.out.println(new IsSmallPredicate().test("hellohello")); // false, line is ok
