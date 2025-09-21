public class ElectricCarFactory implements AbstractCarFactory {
    @Override
    public Car createBolide() { return CarType.ELECTRIC; }
    @Override
    public Car createTruck() { return CarType.ELECTRIC; }
}
