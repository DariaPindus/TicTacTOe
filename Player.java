package ua.od.pindus;

/**
 * Created by User on 12.05.2016.
 */
public abstract class Player {

    private String lastName;
    private String firstName;
    private String middleName;
    private int age;
    private char type;

    public Player(String lastname, String firstname, String middlename, int age, char type) {
        this.lastName = lastname;
        this.firstName = firstname;
        this.middleName = middlename;
        this.age = age;
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public abstract String makeMove();
}
