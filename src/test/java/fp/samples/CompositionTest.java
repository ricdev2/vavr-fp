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

        // Add 1 and then multiply by 2.
        assertEquals(Integer.valueOf(8), addAndMultiply.apply(3));

    }

    @Test
    public void create_composition() {
        // Declare the functions.
        Function1<Integer, Integer> addOne = a -> a + 1;
        Function1<Integer, Integer> multiplyOne = a -> a * 2;

        Function1<Integer, Integer> compose = addOne.compose(multiplyOne);

        // Multiply by 2 and add 1. As you can see the execution order is inverted when using compose, it starting from last function added.
        assertEquals(Integer.valueOf(7), compose.apply(3));
    }
}
