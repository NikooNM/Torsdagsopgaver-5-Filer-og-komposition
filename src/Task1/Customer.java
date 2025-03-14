package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    Customer(String firstname, String lastname, String username){
        this.firstName = firstname;
        this.lastName = lastname;
        this.username = username;

        counter += 1;
        this.id = counter;
    }

    public String toString(){
        return "Name: " + firstName + " " + lastName + ", Username: " + username + ", ID: " + id;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String newName){
        this.firstName = newName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public String getUsername() {
        return this.username;
    }
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public int getID(){
        return this.id;
    }
    public void setID(int newID){
        this.id = newID;
    }
}
