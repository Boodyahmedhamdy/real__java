public class Bike extends Vehicle{

    public static int numOfTiers = 2;

    @Override
    public void go() {
        System.out.println("this Bike is moving now");
    }

    @Override
    public void stop() {
        System.out.println("this Bike has been stopped");
    }
}
