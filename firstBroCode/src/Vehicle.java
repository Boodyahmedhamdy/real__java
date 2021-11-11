public abstract class Vehicle {

    // adding abstract means you can't make objects from the class
    /*
    * abstract methods are only defined without body
    * you create its body inside a child class only
    * on other meaning .. this method should be overridden and has no body
    */
    public abstract void sleep();


    public double speed;
    public String name;
    public String model;
    public void go() {
        System.out.println("this vehicle is moving now");
    }
    public void stop() {
        System.out.println("this vehicle has been stopped");
    }
    public static int numOfTiers;

    int s;

    public String toString() {
        return this.name + " " + this.model + " " + numOfTiers + " tiers";
    }
}
