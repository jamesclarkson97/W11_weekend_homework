import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;
    private Flight flight;
    private Plane plane;
    private Date time;

    @Before
    public void before() {
        passenger = new Passenger("Jeff", 1);
        plane = new Plane(PlaneType.MEDIUM);
        time = new Date();
        time.setTime(1964158765);
        flight = new Flight(plane, "M123", "LDN", "EDI", time);
    }

    @Test
    public void hasName() {
        assertEquals("Jeff", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(1, passenger.getBags());
    }

    @Test
    public void hasNoFLight() {
        assertEquals(null, passenger.getFlight());
    }

    @Test
    public void hasFlight() {
        flight.bookPassenger(passenger);
        assertEquals(flight, passenger.getFlight());
    }
}
