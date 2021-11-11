public class Boy extends Human{

    // public String gender = "male";
    public static int numberOfBoys = 0;

    //constructors
    public Boy() {
        numberOfBoys++;
        super.gender = "male";
    }

    public Boy(String firstName) {
        this.firstName = firstName;
        System.out.println("created Boy object with first name: " + firstName);
        super.gender = "male";
        numberOfBoys++;
    }

//    @Override
//    public void get__gender(){
//        System.out.println(this.gender);
//    }

//    public void get__gender() {
//        System.out.println(this.gender);
//    }
//
//    public void set__gender(String gender) {
//        this.gender = gender;
//    }
}
