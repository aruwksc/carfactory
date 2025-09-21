public class Main {
    public static void main(String[] args) {
        Car bolide = CarFactory.createCar("bolide");
        bolide.assemble();
        bolide.drive();

        AbstractCarFactory petrolFactory = new PetrolCarFactory();
        Car truck = petrolFactory.createTruck();
        truck.assemble();
        truck.drive();

        AbstractCarFactory electricFactory = new ElectricCarFactory();
        Car eBolide = electricFactory.createBolide();
        eBolide.assemble();
        eBolide.drive();
    }
}
