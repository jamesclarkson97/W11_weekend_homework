import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        int capacity = this.plane.getPlaneType().getCapacity();
        return capacity - this.passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        int capacity = this.plane.getPlaneType().getCapacity();
        if (this.passengers.size() < capacity) {
            this.passengers.add(passenger);
            passenger.setFlight(this);
        }
    }
}
