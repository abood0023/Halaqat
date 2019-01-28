package halaqat;

public class Teacher {

    private String name;
    private String id;
    private String password;
    private double salary;
    private String phoneNumber;
    private Date birthdate;
    private boolean certificate;
    private String supervisorId;
    private int teaches_group;

    public Teacher() {
        this.name = null;
        this.id = null;
        this.password = null ; 
        this.salary = 0.0;
        this.phoneNumber = null;
        this.birthdate = null;
        this.certificate = false;
        this.supervisorId = null;
        this.teaches_group = 0;
    }

    public Teacher(String name,String password, String id, double salary, String phoneNumber, boolean certificate, String supervisorId, int teaches_group) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.birthdate = null;
        this.password = password ;
        this.phoneNumber = phoneNumber;
        this.certificate = certificate;
        this.supervisorId = supervisorId;
        this.teaches_group = teaches_group;
    }

    public Teacher(String name,String password, String id, double salary, String phoneNumber, Date birthdate, boolean certificate, String supervisorId, int teaches_group) {
        this.name = name;
        this.id = id;
        this.password = password ;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.certificate = certificate;
        this.supervisorId = supervisorId;
        this.teaches_group = teaches_group;
    }

    public int getTeaches_group() {
        return teaches_group;
    }    

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public boolean isCertificate() {
        return certificate;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTeaches_group(int teaches_group) {
        this.teaches_group = teaches_group;
    }    
}
