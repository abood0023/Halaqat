package halaqat;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class halaqah extends javax.swing.JFrame {

    public halaqah() {
        initComponents();
        setLocationRelativeTo(null);
    }

    void closeAllPanel() {
        add_group.setVisible(false);
        add_student_p.setVisible(false);
        add_supervisor.setVisible(false);
        add_teacher.setVisible(false);
        edit_informaion_p.setVisible(false);
        edit_students_p.setVisible(false);
        teacher_panel.setVisible(false);
        sign_in_panel.setVisible(false);
        supervisor_add_p.setVisible(false);
        supervisor_delete_p.setVisible(false);
        supervisor_edit_information_mp.setVisible(false);
        supervisor_main_panel.setVisible(false);
        supervisor_panel.setVisible(false);
        jLayeredPane1.setVisible(false);
        teacher_main_panel.setVisible(false);
        student_records_tp.setVisible(false);
        edit_information_tp.setVisible(false);
    }

    void sign_out() throws SQLException {
        currentP = null;
        currentS = null;
        currentStudent = null;
        currentT = null;
        allDaysDates = null;
        allGroups = null;
        allStudent = null;
        allStudentInGroup = null;
        allSupervisor = null;
        allTeacher = null;
        Connector.closeConnection();
    }

    void errorMessage(String message) {
        JLabel label = new JLabel(message);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        JOptionPane.showMessageDialog(null, label, "خطأ", JOptionPane.ERROR_MESSAGE);
    }

    void correctMessage(String message) {
        JLabel label = new JLabel(message);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        JOptionPane.showMessageDialog(null, label, "اكتمال العملية", JOptionPane.PLAIN_MESSAGE);
    }

    public static boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeUserGroup = new javax.swing.ButtonGroup();
        supervisor_add_p_rb = new javax.swing.ButtonGroup();
        supervisor_delete_p_rbg = new javax.swing.ButtonGroup();
        for_edit_students_p = new javax.swing.ButtonGroup();
        group_edit_information_mp = new javax.swing.ButtonGroup();
        sign_in_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        supervisorRB = new javax.swing.JRadioButton();
        teacherRB = new javax.swing.JRadioButton();
        identity_number = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        user_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        sign_in_b = new javax.swing.JButton();
        supervisor_panel = new javax.swing.JPanel();
        supervisor_main_panel = new javax.swing.JPanel();
        supervisor_add_b = new javax.swing.JButton();
        supervisor_edit_information_b = new javax.swing.JButton();
        supervisor_delete_b = new javax.swing.JButton();
        sign_out_s = new javax.swing.JButton();
        supervisor_add_p = new javax.swing.JPanel();
        supervisor_add_rb = new javax.swing.JRadioButton();
        teacher_add_rb = new javax.swing.JRadioButton();
        student_add_rb = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        back_to_supervisor_mp_fap = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        add_supervisor = new javax.swing.JPanel();
        save_add_supervisor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id_supervisor = new javax.swing.JTextField();
        name_supervisor = new javax.swing.JTextField();
        bd_supervisor = new com.toedter.calendar.JDateChooser();
        phone_supervisor = new javax.swing.JTextField();
        salary_supervisor = new javax.swing.JTextField();
        names_supervisors_as_cb = new javax.swing.JComboBox<>();
        add_teacher_s = new javax.swing.JScrollPane();
        add_teacher = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        save_add_teacher = new javax.swing.JButton();
        id_teacher = new javax.swing.JTextField();
        name_teacher = new javax.swing.JTextField();
        bd_teacher = new com.toedter.calendar.JDateChooser();
        phone_teacher = new javax.swing.JTextField();
        salary_teacher = new javax.swing.JTextField();
        certificate_teacher = new javax.swing.JComboBox<>();
        teaches_group = new javax.swing.JComboBox<>();
        super_teacher = new javax.swing.JComboBox<>();
        add_student_s = new javax.swing.JScrollPane();
        add_student_p = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        save_add_student_p = new javax.swing.JButton();
        student_id = new javax.swing.JTextField();
        student_name = new javax.swing.JTextField();
        student_birthdate = new com.toedter.calendar.JDateChooser();
        student_phoneNumber = new javax.swing.JTextField();
        student_fromPage = new javax.swing.JTextField();
        student_toPage = new javax.swing.JTextField();
        student_group = new javax.swing.JComboBox<>();
        parent_id = new javax.swing.JTextField();
        parent_name = new javax.swing.JTextField();
        parent_phoneNumber = new javax.swing.JTextField();
        add_group = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        names_supervisors_ag_cb = new javax.swing.JComboBox<>();
        names_sections_cb = new javax.swing.JComboBox<>();
        name_group_t = new javax.swing.JTextField();
        save_ag = new javax.swing.JButton();
        supervisor_edit_information_mp = new javax.swing.JPanel();
        edit_info_supervisor_rb = new javax.swing.JRadioButton();
        edit_info_teacher_rb = new javax.swing.JRadioButton();
        edit_info_student_rb = new javax.swing.JRadioButton();
        edit_info_group_rb = new javax.swing.JRadioButton();
        edit_students_group_rb = new javax.swing.JRadioButton();
        back_to_supervisor_mp_fep = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        edit_informaion_p = new javax.swing.JPanel();
        names_cb = new javax.swing.JComboBox<>();
        type_edit_cb = new javax.swing.JComboBox<>();
        new_value_b = new javax.swing.JTextField();
        save_the_changes_ip = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        groups_names = new javax.swing.JComboBox<>();
        edit_students_p = new javax.swing.JPanel();
        add_student_to_group = new javax.swing.JRadioButton();
        remove_student_from_group = new javax.swing.JRadioButton();
        group_name_cb = new javax.swing.JComboBox<>();
        student_name_cb = new javax.swing.JComboBox<>();
        save_the_changes_sp = new javax.swing.JButton();
        supervisor_delete_p = new javax.swing.JPanel();
        supervisor_delete_rb = new javax.swing.JRadioButton();
        teacher_delete_rb = new javax.swing.JRadioButton();
        student_delete_rb = new javax.swing.JRadioButton();
        group_delete_rb = new javax.swing.JRadioButton();
        names_delete_cb = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        back_to_supervisor_mp_fdp = new javax.swing.JButton();
        delete_b = new javax.swing.JButton();
        teacher_panel = new javax.swing.JPanel();
        teacher_main_panel = new javax.swing.JPanel();
        teacher_record_b = new javax.swing.JButton();
        teacher_edit_information_b = new javax.swing.JButton();
        sign_out_t = new javax.swing.JButton();
        student_records_tp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        day_record = new javax.swing.JTable();
        day_date_rp = new javax.swing.JComboBox<>();
        back_to_teacher_mp_frp = new javax.swing.JButton();
        save_the_changes_rp = new javax.swing.JButton();
        edit_information_tp = new javax.swing.JPanel();
        type_edit_cb1 = new javax.swing.JComboBox<>();
        new_value_b1 = new javax.swing.JTextField();
        save_the_changes_ip1 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel("Telephone", SwingConstants.RIGHT);
        back_to_teacher_mp_fep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        sign_in_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("مرحبا بكم في مجمع حلقات عثمان الصالح ");

        typeUserGroup.add(supervisorRB);
        supervisorRB.setText("مشرف");
        supervisorRB.setBorderPainted(true);
        supervisorRB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        supervisorRB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        typeUserGroup.add(teacherRB);
        teacherRB.setText("مدرس");
        teacherRB.setBorderPainted(true);
        teacherRB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        teacherRB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        identity_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        identity_number.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        identity_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identity_numberActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("رقم الهوية ");

        user_password.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        user_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_passwordActionPerformed(evt);
            }
        });
        user_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_passwordKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("كلمة المرور");

        sign_in_b.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sign_in_b.setText("دخول");
        sign_in_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_in_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sign_in_panelLayout = new javax.swing.GroupLayout(sign_in_panel);
        sign_in_panel.setLayout(sign_in_panelLayout);
        sign_in_panelLayout.setHorizontalGroup(
            sign_in_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_in_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(sign_in_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sign_in_panelLayout.createSequentialGroup()
                        .addGroup(sign_in_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sign_in_panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sign_in_b, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sign_in_panelLayout.createSequentialGroup()
                                .addGroup(sign_in_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(identity_number, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user_password, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(sign_in_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))))
                        .addGap(35, 35, 35)
                        .addGroup(sign_in_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(supervisorRB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(teacherRB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        sign_in_panelLayout.setVerticalGroup(
            sign_in_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_in_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(sign_in_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sign_in_panelLayout.createSequentialGroup()
                        .addGroup(sign_in_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(identity_number, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(sign_in_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user_password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sign_in_panelLayout.createSequentialGroup()
                        .addComponent(supervisorRB)
                        .addGap(14, 14, 14)
                        .addComponent(teacherRB)))
                .addGap(20, 20, 20)
                .addComponent(sign_in_b, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(sign_in_panel, "card2");

        supervisor_panel.setLayout(new java.awt.CardLayout());

        supervisor_add_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supervisor_add_b.setForeground(new java.awt.Color(0, 153, 0));
        supervisor_add_b.setText("إضافة");
        supervisor_add_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisor_add_bActionPerformed(evt);
            }
        });

        supervisor_edit_information_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supervisor_edit_information_b.setForeground(new java.awt.Color(204, 204, 0));
        supervisor_edit_information_b.setText("تعديل بيانات");
        supervisor_edit_information_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisor_edit_information_bActionPerformed(evt);
            }
        });

        supervisor_delete_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supervisor_delete_b.setForeground(new java.awt.Color(204, 0, 0));
        supervisor_delete_b.setText("حذف");
        supervisor_delete_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisor_delete_bActionPerformed(evt);
            }
        });

        sign_out_s.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sign_out_s.setForeground(new java.awt.Color(204, 0, 0));
        sign_out_s.setText("تسجيل الخروج");
        sign_out_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_out_sActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout supervisor_main_panelLayout = new javax.swing.GroupLayout(supervisor_main_panel);
        supervisor_main_panel.setLayout(supervisor_main_panelLayout);
        supervisor_main_panelLayout.setHorizontalGroup(
            supervisor_main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supervisor_main_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(sign_out_s, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supervisor_main_panelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(supervisor_delete_b, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(supervisor_main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supervisor_add_b, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supervisor_edit_information_b, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        supervisor_main_panelLayout.setVerticalGroup(
            supervisor_main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supervisor_main_panelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(supervisor_main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supervisor_main_panelLayout.createSequentialGroup()
                        .addComponent(supervisor_add_b, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supervisor_edit_information_b, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(supervisor_main_panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(supervisor_delete_b, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(sign_out_s, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        supervisor_panel.add(supervisor_main_panel, "card2");

        supervisor_add_p_rb.add(supervisor_add_rb);
        supervisor_add_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supervisor_add_rb.setText("مشرف");
        supervisor_add_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        supervisor_add_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        supervisor_add_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisor_add_rbActionPerformed(evt);
            }
        });

        supervisor_add_p_rb.add(teacher_add_rb);
        teacher_add_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teacher_add_rb.setText("مدرس");
        teacher_add_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        teacher_add_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        teacher_add_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_add_rbActionPerformed(evt);
            }
        });

        supervisor_add_p_rb.add(student_add_rb);
        student_add_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        student_add_rb.setText("طالب");
        student_add_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        student_add_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        student_add_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_add_rbActionPerformed(evt);
            }
        });

        supervisor_add_p_rb.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("حلقة");
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        back_to_supervisor_mp_fap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back_to_supervisor_mp_fap.setText("رجوع");
        back_to_supervisor_mp_fap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_supervisor_mp_fapActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        save_add_supervisor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save_add_supervisor.setText("حفظ");
        save_add_supervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_add_supervisorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("رقم الهوية");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("الاسم");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("تاريخ الميلاد");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("رقم الجوال");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("الراتب");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("المشرف عليه");

        id_supervisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        id_supervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_supervisorActionPerformed(evt);
            }
        });

        name_supervisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        phone_supervisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        phone_supervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_supervisorActionPerformed(evt);
            }
        });

        salary_supervisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        salary_supervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salary_supervisorActionPerformed(evt);
            }
        });

        names_supervisors_as_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "اسم المشرف" }));

        javax.swing.GroupLayout add_supervisorLayout = new javax.swing.GroupLayout(add_supervisor);
        add_supervisor.setLayout(add_supervisorLayout);
        add_supervisorLayout.setHorizontalGroup(
            add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_supervisorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_supervisorLayout.createSequentialGroup()
                        .addComponent(save_add_supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(add_supervisorLayout.createSequentialGroup()
                        .addGroup(add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_supervisor)
                            .addComponent(name_supervisor)
                            .addComponent(bd_supervisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(phone_supervisor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salary_supervisor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(names_supervisors_as_cb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        add_supervisorLayout.setVerticalGroup(
            add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_supervisorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(add_supervisorLayout.createSequentialGroup()
                        .addGroup(add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(add_supervisorLayout.createSequentialGroup()
                                .addGroup(add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(id_supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(name_supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addComponent(bd_supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addComponent(phone_supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(salary_supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(add_supervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(names_supervisors_as_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(save_add_supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane1.add(add_supervisor, "card3");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("رقم الهوية");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("الاسم ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("تاريخ الميلاد");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("رقم الجوال");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("الراتب");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("الإجازة");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("يُدرس الحلقة");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("المشرف عليه");

        save_add_teacher.setText("حفظ");
        save_add_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_add_teacherActionPerformed(evt);
            }
        });

        id_teacher.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        name_teacher.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        phone_teacher.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        salary_teacher.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        certificate_teacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "يحمل إجازة", "لا يحمل إجازة" }));

        teaches_group.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        super_teacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        super_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                super_teacherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_teacherLayout = new javax.swing.GroupLayout(add_teacher);
        add_teacher.setLayout(add_teacherLayout);
        add_teacherLayout.setHorizontalGroup(
            add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_teacherLayout.createSequentialGroup()
                .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_teacherLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_teacher)
                            .addComponent(id_teacher)
                            .addComponent(bd_teacher, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(phone_teacher)
                            .addComponent(salary_teacher)
                            .addComponent(certificate_teacher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teaches_group, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(add_teacherLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(super_teacher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(add_teacherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(save_add_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        add_teacherLayout.setVerticalGroup(
            add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_teacherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(id_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(name_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(bd_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(phone_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(salary_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(certificate_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(teaches_group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(super_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save_add_teacher)
                .addContainerGap())
        );

        add_teacher_s.setViewportView(add_teacher);

        jLayeredPane1.add(add_teacher_s, "card6");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("رقم هوية الطالب");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("اسم الطالب");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("تاريخ ميلاد الطالب");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("رقم جوال الطالب");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("من الصفحة");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("إلى الصفحة");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("يدرس في حلقة");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("رقم هوية ولي الأمر");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("اسم ولي الأمر");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("رقم جوال ولي الأمر");

        save_add_student_p.setText("حفظ");
        save_add_student_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_add_student_pActionPerformed(evt);
            }
        });

        student_id.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        student_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_idActionPerformed(evt);
            }
        });

        student_name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        student_phoneNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        student_fromPage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        student_toPage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        student_group.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        parent_id.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        parent_name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        parent_phoneNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout add_student_pLayout = new javax.swing.GroupLayout(add_student_p);
        add_student_p.setLayout(add_student_pLayout);
        add_student_pLayout.setHorizontalGroup(
            add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_student_pLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_student_pLayout.createSequentialGroup()
                        .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_id)
                            .addComponent(student_name)
                            .addComponent(student_birthdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(student_phoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(student_fromPage, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(student_toPage, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(student_group, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(parent_id, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(parent_name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(parent_phoneNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(add_student_pLayout.createSequentialGroup()
                        .addComponent(save_add_student_p)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        add_student_pLayout.setVerticalGroup(
            add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_student_pLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(student_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(student_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(student_fromPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(student_toPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(student_group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(parent_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(parent_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_student_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(parent_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save_add_student_p)
                .addContainerGap())
        );

        add_student_s.setViewportView(add_student_p);

        jLayeredPane1.add(add_student_s, "card5");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("اسم الحلقة");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("القسم/الفرع الذي تندرج تحته الحلقة");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("المشرف على الحلقة");

        names_supervisors_ag_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الرجاء اختيار اسم المشرف على الحلقة" }));

        names_sections_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "القرآن الكريم كاملا", "15 جزء", "9 أجزاء", "6 أجزاء", "3 أجزاء" }));
        names_sections_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                names_sections_cbActionPerformed(evt);
            }
        });

        name_group_t.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        save_ag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save_ag.setText("حفظ");
        save_ag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_agActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_groupLayout = new javax.swing.GroupLayout(add_group);
        add_group.setLayout(add_groupLayout);
        add_groupLayout.setHorizontalGroup(
            add_groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_groupLayout.createSequentialGroup()
                .addGroup(add_groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_groupLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(add_groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(add_groupLayout.createSequentialGroup()
                        .addGroup(add_groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(add_groupLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(save_ag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(add_groupLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(add_groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(names_sections_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(names_supervisors_ag_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_group_t, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        add_groupLayout.setVerticalGroup(
            add_groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_groupLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel35)
                .addGap(4, 4, 4)
                .addComponent(name_group_t, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(names_sections_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(names_supervisors_ag_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(save_ag)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLayeredPane1.add(add_group, "card5");

        javax.swing.GroupLayout supervisor_add_pLayout = new javax.swing.GroupLayout(supervisor_add_p);
        supervisor_add_p.setLayout(supervisor_add_pLayout);
        supervisor_add_pLayout.setHorizontalGroup(
            supervisor_add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supervisor_add_pLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(supervisor_add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supervisor_add_pLayout.createSequentialGroup()
                        .addComponent(back_to_supervisor_mp_fap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(supervisor_add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_add_rb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacher_add_rb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supervisor_add_rb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        supervisor_add_pLayout.setVerticalGroup(
            supervisor_add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supervisor_add_pLayout.createSequentialGroup()
                .addGroup(supervisor_add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supervisor_add_pLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(supervisor_add_pLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(supervisor_add_rb)
                        .addGap(33, 33, 33)
                        .addComponent(teacher_add_rb)
                        .addGap(37, 37, 37)
                        .addComponent(student_add_rb)
                        .addGap(35, 35, 35)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addComponent(back_to_supervisor_mp_fap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        supervisor_panel.add(supervisor_add_p, "card3");

        group_edit_information_mp.add(edit_info_supervisor_rb);
        edit_info_supervisor_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit_info_supervisor_rb.setText("مشرف");
        edit_info_supervisor_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edit_info_supervisor_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        edit_info_supervisor_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_info_supervisor_rbActionPerformed(evt);
            }
        });

        group_edit_information_mp.add(edit_info_teacher_rb);
        edit_info_teacher_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit_info_teacher_rb.setText("مدرس");
        edit_info_teacher_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edit_info_teacher_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        edit_info_teacher_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_info_teacher_rbActionPerformed(evt);
            }
        });

        group_edit_information_mp.add(edit_info_student_rb);
        edit_info_student_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit_info_student_rb.setText("طالب");
        edit_info_student_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edit_info_student_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        edit_info_student_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_info_student_rbActionPerformed(evt);
            }
        });

        group_edit_information_mp.add(edit_info_group_rb);
        edit_info_group_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit_info_group_rb.setText("بيانات حلقة");
        edit_info_group_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edit_info_group_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        edit_info_group_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_info_group_rbActionPerformed(evt);
            }
        });

        group_edit_information_mp.add(edit_students_group_rb);
        edit_students_group_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit_students_group_rb.setText("طلاب حلقة");
        edit_students_group_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edit_students_group_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        edit_students_group_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_students_group_rbActionPerformed(evt);
            }
        });

        back_to_supervisor_mp_fep.setText("رجوع");
        back_to_supervisor_mp_fep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_supervisor_mp_fepActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayout(new java.awt.CardLayout());

        type_edit_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الرجاء اختيار ما تريد تعديله" }));
        type_edit_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_edit_cbActionPerformed(evt);
            }
        });

        new_value_b.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        save_the_changes_ip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save_the_changes_ip.setForeground(new java.awt.Color(204, 0, 0));
        save_the_changes_ip.setText("حفظ");
        save_the_changes_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_the_changes_ipActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("القيمة الجديدة:");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel39.setForeground(new java.awt.Color(255, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("<html>إذا كنت تريد تغير تاريخ الميلادالرجاء كتابته على الصيغة الآتية:<br> سنة.شهر.يوم <html>");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        groups_names.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groups_namesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edit_informaion_pLayout = new javax.swing.GroupLayout(edit_informaion_p);
        edit_informaion_p.setLayout(edit_informaion_pLayout);
        edit_informaion_pLayout.setHorizontalGroup(
            edit_informaion_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_informaion_pLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(edit_informaion_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(new_value_b)
                    .addComponent(names_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(type_edit_cb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(edit_informaion_pLayout.createSequentialGroup()
                        .addComponent(save_the_changes_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_informaion_pLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(groups_names, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        edit_informaion_pLayout.setVerticalGroup(
            edit_informaion_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_informaion_pLayout.createSequentialGroup()
                .addComponent(names_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(type_edit_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(groups_names, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_value_b, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(save_the_changes_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane2.add(edit_informaion_p, "card2");

        for_edit_students_p.add(add_student_to_group);
        add_student_to_group.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add_student_to_group.setForeground(new java.awt.Color(0, 153, 0));
        add_student_to_group.setText("إضافة طالب");
        add_student_to_group.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add_student_to_group.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add_student_to_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_student_to_groupActionPerformed(evt);
            }
        });

        for_edit_students_p.add(remove_student_from_group);
        remove_student_from_group.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        remove_student_from_group.setForeground(new java.awt.Color(204, 0, 0));
        remove_student_from_group.setText("حذف طالب");
        remove_student_from_group.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        remove_student_from_group.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        remove_student_from_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_student_from_groupActionPerformed(evt);
            }
        });

        group_name_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        group_name_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group_name_cbActionPerformed(evt);
            }
        });

        student_name_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        student_name_cb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_name_cbActionPerformed(evt);
            }
        });

        save_the_changes_sp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save_the_changes_sp.setForeground(new java.awt.Color(204, 0, 0));
        save_the_changes_sp.setText("حفظ");
        save_the_changes_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_the_changes_spActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edit_students_pLayout = new javax.swing.GroupLayout(edit_students_p);
        edit_students_p.setLayout(edit_students_pLayout);
        edit_students_pLayout.setHorizontalGroup(
            edit_students_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_students_pLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(edit_students_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_students_pLayout.createSequentialGroup()
                        .addComponent(save_the_changes_sp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(edit_students_pLayout.createSequentialGroup()
                        .addGroup(edit_students_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_name_cb, 0, 174, Short.MAX_VALUE)
                            .addComponent(group_name_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(edit_students_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_student_to_group, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(remove_student_from_group, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        edit_students_pLayout.setVerticalGroup(
            edit_students_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_students_pLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(edit_students_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_student_to_group)
                    .addGroup(edit_students_pLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(group_name_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(edit_students_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(remove_student_from_group, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(student_name_cb, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(save_the_changes_sp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jLayeredPane2.add(edit_students_p, "card3");

        javax.swing.GroupLayout supervisor_edit_information_mpLayout = new javax.swing.GroupLayout(supervisor_edit_information_mp);
        supervisor_edit_information_mp.setLayout(supervisor_edit_information_mpLayout);
        supervisor_edit_information_mpLayout.setHorizontalGroup(
            supervisor_edit_information_mpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supervisor_edit_information_mpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(supervisor_edit_information_mpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supervisor_edit_information_mpLayout.createSequentialGroup()
                        .addComponent(back_to_supervisor_mp_fep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(supervisor_edit_information_mpLayout.createSequentialGroup()
                        .addComponent(jLayeredPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(supervisor_edit_information_mpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edit_info_group_rb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit_info_student_rb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit_info_teacher_rb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit_info_supervisor_rb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit_students_group_rb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        supervisor_edit_information_mpLayout.setVerticalGroup(
            supervisor_edit_information_mpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supervisor_edit_information_mpLayout.createSequentialGroup()
                .addGroup(supervisor_edit_information_mpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supervisor_edit_information_mpLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(edit_info_supervisor_rb)
                        .addGap(18, 18, 18)
                        .addComponent(edit_info_teacher_rb)
                        .addGap(18, 18, 18)
                        .addComponent(edit_info_student_rb)
                        .addGap(18, 18, 18)
                        .addComponent(edit_info_group_rb)
                        .addGap(18, 18, 18)
                        .addComponent(edit_students_group_rb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(supervisor_edit_information_mpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(back_to_supervisor_mp_fep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        supervisor_panel.add(supervisor_edit_information_mp, "card4");

        supervisor_delete_p_rbg.add(supervisor_delete_rb);
        supervisor_delete_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supervisor_delete_rb.setText("مشرف");
        supervisor_delete_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        supervisor_delete_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        supervisor_delete_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisor_delete_rbActionPerformed(evt);
            }
        });

        supervisor_delete_p_rbg.add(teacher_delete_rb);
        teacher_delete_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teacher_delete_rb.setText("مدرس");
        teacher_delete_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        teacher_delete_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        teacher_delete_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_delete_rbActionPerformed(evt);
            }
        });

        supervisor_delete_p_rbg.add(student_delete_rb);
        student_delete_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        student_delete_rb.setText("طالب");
        student_delete_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        student_delete_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        student_delete_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_delete_rbActionPerformed(evt);
            }
        });

        supervisor_delete_p_rbg.add(group_delete_rb);
        group_delete_rb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        group_delete_rb.setText("حلقة");
        group_delete_rb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        group_delete_rb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        group_delete_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group_delete_rbActionPerformed(evt);
            }
        });

        names_delete_cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        names_delete_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الرجاء اختيار الاسم" }));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("اختيار الاسم");

        back_to_supervisor_mp_fdp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back_to_supervisor_mp_fdp.setText("رجوع");
        back_to_supervisor_mp_fdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_supervisor_mp_fdpActionPerformed(evt);
            }
        });

        delete_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_b.setForeground(new java.awt.Color(204, 0, 0));
        delete_b.setText("حذف");
        delete_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout supervisor_delete_pLayout = new javax.swing.GroupLayout(supervisor_delete_p);
        supervisor_delete_p.setLayout(supervisor_delete_pLayout);
        supervisor_delete_pLayout.setHorizontalGroup(
            supervisor_delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supervisor_delete_pLayout.createSequentialGroup()
                .addGroup(supervisor_delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(supervisor_delete_pLayout.createSequentialGroup()
                        .addContainerGap(120, Short.MAX_VALUE)
                        .addGroup(supervisor_delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supervisor_delete_pLayout.createSequentialGroup()
                                .addComponent(delete_b, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(student_delete_rb))
                            .addComponent(group_delete_rb, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, supervisor_delete_pLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(supervisor_delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(names_delete_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(supervisor_delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacher_delete_rb, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(supervisor_delete_rb, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(15, 15, 15))
            .addGroup(supervisor_delete_pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_to_supervisor_mp_fdp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        supervisor_delete_pLayout.setVerticalGroup(
            supervisor_delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supervisor_delete_pLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(supervisor_delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(supervisor_delete_rb)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(supervisor_delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacher_delete_rb)
                    .addComponent(names_delete_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(supervisor_delete_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_delete_rb)
                    .addComponent(delete_b, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(group_delete_rb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(back_to_supervisor_mp_fdp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        supervisor_panel.add(supervisor_delete_p, "card6");

        getContentPane().add(supervisor_panel, "card3");

        teacher_panel.setLayout(new java.awt.CardLayout());

        teacher_record_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        teacher_record_b.setForeground(new java.awt.Color(0, 153, 0));
        teacher_record_b.setText("السجل");
        teacher_record_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_record_bActionPerformed(evt);
            }
        });

        teacher_edit_information_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        teacher_edit_information_b.setForeground(new java.awt.Color(204, 204, 0));
        teacher_edit_information_b.setText("تعديل البيانات الشخصية");
        teacher_edit_information_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_edit_information_bActionPerformed(evt);
            }
        });

        sign_out_t.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sign_out_t.setForeground(new java.awt.Color(204, 0, 0));
        sign_out_t.setText("تسجيل الخروج");
        sign_out_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_out_tActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout teacher_main_panelLayout = new javax.swing.GroupLayout(teacher_main_panel);
        teacher_main_panel.setLayout(teacher_main_panelLayout);
        teacher_main_panelLayout.setHorizontalGroup(
            teacher_main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacher_main_panelLayout.createSequentialGroup()
                .addGroup(teacher_main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacher_main_panelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(sign_out_t, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(teacher_main_panelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(teacher_main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teacher_edit_information_b, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(teacher_record_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        teacher_main_panelLayout.setVerticalGroup(
            teacher_main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacher_main_panelLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(teacher_record_b, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teacher_edit_information_b, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(sign_out_t, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        teacher_panel.add(teacher_main_panel, "card2");

        day_record.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الحضور", "الدرجة", "عدد صفحات الحفظ", "اسم الطالب "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(day_record);
        if (day_record.getColumnModel().getColumnCount() > 0) {
            day_record.getColumnModel().getColumn(0).setMinWidth(40);
            day_record.getColumnModel().getColumn(0).setPreferredWidth(55);
            day_record.getColumnModel().getColumn(0).setMaxWidth(60);
            day_record.getColumnModel().getColumn(1).setMinWidth(40);
            day_record.getColumnModel().getColumn(1).setPreferredWidth(55);
            day_record.getColumnModel().getColumn(1).setMaxWidth(60);
            day_record.getColumnModel().getColumn(2).setMinWidth(60);
            day_record.getColumnModel().getColumn(2).setPreferredWidth(80);
            day_record.getColumnModel().getColumn(2).setMaxWidth(100);
            day_record.getColumnModel().getColumn(3).setMinWidth(90);
            day_record.getColumnModel().getColumn(3).setPreferredWidth(100);
            day_record.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        day_date_rp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        day_date_rp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day_date_rpActionPerformed(evt);
            }
        });

        back_to_teacher_mp_frp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back_to_teacher_mp_frp.setText("رجوع");
        back_to_teacher_mp_frp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_teacher_mp_frpActionPerformed(evt);
            }
        });

        save_the_changes_rp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save_the_changes_rp.setForeground(new java.awt.Color(204, 0, 0));
        save_the_changes_rp.setText("حفظ");
        save_the_changes_rp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_the_changes_rpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout student_records_tpLayout = new javax.swing.GroupLayout(student_records_tp);
        student_records_tp.setLayout(student_records_tpLayout);
        student_records_tpLayout.setHorizontalGroup(
            student_records_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_records_tpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(student_records_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(day_date_rp, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(student_records_tpLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(student_records_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(student_records_tpLayout.createSequentialGroup()
                                .addComponent(back_to_teacher_mp_frp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(save_the_changes_rp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        student_records_tpLayout.setVerticalGroup(
            student_records_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_records_tpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(day_date_rp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(student_records_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_the_changes_rp, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(back_to_teacher_mp_frp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        teacher_panel.add(student_records_tp, "card3");

        edit_information_tp.setPreferredSize(new java.awt.Dimension(400, 310));

        type_edit_cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الرجاء اختيار ما تريد تعديله", "الاسم", "تاريخ الميلاد", "رقم الجوال" }));
        type_edit_cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_edit_cb1ActionPerformed(evt);
            }
        });

        new_value_b1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        save_the_changes_ip1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save_the_changes_ip1.setForeground(new java.awt.Color(204, 0, 0));
        save_the_changes_ip1.setText("حفظ");
        save_the_changes_ip1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_the_changes_ip1ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("القيمة الجديدة:");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel41.setForeground(new java.awt.Color(255, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("<html>إذا كنت تريد تغير تاريخ الميلادالرجاء كتابته على الصيغة الآتية:<br> سنة.شهر.يوم <html>");
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        back_to_teacher_mp_fep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back_to_teacher_mp_fep.setText("رجوع");
        back_to_teacher_mp_fep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_teacher_mp_fepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edit_information_tpLayout = new javax.swing.GroupLayout(edit_information_tp);
        edit_information_tp.setLayout(edit_information_tpLayout);
        edit_information_tpLayout.setHorizontalGroup(
            edit_information_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_information_tpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(edit_information_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(edit_information_tpLayout.createSequentialGroup()
                        .addGroup(edit_information_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(new_value_b1)
                            .addComponent(type_edit_cb1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_information_tpLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(edit_information_tpLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(back_to_teacher_mp_fep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save_the_changes_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        edit_information_tpLayout.setVerticalGroup(
            edit_information_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_information_tpLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(type_edit_cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_value_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(edit_information_tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_the_changes_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_to_teacher_mp_fep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        teacher_panel.add(edit_information_tp, "card2");

        getContentPane().add(teacher_panel, "card6");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_passwordActionPerformed

    private void supervisor_add_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisor_add_bActionPerformed
        supervisor_main_panel.setVisible(false);

        supervisor_add_p.setVisible(true);

    }//GEN-LAST:event_supervisor_add_bActionPerformed

    private void student_add_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_add_rbActionPerformed
        add_supervisor.setVisible(false);
        add_teacher.setVisible(false);
        add_group.setVisible(false);
        add_teacher_s.setVisible(false);
        jLayeredPane1.setVisible(true);
        add_student_s.setVisible(true);
        add_student_p.setVisible(true);

        try {
            allGroups = Connector.getAllGroup();
        } catch (SQLException ex) {

        }
        student_group.removeAllItems();
        for (int i = 0; i < allGroups.length; i++) {
            student_group.addItem(allGroups[i].getName());
        }
    }//GEN-LAST:event_student_add_rbActionPerformed

    private void supervisor_add_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisor_add_rbActionPerformed
        add_teacher.setVisible(false);
        add_teacher_s.setVisible(false);
        add_group.setVisible(false);
        add_student_p.setVisible(false);
        add_student_s.setVisible(false);
        jLayeredPane1.setVisible(true);
        add_supervisor.setVisible(true);
        try {
            allSupervisor = Connector.getAllSupervisor();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        names_supervisors_as_cb.removeAllItems();
        names_supervisors_as_cb.addItem("اسم المشرف");
        names_supervisors_as_cb.addItem("لا أحد");
        for (int i = 0; i < allSupervisor.length; i++) {
            names_supervisors_as_cb.addItem(allSupervisor[i].getName());
        }
    }//GEN-LAST:event_supervisor_add_rbActionPerformed

    private void back_to_supervisor_mp_fapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_supervisor_mp_fapActionPerformed
        supervisor_main_panel.setVisible(true);
        supervisor_add_p.setVisible(false);
        jLayeredPane1.setVisible(false);
        supervisor_add_p_rb.clearSelection();
    }//GEN-LAST:event_back_to_supervisor_mp_fapActionPerformed

    private void save_add_supervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_add_supervisorActionPerformed
        if (!id_supervisor.getText().isEmpty() && !name_supervisor.getText().isEmpty() && bd_supervisor.getDate() != null
                && !phone_supervisor.getText().isEmpty() && !salary_supervisor.getText().isEmpty()) {
            Supervisor s = new Supervisor();
            if (id_supervisor.getText().length() == 10) {
                try {
                    Integer.parseInt(id_supervisor.getText());
                    s.setId(id_supervisor.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم الهوية", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "رقم الهوية يجب أن لا يقل أو يزيد عن 10 أرقام", "Error", JOptionPane.ERROR_MESSAGE);
            }

            s.setPassword("00000000");
            s.setName(name_supervisor.getText());

            Date d = new Date(bd_supervisor.getDate().getDate(), bd_supervisor.getDate().getMonth(), bd_supervisor.getDate().getYear());
            s.setBirthdate(d);
            try {
                Integer.parseInt(phone_supervisor.getText());
                s.setPhoneNumber(phone_supervisor.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "فضلاً أدخل رقم جوال صحيح", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int x = names_supervisors_as_cb.getSelectedIndex();
            if (x > 1) {
                s.setSupervisorId(allSupervisor[x - 1].getId());
            } else if (x == 0) {
                JOptionPane.showMessageDialog(null, "فضلاً اختر اسم المشرف ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double salary;
            try {
                salary = Double.parseDouble(salary_supervisor.getText());
                s.setSalary(salary);
                Connector.insertSupervisor(s);
                JOptionPane.showMessageDialog(null, "تم إضافة مشرف بنجاح", "", JOptionPane.OK_OPTION);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "فضلاً أدخل رقم صحيح للراتب ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "فضلاً تأكد من إدخال جميع القيم بالشكل الصحيح ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_add_supervisorActionPerformed

    private void id_supervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_supervisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_supervisorActionPerformed

    private void phone_supervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_supervisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_supervisorActionPerformed

    private void salary_supervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salary_supervisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salary_supervisorActionPerformed

    private void save_add_student_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_add_student_pActionPerformed
        if (!student_id.getText().isEmpty() && !student_name.getText().isEmpty()
                && !student_fromPage.getText().isEmpty() && !student_toPage.getText().isEmpty()) {
            Student s = new Student();
            if (student_id.getText().length() == 10) {
                try {
                    Integer.parseInt(student_id.getText());
                    s.setId(student_id.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم هوية الطالب", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "رقم الهوية يجب أن لا يقل أو يزيد عن 10 أرقام", "Error", JOptionPane.ERROR_MESSAGE);
            }
            s.setName(student_name.getText());
            if (!((JTextField) student_birthdate.getDateEditor().getUiComponent()).getText().isEmpty()) {
                Date d = new Date(student_birthdate.getDate().getDate(), student_birthdate.getDate().getMonth(), student_birthdate.getDate().getYear());
                s.setBirthdate(d);
            }
            if (!student_phoneNumber.getText().isEmpty()) {
                try {
                    Integer.parseInt(student_phoneNumber.getText());
                    s.setPhoneNumber(student_phoneNumber.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم جوال الطالب", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            try {
                Integer.parseInt(student_fromPage.getText());
                s.setPhoneNumber(student_fromPage.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم الصفحة ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                Integer.parseInt(student_toPage.getText());
                s.setPhoneNumber(student_toPage.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم الصفحة ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            s.setGroupId(allGroups[student_group.getSelectedIndex()].getId());

            Parent p = new Parent();

            if (!parent_id.getText().isEmpty() && !parent_name.getText().isEmpty() && !parent_phoneNumber.getText().isEmpty()) {
                Parent p1 = Connector.searchParent(parent_id.getText());
                if (p1 == null) {
                    try {
                        Integer.parseInt(parent_id.getText());
                        p.setID(parent_id.getText());
                        s.setParentId(parent_id.getText());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم هوية ولي الأمر", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    p.setName(parent_name.getText());
                    try {
                        Integer.parseInt(parent_phoneNumber.getText());
                        p.setPhoneNumber(parent_phoneNumber.getText());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم جوال ولي أمر الطالب", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    try {
                        Connector.insertParent(p);
                    } catch (SQLException ex) {
                        Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    s.setParentId(parent_id.getText());
                }
            } else if (parent_id.getText().isEmpty() && parent_name.getText().isEmpty() && parent_phoneNumber.getText().isEmpty()) {
            } else {
                errorMessage("فضلاً تأكد من إدخال جميع القيم الخاصة بولي الأمر بالشكل الصحيح ");
                return;
            }
            try {
                Connector.insertStudent(s);
                correctMessage("تم إضافة طالب بنجاح");
            } catch (SQLException ex) {
                errorMessage("لم يتم إضافة الطالب بنجاح");
            }
        } else {
            errorMessage("فضلاً تأكد من إدخال جميع القيم بالشكل الصحيح ");
        }

    }//GEN-LAST:event_save_add_student_pActionPerformed

    private void student_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_idActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        add_student_s.setVisible(false);
        add_supervisor.setVisible(false);
        add_teacher.setVisible(false);
        add_student_p.setVisible(false);
        add_teacher_s.setVisible(false);
        jLayeredPane1.setVisible(true);
        add_group.setVisible(true);

        try {
            allSupervisor = Connector.getAllSupervisor();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        names_supervisors_ag_cb.removeAllItems();
        names_supervisors_ag_cb.addItem("الرجاء اختيار اسم المشرف على الحلقة");
        for (int i = 0; i < allSupervisor.length; i++) {
            names_supervisors_ag_cb.addItem(allSupervisor[i].getName());
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void supervisor_delete_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisor_delete_rbActionPerformed
        try {
            allSupervisor = Connector.getAllSupervisor();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        names_delete_cb.removeAllItems();
        names_delete_cb.addItem("الرجاء اختيار اسم المشرف ");
        for (int i = 0; i < allSupervisor.length; i++) {
            names_delete_cb.addItem(allSupervisor[i].getName());
        }
    }//GEN-LAST:event_supervisor_delete_rbActionPerformed

    private void edit_info_teacher_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_info_teacher_rbActionPerformed
        edit_students_p.setVisible(false);
        edit_informaion_p.setVisible(true);
        groups_names.setVisible(true);

        try {
            allTeacher = Connector.getAllTeacher();
            allGroups = Connector.getAllGroup();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        groups_names.removeAllItems();
        groups_names.addItem("اختر اسم الحلقة بدلاً من كتابته إذا كنت تريد تغير الحلقة التي يدرسها");
        for (int i = 0; i < allGroups.length; i++) {
            groups_names.addItem(allGroups[i].getName());
        }
        type_edit_cb.removeAllItems();
        type_edit_cb.addItem("الرجاء اختيار ما تريد تعديله");
        type_edit_cb.addItem("رقم الهوية");
        type_edit_cb.addItem("كلمة السر");
        type_edit_cb.addItem("الاسم");
        type_edit_cb.addItem("تاريخ الميلاد");
        type_edit_cb.addItem("رقم الجوال");
        type_edit_cb.addItem("الراتب");
        type_edit_cb.addItem("هل يحمل إجازة ؟");
        type_edit_cb.addItem("الحلقة التي يدرسها");
        type_edit_cb.addItem("المشرف عليه");

        names_cb.removeAllItems();
        names_cb.addItem("الرجاء اختيار اسم المدرس");
        for (int i = 0; i < allTeacher.length; i++) {
            names_cb.addItem(allTeacher[i].getName());
        }
    }//GEN-LAST:event_edit_info_teacher_rbActionPerformed

    private void type_edit_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_edit_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_edit_cbActionPerformed

    private void sign_in_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_in_bActionPerformed
        closeAllPanel();
        try {
            Connector.getConnection();
        } catch (Exception e) {
            System.out.println("Error connection");
        }

        if (supervisorRB.isSelected()) {
            currentS = Connector.searchSupervisor(identity_number.getText());
            if (currentS != null) {
                if (currentS.getPassword().equals(new String(user_password.getPassword()))) {
                    supervisor_panel.setVisible(true);
                    identity_number.setText("");
                    user_password.setText("");
                    typeUserGroup.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "فضلاً تأكد من كلمة المرور ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم الهوية ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (teacherRB.isSelected()) {
            currentT = Connector.searchTeacher(identity_number.getText());
            if (currentT != null) {
                if (currentT.getPassword().equals(new String(user_password.getPassword()))) {
                    teacher_panel.setVisible(true);
                    teacher_main_panel.setVisible(true);
                    identity_number.setText("");
                    user_password.setText("");
                    typeUserGroup.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "فضلاً تأكد من كلمة المرور ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم الهوية ", "Error", JOptionPane.ERROR_MESSAGE);
            }
//        } else if (studentRB.isSelected()) {
//            currentStudent = Connector.searchStudent(identity_number.getText());
//            if (currentStudent != null) {
//                if (currentStudent.getPassword().equals(new String(user_password.getPassword()))) {
//                    student_panel.setVisible(true);
//                    identity_number.setText("");
//                    user_password.setText("");
//                    typeUserGroup.clearSelection();
//                } else {
//                    JOptionPane.showMessageDialog(null, "فضلاً تأكد من كلمة المرور ", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم الهوية ", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        } else if (parentRB.isSelected()) {
//            currentP = Connector.searchParent(identity_number.getText());
//            if (currentP != null) {
//                if (currentP.getPassword().equals(new String(user_password.getPassword()))) {
//                    parent_panel.setVisible(true);
//                    identity_number.setText("");
//                    user_password.setText("");
//                    typeUserGroup.clearSelection();
//                } else {
//                    JOptionPane.showMessageDialog(null, "فضلاً تأكد من كلمة المرور ", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم الهوية ", "Error", JOptionPane.ERROR_MESSAGE);
//            }
        } else {
            JOptionPane.showMessageDialog(null, "فضلاً اختر من القائمة من تكون ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sign_in_bActionPerformed

    private void sign_out_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_out_sActionPerformed
        try {
            sign_out();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        supervisor_panel.setVisible(false);
        sign_in_panel.setVisible(true);
    }//GEN-LAST:event_sign_out_sActionPerformed

    private void supervisor_edit_information_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisor_edit_information_bActionPerformed
        supervisor_main_panel.setVisible(false);
        supervisor_edit_information_mp.setVisible(true);
    }//GEN-LAST:event_supervisor_edit_information_bActionPerformed

    private void back_to_supervisor_mp_fepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_supervisor_mp_fepActionPerformed
        supervisor_edit_information_mp.setVisible(false);
        supervisor_main_panel.setVisible(true);
    }//GEN-LAST:event_back_to_supervisor_mp_fepActionPerformed

    private void supervisor_delete_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisor_delete_bActionPerformed
        // TODO add your handling code here:
        supervisor_main_panel.setVisible(false);
        supervisor_delete_p.setVisible(true);
    }//GEN-LAST:event_supervisor_delete_bActionPerformed

    private void back_to_supervisor_mp_fdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_supervisor_mp_fdpActionPerformed
        supervisor_delete_p.setVisible(false);
        supervisor_main_panel.setVisible(true);
    }//GEN-LAST:event_back_to_supervisor_mp_fdpActionPerformed

    private void edit_info_supervisor_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_info_supervisor_rbActionPerformed
        edit_students_p.setVisible(false);
        edit_informaion_p.setVisible(true);
        groups_names.setVisible(false);

        try {
            allSupervisor = Connector.getAllSupervisor();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        type_edit_cb.removeAllItems();
        type_edit_cb.addItem("الرجاء اختيار ما تريد تعديله");
        type_edit_cb.addItem("رقم الهوية");
        type_edit_cb.addItem("كلمة المرور");
        type_edit_cb.addItem("الاسم");
        type_edit_cb.addItem("تاريخ الميلاد");
        type_edit_cb.addItem("رقم الجوال");
        type_edit_cb.addItem("الراتب");
        type_edit_cb.addItem("المشرف عليه");

        names_cb.removeAllItems();
        names_cb.addItem("الرجاء اختيار اسم المشرف");
        for (int i = 0; i < allSupervisor.length; i++) {
            names_cb.addItem(allSupervisor[i].getName());
        }

    }//GEN-LAST:event_edit_info_supervisor_rbActionPerformed

    private void edit_info_student_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_info_student_rbActionPerformed
        edit_students_p.setVisible(false);
        edit_informaion_p.setVisible(true);
        groups_names.setVisible(true);
        try {
            allStudent = Connector.getAllStudent();
            allGroups = Connector.getAllGroup();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        groups_names.removeAllItems();
        groups_names.addItem("اختر اسم الحلقة بدلاً من كتابته إذا كنت تريد تغسر الحلقة التي يدرس بها");
        for (int i = 0; i < allGroups.length; i++) {
            groups_names.addItem(allGroups[i].getName());
        }
        type_edit_cb.removeAllItems();
        type_edit_cb.addItem("الرجاء اختيار ما تريد تعديله");
        type_edit_cb.addItem("رقم الهوية");
        type_edit_cb.addItem("الاسم");
        type_edit_cb.addItem("تاريخ الميلاد");
        type_edit_cb.addItem("رقم الجوال");
        type_edit_cb.addItem("رقم صفحة البداية");
        type_edit_cb.addItem("رقم صفحة النهاية");
        type_edit_cb.addItem("الحلقة التي يدرس بها");
        type_edit_cb.addItem("رقم هوية الأب");
        type_edit_cb.addItem("رقم جوال الأب");
        type_edit_cb.addItem("اسم الأب");

        names_cb.removeAllItems();
        names_cb.addItem("الرجاء اختيار اسم الطالب");
        for (int i = 0; i < allStudent.length; i++) {
            names_cb.addItem(allStudent[i].getName());
        }
    }//GEN-LAST:event_edit_info_student_rbActionPerformed

    private void edit_info_group_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_info_group_rbActionPerformed
        edit_students_p.setVisible(false);
        edit_informaion_p.setVisible(true);
        groups_names.setVisible(false);
        try {
            allGroups = Connector.getAllGroup();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        type_edit_cb.removeAllItems();
        type_edit_cb.addItem("الرجاء اختيار ما تريد تعديله");
        type_edit_cb.addItem("اسم الحلقة");
        type_edit_cb.addItem("الفرع");
        type_edit_cb.addItem("المشرف على الحلقة");

        names_cb.removeAllItems();
        names_cb.addItem("الرجاء اختيار اسم الحلقة");
        for (int i = 0; i < allGroups.length; i++) {
            names_cb.addItem(allGroups[i].getName());
        }
    }//GEN-LAST:event_edit_info_group_rbActionPerformed

    private void edit_students_group_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_students_group_rbActionPerformed
        edit_informaion_p.setVisible(false);
        edit_students_p.setVisible(true);
        try {
            allGroups = Connector.getAllGroup();
            allStudent = Connector.getAllStudent();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        group_name_cb.removeAllItems();
        student_name_cb.removeAllItems();

        group_name_cb.addItem("الرجاء اختيار اسم الحلقة");
        for (int i = 0; i < allGroups.length; i++) {
            group_name_cb.addItem(allGroups[i].getName());
        }
    }//GEN-LAST:event_edit_students_group_rbActionPerformed

    private void teacher_add_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_add_rbActionPerformed
        add_group.setVisible(false);
        add_student_p.setVisible(false);
        add_student_s.setVisible(false);
        add_supervisor.setVisible(false);
        jLayeredPane1.setVisible(true);
        add_teacher_s.setVisible(true);
        add_teacher.setVisible(true);

        try {
            allGroups = Connector.getAllGroup();
            allSupervisor = Connector.getAllSupervisor();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        teaches_group.removeAllItems();
        super_teacher.removeAllItems();
        for (int i = 0; i < allGroups.length; i++) {
            teaches_group.addItem(allGroups[i].getName());
        }
        for (int i = 0; i < allSupervisor.length; i++) {
            super_teacher.addItem(allSupervisor[i].getName());
        }
    }//GEN-LAST:event_teacher_add_rbActionPerformed

    private void names_sections_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_names_sections_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_names_sections_cbActionPerformed

    private void save_agActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_agActionPerformed
        Group g = new Group();
        g.setName(name_group_t.getText());
        if (names_supervisors_ag_cb.getSelectedIndex() > 0) {
            g.setName(name_group_t.getText());
            g.setSection(names_sections_cb.getItemAt(names_sections_cb.getSelectedIndex()));
            g.setSupervisorId(allSupervisor[names_supervisors_ag_cb.getSelectedIndex() - 1].getId());
            try {
                Connector.insertGroup(g);
                JOptionPane.showMessageDialog(null, "تم إضافة حلقة بنجاح", "", JOptionPane.OK_OPTION);
            } catch (SQLException ex) {
                Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "فضلاً تأكد من اختيار\nالمشرف على الحلقة و فرعها.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_agActionPerformed

    private void super_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_super_teacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_super_teacherActionPerformed

    private void save_add_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_add_teacherActionPerformed
        if (bd_teacher.getDate() != null && !id_teacher.getText().isEmpty() && !name_teacher.getText().isEmpty()
                && !phone_teacher.getText().isEmpty() && !salary_teacher.getText().isEmpty()) {
            Teacher t = new Teacher();
            if (id_teacher.getText().length() == 10) {
                try {
                    Integer.parseInt(id_teacher.getText());
                    t.setId(id_teacher.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم الهوية", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "رقم الهوية يجب أن لا يقل أو يزيد عن 10 أرقام", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            t.setName(name_teacher.getName());
            t.setPassword("11111111");
            Date d;
            d = new Date(bd_supervisor.getDate().getDate(), bd_supervisor.getDate().getMonth(), bd_supervisor.getDate().getYear());
            t.setBirthdate(d);

            try {
                Integer.parseInt(phone_teacher.getText());
                t.setPhoneNumber(phone_teacher.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "فضلاً أدخل رقم جوال صحيح", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (certificate_teacher.getSelectedIndex() == 0) {
                t.setCertificate(true);
            }
            t.setTeaches_group(allGroups[teaches_group.getSelectedIndex()].getId());
            t.setSupervisorId(allSupervisor[super_teacher.getSelectedIndex()].getId());
            double salary;
            try {
                salary = Double.parseDouble(salary_teacher.getText());
                t.setSalary(salary);
                Connector.insertTeacher(t);
                JOptionPane.showMessageDialog(null, "تم إضافة مدرس بنجاح", "", JOptionPane.OK_OPTION);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "فضلاً أدخل رقم صحيح للراتب ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "فضلاً تأكد من إدخال جميع القيم بالشكل الصحيح ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_add_teacherActionPerformed

    private void user_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_passwordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sign_in_b.doClick();
        }
    }//GEN-LAST:event_user_passwordKeyPressed

    private void groups_namesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groups_namesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groups_namesActionPerformed

    private void save_the_changes_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_the_changes_ipActionPerformed
        if (edit_info_supervisor_rb.isSelected()) {
            switch (type_edit_cb.getSelectedIndex()) {
                case 1:
                    if (new_value_b.getText().length() == 10) {
                        try {
                            Integer.parseInt(new_value_b.getText());
                            if (Connector.searchSupervisor(new_value_b.getText()) == null) {
                                Connector.updateSupervisor(allSupervisor[names_cb.getSelectedIndex() - 1].getId(), "ID", new_value_b.getText());
                                correctMessage("تمت العملية بنجاح");
                            } else {
                                errorMessage("لا تستطيع وضع هذا الرقم لأنه موجود سابقاً");
                            }
                        } catch (Exception e) {
                            errorMessage("تأكد من أن المدخل أرقام ");
                        }
                    } else {
                        errorMessage("رقم الهوية يجب أن لا يقل أو يزيد عن 10 أرقام");
                    }
                    break;
                case 2:
                    if (new_value_b.getText().length() <= 8) {
                        Connector.updateSupervisor(allSupervisor[names_cb.getSelectedIndex() - 1].getId(), "Password", new_value_b.getText());
                        correctMessage("تمت العملية بنجاح");
                    } else {
                        JOptionPane.showMessageDialog(null, "كلمة المرور يجب أن لا تزيد عن 8 أرقام أو أحرف ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 3:
                    if (new_value_b.getText().length() <= 50) {
                        Connector.updateSupervisor(allSupervisor[names_cb.getSelectedIndex() - 1].getId(), "Name", new_value_b.getText());
                        correctMessage("تمت العملية بنجاح");
                    } else {
                        JOptionPane.showMessageDialog(null, " الاسم يجب أن لا يزيد عن 50 حرف ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 4:
                    String[] parts = new_value_b.getText().split("\\.");
                    if (parts.length == 3) {
                        if (parts[2].length() == 4 && (parts[0].length() == 1 || parts[0].length() == 2) && (parts[1].length() == 1 || parts[1].length() == 2)) {
                            if (isValidDate(parts[2] + "." + parts[1] + "." + parts[0])) {
                                Connector.updateSupervisor(allSupervisor[names_cb.getSelectedIndex() - 1].getId(), "Birthdate", parts[2] + "." + parts[1] + "." + parts[0]);
                                correctMessage("تمت العلمية بنجاح");
                            } else {
                                errorMessage("هذا التاريخ غير صارلح الرجاء التأكد من التاريخ المدخل");
                            }
                        } else if (parts[0].length() == 4 && (parts[2].length() == 1 || parts[2].length() == 2) && (parts[1].length() == 1 || parts[1].length() == 2)) {
                            if (isValidDate(parts[0] + "." + parts[1] + "." + parts[2])) {
                                Connector.updateSupervisor(allSupervisor[names_cb.getSelectedIndex() - 1].getId(), "Birthdate", parts[0] + "." + parts[1] + "." + parts[2]);
                                correctMessage("تمت العلمية بنجاح");
                            } else {
                                errorMessage("هذا التاريخ غير صارلح الرجاء التأكد من التاريخ المدخل");
                            }
                        } else {
                            errorMessage("الرجاء التأكد من أنك أدخلت تاريخ الميلاد على الصيغة التالية: سنة.شهر.يوم " + "مثال ذلك 10.12.2000");
                        }
                    } else {
                        errorMessage("الرجاء التأكد من أنك أدخلت تاريخ الميلاد على الصيغة التالية: سنة.شهر.يوم " + "مثال ذلك 10.12.2000");
                    }
                    break;
                case 5:
                    try {
                        Integer.parseInt(new_value_b.getText());
                        Connector.updateSupervisor(allSupervisor[names_cb.getSelectedIndex() - 1].getId(), "Phone #", new_value_b.getText());
                        correctMessage("تمت العملية بنجاح");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "فضلاً أدخل رقم جوال صحيح", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 6:
                    double salary;
                    try {
                        salary = Double.parseDouble(new_value_b.getText());
                        Connector.updateSupervisor(allSupervisor[names_cb.getSelectedIndex() - 1].getId(), "Salary", new_value_b.getText());
                        correctMessage("تمت العملية بنجاح");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "فضلاً أدخل رقماً صحيحاً", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 7:
                    if (new_value_b.getText().length() == 10) {
                        try {
                            Integer.parseInt(new_value_b.getText());
                            if (Connector.searchSupervisor(new_value_b.getText()) != null) {
                                Connector.updateSupervisor(allSupervisor[names_cb.getSelectedIndex() - 1].getId(), "Super_id", new_value_b.getText());
                                correctMessage("تمت العملية بنجاح");
                            } else {
                                JOptionPane.showMessageDialog(null, "هذا مشرف غير موجود", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "تأكد من أن المدخل أرقام ", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "رقم الهوية يجب أن لا يقل أو يزيد عن 10 أرقام", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
        } else if (edit_info_teacher_rb.isSelected()) {
            switch (type_edit_cb.getSelectedIndex()) {
                case 1:
                    if (new_value_b.getText().length() == 10) {
                        try {
                            Integer.parseInt(new_value_b.getText());
                            if (Connector.searchTeacher(new_value_b.getText()) == null) {
                                Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "ID", new_value_b.getText());
                                correctMessage("تمت العملية بنجاح");
                            } else {
                                JOptionPane.showMessageDialog(null, "لا تستطيع وضع هذا الرقم لأنه موجود سابقاً", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "تأكد من أن المدخل أرقام ", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "رقم الهوية يجب أن لا يقل أو يزيد عن 10 أرقام", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 2:
                    if (new_value_b.getText() != null && new_value_b.getText().length() <= 8) {
                        Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Password", new_value_b.getText());
                        correctMessage("تمت العملية بنجاح");
                    } else {
                        JOptionPane.showMessageDialog(null, "كلمة المرور يجب أن لا تزيد عن 8 أرقام أو أحرف ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 3:
                    if (new_value_b.getText() != null && new_value_b.getText().length() <= 50) {
                        Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Name", new_value_b.getText());
                        correctMessage("تمت العملية بنجاح");
                    } else {
                        JOptionPane.showMessageDialog(null, " الاسم يجب أن لا يزيد عن 50 حرف ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 4:
                    String[] parts = new_value_b.getText().split("\\.");
                    if (parts.length == 3) {
                        if (parts[2].length() == 4 && (parts[0].length() == 1 || parts[0].length() == 2) && (parts[1].length() == 1 || parts[1].length() == 2)) {
                            if (isValidDate(parts[2] + "." + parts[1] + "." + parts[0])) {
                                Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Birthdate", parts[2] + "." + parts[1] + "." + parts[0]);
                                correctMessage("تمت العلمية بنجاح");
                            } else {
                                errorMessage("هذا التاريخ غير صارلح الرجاء التأكد من التاريخ المدخل");
                            }
                        } else if (parts[0].length() == 4 && (parts[2].length() == 1 || parts[2].length() == 2) && (parts[1].length() == 1 || parts[1].length() == 2)) {
                            if (isValidDate(parts[0] + "." + parts[1] + "." + parts[2])) {
                                Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Birthdate", parts[0] + "." + parts[1] + "." + parts[2]);
                                correctMessage("تمت العلمية بنجاح");
                            } else {
                                errorMessage("هذا التاريخ غير صارلح الرجاء التأكد من التاريخ المدخل");
                            }
                        } else {
                            errorMessage("الرجاء التأكد من أنك أدخلت تاريخ الميلاد على الصيغة التالية: سنة.شهر.يوم " + "مثال ذلك 10.12.2000");
                        }
                    } else {
                        errorMessage("الرجاء التأكد من أنك أدخلت تاريخ الميلاد على الصيغة التالية: سنة.شهر.يوم " + "مثال ذلك 10.12.2000");
                    }
                    break;
                case 5:
                    try {
                        Integer.parseInt(new_value_b.getText());
                        Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Phone #", new_value_b.getText());
                        correctMessage("تمت العلمية بنجاح");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "فضلاً أدخل رقم جوال صحيح", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 6:
                    double salary;
                    try {
                        salary = Double.parseDouble(new_value_b.getText());
                        Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Salary", new_value_b.getText());
                        correctMessage("تمت العلمية بنجاح");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "فضلاً أدخل رقماً  صحيح", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 7:
                    if (new_value_b.getText().equals("نعم")) {
                        Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Certificate", 1);
                        correctMessage("تمت العلمية بنجاح");
                    } else if (new_value_b.getText().equals("لا")) {
                        Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Certificate", 0);
                        correctMessage("تمت العلمية بنجاح");
                    } else {
                        errorMessage("الرجاء كتابت نعم إذا كان يحمل إجازة أو لا إذا لم يكن يحمل إجازة");
                    }
                    break;
                case 8:
                    if (groups_names.getSelectedIndex() > 0) {
                        Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Teaches_group", allGroups[groups_names.getSelectedIndex() - 1].getId());
                        correctMessage("تمت العلمية بنجاح");
                    } else {
                        errorMessage("الرجاء اختيار اسم الحلقة");
                    }
                    break;
                case 9:
                    if (new_value_b.getText().length() == 10) {
                        try {
                            Integer.parseInt(new_value_b.getText());
                            if (Connector.searchSupervisor(new_value_b.getText()) != null) {
                                Connector.updateTeacher(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Super_id", new_value_b.getText());
                                correctMessage("تمت العلمية بنجاح");
                            } else {
                                JOptionPane.showMessageDialog(null, "هذا مشرف غير موجود", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "أدخل رقم هوية المشرف", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "رقم الهوية يجب أن لا يقل أو يزيد عن 10 أرقام", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }

        } else if (edit_info_student_rb.isSelected()) {
            switch (type_edit_cb.getSelectedIndex()) {
                case 1:
                    if (new_value_b.getText().length() == 10) {
                        try {
                            Integer.parseInt(new_value_b.getText());
                            if (Connector.searchStudent(new_value_b.getText()) == null) {
                                Connector.updateStudent(allStudent[names_cb.getSelectedIndex() - 1].getId(), "ID", new_value_b.getText());
                                correctMessage("تمت العلمية بنجاح");
                            } else {
                                JOptionPane.showMessageDialog(null, "لا تستطيع وضع هذا الرقم لأنه موجود سابقاً", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "تأكد من أن المدخل أرقام ", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "رقم الهوية يجب أن لا يقل أو يزيد عن 10 أرقام", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 2:
                    if (new_value_b.getText().length() <= 50) {
                        try {
                            Connector.updateStudent(allStudent[names_cb.getSelectedIndex() - 1].getId(), "Name", new_value_b.getText());
                            correctMessage("تمت العلمية بنجاح");
                        } catch (SQLException ex) {
                            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, " الاسم يجب أن لا يزيد عن 50 حرف ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 3:
                    String[] parts = new_value_b.getText().split("\\.");
                    if (parts.length == 3) {
                        if (parts[2].length() == 4 && (parts[0].length() == 1 || parts[0].length() == 2) && (parts[1].length() == 1 || parts[1].length() == 2)) {
                            if (isValidDate(parts[2] + "." + parts[1] + "." + parts[0])) {
                                try {
                                    Connector.updateStudent(allStudent[names_cb.getSelectedIndex() - 1].getId(), "Birthdate", parts[2] + "." + parts[1] + "." + parts[0]);
                                    correctMessage("تمت العلمية بنجاح");
                                } catch (SQLException ex) {
                                    errorMessage("لم تتم العملية بنجاح");
                                }

                            } else {
                                errorMessage("هذا التاريخ غير صارلح الرجاء التأكد من التاريخ المدخل");
                            }
                        } else if (parts[0].length() == 4 && (parts[2].length() == 1 || parts[2].length() == 2) && (parts[1].length() == 1 || parts[1].length() == 2)) {
                            if (isValidDate(parts[0] + "." + parts[1] + "." + parts[2])) {
                                try {
                                    Connector.updateStudent(allTeacher[names_cb.getSelectedIndex() - 1].getId(), "Birthdate", parts[0] + "." + parts[1] + "." + parts[2]);
                                    correctMessage("تمت العلمية بنجاح");
                                } catch (SQLException ex) {
                                    errorMessage("لم تتم العملية بنجاح");
                                }
                                correctMessage("تمت العلمية بنجاح");
                            } else {
                                errorMessage("هذا التاريخ غير صارلح الرجاء التأكد من التاريخ المدخل");
                            }
                        } else {
                            errorMessage("الرجاء التأكد من أنك أدخلت تاريخ الميلاد على الصيغة التالية: سنة.شهر.يوم " + "مثال ذلك 10.12.2000");
                        }
                    } else {
                        errorMessage("الرجاء التأكد من أنك أدخلت تاريخ الميلاد على الصيغة التالية: سنة.شهر.يوم " + "مثال ذلك 10.12.2000");
                    }
                    break;
                case 4:
                    try {
                        Integer.parseInt(new_value_b.getText());
                        Connector.updateStudent(allStudent[names_cb.getSelectedIndex() - 1].getId(), "Phone #", new_value_b.getText());
                        correctMessage("تمت العلمية بنجاح");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "فضلاً أدخل رقم جوال صحيح", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 5:
                    try {
                        Integer.parseInt(new_value_b.getText());
                        Connector.updateStudent(allStudent[names_cb.getSelectedIndex() - 1].getId(), "From_page", new_value_b.getText());
                        correctMessage("تمت العلمية بنجاح");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "أدخل رقماً صحيحاً للصفحة ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 6:
                    try {
                        Integer.parseInt(new_value_b.getText());
                        Connector.updateStudent(allStudent[names_cb.getSelectedIndex() - 1].getId(), "To_page", new_value_b.getText());
                        correctMessage("تمت العلمية بنجاح");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "أدخل رقماً صحيحاً للصفحة ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 7:
                    if (groups_names.getSelectedIndex() > 0) {
                        try {
                            Connector.updateStudent(allStudent[names_cb.getSelectedIndex() - 1].getId(), "Enrolled_in", allGroups[groups_names.getSelectedIndex() - 1].getId());
                            correctMessage("تمت العلمية بنجاح");
                        } catch (SQLException ex) {
                            errorMessage("لم تتم العملية بنجاح");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "فضلاً اختر اسم الحلقة بدلاً من كتابته", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 8:
                    try {
                        if (new_value_b.getText().length() != 10) {
                            errorMessage("رقم الهوية يجب أن لا يقل عن 10 أرقام ");
                            return;
                        }
                        Long.parseUnsignedLong(new_value_b.getText());
                        Parent newP = Connector.searchParent(new_value_b.getText());
                        Parent oldP = Connector.searchParent(allStudent[names_cb.getSelectedIndex() - 1].getParentId());
                        Student[] StudentForOldP = null;
                        try {
                            StudentForOldP = Connector.getAllStudentForParent(new_value_b.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if (newP == null) {
                            newP = new Parent();
                            newP.setID(new_value_b.getText());
                            newP.setName(oldP.getName());
                            newP.setPhoneNumber(oldP.getPhoneNumber());
                            try {
                                Connector.insertParent(newP);
                            } catch (SQLException ex) {
                                Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        {
                            try {
                                Connector.updateStudent(allStudent[names_cb.getSelectedIndex() - 1].getId(), "My_parent", new_value_b.getText());
                            } catch (SQLException ex) {
                                Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        correctMessage("تمت العملية بنجاح");
                        if (StudentForOldP != null && StudentForOldP.length == 1) {
                            try {
                                Connector.deleteParent(oldP.getID());
                            } catch (SQLException ex) {
                                Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم هوية ولي الأمر", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 9:
                    try {
                        Integer.parseInt(new_value_b.getText());
                        Connector.updateParent(allStudent[names_cb.getSelectedIndex() - 1].getParentId(), "Phone #", new_value_b.getText());
                        correctMessage("تمت العلمية بنجاح");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "فضلاً تأكد من رقم جوال ولي أمر الطالب", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 10:
                    Connector.updateParent(allStudent[names_cb.getSelectedIndex() - 1].getParentId(), "Name", new_value_b.getText());
                    correctMessage("تمت العلمية بنجاح");
                    break;
            }
        } else if (edit_info_group_rb.isSelected()) {
            switch (type_edit_cb.getSelectedIndex()) {
                case 1:
                    if (new_value_b.getText().length() <= 50) {
                        Connector.updateGroup(allGroups[names_cb.getSelectedIndex() - 1].getId(), "Name", new_value_b.getText());
                        correctMessage("تمت العلمية بنجاح");
                    } else {
                        JOptionPane.showMessageDialog(null, " الاسم يجب أن لا يزيد عن 50 حرف ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 2:
                    if (new_value_b.getText().length() <= 50) {
                        Connector.updateGroup(allGroups[names_cb.getSelectedIndex() - 1].getId(), "Section", new_value_b.getText());
                        correctMessage("تمت العلمية بنجاح");
                    } else {
                        JOptionPane.showMessageDialog(null, " الاسم يجب أن لا يزيد عن 50 حرف ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 3:
                    if (new_value_b.getText().length() == 10) {
                        try {
                            Integer.parseInt(new_value_b.getText());
                            if (Connector.searchSupervisor(new_value_b.getText()) != null) {
                                Connector.updateGroup(allGroups[names_cb.getSelectedIndex() - 1].getId(), "Super_id", new_value_b.getText());
                                correctMessage("تمت العلمية بنجاح");
                            } else {
                                JOptionPane.showMessageDialog(null, "هذا مشرف غير موجود", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "تأكد من أن المدخل أرقام ", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "رقم الهوية يجب أن لا يقل أو يزيد عن 10 أرقام", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
        }
    }//GEN-LAST:event_save_the_changes_ipActionPerformed

    private void group_name_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group_name_cbActionPerformed
        if (group_name_cb.getSelectedIndex() > 0 && remove_student_from_group.isSelected()) {
            try {
                allStudentInGroup = Connector.getAllStudentInGroup(allGroups[group_name_cb.getSelectedIndex() - 1].getId());
            } catch (SQLException ex) {
                Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
            }
            student_name_cb.removeAllItems();
            student_name_cb.addItem("الرجاء اختيار اسم الطالب");
            for (int i = 0; i < allStudentInGroup.length; i++) {
                student_name_cb.addItem(allStudentInGroup[i].getName());
            }
        }
    }//GEN-LAST:event_group_name_cbActionPerformed

    private void student_name_cbActionPerformed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_name_cbActionPerformed
        if (group_name_cb.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "الرجاء اختيار اسم الحلقة أولاً ثم اختيار نوع العملية ", "خطأ", JOptionPane.ERROR_MESSAGE);
        } else if (!add_student_to_group.isSelected() && !remove_student_from_group.isSelected()) {
            JOptionPane.showMessageDialog(null, "الرجاء اختيار نوع العملية", "خطأ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_student_name_cbActionPerformed

    private void save_the_changes_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_the_changes_spActionPerformed
        if (group_name_cb.getSelectedIndex() > 0 && (add_student_to_group.isSelected() || remove_student_from_group.isSelected())) {
            if (remove_student_from_group.isSelected()) {
                try {
                    allStudentInGroup[student_name_cb.getSelectedIndex() - 1].setGroupId(0);
                    Connector.updateStudent(allStudentInGroup[student_name_cb.getSelectedIndex() - 1].getId(), "Enrolled_in", 0);
                    JOptionPane.showMessageDialog(null, "تم حذف الطالب من الحلقة", "إكتمال العملية", JOptionPane.OK_OPTION);
                } catch (SQLException ex) {
                    Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    allStudentInGroup[student_name_cb.getSelectedIndex() - 1].setGroupId(allGroups[group_name_cb.getSelectedIndex() - 1].getId());
                    Connector.updateStudent(allStudentInGroup[student_name_cb.getSelectedIndex() - 1].getId(), "Enrolled_in", allGroups[group_name_cb.getSelectedIndex() - 1].getId());
                    JOptionPane.showMessageDialog(null, "تم إضافة الطالب إلى الحلقة", "إكتمال العملية", JOptionPane.OK_OPTION);
                } catch (SQLException ex) {
                    Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "الرجاء اختيار اسم الحلقة أولاً ثم اختيار نوع العملية ", "خطأ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_the_changes_spActionPerformed

    private void add_student_to_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_student_to_groupActionPerformed
        if (group_name_cb.getSelectedIndex() > 0) {
            try {
                allStudent = Connector.getAllStudent();
            } catch (SQLException ex) {
                Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
            }
            student_name_cb.removeAllItems();
            student_name_cb.addItem("الرجاء اختيار اسم الطالب");
            for (int i = 0; i < allStudent.length && allStudent[i].getGroupId() == 0; i++) {
                student_name_cb.addItem(allStudent[i].getName());
            }
        } else {
            JOptionPane.showMessageDialog(null, "الرجاء اختيار اسم الحلقة أولاً", "خطأ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_student_to_groupActionPerformed

    private void remove_student_from_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_student_from_groupActionPerformed
        if (group_name_cb.getSelectedIndex() > 0) {
            try {
                allStudentInGroup = Connector.getAllStudentInGroup(allGroups[group_name_cb.getSelectedIndex() - 1].getId());
            } catch (SQLException ex) {
                Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
            }
            student_name_cb.removeAllItems();
            student_name_cb.addItem("الرجاء اختيار اسم الطالب");
            for (int i = 0; i < allStudentInGroup.length; i++) {
                student_name_cb.addItem(allStudentInGroup[i].getName());
            }
        } else {
            JOptionPane.showMessageDialog(null, "الرجاء اختيار اسم الحلقة أولاً", "خطأ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_remove_student_from_groupActionPerformed

    private void teacher_delete_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_delete_rbActionPerformed
        try {
            allTeacher = Connector.getAllTeacher();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        names_delete_cb.removeAllItems();
        names_delete_cb.addItem("الرجاء اختيار اسم المدرس");
        for (int i = 0; i < allTeacher.length; i++) {
            names_delete_cb.addItem(allTeacher[i].getName());
        }

    }//GEN-LAST:event_teacher_delete_rbActionPerformed

    private void student_delete_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_delete_rbActionPerformed

        try {
            allStudent = Connector.getAllStudent();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        names_delete_cb.removeAllItems();
        names_delete_cb.addItem("الرجاء اختيار اسم الطالب");
        for (int i = 0; i < allStudent.length; i++) {
            names_delete_cb.addItem(allStudent[i].getName());
        }
    }//GEN-LAST:event_student_delete_rbActionPerformed

    private void group_delete_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group_delete_rbActionPerformed

        try {
            allGroups = Connector.getAllGroup();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        names_delete_cb.removeAllItems();
        names_delete_cb.addItem("فضلاً اختر اسم الحلقة");
        for (int i = 0; i < allGroups.length; i++) {
            names_delete_cb.addItem(allGroups[i].getName());
        }
    }//GEN-LAST:event_group_delete_rbActionPerformed

    private void delete_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bActionPerformed
        if (supervisor_delete_rb.isSelected()) {
            try {
                Connector.deleteSupervisor(allSupervisor[names_delete_cb.getSelectedIndex() - 1].getId());
                JOptionPane.showMessageDialog(null, "تم حذف المشرف بنجاح");
            } catch (Exception e) {
                errorMessage("لم يتم حذف المشرف بنجاح تأكد من أنه لايشرف على أي من مدرس أو حلقة أو مشرف آخر");
            }

        } else if (teacher_delete_rb.isSelected()) {
            try {
                Connector.deleteTeacher(allTeacher[names_delete_cb.getSelectedIndex() - 1].getId());
                correctMessage("تم حذف المدرس بنجاح");
            } catch (SQLException ex) {
                errorMessage("لم يتم حذف المدرس بنجاح");
            }

        } else if (student_delete_rb.isSelected()) {
            String parentID = allStudent[names_delete_cb.getSelectedIndex() - 1].getParentId();
            if (parentID != null) {
                try {
                    Student allStudentForParent[] = Connector.getAllStudentForParent(parentID);
                    if (allStudentForParent.length == 1) {
                        Connector.deleteParent(parentID);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            Connector.deleteAllDailyForStudent(allStudent[names_delete_cb.getSelectedIndex() - 1].getId());
            try {
                Connector.deleteStudent(allStudent[names_delete_cb.getSelectedIndex() - 1].getId());
            } catch (SQLException ex) {
                Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "تم حذف الطالب بنجاح");
        } else if (group_delete_rb.isSelected()) {
            try {
                Connector.deleteGroup(allGroups[names_delete_cb.getSelectedIndex() - 1].getId());
                correctMessage("تم حذف الحلقة بنجاح");
            } catch (SQLException ex) {
                errorMessage("لم يتم حذف الحلقة لأن هناك طلاب يدرسون بها أو مدرس يدرسها");
            }

        } else {
            errorMessage("الرجاء اختيار نوع الشخص الذي تريد حذفه");
        }
    }//GEN-LAST:event_delete_bActionPerformed

    private void teacher_record_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_record_bActionPerformed
        teacher_main_panel.setVisible(false);
        student_records_tp.setVisible(true);
        try {
            allDaysDates = Connector.getAllDaysDates();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        day_date_rp.removeAllItems();
        day_date_rp.addItem("الرجاء اختيار تاريخ اليوم");
        day_date_rp.addItem("يوم جديد");
        String day;
        for (int i = 0; i < allDaysDates.length; i++) {
            day = allDaysDates[i].getDay() + "/" + allDaysDates[i].getMonth() + "/" + allDaysDates[i].getYear();
            day_date_rp.addItem(day);
        }
    }//GEN-LAST:event_teacher_record_bActionPerformed

    private void teacher_edit_information_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_edit_information_bActionPerformed
        teacher_main_panel.setVisible(false);
        edit_information_tp.setVisible(true);
    }//GEN-LAST:event_teacher_edit_information_bActionPerformed

    private void sign_out_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_out_tActionPerformed
        try {
            sign_out();
        } catch (SQLException ex) {
            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
        }
        teacher_main_panel.setVisible(false);
        teacher_panel.setVisible(false);
        sign_in_panel.setVisible(true);
    }//GEN-LAST:event_sign_out_tActionPerformed

    private void type_edit_cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_edit_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_edit_cb1ActionPerformed

    private void save_the_changes_ip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_the_changes_ip1ActionPerformed
        if (type_edit_cb1.getSelectedIndex() > 0) {
            switch (type_edit_cb1.getSelectedIndex()) {
                case 1:
                    if (new_value_b1.getText() != null && new_value_b1.getText().length() <= 50) {
                        Connector.updateTeacher(currentT.getId(), "Name", new_value_b1.getText());
                    } else {
                        JOptionPane.showMessageDialog(null, " الاسم يجب أن لا يزيد عن 50 حرف ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 2:
                    String[] parts = new_value_b1.getText().split("\\.");
                    if (parts.length == 3) {
                        if (parts[2].length() == 4 && (parts[0].length() == 1 || parts[0].length() == 2) && (parts[1].length() == 1 || parts[1].length() == 2)) {
                            if (isValidDate(parts[2] + "." + parts[1] + "." + parts[0])) {
                                Connector.updateTeacher(currentT.getId(), "Birthdate", parts[2] + "." + parts[1] + "." + parts[0]);
                                correctMessage("تمت العلمية بنجاح");
                            } else {
                                errorMessage("هذا التاريخ غير صارلح الرجاء التأكد من التاريخ المدخل");
                            }
                        } else if (parts[0].length() == 4 && (parts[2].length() == 1 || parts[2].length() == 2) && (parts[1].length() == 1 || parts[1].length() == 2)) {
                            if (isValidDate(parts[0] + "." + parts[1] + "." + parts[2])) {
                                Connector.updateTeacher(currentT.getId(), "Birthdate", parts[0] + "." + parts[1] + "." + parts[2]);
                                correctMessage("تمت العلمية بنجاح");
                            } else {
                                errorMessage("هذا التاريخ غير صارلح الرجاء التأكد من التاريخ المدخل");
                            }
                        } else {
                            errorMessage("الرجاء التأكد من أنك أدخلت تاريخ الميلاد على الصيغة التالية: سنة.شهر.يوم " + "مثال ذلك 10.12.2000");
                        }
                    } else {
                        errorMessage("الرجاء التأكد من أنك أدخلت تاريخ الميلاد على الصيغة التالية: سنة.شهر.يوم " + "مثال ذلك 10.12.2000");
                    }
                    break;
                case 3:
                    try {
                        Integer.parseInt(new_value_b1.getText());
                        Connector.updateTeacher(currentT.getId(), "Phone #", new_value_b1.getText());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "فضلاً أدخل رقم جوال صحيح", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "الرجاء اختيار ما تريد تعديله", "خطأ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_save_the_changes_ip1ActionPerformed

    private void back_to_teacher_mp_fepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_teacher_mp_fepActionPerformed
        teacher_main_panel.setVisible(true);
        edit_information_tp.setVisible(false);
    }//GEN-LAST:event_back_to_teacher_mp_fepActionPerformed

    private void back_to_teacher_mp_frpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_teacher_mp_frpActionPerformed
        teacher_main_panel.setVisible(true);
        student_records_tp.setVisible(false);
    }//GEN-LAST:event_back_to_teacher_mp_frpActionPerformed

    private void save_the_changes_rpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_the_changes_rpActionPerformed
        if (day_record.isEditing()) {
            day_record.getCellEditor().stopCellEditing();
        }
        if (day_date_rp.getSelectedIndex() > 0) {
            dm = (DefaultTableModel) day_record.getModel();
            Integer numberPages, mark;
            boolean attendeace = false;
            for (int i = 0; i < allStudentInGroup.length; i++) {
                if (dm.getValueAt(i, 2) != null) {
                    try {
                        numberPages = Integer.parseInt(dm.getValueAt(i, 2).toString());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "لم تتم العملية بنجاح الرجاء التأكد من المدخلات", "اكتمال العملية", JOptionPane.PLAIN_MESSAGE);
                        return;
                    }
                } else {
                    numberPages = 0;
                }
                if (dm.getValueAt(i, 1) != null) {
                    try {
                        mark = Integer.parseInt(dm.getValueAt(i, 1).toString());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "لم تتم العملية بنجاح الرجاء التأكد من المدخلات", "اكتمال العملية", JOptionPane.PLAIN_MESSAGE);
                        return;
                    }
                } else {
                    mark = 0;
                }

                try {
                    attendeace = (boolean) dm.getValueAt(i, 0);
                    Connector.updateDaily(allStudentInGroup[i].getId(), "Attendance", attendeace);

                    if (attendeace) {
                        if (numberPages > 0 && mark >= 0) {
                            Connector.updateDaily(allStudentInGroup[i].getId(), "Mark", mark);
                            Connector.updateDaily(allStudentInGroup[i].getId(), "#_of_pages", numberPages);
                        } else if (numberPages == 0 && mark == 0) {
                            Connector.updateDaily(allStudentInGroup[i].getId(), "Mark", mark);
                            Connector.updateDaily(allStudentInGroup[i].getId(), "#_of_pages", numberPages);
                        } else {
                            JOptionPane.showMessageDialog(null, "لم تتم العملية بنجاح الرجاء التأكد من عدد الصفحات والدرجات للطلاب ", "اكتمال العملية", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    } else if (mark > 0 || numberPages > 0) {
                        JOptionPane.showMessageDialog(null, "لم تتم العملية بنجاح لأن هناك أحد الطلاب لم يحضر ولكن سمع وأخذ درجة على تسميعه أو لم يسمع و أخذ درجة على تسميعه !!", "اكتمال العملية", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(null, "تمت العملية بنجاح", "اكتمال العملية", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "الرجاء اختيار تاريخ اليوم", "خطأ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_save_the_changes_rpActionPerformed

    @SuppressWarnings("empty-statement")
    private void day_date_rpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day_date_rpActionPerformed
        dm = (DefaultTableModel) day_record.getModel();
        for (int i = dm.getRowCount() - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        cal.setTime(today); // don't forget this if date is arbitrary e.g. 01-01-2014

        if (day_date_rp.getSelectedIndex() > 0) {
            try {
                allStudentInGroup = Connector.getAllStudentInGroup(currentT.getTeaches_group());
            } catch (SQLException ex) {
                Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
            }
            Object[] rowData;
            Date d = null;
            if (day_date_rp.getSelectedIndex() == 1) {
                if (allDaysDates.length > 0) {
                    d = allDaysDates[0];
                } else {
                    d = new Date();
                }
                String today = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR);
                String firstDate = d.getDay() + "/" + d.getMonth() + "/" + d.getYear();
                if (!today.equals(firstDate)) {
                    Daily daily;
                    for (int i = 0; i < allStudentInGroup.length; i++) {
                        daily = new Daily();
                        rowData = new Object[4];
                        rowData[3] = allStudentInGroup[i].getName();
                        rowData[2] = 0;
                        rowData[1] = 0;
                        rowData[0] = false;
                        dm.addRow(rowData);
                        daily.setStudent_id(allStudentInGroup[i].getId());
                        try {
                            Connector.insertDaily(daily);
                        } catch (SQLException ex) {
                            Logger.getLogger(halaqah.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "يوجد سجل لهذا اليوم الرجاء اختيار التاريخ", "خطأ", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                DailyForAllStudentsInGroup = new Daily[allStudentInGroup.length];
                String day1 = day_date_rp.getItemAt(day_date_rp.getSelectedIndex());
                String[] day = day1.split("/");
                for (int i = 0; i < allStudentInGroup.length; i++) {
                    d = new Date(Integer.parseInt(day[0]), Integer.parseInt(day[1]), Integer.parseInt(day[2]));
                    DailyForAllStudentsInGroup[i] = Connector.searchDaily(d, allStudentInGroup[i].getId());
                    rowData = new Object[4];
                    rowData[3] = allStudentInGroup[i].getName();
                    rowData[2] = DailyForAllStudentsInGroup[i].getNumber_of_pages();
                    rowData[1] = DailyForAllStudentsInGroup[i].getMark();
                    rowData[0] = DailyForAllStudentsInGroup[i].isAttendance();
                    dm.addRow(rowData);
                }
            }
        }
    }//GEN-LAST:event_day_date_rpActionPerformed

    private void identity_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identity_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identity_numberActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(halaqah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halaqah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halaqah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halaqah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new halaqah().setVisible(true);
            }
        });
        Connector.closeConnection();
    }

    Supervisor currentS;
    Teacher currentT;
    Student currentStudent;
    Parent currentP;
    Supervisor allSupervisor[];
    Teacher allTeacher[];
    Group allGroups[];
    Student allStudent[];
    Student allStudentInGroup[];
    Daily DailyForAllStudentsInGroup[];
    Date allDaysDates[];
    DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
    java.util.Date today = new java.util.Date();
    Calendar cal = Calendar.getInstance();
    DefaultTableModel dm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_group;
    private javax.swing.JPanel add_student_p;
    private javax.swing.JScrollPane add_student_s;
    private javax.swing.JRadioButton add_student_to_group;
    private javax.swing.JPanel add_supervisor;
    private javax.swing.JPanel add_teacher;
    private javax.swing.JScrollPane add_teacher_s;
    private javax.swing.JButton back_to_supervisor_mp_fap;
    private javax.swing.JButton back_to_supervisor_mp_fdp;
    private javax.swing.JButton back_to_supervisor_mp_fep;
    private javax.swing.JButton back_to_teacher_mp_fep;
    private javax.swing.JButton back_to_teacher_mp_frp;
    private com.toedter.calendar.JDateChooser bd_supervisor;
    private com.toedter.calendar.JDateChooser bd_teacher;
    private javax.swing.JComboBox<String> certificate_teacher;
    private javax.swing.JComboBox<String> day_date_rp;
    private javax.swing.JTable day_record;
    private javax.swing.JButton delete_b;
    private javax.swing.JRadioButton edit_info_group_rb;
    private javax.swing.JRadioButton edit_info_student_rb;
    private javax.swing.JRadioButton edit_info_supervisor_rb;
    private javax.swing.JRadioButton edit_info_teacher_rb;
    private javax.swing.JPanel edit_informaion_p;
    private javax.swing.JPanel edit_information_tp;
    private javax.swing.JRadioButton edit_students_group_rb;
    private javax.swing.JPanel edit_students_p;
    private javax.swing.ButtonGroup for_edit_students_p;
    private javax.swing.JRadioButton group_delete_rb;
    private javax.swing.ButtonGroup group_edit_information_mp;
    private javax.swing.JComboBox<String> group_name_cb;
    private javax.swing.JComboBox<String> groups_names;
    private javax.swing.JTextField id_supervisor;
    private javax.swing.JTextField id_teacher;
    private javax.swing.JTextField identity_number;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_group_t;
    private javax.swing.JTextField name_supervisor;
    private javax.swing.JTextField name_teacher;
    private javax.swing.JComboBox<String> names_cb;
    private javax.swing.JComboBox<String> names_delete_cb;
    private javax.swing.JComboBox<String> names_sections_cb;
    private javax.swing.JComboBox<String> names_supervisors_ag_cb;
    private javax.swing.JComboBox<String> names_supervisors_as_cb;
    private javax.swing.JTextField new_value_b;
    private javax.swing.JTextField new_value_b1;
    private javax.swing.JTextField parent_id;
    private javax.swing.JTextField parent_name;
    private javax.swing.JTextField parent_phoneNumber;
    private javax.swing.JTextField phone_supervisor;
    private javax.swing.JTextField phone_teacher;
    private javax.swing.JRadioButton remove_student_from_group;
    private javax.swing.JTextField salary_supervisor;
    private javax.swing.JTextField salary_teacher;
    private javax.swing.JButton save_add_student_p;
    private javax.swing.JButton save_add_supervisor;
    private javax.swing.JButton save_add_teacher;
    private javax.swing.JButton save_ag;
    private javax.swing.JButton save_the_changes_ip;
    private javax.swing.JButton save_the_changes_ip1;
    private javax.swing.JButton save_the_changes_rp;
    private javax.swing.JButton save_the_changes_sp;
    private javax.swing.JButton sign_in_b;
    private javax.swing.JPanel sign_in_panel;
    private javax.swing.JButton sign_out_s;
    private javax.swing.JButton sign_out_t;
    private javax.swing.JRadioButton student_add_rb;
    private com.toedter.calendar.JDateChooser student_birthdate;
    private javax.swing.JRadioButton student_delete_rb;
    private javax.swing.JTextField student_fromPage;
    private javax.swing.JComboBox<String> student_group;
    private javax.swing.JTextField student_id;
    private javax.swing.JTextField student_name;
    private javax.swing.JComboBox<String> student_name_cb;
    private javax.swing.JTextField student_phoneNumber;
    private javax.swing.JPanel student_records_tp;
    private javax.swing.JTextField student_toPage;
    private javax.swing.JComboBox<String> super_teacher;
    private javax.swing.JRadioButton supervisorRB;
    private javax.swing.JButton supervisor_add_b;
    private javax.swing.JPanel supervisor_add_p;
    private javax.swing.ButtonGroup supervisor_add_p_rb;
    private javax.swing.JRadioButton supervisor_add_rb;
    private javax.swing.JButton supervisor_delete_b;
    private javax.swing.JPanel supervisor_delete_p;
    private javax.swing.ButtonGroup supervisor_delete_p_rbg;
    private javax.swing.JRadioButton supervisor_delete_rb;
    private javax.swing.JButton supervisor_edit_information_b;
    private javax.swing.JPanel supervisor_edit_information_mp;
    private javax.swing.JPanel supervisor_main_panel;
    private javax.swing.JPanel supervisor_panel;
    private javax.swing.JRadioButton teacherRB;
    private javax.swing.JRadioButton teacher_add_rb;
    private javax.swing.JRadioButton teacher_delete_rb;
    private javax.swing.JButton teacher_edit_information_b;
    private javax.swing.JPanel teacher_main_panel;
    private javax.swing.JPanel teacher_panel;
    private javax.swing.JButton teacher_record_b;
    private javax.swing.JComboBox<String> teaches_group;
    private javax.swing.ButtonGroup typeUserGroup;
    private javax.swing.JComboBox<String> type_edit_cb;
    private javax.swing.JComboBox<String> type_edit_cb1;
    private javax.swing.JPasswordField user_password;
    // End of variables declaration//GEN-END:variables
}
