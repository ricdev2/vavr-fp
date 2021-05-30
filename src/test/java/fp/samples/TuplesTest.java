package fp.samples;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TuplesTest {

    @Test
    public void create_tuples() {
        // Declaration:
        Tuple2<String, Integer> data= Tuple.of("M5", 2000);
        // Accessing by method.
        data._1();     // ---> "M5"
        data._2();     // ---> 3
        // Access using variables.
        String elm1 = data._1;         //---> "M5"
        Integer elem2 = data._2;       //---> 3

    }
}
