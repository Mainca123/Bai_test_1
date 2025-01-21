package org.example.view;

import jakarta.persistence.EntityManager;
import org.example.DAO.HibernateUtil;
import org.example.Entity.User;

import javax.swing.JOptionPane;


public class LoginView extends javax.swing.JFrame {
    public static EntityManager entityManager = HibernateUtil.getEntityManager();
    public LoginView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        huyClick = new javax.swing.JToggleButton();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginClick = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Đăng nhập");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("User name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Passwork ");

        huyClick.setText("HỦY");
        huyClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyClickActionPerformed(evt);
            }
        });

        userName.setText("Nhập số điện thoại hoặc email");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        loginClick.setText("ĐĂNG NHẬP");
        loginClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginClickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginClick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(huyClick)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password)))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginClick)
                    .addComponent(huyClick))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>                        

    private void huyClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyClickActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(this, "XÁC NHẬN HỦY", "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
        if(check == JOptionPane.OK_OPTION) {
            this.setVisible(false);
            new QuanLyView().setVisible(true);
        }
    }//GEN-LAST:event_huyClickActionPerformed

    // Login
    private void loginClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginClickActionPerformed
        String name = userName.getText();
        User user = entityManager.find(User.class, name);
        if(user == null) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không chính xác !",
                    "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            char[] pass = password.getPassword();
            String passwordStr = String.valueOf(pass);
            java.util.Arrays.fill(pass, '*');
            if (passwordStr.equalsIgnoreCase(user.getPassword())) {
                this.setVisible(false);
                new UserView().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Mật khẩu không chính xác !",
                        "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_loginClickActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton huyClick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton loginClick;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
