package fp.samples;

import io.vavr.Function1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompositionTest {

    @Test
    public void create_chain_composition() {

        // Declare functions to chain.
        Function1<Integer, Integer> addOne = a -> a + 1;
        Function1<Integer, Integer> multiplyOne = a -> a * 2;

        Function1<Integer, Integer> addAndMultiply = addOne.andThen(multiplyOne);

        // The execute is by order.
        assertEquals(Integer.valueOf(8), addAndMultiply.apply(3));

    }

    @Test
    public void create_composition() {
        // Declare the functions.
        Function1<Integer, Integer> addOne = a -> a + 1;
        Function1<Integer, Integer> multiplyOne = a -> a * 2;

        Function1<Integer, Integer> compose = addOne.compose(multiplyOne);

        // First multiply by 2 and add 1, the order execution is inverse when using compose.
        assertEquals(Integer.valueOf(7), compose.apply(3));
    }
}
