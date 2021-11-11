import java.util.List;

public abstract class Human {

    public String firstName = "firstName";
    public String lastName = "lastName";
    private int age;
    public String gender;

    public enum sex {male, female, mixed};

    public sex status;

    public void set__gender(String gender) {
        this.gender = gender;
    }
    public void get__gender() {
        System.out.println(this.gender);
    }

    public void output__name(){
        System.out.println(this.getFirstName() + " " + getLastName());
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // static methods
    public static void print__human(List<Human> listOfHumans) {
        for(Human h : listOfHumans) {
            h.output__name();
        }
    }

    public static void print__human(Human ...arrayOfHumans) {
        for (int i = 0 ; i < arrayOfHumans.length ; i++) {
            arrayOfHumans[i].output__name();
        }
    }

    public static boolean in__list(List<Human> theList, String firstName) {
        for (Human h : theList) {
            if(h.firstName.equals(firstName)){
                return true;
            }
        }
        return false;
    }

}
