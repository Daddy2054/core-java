package m2.streams;

import java.util.function.Function;

class StringToLengthFunction implements Function<String, Integer> {
    @Override
    public Integer apply(final String line) {
        return line == null ? 0 : line.length();
    }
}

----

System.out.println(new StringToLengthFunction().apply("hello")); // 5
System.out.println(new StringToLengthFunction().apply("hellohello")); // 10

// Summarize the four stream-related functional interfaces by filling in the blanks in the table below.

// Note: If a type was not specified above, the interface handles generic type T and/or R.

// Accepts	Functional Interface	Returns
// T	
// Consumer
// None
// T	
// Function
// R
// None	
// Supplier
// T
// T	
// Predicate
// boolean
// Consumer accepts a type but does not return anything.

// Function accepts a type and returns a type – and the types do not have to be the same.

// Supplier does not accept anything and returns a type.

// Predicate test function accepts a type and returns boolean.