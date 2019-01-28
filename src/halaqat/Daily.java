package halaqat;

public class Daily {

    private String Student_id;
    private Date day;
    private boolean attendance;
    private int number_of_pages;
    private int mark;

    public Daily() {
        this.Student_id = null;
        this.day = null;
        this.attendance = false;
        this.number_of_pages = 0;
        this.mark = 0;
    }

    public Daily(String Student_id, Date day, boolean attendance, int number_of_pages, int mark) {
        this.Student_id = Student_id;
        this.day = day;
        this.attendance = attendance;
        this.number_of_pages = number_of_pages;
        this.mark = mark;
    }

    public String getStudent_id() {
        return Student_id;
    }

    public Date getDay() {
        return day;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public int getMark() {
        return mark;
    }

    public void setStudent_id(String Student_id) {
        this.Student_id = Student_id;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
