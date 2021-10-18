public class User {
    public String firstName;
    public String lastName;
    private int ID = 11111;

    public void setID(int theID)
    {
        this.ID = theID;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public void output()
    {
        System.out.println("first name: " + this.firstName);
        System.out.println("last name: " + this.lastName);
        System.out.println("ID: " + this.ID);
    }

}
