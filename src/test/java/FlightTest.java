import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.MEDIUM);
        flight = new Flight(plane, "M123", "LDN", "EDI", "12:00");
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("M123", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("LDN", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("12:00", flight.getDepartureTime());
    }
}
