import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Jeff", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Jeff", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(1, passenger.getBags());
    }
}
