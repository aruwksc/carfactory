public enum CarType implements Car {
    BOLIDE {
        public void assemble() { System.out.println("Assembling Formula Bolide..."); }
        public void drive() { System.out.println("Racing with Bolide at 350 km/h!"); }
    },
    TRUCK {
        public void assemble() { System.out.println("Assembling Truck..."); }
        public void drive() { System.out.println("Driving a heavy Truck loaded with cargo."); }
    },
    ELECTRIC {
        public void assemble() { System.out.println("Assembling Electric Car..."); }
        public void drive() { System.out.println("Driving Electric Car silently and eco-friendly."); }
    };
}
