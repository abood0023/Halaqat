package halaqat;

public class Student {

    private String id;
    private Date birthdate;
    private String name;
    private String phoneNumber;
    private String fromPage;
    private String toPage;
    private String parentId;
    private int groupId;

    public Student() {
        this.id = null;
        this.birthdate = null;
        this.name = null;
        this.phoneNumber = null;
        this.fromPage = null;
        this.toPage = null;
        this.parentId = null;
        this.groupId = 0;
    }

    public Student(String id, Date birthdate, String name, String phoneNumber, String fromPage, String toPage, String parentId, int groupId) {
        this.id = id;
        this.birthdate = birthdate;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.fromPage = fromPage;
        this.toPage = toPage;
        this.parentId = parentId;
        this.groupId = groupId;
    }

    public String getId() {
        return id;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFromPage() {
        return fromPage;
    }

    public String getToPage() {
        return toPage;
    }

    public String getParentId() {
        return parentId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFromPage(String fromPage) {
        this.fromPage = fromPage;
    }

    public void setToPage(String toPage) {
        this.toPage = toPage;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
