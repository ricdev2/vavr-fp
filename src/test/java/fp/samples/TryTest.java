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
            // You can print in console the error
            // Or return some result like number value ( -1 )
            // Rethrow the exception ...
            throw new Exception("Error");
        }

        // Trying to avoid side effects like exceptions.
        int a = 5;
        int b = 0;
        // A clear example of divide by zero.
        Try<Integer> result = Try.of(() ->  a / b);

        // Obtain the success or failed results.
        result.
        onSuccess(integer -> assertEquals(Integer.valueOf(5), integer));
        result.
        onFailure(throwable -> System.out.println(throwable));
    }
}
