package fp.samples;

import static org.junit.Assert.assertEquals;

import io.vavr.control.Either;
import io.vavr.control.Option;
import org.junit.Test;

public class EitherTest {

    @Test
    public void either() {
        // Return 2 results.
        Either<Option<Integer>, Integer> either =
                Option.of(5).toEither(() -> Option.none());
        if (either.isLeft()) {
            assertEquals(Option.none(), either.getLeft());
        }
        if (either.isRight()) {
            assertEquals(Integer.valueOf(5), either.get());
        }
    }
}
