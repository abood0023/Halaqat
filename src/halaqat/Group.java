package halaqat;

public class Group {

    private String name;
    private String section;
    private int id;
    private String supervisorId;

    public Group() {
        this.name = null;
        this.section = null;
        this.id = 0;
        this.supervisorId = null;
    }

    public Group(int id ,String name, String section, String supervisorId) {
        this.name = name;
        this.section = section;
        this.id = id;
        this.supervisorId = supervisorId;
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public int getId() {
        return id;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }
}
