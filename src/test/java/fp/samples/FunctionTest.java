package fp.samples;

import io.vavr.Function1;
import io.vavr.Function2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionTest {

    @Test
    public void create_function() {
        // Supporting us of lambdas, function receives a parameter of type Integer and returns an Integer, the processing only increases the value by 1
        Function1<Integer, Integer> addOne = a -> a + 1;

        assertEquals(Integer.valueOf(8), addOne.apply(7));
        assertEquals(Integer.valueOf(8), addOne.apply(7));

        // We can also use method reference, in this case the sum method receives 2 parameters and adds them, on the side of the function definition the first 2 parameters are the input data and the last one is the output type.
        Function2<Integer, Integer, Integer> sum = Integer::sum;

        assertEquals(Integer.valueOf(10), sum.apply(5, 5));
        assertEquals(Integer.valueOf(10), sum.apply(5, 5));
    }
}
