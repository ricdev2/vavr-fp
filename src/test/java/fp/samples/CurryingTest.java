package fp.samples;

import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.Function5;
import org.junit.Test;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CurryingTest {

    @Test
    public void currying() {

        // Create the function to receive all parameters.
        Function5<DayOfWeek, DayOfWeek, DayOfWeek, DayOfWeek, DayOfWeek, Map<String, DayOfWeek>> calendar = (d1, d2, d3, d4, d5)-> {
            Map<String, DayOfWeek> routine = new HashMap<>();
            routine.put("Squat", d1);
            routine.put("Plank", d2);
            routine.put("Lunge", d3);
            routine.put("Push Up", d4);
            routine.put("Jumping Jacks", d5);
            return routine;
        };

        // Adding 3 days for the firsts workouts.
        Function2<DayOfWeek, DayOfWeek, Map<String, DayOfWeek>> sessionOne = calendar.apply(DayOfWeek.MONDAY,
                DayOfWeek.WEDNESDAY,
                DayOfWeek.FRIDAY);
        // Adding 1 day for the next workout.
        Function1<DayOfWeek, Map<String, DayOfWeek>> sessionTwo = sessionOne.apply(DayOfWeek.TUESDAY);
        // Adding final workout.
        Map<String, DayOfWeek> workoutWeek = sessionTwo.apply(DayOfWeek.THURSDAY);

        // Workout for all weekday.
        assertEquals(5, workoutWeek.size());
    }
}
