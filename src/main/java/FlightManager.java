public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double getPassengerAllowance() {
        int capacity = flight.getPlane().getPlaneType().getCapacity();
        int bagWeight = flight.getPlane().getPlaneType().getTotalWeight() / 2;
        return bagWeight / capacity;
    }

    public double getBookedBaggageWeight() {
        double baggageWeight = 0.0;
        for(Passenger passenger : flight.getPassengers()) {
            int totalBags = passenger.getBags();
            baggageWeight = totalBags * 2.5;
        }
        return baggageWeight;
    }

    public double getRemainingBaggageWeight() {
        double bookedBaggage = this.getBookedBaggageWeight();
        int totalBaggageWeight = flight.getPlane().getPlaneType().getTotalWeight() / 2;
        double remainingBaggageWeight = totalBaggageWeight - bookedBaggage;
        return remainingBaggageWeight;
    }
}
