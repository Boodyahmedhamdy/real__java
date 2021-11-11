public class Car extends Vehicle{


    // public static int numOfTiers = 4;
    Car() {
        super.name = "carName";
        super.model = "carModel";
        numOfTiers = 4;
        this.speed = 99;
    }

    public void sleep(){

    }



    @Override
    public void go() {
        System.out.println("this Car is moving now");
    }
    @Override
    public void stop() {
        System.out.println("this Car has been stopped");
    }





}

