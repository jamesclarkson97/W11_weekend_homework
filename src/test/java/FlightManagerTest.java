import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    private Passenger passenger;
    private Flight flight;
    private Plane plane;
    private FlightManager flightManager;
    private Date time;

    @Before
    public void before() {
        passenger = new Passenger("Jeff", 1);
        plane = new Plane(PlaneType.NOPE);
        flight = new Flight(plane, "N001", "LDN", "EDI", time);
        flightManager = new FlightManager(flight);
        time = new Date();
        time.setTime(1000999);
    }

    @Test
    public void passengerAllowance() {
        assertEquals(5, flightManager.getPassengerAllowance(), 0.5);
    }

    @Test
    public void bookedBaggageWeight() {
        assertEquals(0, flightManager.getBookedBaggageWeight(), 0.01);
    }

    @Test
    public void remainingBaggageWeight() {
        assertEquals(5, flightManager.getRemainingBaggageWeight(), 0.01);
    }

}
