package fp.samples;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import static io.vavr.API.*;

public class PM {

    private static final Logger LOGGER = LoggerFactory.getLogger(PM.class);

    public void codesmell() {
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
        LOGGER.debug(cmd);
    }
}
