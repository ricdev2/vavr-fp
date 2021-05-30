package fp.samples;

import static org.junit.Assert.assertEquals;

import io.vavr.control.Try;
import org.junit.Test;

public class TryTest {

    @Test
    public void try_test() throws Exception {

        try {
            // some exception occur.
        } catch(Exception e) {
            // You can use Logging the error
            // Or return some result: -1 :(
            // And ...
            throw new Exception("Error");
        }

        // Trying to avoid side effects like exceptions.
        int a = 5;
        int b = 0;
        Try<Integer> result = Try.of(() ->  a / b); // A clear example of divide by zero.

        // Obtain the success or failed results.
        result.onSuccess(integer -> assertEquals(Integer.valueOf(5), integer));
        result.onFailure(throwable -> System.out.println(throwable));
    }
}
