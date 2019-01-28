package halaqat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class Connector {

    static private Connection connect = null;// connect with database
    static private Statement statement = null; //quiry
    static private PreparedStatement preparedStatement = null;
    static private ResultSet resultSet = null;

    static private String querie;
    static private Calendar cal = Calendar.getInstance();

    static void getConnection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/halaqat?user=root&password=111444");
            //read write on DB 
            statement = connect.createStatement(resultSet.TYPE_SCROLL_INSENSITIVE, resultSet.CONCUR_READ_ONLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void closeConnection() throws SQLException {
        try {
            if (connect != null) {
                connect.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (Exception e) {
            System.out.println("Error in close connection.");
        }

    }

    static void insertSupervisor(Supervisor s) throws SQLException {
        try {
            String Bday = s.getBirthdate().getYear() + "." + s.getBirthdate().getMonth() + "." + s.getBirthdate().getDay();
            if (s.getSupervisorId() != null) {
                querie = "insert into `Supervisor`"
                        + "values('" + s.getId() + "','" + s.getName() + "','" + Bday + "','" + s.getPhoneNumber() + "','" + s.getSalary() + "','" + s.getSupervisorId() + "')";
            } else {
                querie = "insert into `Supervisor`(`ID`,`Name`,`Birthdate`,`Phone #`,`Salary`) "
                        + "values('" + s.getId() + "','" + s.getName() + "','" + Bday + "','" + s.getPhoneNumber() + "','" + s.getSalary() + "')";
            }
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in insert supervisor.");
        }
    }

    static void insertTeacher(Teacher t) throws SQLException {
        int c;
        if (t.isCertificate()) {
            c = 1;
        } else {
            c = 0;
        }
        if (t.getBirthdate() != null) {
            String Bday = t.getBirthdate().getYear() + "." + t.getBirthdate().getMonth() + "." + t.getBirthdate().getDay();
            querie = "insert into `Teacher`"
                    + "values('" + t.getId() + "','" + t.getName() + "','" + Bday + "','" + t.getPhoneNumber() + "'"
                    + ",'" + t.getSalary() + "','" + c + "','" + t.getTeaches_group() + "','" + t.getSupervisorId() + "')";
        } else {
            querie = "insert into `Teacher`(`ID`,`Name`,`Phone #`,`Salary`,`Certificate`,`Teaches_group`,`Super_id`)"
                    + "values('" + t.getId() + "','" + t.getName() + "','" + t.getPhoneNumber() + "',"
                    + "'" + t.getSalary() + "','" + c + "','" + t.getTeaches_group() + "','" + t.getSupervisorId() + "')";
        }
        preparedStatement = connect.prepareStatement(querie);
        preparedStatement.execute();
    }

    static void insertStudent(Student s) throws SQLException {
        try {
            if (s.getBirthdate() != null && s.getParentId() != null && s.getPhoneNumber() != null) {
                String Bday = s.getBirthdate().getYear() + "." + s.getBirthdate().getMonth() + "." + s.getBirthdate().getDay();
                querie = "insert into `Student` "
                        + "values('" + s.getId() + "','" + s.getName() + "','" + Bday + "','" + s.getPhoneNumber() + "',"
                        + "'" + s.getFromPage() + "','" + s.getToPage() + "','" + s.getGroupId() + "','" + s.getParentId() + "')";
            } else if (s.getBirthdate() != null && s.getParentId() != null && s.getPhoneNumber() == null) {
                String Bday = s.getBirthdate().getYear() + "." + s.getBirthdate().getMonth() + "." + s.getBirthdate().getDay();
                querie = "insert into `Student`(`ID`,`Name`,`Birthdate`,`From_page`,`To_page`,`Enrolled_in`,`My_parent`)"
                        + "values('" + s.getId() + "','" + s.getName() + "','" + Bday + "','"
                        + s.getFromPage() + "','" + s.getToPage() + "','" + s.getGroupId() + "','" + s.getParentId() + "')";
            } else if (s.getBirthdate() != null && s.getParentId() == null && s.getPhoneNumber() != null) {
                String Bday = s.getBirthdate().getYear() + "." + s.getBirthdate().getMonth() + "." + s.getBirthdate().getDay();
                querie = "insert into `Student`(`ID`,`Name`,`Birthdate`,`Phone #`,`From_page`,`To_page`,`Enrolled_in`)"
                        + "values('" + s.getId() + "','" + s.getName() + "'," + "'" + Bday + "'," + "'" + s.getPhoneNumber() + "',"
                        + "'" + s.getFromPage() + "','" + s.getToPage() + "','" + s.getGroupId() + "')";
            } else if (s.getBirthdate() != null && s.getParentId() == null && s.getPhoneNumber() == null) {
                String Bday = s.getBirthdate().getYear() + "." + s.getBirthdate().getMonth() + "." + s.getBirthdate().getDay();
                querie = "insert into `Student`(`ID`,`Name`,`Birthdate`,`From_page`,`To_page`,`Enrolled_in`)"
                        + "values('" + s.getId() + "','" + s.getName() + "','" + Bday + "',"
                        + "'" + s.getFromPage() + "','" + s.getToPage() + "','" + s.getGroupId() + "')";
            } else if (s.getBirthdate() == null && s.getParentId() != null && s.getPhoneNumber() == null) {
                querie = "insert into `Student` (`ID`,`Name`,`From_page`,`To_page`,`Enrolled_in`,`My_parent`) "
                        + "values('" + s.getId() + "','" + s.getName() + "',"
                        + "'" + s.getFromPage() + "','" + s.getToPage() + "','" + s.getGroupId() + "','" + s.getParentId() + "')";
            } else if (s.getBirthdate() == null && s.getParentId() == null && s.getPhoneNumber() == null) {
                querie = "insert into `Student` (`ID`,`Name`,`From_page`,`To_page`,`Enrolled_in`) "
                        + "values('" + s.getId() + "','" + s.getName() + "',"
                        + "'" + s.getFromPage() + "','" + s.getToPage() + "','" + s.getGroupId() + "')";
            } else if (s.getBirthdate() == null && s.getParentId() == null && s.getPhoneNumber() != null) {
                querie = "insert into `Student`(`ID`,`Name`,`Phone #`,`From_page`,`To_page`,`Enrolled_in`)"
                        + "values('" + s.getId() + "','" + s.getName() + "','" + s.getPhoneNumber() + "',"
                        + "'" + s.getFromPage() + "','" + s.getToPage() + "','" + s.getGroupId() + "')";
            } else if (s.getBirthdate() == null && s.getParentId() != null && s.getPhoneNumber() != null) {
                querie = "insert into `Student`(`ID`,`Name`,`Phone #`,`From_page`,`To_page`,`Enrolled_in`,`My_parent`)"
                        + "values('" + s.getId() + "','" + s.getName() + "','" + s.getPhoneNumber() + "',"
                        + "'" + s.getFromPage() + "','" + s.getToPage() + "','" + s.getGroupId() + "','" + s.getParentId() + "')";
            }

            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in insert student.");
        }
    }

    static void insertParent(Parent p) throws SQLException {
        try {
            if (p.getPhoneNumber() != null) {
                querie = "insert into `Parent` values ('" + p.getID() + "','" + p.getPhoneNumber() + "','" + p.getName() + "')";
            } else {
                querie = "insert into `Parent` (`ID`,`Name`) values ('" + p.getID() + "','" + p.getName() + "')";
            }
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in insert parent.");
        }
    }

    static void insertGroup(Group g) throws SQLException {
        try {
            querie = "insert into `Group`(`Name`,`Section`,`Super_id`) values ('" + g.getName() + "','" + g.getSection() + "','" + g.getSupervisorId() + "')";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in insert group.");
        }
    }

    static void insertDaily(Daily d) throws SQLException {
        try {
            int a = 0;
            if (d.isAttendance()) {
                a = 1;
            }
            querie = "insert into `Daily` values ('" + d.getStudent_id() + "',CURDATE(),'" + a + "','" + d.getNumber_of_pages() + "','" + d.getMark() + "')";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in insert Daily.");
        }
    }

    static void updateSupervisor(String id, String type, Object newValue) {
        try {
            querie = "update `Supervisor` set `" + type + "`='" + newValue + "' where `id`='" + id + "'";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in update Teacher.");
        }
    }

    static void updateStudent(String id, String type, Object newValue) throws SQLException {
        try {
            querie = "update `Student` set `" + type + "`='" + newValue + "' where `id`='" + id + "'";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in update Student.");
        }
    }

    static void updateTeacher(String id, String type, Object newValue) {
        try {
            querie = "update `Teacher` set `" + type + "`='" + newValue + "' where `id`='" + id + "'";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in update Teacher.");
        }
    }

    static void updateGroup(int id, String type, Object newValue) {
        try {
            querie = "update `Group` set `" + type + "`='" + newValue + "' where `id`='" + id + "'";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in update Teacher.");
        }
    }

    static void updateParent(String id, String type, Object newValue) {
        try {
            querie = "update `Parent` set `" + type + "`='" + newValue + "' where `id`='" + id + "'";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in update Teacher.");
        }
    }

    static void updateDaily(String id, String type, Object newValue) throws SQLException {
        try {
            if (type == "Attendance") {
                querie = "update `Daily` set `" + type + "`=" + newValue + " where `Student_ID`='" + id + "'";
            } else {
                querie = "update `Daily` set `" + type + "`='" + newValue + "' where `Student_ID`='" + id + "'";
            }
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in update Daily.");
        }
    }

    static void deleteSupervisor(String id) throws SQLException {
        querie = "delete from `Supervisor` where `id`='" + id + "'";
        preparedStatement = connect.prepareStatement(querie);
        preparedStatement.execute();
    }

    static void deleteTeacher(String id) throws SQLException {
        querie = "delete from `Teacher` where `id`='" + id + "'";
        preparedStatement = connect.prepareStatement(querie);
        preparedStatement.execute();
    }

    static void deleteStudent(String id) throws SQLException {
        try {
            querie = "delete from `Student` where `id`='" + id + "'";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in delete Supervisor.");
        }
    }

    static void deleteParent(String id) throws SQLException {
//        try {
            querie = "delete from `Parent` where `id`='" + id + "'";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
//        } catch (Exception e) {
//            System.out.println("Error in delete parent.");
//        }
    }

    static void deleteGroup(int id) throws SQLException {
        try {
            querie = "delete from `Group` where `id`='" + id + "'";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in delete Group.");
        }
    }

    static void deleteDaily(String id, Date d) {
        try {
            String day = d.getYear() + "." + d.getMonth() + "." + d.getDay();
            querie = "delete from `Daily` where `id`='" + id + "' and `Day`=" + day;
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in delete Daily.");
        }
    }

    static void deleteAllDailyForStudent(String id) {
        try {
            querie = "delete from `Daily` where `id`='" + id + "'";
            preparedStatement = connect.prepareStatement(querie);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error in delete Daily.");
        }
    }

    static Supervisor searchSupervisor(String id) {
        try {
            Supervisor s = new Supervisor();
            querie = "select * from `Supervisor` where `id`='" + id + "'";
            resultSet = statement.executeQuery(querie);
            resultSet.next();
            s.setId(resultSet.getString("ID"));
            s.setPassword(resultSet.getString("Password"));
            s.setName(resultSet.getString("Name"));
            java.sql.Date BD;
            Date D = new Date();
            BD = resultSet.getDate("Birthdate");
            D.setDay(BD.getDate());
            D.setMonth(BD.getMonth());
            D.setYear(BD.getYear());
            s.setBirthdate(D);
            s.setPhoneNumber(resultSet.getString("Phone #"));
            s.setSalary(resultSet.getFloat("Salary"));
            try {
                s.setSupervisorId(resultSet.getString("Super_id"));
            } catch (Exception e) {
            }
            return s;
        } catch (Exception e) {
            return null;
        }
    }

    static Teacher searchTeacher(String id) {
        try {
            Teacher t = new Teacher();
            querie = "select * from `Teacher` where `id`='" + id + "'";
            resultSet = statement.executeQuery(querie);
            resultSet.next();
            t.setId(resultSet.getString("ID"));
            t.setName(resultSet.getString("Name"));
            t.setPassword(resultSet.getString("Password"));
            java.sql.Date BD;
            Date D = new Date();
            try {
                BD = resultSet.getDate("Birthdate");
                D.setDay(BD.getDate());
                D.setMonth(BD.getMonth());
                D.setYear(BD.getYear());
                t.setBirthdate(D);
            } catch (Exception e) {
            }
            t.setPhoneNumber(resultSet.getString("Phone #"));
            t.setSalary(resultSet.getFloat("Salary"));
            if (resultSet.getBoolean("Certificate")) {
                t.setCertificate(true);
            }

            try {
                t.setTeaches_group(resultSet.getInt("Teaches_group"));
            } catch (Exception e) {
            }
            try {
                t.setSupervisorId(resultSet.getString("Super_id"));
            } catch (Exception e) {
            }

            return t;
        } catch (Exception e) {
            return null;
        }
    }

    static Student searchStudent(String id) {
        Student s = new Student();
        try {
            querie = "select * from `Student` where `id`='" + id + "'";
            resultSet = statement.executeQuery(querie);
            resultSet.next();
            s.setId(resultSet.getString("ID"));
            s.setName(resultSet.getString("Name"));

            java.sql.Date BD;
            Date D = new Date();
            try {
                BD = resultSet.getDate("Birthdate");
                D.setDay(BD.getDate());
                D.setMonth(BD.getMonth());
                D.setYear(BD.getYear());
                s.setBirthdate(D);
            } catch (Exception e) {
            }

            try {
                s.setPhoneNumber(resultSet.getString("Phone #"));
            } catch (Exception e) {
            }

            try {
                s.setParentId(resultSet.getString("My_parent"));
            } catch (Exception e) {
            }

            s.setFromPage(resultSet.getString("From_page"));
            s.setToPage("To_page");
            try {
                s.setGroupId(resultSet.getInt("Enrolled_in"));
            } catch (Exception e) {
            }
            try {
                s.setParentId(resultSet.getString("My_parent"));
            } catch (Exception e) {
            }
        } catch (Exception e) {
            return null;
        }
        return s;
    }

    static Parent searchParent(String id) {
        try {
            Parent p = new Parent();
            querie = "select * from `Parent` where `id`='" + id + "'";
            resultSet = statement.executeQuery(querie);
            resultSet.next();
            p.setID(resultSet.getString("ID"));
            try {
                p.setPhoneNumber(resultSet.getString("Phone #"));
            } catch (Exception e) {
            }
            
            p.setName(resultSet.getString("Name"));
            return p;
        } catch (Exception e) {
            return null;
        }
    }
    static Group searchGroup(String id) {
        try {
            Group g = new Group();
            querie = "select * from `Group` where `id`='" + id + "'";
            resultSet = statement.executeQuery(querie);
            resultSet.next();
            g.setId(resultSet.getInt("ID"));
            g.setName(resultSet.getString("Name"));
            g.setSection(resultSet.getString("Section"));
            try {
                g.setSupervisorId(resultSet.getString("Super_id"));
            } catch (Exception e) {
            }
            return g;
        } catch (Exception e) {
            return null;
        }
    }

    static Daily searchDaily(Date date, String studentId) {
        try {
            Daily d = new Daily();
            querie = "select * from `Daily` where `Student_ID`='" + studentId + "' and `Day`='" + date.getYear() + "." + date.getMonth() + "." + date.getDay() + "'";
            resultSet = statement.executeQuery(querie);
            resultSet.next();
            d.setStudent_id(studentId);
            d.setDay(date);
            if (resultSet.getBoolean("Attendance")) {
                d.setAttendance(true);
            }
            d.setNumber_of_pages(resultSet.getInt("#_of_pages"));
            d.setMark(resultSet.getInt("Mark"));
            return d;
        } catch (Exception e) {
            return null;
        }
    }

    static Supervisor[] getAllSupervisor() throws SQLException {
        querie = "select * from `Supervisor`";
        resultSet = statement.executeQuery(querie);
        resultSet.last();
        Supervisor all[] = new Supervisor[resultSet.getRow()];
        Date d;
        resultSet.beforeFirst();
        for (int i = 0; resultSet.next(); i++) {
            d = new Date();
            d.setDay(resultSet.getDate("Birthdate").getDay());
            d.setMonth(resultSet.getDate("Birthdate").getMonth());
            d.setYear(resultSet.getDate("Birthdate").getYear());
            try {
                all[i] = new Supervisor(resultSet.getString("ID"), resultSet.getString("Name"),
                        resultSet.getString("Phone #"), resultSet.getDouble("Salary"), d, resultSet.getString("Password"), resultSet.getString("Super_id"));
            } catch (Exception e) {
                all[i] = new Supervisor(resultSet.getString("ID"), resultSet.getString("Name"), resultSet.getString("Phone #"), resultSet.getDouble("Salary"), d, resultSet.getString("Password"));
            }

        }
        return all;
    }

    static Teacher[] getAllTeacher() throws SQLException {
        querie = "select * from `Teacher`";
        resultSet = statement.executeQuery(querie);
        resultSet.last();
        Teacher all[] = new Teacher[resultSet.getRow()];
        Date d;
        resultSet.beforeFirst();
        for (int i = 0; resultSet.next(); i++) {
            try {
                d = new Date();
                d.setDay(resultSet.getDate("Birthdate").getDay());
                d.setMonth(resultSet.getDate("Birthdate").getMonth());
                d.setYear(resultSet.getDate("Birthdate").getYear());
                all[i] = new Teacher(resultSet.getString("Name"), resultSet.getString("Password"), resultSet.getString("ID"), resultSet.getDouble("Salary"), resultSet.getString("Phone #"), d, resultSet.getBoolean("Certificate"), resultSet.getString("Super_id"), resultSet.getInt("Teaches_group"));
            } catch (Exception e) {
                all[i] = new Teacher(resultSet.getString("Name"), resultSet.getString("Password"), resultSet.getString("ID"), resultSet.getDouble("Salary"), resultSet.getString("Phone #"), resultSet.getBoolean("Certificate"), resultSet.getString("Super_id"), resultSet.getInt("Teaches_group"));
            }

        }
        return all;
    }

    static Student[] getAllStudent() throws SQLException {
        querie = "select * from `Student`";
        resultSet = statement.executeQuery(querie);
        resultSet.last();
        Date d = null;
        Student all[] = new Student[resultSet.getRow()];
        resultSet.beforeFirst();
        for (int i = 0; resultSet.next(); i++) {
            all[i] = new Student();
            if (resultSet.getDate("Birthdate") != null) {
                d = new Date();
                d.setDay(resultSet.getDate("Birthdate").getDay());
                d.setMonth(resultSet.getDate("Birthdate").getMonth());
                d.setYear(resultSet.getDate("Birthdate").getYear());
            }
            all[i].setId(resultSet.getString("ID"));
            all[i].setName(resultSet.getString("Name"));
            all[i].setBirthdate(d);
            if (resultSet.getString("Phone #") != null) {
                all[i].setPhoneNumber(resultSet.getString("Phone #"));
            }
            all[i].setFromPage(resultSet.getString("From_page"));
            all[i].setToPage(resultSet.getString("To_page"));
            all[i].setGroupId(resultSet.getInt("Enrolled_in"));
            if (resultSet.getString("My_parent") != null) {
                all[i].setParentId(resultSet.getString("My_parent"));
            }
        }
        return all;
    }

    static Student[] getAllStudentForParent(String parentID) throws SQLException {
        querie = "select * from `Student` where `My_parent`='" + parentID + "'";
        resultSet = statement.executeQuery(querie);
        resultSet.last();
        Date d = null;
        Student all[] = new Student[resultSet.getRow()];
        resultSet.beforeFirst();
        for (int i = 0; resultSet.next(); i++) {
            all[i] = new Student();
            if (resultSet.getDate("Birthdate") != null) {
                d = new Date();
                d.setDay(resultSet.getDate("Birthdate").getDay());
                d.setMonth(resultSet.getDate("Birthdate").getMonth());
                d.setYear(resultSet.getDate("Birthdate").getYear());
            }
            all[i].setId(resultSet.getString("ID"));
            all[i].setName(resultSet.getString("Name"));
            all[i].setBirthdate(d);
            if (resultSet.getString("Phone #") != null) {
                all[i].setPhoneNumber(resultSet.getString("Phone #"));
            }
            all[i].setFromPage(resultSet.getString("From_page"));
            all[i].setToPage(resultSet.getString("To_page"));
            all[i].setGroupId(resultSet.getInt("Enrolled_in"));
            all[i].setParentId(resultSet.getString("My_parent"));
        }
        return all;
    }

    static Group[] getAllGroup() throws SQLException {
        querie = "select * from `Group`";
        resultSet = statement.executeQuery(querie);
        resultSet.last();
        Group all[] = new Group[resultSet.getRow()];

        resultSet.beforeFirst();
        for (int i = 0; resultSet.next(); i++) {
            try {
                all[i] = new Group(resultSet.getInt("ID"), resultSet.getString("Name"), resultSet.getString("Section"), resultSet.getString("Super_id"));
            } catch (Exception e) {
                all[i] = new Group();
            }
        }
        return all;
    }

    static Student[] getAllStudentInGroup(int groupId) throws SQLException {
        querie = "select `student`.`ID`,`student`.`Name`,`Birthdate`,`Phone #`,`From_page`,`To_page`,`Enrolled_in`,`My_parent` from `Student`,`Group` where `group`.`ID`='" + groupId + "' and `Enrolled_in` = `group`.`ID`";
        resultSet = statement.executeQuery(querie);
        resultSet.last();
        Date d = null;
        Student all[] = new Student[resultSet.getRow()];
        resultSet.beforeFirst();
        for (int i = 0; resultSet.next(); i++) {
            all[i] = new Student();
            if (resultSet.getDate("Birthdate") != null) {
                d = new Date();
                d.setDay(resultSet.getDate("Birthdate").getDay());
                d.setMonth(resultSet.getDate("Birthdate").getMonth());
                d.setYear(resultSet.getDate("Birthdate").getYear());
            }
            all[i].setId(resultSet.getString("ID"));
            all[i].setName(resultSet.getString("Name"));
            all[i].setBirthdate(d);
            if (resultSet.getString("Phone #") != null) {
                all[i].setPhoneNumber(resultSet.getString("Phone #"));
            }
            all[i].setFromPage(resultSet.getString("From_page"));
            all[i].setToPage(resultSet.getString("To_page"));
            all[i].setGroupId(resultSet.getInt("Enrolled_in"));
            if (resultSet.getString("My_parent") != null) {
                all[i].setParentId(resultSet.getString("My_parent"));
            }
        }
        return all;
    }

//    static Daily[] getAllDaily() throws SQLException {
//        try {
//            querie = "select * from `Daily`";
//            resultSet = statement.executeQuery(querie);
//            resultSet.last();
//            Daily[] all = new Daily[resultSet.getRow()];
//            Date d;
//            resultSet.beforeFirst();
//            for (int i = 0; resultSet.next(); i++) {
//                all[i] = new Daily();
//                all[i].setStudent_id(resultSet.getString("Student_ID"));
//                d = new Date();
//                d.setDay(resultSet.getDate("Day").getDay());
//                d.setMonth(resultSet.getDate("Day").getMonth());
//                d.setYear(resultSet.getDate("Day").getYear());
//                all[i].setDay(d);
//                all[i].setAttendance(resultSet.getBoolean("Attendance"));
//                all[i].setNumber_of_pages(resultSet.getInt("#_of_page"));
//                all[i].setMark(resultSet.getInt("Mark"));
//            }
//
//            return all;
//        } catch (Exception e) {
//            
//            System.out.println("Error in get all daily");
//        }
//        return null;
//    }
    static Date[] getAllDaysDates() throws SQLException {
        querie = "select distinct `Day` from `Daily` order by `Day` desc";
        resultSet = statement.executeQuery(querie);
        resultSet.last();
        Date[] allDaysDates = new Date[resultSet.getRow()];
        resultSet.beforeFirst();

        for (int i = 0; resultSet.next(); i++) {
            allDaysDates[i] = new Date();
            cal.setTime(resultSet.getDate("Day"));
            allDaysDates[i].setDay(cal.get(Calendar.DATE));
            allDaysDates[i].setMonth(cal.get(Calendar.MONTH) + 1);
            allDaysDates[i].setYear(cal.get(Calendar.YEAR));
        }
        return allDaysDates;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        getConnection();
//        Teacher t = new Teacher();
//        t.setId("1112223336");
//        t.setName("Ahmad");
//        t.setPhoneNumber("0500112233");
//        Date d = new Date(10, 12, 2004);
//        t.setBirthdate(d);
//        t.setCertificate(true);
//        t.setSupervisorId("2125006797");
//        t.setTeaches_group(1);
//        insertTeacher(t);
//        Teacher all[] = getAllTeacher();
//        System.out.println(all.length);
//        Student all[] = getAllStudent();
//        System.out.println(all.length);
//        closeConnection();
//
//        Student all [] = getAllStudent();
//        for (int i = 0; i < all.length; i++) {
//            System.out.println(all[i].getName() + all[i].getId());
//        }
    }
}
