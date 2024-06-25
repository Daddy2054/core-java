package m2.streams;

import java.util.function.Supplier;

class HelloSupplier implements Supplier<String> {
    @Override
    public String get() {
        // we could generate any required for business logic result here
        return "hello";
    }
}

------

// get generated result
System.out.println(new HelloSupplier().get());