package cuoiky;


import cuoiky.ConnectionDB.ConnectionDB;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class LoginForm2 extends javax.swing.JFrame {
     
    
    public LoginForm2() {
        initComponents();
       Toolkit toolkit = getToolkit();
       Dimension size = toolkit.getScreenSize();
       setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        bluser = new javax.swing.JLabel();
        blpass = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setPreferredSize(new java.awt.Dimension(596, 516));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG NHẬP");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Username   :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 130, -1));

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 240, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Password    :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, -1));

        login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        reset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));
        getContentPane().add(bluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 220, 20));
        getContentPane().add(blpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 220, 20));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 240, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuoiky/image/ght.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
         user.setText("");
    }//GEN-LAST:event_userActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
         if(user.getText().trim().isEmpty()&& pass.getText().trim().isEmpty()){
            bluser.setText("Username is Empty");
             blpass.setText("Password is Empty");
        }
        else if(user.getText().trim().isEmpty()){
            bluser.setText("Username is Empty");
        }
        else if(pass.getText().trim().isEmpty()){
            blpass.setText("Password is Empty");
        }
        else{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dien","root","phandien05");
            String sql ="Select * from login where user=? and pass=?";
            PreparedStatement pst =con.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2, pass.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                  JOptionPane.showMessageDialog(null, "username and password match");
                  MainJFrame2 menu = new MainJFrame2();
                  menu.setVisible(true);
                  setVisible(false);
            }
            else{
                  JOptionPane.showMessageDialog(null, "username and password donot match");
                  user.setText("");
                  pass.setText("");
            }
            con.close();
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
    
        }
    }//GEN-LAST:event_loginActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        user.setText("");
        pass.setText("");
        bluser.setText("");
        blpass.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
         pass.setText("");
    }//GEN-LAST:event_passActionPerformed
        
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blpass;
    private javax.swing.JLabel bluser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton reset;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
