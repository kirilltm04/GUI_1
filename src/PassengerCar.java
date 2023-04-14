class PassengerCar extends Car {
    String Id;
    Locomotive locomotive;
    int weight;
    int numberOfPassengers = 0;
    public PassengerCar(String Id, Locomotive locomotive, int weight) {
        super(Id, locomotive, weight);
    }
}
