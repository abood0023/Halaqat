package halaqat;

public class Parent {
    
    private String ID;
    private String phoneNumber;
    private String name;

    public Parent() {
        this.ID = null;
        this.phoneNumber = null;
        this.name = null;
    }

    public Parent(String ID, String phoneNumber, String name, Date birthdate) {
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
