
package hm;
import java.sql.*;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserNamel = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        Passwordinpt = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                          LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 80));

        UserNamel.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        UserNamel.setForeground(new java.awt.Color(255, 255, 255));
        UserNamel.setText("UserName:");
        getContentPane().add(UserNamel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 100, 40));

        UserName.setBackground(new java.awt.Color(240, 240, 240));
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 180, 40));

        Password.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password:");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 100, 40));

        Passwordinpt.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(Passwordinpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 180, 40));

        Login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Login.setText("Login");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 130, 40));

        Cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hm/IMG-20181107-WA0015.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
         String action = evt.getActionCommand();
        if(action.equals("Cancel")){
            Home  nm=new Home();
            nm.setVisible(true);
            dispose();
       }


    }//GEN-LAST:event_CancelActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        Connection con;
        Statement st;
        ResultSet rst;
        
        String CONN_STRING;
        String USERNAME;
        String PASSWORD;
        String Password_Field = null;
        String Password_Input = null;
        
       
        String query;
        
        CONN_STRING = "jdbc:mysql://localhost:3306/hostel";
        USERNAME = "root";
        PASSWORD = "root";
       query = "select * from user";
          String Username = UserName.getText();
         String PasswordInpt = Passwordinpt.getText();
         if(Username.equals("admin") && PasswordInpt.equals("admin")){
             Option rt = new Option();
             rt.setVisible(true);
             dispose();
         }
         else 
         {
             JOptionPane.showMessageDialog(null, "Enter correct username or password");
             
             Passwordinpt.setText("");
         }
     
        
        
                                
    }//GEN-LAST:event_LoginActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Login;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Passwordinpt;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel UserNamel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
