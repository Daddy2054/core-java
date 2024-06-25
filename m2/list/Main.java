import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        final Map<String, Integer> map = new ConcurrentHashMap<>();
        // final Map<String, Integer> map = new HashMap<>();
        final ExecutorService es = Executors.newFixedThreadPool(5);
        try {
            // create a task that slowly reads from the map.
            Runnable reader = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ie) { /*ignore*/ }
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ie) { /*ignore*/ }
                        System.out.println("key " + entry.getKey() + " value " + entry.getValue());
                    }
                }
            };
            // create a task to write to the map a little faster than the reader
            final Runnable writer = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException ie) { /*ignore*/ }
                        map.put("key-" + i, i);
                    }
                }
            };
            // submit the task twice
            final Future future1 = es.submit(writer);
            final Future future2 = es.submit(reader);
            // wait for the threads to finish
            future1.get();
            future2.get();
        } finally {
            // We know the code will generate a ConcurrentModificationException so
            // remember to shutdown the executor service in a finally block
            es.shutdown();
        }
    }
}
