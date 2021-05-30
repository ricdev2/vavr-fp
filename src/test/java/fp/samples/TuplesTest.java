package fp.samples;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TuplesTest {

    @Test
    public void create_tuples() {
        Tuple2<String, Integer> data= Tuple.of("M5", 2000);
        // Accessing by method:
        data._1();     //---> 3
        data._2();     //---> "M5"
        // Or using final variables
        String elm1 = data._1;       //---> 3
        Integer elm2 = data._2;       //---> "M5"

        assertEquals("M5", elm1);
        assertEquals(Integer.valueOf(2000), elm2);

    }
}
