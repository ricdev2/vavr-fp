package fp.samples;

import io.vavr.Function2;
import io.vavr.control.Option;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LiftingTest {

    @Test
    public void lifting() {
        // Function can return 2 of results.
        Function2<Integer, Integer, Option<Integer>> div = Function2.lift((a, b) -> a / b);

        // Here the execution could throw ArithmeticException: divide by zero, but get None.
        Option<Integer> fail = div.apply(100, 0);
        assertEquals(Option.none(), fail);

        // The execution was successful.
        Option<Integer> correct = div.apply(100, 10);
        assertEquals(Integer.valueOf(10), correct.get());

    }
}
