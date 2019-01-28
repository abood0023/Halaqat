package halaqat;

public class Supervisor {
    
    private String id;
    private String name ;
    private String phoneNumber;
    private double salary;
    private Date birthdate;
    private String password;
    private String supervisorId;

    public Supervisor() {
        this.id = null;
        this.name = null;
        this.phoneNumber = null;
        this.salary = 0.0;
        this.birthdate = null;
        this.password = null;
        this.supervisorId = null;
    }
    
    public Supervisor(String id, String name, String phoneNumber, double salary, Date birthdate, String password) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthdate = birthdate;
        this.password = password;
        this.supervisorId = null;
    }

    public Supervisor(String id, String name, String phoneNumber, double salary, Date birthdate, String password, String supervisorId) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthdate = birthdate;
        this.password = password;
        this.supervisorId = supervisorId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getPassword() {
        return password;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }   
}
