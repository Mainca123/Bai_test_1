package org.example.view;

import jakarta.persistence.EntityManager;
import org.example.DAO.HibernateUtil;
import org.example.Entity.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DangKyView extends javax.swing.JFrame {
    public static EntityManager entityManager = HibernateUtil.getEntityManager();
    public DangKyView() {
        initComponents();
    }
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        huyDangKyClick = new javax.swing.JButton();
        dangKyClick = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        txtMonth = new javax.swing.JTextField();
        txtYera = new javax.swing.JTextField();
        txtGender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPasswordAC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("ĐĂNG KÝ");

        huyDangKyClick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        huyDangKyClick.setText("HỦY");
        huyDangKyClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyDangKyClickActionPerformed(evt);
            }
        });

        dangKyClick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dangKyClick.setText("ĐĂNG KÝ");
        dangKyClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangKyClickActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Giới tính:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Ngày sinh");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Tháng sinh");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Năm sinh");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Họ và Tên");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtDay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtMonth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthActionPerformed(evt);
            }
        });

        txtYera.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Nam", "Nữ", "Khác" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Số điện thoại");

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Mật khẩu");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Xác nhận mật khẩu");

        txtPasswordAC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(644, Short.MAX_VALUE)
                .addComponent(dangKyClick)
                .addGap(18, 18, 18)
                .addComponent(huyDangKyClick)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtYera, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE))
                            .addComponent(txtGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtEmail)
                            .addComponent(txtPhoneNumber)
                            .addComponent(txtPassword)
                            .addComponent(txtPasswordAC))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPasswordAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huyDangKyClick)
                    .addComponent(dangKyClick))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void huyDangKyClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyDangKyClickActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(this, "XÁC NHẬN HỦY",
                "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
        if(check == JOptionPane.OK_OPTION) {
            this.setVisible(false);
            new QuanLyView().setVisible(true);
        }   
    }//GEN-LAST:event_huyDangKyClickActionPerformed

    private void txtMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonthActionPerformed




    // Đăng ký
    private void dangKyClickActionPerformed(ActionEvent evt) {//GEN-FIRST:event_dangKyClickActionPerformed
        // TODO add your handling code here:
        String name = String.valueOf(txtName.getText()).toUpperCase(), phone = String.valueOf(txtPhoneNumber.getText()),
               email = String.valueOf(txtEmail.getText()), gender = (String) txtGender.getSelectedItem(), 
               day = (String)txtDay.getText(), month = (String)txtMonth.getText(), year = (String)txtYera.getText(),
               passwordAC =String.valueOf(txtPasswordAC.getText());
        
        // Check Name;
        if(txtName.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "KHÔNG ĐỂ TRỐNG TÊN !",
                    "THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            StringBuilder sbName = new StringBuilder(name);
            while(sbName.charAt(0) == ' ')
                sbName.deleteCharAt(0);
            while(sbName.charAt(sbName.length()-1) == ' ')
                sbName.deleteCharAt(sbName.length()-1);
            name = String.valueOf(sbName);
        }
        txtName.setText(name);
        
        // Check PhoneNumber
        if(txtPhoneNumber.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "KHÔNG ĐỂ TRỐNG SỐ ĐIỆN THOẠI !",
                    "THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            StringBuilder sbPhone = new StringBuilder(phone);
            while(sbPhone.charAt(0) == ' ')
                sbPhone.deleteCharAt(0);
            while(sbPhone.charAt(sbPhone.length()-1) == ' ')
                sbPhone.deleteCharAt(sbPhone.length()-1);
            phone = String.valueOf(sbPhone);
            if(phone.length() != 10 || phone.charAt(0) != '0'){
                JOptionPane.showMessageDialog(this, "THÔNG TIN SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ !"
                        ,"THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                for(int i=0; i<phone.length(); ++i)
                    if(phone.charAt(i)<'0' || phone.charAt(i)>'9'){
                        JOptionPane.showMessageDialog(this, "THÔNG TIN SỐ ĐIỆN THOẠI KHÔNG HỢP LỆ !"
                                ,"THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
            }
        }
        txtPhoneNumber.setText(phone);
        
        
        //Check Email
        if(txtEmail.getText().isBlank())
            email = " ";
        
        //Check Pass
        String pass = String.valueOf(txtPassword.getText());
        pass = pass.replaceAll("\\s+"," ").trim();
        if(txtPassword.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "KHÔNG ĐỂ TRỐNG MẬT KHẨU",
                    "THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(txtPasswordAC.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "HÃY XÁC NHẬN MẬT KHẨU",
                    "THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        passwordAC = passwordAC.replaceAll("\\s+", " ").trim();
        if(!String.valueOf(txtPassword.getText()).equalsIgnoreCase(String.valueOf(txtPasswordAC.getText()))){
            JOptionPane.showMessageDialog(this, "MẬT KHẨU XÁC NHẬN KHÔNG CHÍNH XÁC !!",
                    "THÔNG BÁO",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Check Gender
        if(txtGender.getSelectedItem().equals(" ")){
            JOptionPane.showMessageDialog(this, "KHÔNG ĐỂ TRỐNG THÔNG TIN GIỚI TÍNH! ");
            return;
        }
        
        // Check Day
        int dayInterger = 0;
        if(txtDay.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "KHÔNG ĐỂ TRỐNG NGÀY SINH! ");
            return;
        } else {
            StringBuilder sbDay = new StringBuilder(day);
            while(sbDay.charAt(0) == ' ')
                sbDay.deleteCharAt(0);
            while(sbDay.charAt(sbDay.length()-1) == ' ')
                sbDay.deleteCharAt(sbDay.length()-1);
            day = String.valueOf(sbDay);
            for(var c : day.toCharArray()){
                if(c>'9' || c<'0'){
                    JOptionPane.showMessageDialog(this, "THÔNG TIN NGÀY KHÔNG HỢP LỆ !");
                    return;
                }
                dayInterger *=10;
                dayInterger += (int)c - '0';
            }
            if(dayInterger > 31 || dayInterger <1){
                JOptionPane.showMessageDialog(this, "THÔNG TIN NGÀY KHÔNG HỢP LỆ !");
                return;
            }
        }
        txtDay.setText(day);
        
        // Check Month
        int monthInterger = 0;
        if(txtMonth.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "KHÔNG ĐỂ TRỐNG THÁNG SINH! ");
            return;
        } else {
            StringBuilder sbMonth = new StringBuilder(month);
            while(sbMonth.charAt(0) == ' ')
                sbMonth.deleteCharAt(0);
            while(sbMonth.charAt(sbMonth.length()-1) == ' ')
                sbMonth.deleteCharAt(sbMonth.length() - 1);
            month = String.valueOf(sbMonth);
            for(var c : month.toCharArray()){
                if(c<'0' && c>'9'){
                    JOptionPane.showMessageDialog(this, "THÔNG TIN THÁNG KHÔNG HỢP LỆ !");
                    return;
                }
                monthInterger *= 10;
                monthInterger += (int)c - '0';
            }
            if(monthInterger <0 || monthInterger>12) {
                JOptionPane.showMessageDialog(this, "THÔNG TIN THÁNG KHÔNG HỢP LỆ !!");
                return;
            }
        }
        txtMonth.setText(month);
        
        
        // Check Year
        int yeraInterger = 0;
        if(txtYera.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "KHÔNG ĐỂ TRỐNG NĂM SINHI! ");
            return;
        } else {
            StringBuilder sbYear = new StringBuilder(year);
            while(sbYear.charAt(0) == ' ')
                sbYear.deleteCharAt(0);
            while(sbYear.charAt(sbYear.length()-1) == ' ')
                sbYear.deleteCharAt(sbYear.length() - 1);
            year = String.valueOf(sbYear);
            for(var c : year.toCharArray()){
                if(c<'0' && c>'9'){
                    JOptionPane.showMessageDialog(this, "THÔNG TIN THÁNG KHÔNG HỢP LỆ !");
                    return;
                }
                yeraInterger *= 10;
                yeraInterger += (int)c - '0';
            }
            if(yeraInterger < 0) {
                JOptionPane.showMessageDialog(this, "THÔNG TIN NĂM KHÔNG HỢP LỆ !");
                return;
            }
            //Kiểm tra nhuận
            if(yeraInterger % 4 == 0){
                if(monthInterger == 2 && dayInterger >29){
                    JOptionPane.showMessageDialog(this, "THÔNG TIN NGÀY KHÔNG HỢP LỆ ! 'NĂM NHUẬN'");
                    return;
                }
            } else {
                if(monthInterger == 2 && dayInterger >28){
                    JOptionPane.showMessageDialog(this, "THÔNG TIN NGÀY KHÔNG HỢP LỆ ! 'NĂM KHÔNG NHUẬN'");
                    return;
                }
            }
            for(int i=1; i<8; i++)
                if(i%2 == 0){
                    if(dayInterger > 30){
                        JOptionPane.showMessageDialog(this, "THÔNG TIN NGÀY KHÔNG HỢP LỆ ! 'THÁNG 30 NGÀY'");
                        return;
                    }
                }
            for(int i=9; i<12; i++)
                if(i%2 != 0){
                    if(dayInterger > 30){
                        JOptionPane.showMessageDialog(this, "THÔNG TIN NGÀY KHÔNG HỢP LỆ ! 'THÁNG 30 NGÀY'");
                        return;
                    }
                }
            if(yeraInterger > 2007) {
                JOptionPane.showMessageDialog(this, "NĂM SINH CỦA BẠN CHƯA ĐỦ 18 TUỔI !");
            }
        }
        txtYera.setText(year);
        int yearInterger = Integer.parseInt(year);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        User user = entityManager.find(User.class, phone);
        if(user != null) {
            JOptionPane.showMessageDialog(this,"SỐ ĐIỆN THOẠI ĐÃ TỒN TẠI !",
                    "THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        user = new User(phone, passwordAC, name,month+"-"+day+"-"+year, (LocalDate.now().getYear() - yearInterger), gender,email,
                LocalDate.now().format(formatter).toString(),0,0,0,0);
        //Thêm vào CSDL
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.getTransaction().commit();

        ImageIcon icon = new ImageIcon("D:\\Data_clb\\code_net\\First_app\\ảnh\\icon-tick-xanh.png");
        JOptionPane.showMessageDialog(this, "ĐÃ ĐĂNG KÝ THÀNH CÔNG",
                "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE,icon);
        this.setVisible(false);
        new QuanLyView().setVisible(true);
    }//GEN-LAST:event_dangKyClickActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(DangKyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKyView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangKyClick;
    private javax.swing.JButton huyDangKyClick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPasswordAC;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtYera;
    // End of variables declaration//GEN-END:variables
}
