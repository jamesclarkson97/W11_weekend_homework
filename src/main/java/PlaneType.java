public enum PlaneType {
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
}
