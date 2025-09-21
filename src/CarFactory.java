public class CarFactory {
    public static Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "bolide": return CarType.BOLIDE;
            case "truck": return CarType.TRUCK;
            case "electric": return CarType.ELECTRIC;
            default: throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}
