package fp.samples;

import io.vavr.Function0;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class MemoizedTest {

    @Test
    public void memoized() {

        Function0<LocalDateTime> fixedDateTime =
                Function0.of(LocalDateTime::now).memoized();

        // In each invocation get the same value.

        LocalDateTime dayAndHour1 = fixedDateTime.apply();
        LocalDateTime dayAndHour2 = fixedDateTime.apply();
        assertEquals(dayAndHour1, dayAndHour2);

    }
}
