public enum PlaneType {
    NOPE(1, 10),
    SMALLEST(20, 200),
    SMALL(50, 500),
    MEDIUM(100, 1000),
    BIG(200, 2000),
    BIGGER(300, 3000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
