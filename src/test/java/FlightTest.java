import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Flight flight2;
    private Plane plane;
    private Plane plane2;
    private Passenger passenger;
    private Passenger passenger2;
    private Date time;
    private Date time2;

    @Before
    public void before() {
        plane = new Plane(PlaneType.MEDIUM);
        plane2 = new Plane(PlaneType.NOPE);
        time = new Date();
        time.setTime(1000999);
        time2 = new Date();
        time2.setTime(1964158765);
        flight = new Flight(plane, "M123", "LDN", "EDI", time);
        flight2 = new Flight(plane2, "N001", "LDN", "EDI",time2);
        passenger = new Passenger("Simon", 2);
        passenger2 = new Passenger("Jeff", 1);
    }

    @Test
    public void hasPassengers() {
        assertEquals(0, flight.getPassengers().size());
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
        assertEquals(time2, flight2.getDepartureTime());
    }

    @Test
    public void returnAvailableSeats() {
        assertEquals(100, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger);
        assertEquals(99, flight.getAvailableSeats());
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void cannotBookPassenger() {
        flight2.bookPassenger(passenger);
        flight2.bookPassenger(passenger2);
        assertEquals(0, flight2.getAvailableSeats());
        assertEquals(1, flight2.getPassengers().size());
    }
}
