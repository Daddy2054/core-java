package m2.streams;

import java.util.function.Consumer;

class PrintConsumer implements Consumer<String> {
    @Override
    public void accept(final String line) {
        // consumer accept a line and do some action,
        // action could be different in different consumer implementations
        System.out.println(line);
    }
}

-----

new PrintConsumer().accept("hello");