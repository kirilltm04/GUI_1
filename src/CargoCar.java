class CargoCar extends Car {
    String id;
    Locomotive locomotive;
    int weight;
    double maxCargoLoad = 0;
    public CargoCar(String Id, Locomotive locomotive, int weight) {
        super(Id, locomotive, weight);
    }
}
