public class Main {
    public static void main(String[] args) {
        // inheritance
        // Vehicle v = new Vehicle();
        Vehicle.numOfTiers = 2;

        Car c = new Car();
        c.speed = 23;

        Bike b = new Bike();
        b.speed = 11;

        System.out.println(Vehicle.numOfTiers); // why??
        System.out.println(Car.numOfTiers);
        System.out.println(Bike.numOfTiers);

        // System.out.println(v);
        System.out.println(c);
        System.out.println(b);

        // we stopped at 4:10:00

    }
}
