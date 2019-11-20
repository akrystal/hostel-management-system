
package hm;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Hostel extends javax.swing.JFrame {
Connection c=null;
    
    public Hostel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hostel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        room = new javax.swing.JTextField();
        student = new javax.swing.JTextField();
        INSERT = new javax.swing.JButton();
        READ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hostel.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        Hostel.setForeground(new java.awt.Color(255, 255, 255));
        Hostel.setText("                              HOSTEL  INFORMATION");
        getContentPane().add(Hostel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 70));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hostel ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 30));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No of Rooms:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 30));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No of Students:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 30));

        id.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 180, 30));

        room.setBackground(new java.awt.Color(240, 240, 240));
        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomActionPerformed(evt);
            }
        });
        getContentPane().add(room, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, 30));

        student.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 180, 30));

        INSERT.setBackground(new java.awt.Color(34, 167, 240));
        INSERT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        INSERT.setText("INSERT");
        INSERT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });
        getContentPane().add(INSERT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 90, -1));

        READ.setBackground(new java.awt.Color(34, 167, 240));
        READ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        READ.setText("READ");
        READ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        READ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                READActionPerformed(evt);
            }
        });
        getContentPane().add(READ, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 90, -1));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HOSTEL ID", "ROOMS", "STUDENTS"
            }
        ));
        table2.setGridColor(new java.awt.Color(255, 255, 255));
        table2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 510, 220));

        UPDATE.setBackground(new java.awt.Color(34, 167, 240));
        UPDATE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        getContentPane().add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 90, -1));

        DELETE.setBackground(new java.awt.Color(34, 167, 240));
        DELETE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DELETE.setText("DELETE");
        DELETE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 90, -1));

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, -1, -1));

        jButton2.setBackground(new java.awt.Color(34, 167, 240));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("NEXT");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 80, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hm/IMG-20181107-WA0019.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -40, 1090, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
       Connection con;
       Statement st;
       ResultSet rst;
       
       String CONN_STRING;
       String USER_NAME;
       String PASSWORD;
       int Id = 0, Room = 0, Student = 0;
       
       

        CONN_STRING = "jdbc:mysql://localhost:3306/hostel";
        USER_NAME = "root";
        PASSWORD = "";
        Id = Integer.parseInt(this.id.getText());
        Room = Integer.parseInt(this.room.getText());
        Student = Integer.parseInt(this.student.getText());
        String query="insert into hostel(HOSTEL_ID,NO_OF_ROOMS,NO_OF_STUDENTS) values('"+Id+"','"+Room+"','"+Student+"')";

        try {
            con = DriverManager.getConnection(CONN_STRING,USER_NAME,PASSWORD);
            st = con.createStatement();
            st.executeUpdate(query);
              DefaultTableModel model = (DefaultTableModel) table2.getModel();
            model.addRow(new Object[]{Id,Room,Student});
            JOptionPane.showMessageDialog(rootPane, "Successful");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error "+e);
            System.out.println(e);
        }
  
       
    
    }//GEN-LAST:event_INSERTActionPerformed

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
        String query_1 = "select * from hostel";
        String HOSTEL_ID = null, query,HOSTEL_id = this.id.getText(),set = "false";
        String NO_OF_ROOMS = null,NO_OF_STUDENTS = null;
        try {
            con = DriverManager.getConnection(CONN_STRING,USER_NAME,PASSWORD);
            st = con.createStatement();
                
                query = "delete from hostel where HOSTEL_ID = '"+HOSTEL_id+"'";
                st.executeUpdate(query);
                set = "true";
                DefaultTableModel model = (DefaultTableModel) table2.getModel();
                model.setRowCount(0);

                while(true){
                       rst = st.executeQuery("select * from hostel");
                       if (set.equals("true")) {
                           while(rst.next()) {                    
                                   HOSTEL_id = rst.getString("HOSTEL_ID");
                                    NO_OF_ROOMS= rst.getString("NO_OF_ROOMS");
                                   NO_OF_STUDENTS = rst.getString("NO_OF_STUDENTS");
                                  
                                   DefaultTableModel model1 = (DefaultTableModel) this.table2.getModel();
                                   model1.addRow(new Object[] {HOSTEL_id,NO_OF_ROOMS,NO_OF_STUDENTS});
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

    private void READActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_READActionPerformed
       Connection con;
       Statement st;
       ResultSet rst;
       
       String CONN_STRING;
       String USER_NAME;
       String PASSWORD;
       String Id1 = null, Room2 = null, Student3 = null;
       
       

        CONN_STRING = "jdbc:mysql://localhost:3306/hostel";
        USER_NAME = "root";
        PASSWORD = "";
        
        String query="select * from hostel";

        try {
            con = DriverManager.getConnection(CONN_STRING,USER_NAME,PASSWORD);
            st = con.createStatement();
            rst = st.executeQuery(query);
            while(rst.next()){
                Id1=rst.getString("HOSTEL_ID");
                Room2= rst.getString("NO_OF_ROOMS");
                Student3 = rst.getString("NO_OF_STUDENTS");
                 DefaultTableModel model=(DefaultTableModel) table2.getModel();
            model.addRow(new Object[]{Id1,Room2,Student3});
            System.out.println(Id1+" "+Room2+" "+Student3);
                     }
             

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error "+e);
            System.out.println(e);
        }
        
       
             }//GEN-LAST:event_READActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String action = evt.getActionCommand();
        if(action.equals("CANCEL")){
                 Option nm=new Option();
            nm.setVisible(true);
            dispose();
       }    }//GEN-LAST:event_jButton1ActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
     Connection con;
       Statement st;
       ResultSet rst;
       
       String CONN_STRING;
       String USER_NAME;
       String PASSWORD;

               
               String hostel_id = null;
       String No_of_rooms = null,No_of_students = null;
       
       

        CONN_STRING = "jdbc:mysql://localhost:3306/hostel";
        USER_NAME = "root";
        PASSWORD = "";
        
       
        hostel_id = this.id.getText();
        No_of_rooms = this.room.getText();
        No_of_students = this.student.getText();
        String Hostel_id = null;
        String query_1 = "select * from hostel";
        String NO_oF_ROOM= null,NO_Of_STUDENTS = null;


        try {
            
            String query = null,querry_2 = null;
            con = DriverManager.getConnection(CONN_STRING,USER_NAME,PASSWORD);
            st = con.createStatement();

            String set = "false";

             

                query = "update hostel set HOSTEL_ID= '"+hostel_id+"',"
                + "NO_OF_ROOMS = '"+No_of_rooms+"',NO_OF_STUDENTS = '"+No_of_students+"' where HOSTEL_ID = '"+hostel_id+"'";
                st.executeUpdate(query);
                DefaultTableModel model = (DefaultTableModel) table2.getModel();
                set = "true";
                model.setRowCount(0);

                while(true){
                       rst = st.executeQuery("select * from hostel");
                       if (set.equals("true")) {
                           while(rst.next()) {                    
                                   Hostel_id = rst.getString("HOSTEL_ID");
                                    NO_oF_ROOM= rst.getString("NO_OF_ROOMS");
                                   NO_Of_STUDENTS = rst.getString("NO_OF_STUDENTS");
                                   DefaultTableModel model1 = (DefaultTableModel) this.table2.getModel();
                                   model1.addRow(new Object[] {Hostel_id,NO_oF_ROOM,NO_Of_STUDENTS});
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

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        int i=table2.getSelectedRow();
        TableModel model= table2.getModel();
        id.setText(model.getValueAt(i, 0).toString());
        room.setText(model.getValueAt(i, 1).toString());
        student.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_table2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Room hg= new Room();
       hg.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomActionPerformed

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
            java.util.logging.Logger.getLogger(Hostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        //</editor-fold>

        /* Create and display the form */java.awt.EventQueue.invokeLater(() -> {
            new Hostel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel Hostel;
    private javax.swing.JButton INSERT;
    private javax.swing.JButton READ;
    private javax.swing.JButton UPDATE;
    public static javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField room;
    private javax.swing.JTextField student;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
