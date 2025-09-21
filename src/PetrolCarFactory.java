public class PetrolCarFactory implements AbstractCarFactory {
    @Override
    public Car createBolide() { return CarType.BOLIDE; }

    @Override
    public Car createTruck() { return CarType.TRUCK; }
}
