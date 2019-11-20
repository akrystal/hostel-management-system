
package hm;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.*;

public class Fees extends javax.swing.JFrame {

    public Fees() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        feesstatus = new javax.swing.JTextField();
        usn = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        INSERT = new javax.swing.JButton();
        READ = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableData = new javax.swing.JTable();
        DELETE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        DefaultTableModel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FEES MONTH YEAR:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 170, -1));

        jLabel2.setFont(new java.awt.Font("Jokerman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                                        FEES   INFORMATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 70));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FEES STATUS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, -1));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STUDENT USN:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, -1));

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NAME:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 60, -1));

        feesstatus.setBackground(new java.awt.Color(240, 240, 240));
        feesstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesstatusActionPerformed(evt);
            }
        });
        getContentPane().add(feesstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 140, 30));

        usn.setBackground(new java.awt.Color(240, 240, 240));
        usn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnActionPerformed(evt);
            }
        });
        getContentPane().add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 140, 30));

        name.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 140, 30));

        INSERT.setBackground(new java.awt.Color(34, 167, 240));
        INSERT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        INSERT.setText("INSERT");
        INSERT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });
        getContentPane().add(INSERT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 90, -1));

        READ.setBackground(new java.awt.Color(34, 167, 240));
        READ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        READ.setText("READ");
        READ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        READ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                READActionPerformed(evt);
            }
        });
        getContentPane().add(READ, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 90, -1));

        UPDATE.setBackground(new java.awt.Color(34, 167, 240));
        UPDATE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        getContentPane().add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 100, -1));

        TableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FEES MONTH YEAR", "FEES STATUS", "STUDENT USN", "NAME"
            }
        ));
        TableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 500, 260));

        DELETE.setBackground(new java.awt.Color(34, 167, 240));
        DELETE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DELETE.setText("DELETE");
        DELETE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 90, -1));

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, -1, -1));

        DefaultTableModel.setBackground(new java.awt.Color(36, 37, 42));
        DefaultTableModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hm/IMG-20181107-WA0019.jpg"))); // NOI18N
        getContentPane().add(DefaultTableModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnActionPerformed
        
    }//GEN-LAST:event_usnActionPerformed

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
   Connection con;
       Statement st;
       ResultSet rst;
       
       String CONN_STRING;
       String USER_NAME;
       String PASSWORD;
       
               
               
       String Feesstatus = null, Usn = null, Name=null;
       
       

        CONN_STRING = "jdbc:mysql://localhost:3306/hostel";
        USER_NAME = "root";
        PASSWORD = "";
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(jDateChooser1.getDate());
        Feesstatus=this.feesstatus.getText();
        Usn = this.usn.getText();
        Name = this.name.getText();
        String query="insert into Fees(FEES_MONTH_YEAR,FEES_STATUS,STUDENT_USN,STUDENT_NAME) values('"+date+"','"+Feesstatus+"','"+Usn+"','"+Name+"')";

        try {
            con = DriverManager.getConnection(CONN_STRING,USER_NAME,PASSWORD);
            st = con.createStatement();
            st.executeUpdate(query);
            DefaultTableModel model = (DefaultTableModel) TableData.getModel();
            model.addRow(new Object[]{date,Feesstatus,Usn,Name});
            JOptionPane.showMessageDialog(rootPane, "Inserted Successful");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error "+e);
            System.out.println(e);
        }        
        
                                
    }//GEN-LAST:event_INSERTActionPerformed

    private void READActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_READActionPerformed
       Connection con;
       Statement st;
       ResultSet rst;
       
       String CONN_STRING;
       String USER_NAME;
       String PASSWORD;
       String  Feesmonth = null;
               
               
       String Feesstatus = null, Usn = null, Name=null;
       
       

        CONN_STRING = "jdbc:mysql://localhost:3306/hostel";
        USER_NAME = "root";
        PASSWORD = "";
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String date;
        String query="(select * from fees)";

        try {
            con = DriverManager.getConnection(CONN_STRING,USER_NAME,PASSWORD);
            st = con.createStatement();
            rst = st.executeQuery(query);
            while(rst.next()){
                date= rst.getString("FEES_MONTH_YEAR");
                Feesstatus = rst.getString("FEES_STATUS");
                Usn = rst.getString("STUDENT_USN");
                Name = rst.getString("STUDENT_NAME");
                DefaultTableModel model = (DefaultTableModel) TableData.getModel();
                model.addRow(new Object[]{date,Feesstatus,Usn,Name});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error "+e);
            System.out.println(e);
        }        
    }//GEN-LAST:event_READActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
      Connection con;
       Statement st;
       ResultSet rst;
       
       String CONN_STRING;
       String USER_NAME;
       String PASSWORD;
      
        CONN_STRING = "jdbc:mysql://localhost:3306/hostel";
        USER_NAME = "root";
        PASSWORD = "";
        String query_1 = "select * from fees";
        String USN = null, query,Usn = this.usn.getText(),set = "false";
        String Fees_status = null,Fees_month = null, Student_Name = null;
        try {
            con = DriverManager.getConnection(CONN_STRING,USER_NAME,PASSWORD);
            st = con.createStatement();
                
                query = "delete from fees where STUDENT_USN = '"+Usn+"'";
                st.executeUpdate(query);
                set = "true";
                DefaultTableModel model = (DefaultTableModel) TableData.getModel();
                model.setRowCount(0);

                while(true){
                       rst = st.executeQuery("select * from fees");
                       if (set.equals("true")) {
                           while(rst.next()) {                    
                                   Fees_month = rst.getString("FEES_MONTH_YEAR");
                                   Fees_status = rst.getString("FEES_STATUS");
                                   Usn = rst.getString("STUDENT_USN");
                                   Student_Name = rst.getString("STUDENT_NAME");
                                   DefaultTableModel model1 = (DefaultTableModel) this.TableData.getModel();
                                   model1.addRow(new Object[] {Fees_month,Fees_status,Usn,Student_Name});
                           } 
                       }else {
                           JOptionPane.showMessageDialog(rootPane, "nothing to update");
                       }
                       break;
                   }
            
            JOptionPane.showMessageDialog(rootPane,"Deleted Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error "+e);
            System.out.println(e);
        }
        
       

      
    }//GEN-LAST:event_DELETEActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        Connection con;
       Statement st;
       ResultSet rst;
       
       String CONN_STRING;
       String USER_NAME;
       String PASSWORD;
       String  Feesmonth = null;
               
               
       String Feesstatus = null, Usn = null, Name=null;
       
       

        CONN_STRING = "jdbc:mysql://localhost:3306/hostel";
        USER_NAME = "root";
        PASSWORD = "";
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(jDateChooser1.getDate());
       
        Usn = this.usn.getText();
        Name = this.name.getText();
        Feesstatus = this.feesstatus.getText();
        String USN = null;
        String query_1 = "select * from fees";
        String Fees_status = null,Fees_month = null, Student_Name = null;


        try {
            
            String query = null,querry_2 = null;
            con = DriverManager.getConnection(CONN_STRING,USER_NAME,PASSWORD);
            st = con.createStatement();

            String set = "false";

             

                query = "update fees set FEES_MONTH_YEAR = '"+date+"',"
                + "FEES_STATUS = '"+Feesstatus+"',STUDENT_USN = '"+Usn+"',"
                + "STUDENT_NAME = '"+Name+"' where STUDENT_USN = '"+Usn+"'";
                st.executeUpdate(query);
                DefaultTableModel model = (DefaultTableModel) TableData.getModel();
                set = "true";
                model.setRowCount(0);

                while(true){
                       rst = st.executeQuery("select * from fees");
                       if (set.equals("true")) {
                           while(rst.next()) {                    
                                   Fees_month = rst.getString("FEES_MONTH_YEAR");
                                   Fees_status = rst.getString("FEES_STATUS");
                                   Usn = rst.getString("STUDENT_USN");
                                   Student_Name = rst.getString("STUDENT_NAME");
                                   DefaultTableModel model1 = (DefaultTableModel) this.TableData.getModel();
                                   model1.addRow(new Object[] {Fees_month,Fees_status,Usn,Student_Name});
                           } 
                       }else {
                           JOptionPane.showMessageDialog(rootPane, "nothing to update");
                       }
                       break;
                   }
                    JOptionPane.showMessageDialog(rootPane,"successfully updated!!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Error "+e);
            System.out.println(e);
        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String action = evt.getActionCommand();
        if(action.equals("CANCEL")){
            Option nm=new Option();
            nm.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDataMouseClicked
        int i=TableData.getSelectedRow();
        TableModel model= TableData.getModel();
        try{
            DefaultTableModel model1= (DefaultTableModel)TableData.getModel();
            int index=TableData.getSelectedRow();
            java.util.Date date =new SimpleDateFormat("yyyy-MM-dd").parse((String)model1.getValueAt(index, 0));
        jDateChooser1.setDate(date);
        }catch(ParseException ex){
      
        }
        feesstatus.setText(model.getValueAt(i, 1).toString());
        usn.setText(model.getValueAt(i, 2).toString());
        name.setText(model.getValueAt(i, 3).toString());
        
    }//GEN-LAST:event_TableDataMouseClicked

    private void feesstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feesstatusActionPerformed

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
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fees().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel DefaultTableModel;
    private javax.swing.JButton INSERT;
    private javax.swing.JButton READ;
    private javax.swing.JTable TableData;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField feesstatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField usn;
    // End of variables declaration//GEN-END:variables
}
