package fp.samples;

import org.junit.Test;

import static io.vavr.API.*;
import static org.junit.Assert.assertEquals;

public class PatternMatchingTest {

    @Test
    public void pattern_matching() {
        // Using switch statement.
        String command = null;
        int option = 2;
        switch (option) {
            case 1:
                command = "Order a pizza";
                break;
            case 2:
                command = "Order a hamburger";
                break;
            default:
                command = "Order any food";
        }
        // Using Pattern matching.
        String cmd = Match(option).of(
                Case($(1), "Order a pizza"),
                Case($(2), "Order a hamburger"),
                Case($(), "Order any food")
        );
        assertEquals("Order a hamburger", cmd);
    }
}
