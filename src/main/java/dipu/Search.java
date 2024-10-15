/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dipu;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIPU
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Studentinfo
     */
    private Connection con;
    private PreparedStatement st;
    private ResultSet rs;
    public Search() {
        initComponents();
//        table_loaded();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelsidebar = new javax.swing.JPanel();
        panelhome = new javax.swing.JPanel();
        buttonhome = new javax.swing.JLabel();
        panelsearch = new javax.swing.JPanel();
        buttonsearch = new javax.swing.JLabel();
        panelrecord = new javax.swing.JPanel();
        buttonrecord = new javax.swing.JLabel();
        panelback = new javax.swing.JPanel();
        buttonback = new javax.swing.JLabel();
        panellogout = new javax.swing.JPanel();
        buttonlogout = new javax.swing.JLabel();
        panellogout1 = new javax.swing.JPanel();
        buttonlogout1 = new javax.swing.JLabel();
        panellogout2 = new javax.swing.JPanel();
        buttonlogout2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsidebar.setBackground(new java.awt.Color(0, 80, 80));
        panelsidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelhome.setBackground(new java.awt.Color(0, 140, 140));
        panelhome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panelhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelhomeMouseClicked(evt);
            }
        });
        panelhome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonhome.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        buttonhome.setForeground(new java.awt.Color(255, 255, 255));
        buttonhome.setIcon(new javax.swing.ImageIcon("C:\\Users\\DIPU\\Desktop\\JU_Fees_Management\\src\\main\\java\\dipu\\Icons\\home.png")); // NOI18N
        buttonhome.setText(" Home");
        buttonhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhomeMouseExited(evt);
            }
        });
        panelhome.add(buttonhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 70));

        panelsidebar.add(panelhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 390, 70));

        panelsearch.setBackground(new java.awt.Color(0, 140, 140));
        panelsearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panelsearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonsearch.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        buttonsearch.setForeground(new java.awt.Color(255, 255, 255));
        buttonsearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\DIPU\\Desktop\\JU_Fees_Management\\src\\main\\java\\dipu\\Icons\\search2.png")); // NOI18N
        buttonsearch.setText(" Search Record");
        buttonsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonsearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonsearchMouseExited(evt);
            }
        });
        panelsearch.add(buttonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 360, 70));

        panelsidebar.add(panelsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 390, 70));

        panelrecord.setBackground(new java.awt.Color(0, 140, 140));
        panelrecord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panelrecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonrecord.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        buttonrecord.setForeground(new java.awt.Color(255, 255, 255));
        buttonrecord.setIcon(new javax.swing.ImageIcon("C:\\Users\\DIPU\\Desktop\\JU_Fees_Management\\src\\main\\java\\dipu\\Icons\\view all record.png")); // NOI18N
        buttonrecord.setText(" View All Record");
        buttonrecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonrecordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonrecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonrecordMouseExited(evt);
            }
        });
        panelrecord.add(buttonrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 70));

        panelsidebar.add(panelrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 390, 70));

        panelback.setBackground(new java.awt.Color(0, 140, 140));
        panelback.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.darkGray, null));
        panelback.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonback.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        buttonback.setForeground(new java.awt.Color(255, 255, 255));
        buttonback.setIcon(new javax.swing.ImageIcon("C:\\Users\\DIPU\\Desktop\\JU_Fees_Management\\src\\main\\java\\dipu\\Icons\\left-arrow.png")); // NOI18N
        buttonback.setText("Back");
        buttonback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonbackMouseExited(evt);
            }
        });
        panelback.add(buttonback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 360, 70));

        panelsidebar.add(panelback, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 390, 70));

        panellogout.setBackground(new java.awt.Color(0, 140, 140));
        panellogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panellogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonlogout.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        buttonlogout.setForeground(new java.awt.Color(255, 255, 255));
        buttonlogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\DIPU\\Desktop\\JU_Fees_Management\\src\\main\\java\\dipu\\Icons\\logout.png")); // NOI18N
        buttonlogout.setText(" Logout");
        buttonlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonlogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonlogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonlogoutMouseExited(evt);
            }
        });
        panellogout.add(buttonlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 70));

        panelsidebar.add(panellogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 390, 70));

        panellogout1.setBackground(new java.awt.Color(0, 140, 140));
        panellogout1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panellogout1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonlogout1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        buttonlogout1.setForeground(new java.awt.Color(255, 255, 255));
        buttonlogout1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DIPU\\Desktop\\JU_Fees_Management\\src\\main\\java\\dipu\\Icons\\printer-.png")); // NOI18N
        buttonlogout1.setText(" Print");
        buttonlogout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonlogout1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonlogout1MouseExited(evt);
            }
        });
        panellogout1.add(buttonlogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 370, 70));

        panelsidebar.add(panellogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 390, 70));

        panellogout2.setBackground(new java.awt.Color(0, 140, 140));
        panellogout2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panellogout2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonlogout2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        buttonlogout2.setForeground(new java.awt.Color(255, 255, 255));
        buttonlogout2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DIPU\\Desktop\\JU_Fees_Management\\src\\main\\java\\dipu\\Icons\\edit2.png")); // NOI18N
        buttonlogout2.setText("Edit");
        buttonlogout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonlogout2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonlogout2MouseExited(evt);
            }
        });
        panellogout2.add(buttonlogout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 70));

        panelsidebar.add(panellogout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 390, 70));

        getContentPane().add(panelsidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 830));

        jPanel2.setBackground(new java.awt.Color(0, 140, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Student Record");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 430, 60));

        dataTable.setBackground(new java.awt.Color(255, 255, 255));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 860, 530));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Search :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, 30));

        searchBox.setBackground(new java.awt.Color(255, 255, 255));
        searchBox.setForeground(new java.awt.Color(0, 0, 0));
        searchBox.setText("Enter Your Roll");
        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });
        jPanel2.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 150, 30));

        searchButton.setBackground(new java.awt.Color(0, 51, 51));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel2.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 80, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 910, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
//     void table_loaded(){
//        
//        try {
//            Connect cn = new Connect();
//            con = cn.getConnection();
//            st = con.prepareStatement("select * from login");
//            rs = st.executeQuery();
//            ResultSetMetaData rsmd = rs.getMetaData() ;
//            DefaultTableModel model = (DefaultTableModel) cloths.getModel();
//            int cols = rsmd.getColumnCount();
//            String[] colName = new String[cols];
//            for(int i=0;i<cols;i++){
//                colName[i]=rsmd.getColumnName(i+1);
//            }
//            model.setColumnIdentifiers(colName);
//          
//            String name,id,roll,user,phone,pass,cpass,dob,dept;
//            while(rs.next()){
//                id = rs.getString(1);
//                name = rs.getString(2);
//                 roll= rs.getString(3);
//                user = rs.getString(4);
//                phone = rs.getString(5);
//                pass = rs.getString(6);
//                cpass = rs.getString(7);
//                dept = rs.getString(8);
//                dob = rs.getString(8);
//                String[] row = {id,name,roll,user,phone,pass,cpass,dept,dob};
//                model.addRow(row);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
//        }     
//    }
//    
    
    private void buttonhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhomeMouseClicked
         dispose();
        AdminDashboard h=new AdminDashboard();
        h.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonhomeMouseClicked

    private void buttonhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhomeMouseEntered
        Color clr = new Color(0, 100, 100);
        panelhome.setBackground(clr);// TODO add your handling code here:
    }//GEN-LAST:event_buttonhomeMouseEntered

    private void buttonhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhomeMouseExited
        Color clr = new Color(0,140,140);
        panelhome.setBackground(clr);// TODO add your handling code here:
    }//GEN-LAST:event_buttonhomeMouseExited

    private void buttonsearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsearchMouseEntered
        Color clr = new Color(0, 100, 100);
        panelsearch.setBackground(clr);// TODO add your handling code here:
    }//GEN-LAST:event_buttonsearchMouseEntered

    private void buttonsearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonsearchMouseExited
        Color clr = new Color(0,140,140);
        panelsearch.setBackground(clr);// TODO add your handling code here:
    }//GEN-LAST:event_buttonsearchMouseExited

    private void buttonrecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonrecordMouseEntered
        Color clr = new Color(0, 100, 100);
        panelrecord.setBackground(clr);// TODO add your handling code here:
    }//GEN-LAST:event_buttonrecordMouseEntered

    private void buttonrecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonrecordMouseExited
        Color clr = new Color(0,140,140);
        panelrecord.setBackground(clr);// TODO add your handling code here:
    }//GEN-LAST:event_buttonrecordMouseExited

    private void buttonbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonbackMouseEntered
        Color clr = new Color(0, 100, 100);
        panelback.setBackground(clr);// TODO add your handling code here:
    }//GEN-LAST:event_buttonbackMouseEntered

    private void buttonbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonbackMouseExited
        Color clr = new Color(0,140,140);
        panelback.setBackground(clr);// TODO add your handling code here:
    }//GEN-LAST:event_buttonbackMouseExited

    private void buttonlogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonlogoutMouseEntered
        Color clr = new Color(0, 100, 100);
        panellogout.setBackground(clr); // TODO add your handling code here:
    }//GEN-LAST:event_buttonlogoutMouseEntered

    private void buttonlogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonlogoutMouseExited
        Color clr = new Color(0,140,140);
        panellogout.setBackground(clr);// TODO add your handling code here:
    }//GEN-LAST:event_buttonlogoutMouseExited

    private void buttonlogout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonlogout1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonlogout1MouseEntered

    private void buttonlogout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonlogout1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonlogout1MouseExited

    private void buttonlogout2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonlogout2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonlogout2MouseEntered

    private void buttonlogout2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonlogout2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonlogout2MouseExited

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:

//        st = con.prepareStatement("select * from login");
        String toSearch = searchBox.getText();
        String query = "select * from login where roll='"+ toSearch +"'";
        
        try {
            Connect connection= new Connect();           
            con = connection.getConnection();
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            DefaultTableModel tableModel = (DefaultTableModel)dataTable.getModel();
            if (result.next()) {
                String stdId = String.valueOf(result.getString("id"));
                String firstName = String.valueOf(result.getString("firstname"));
                String rollNo = String.valueOf(result.getString("roll"));
                String userName = String.valueOf(result.getString("username"));
                String Phone = String.valueOf(result.getString("phone"));
                String pass = String.valueOf(result.getString("password"));
                String dept = String.valueOf(result.getString("department"));
                String DoB = String.valueOf(result.getString("dob"));
                String[] rowData = {stdId, firstName, rollNo, userName, Phone, pass, dept, DoB};
                tableModel.addRow(rowData);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

    private void buttonlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonlogoutMouseClicked
       dispose();
        Adminlogin h=new Adminlogin();
        h.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_buttonlogoutMouseClicked

    private void buttonbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonbackMouseClicked
        dispose();
        AdminDashboard h=new AdminDashboard();
        h.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonbackMouseClicked

    private void buttonrecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonrecordMouseClicked
         dispose();
        Studentinfo h=new Studentinfo();
        h.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_buttonrecordMouseClicked

    private void panelhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelhomeMouseClicked
        dispose();
        AdminDashboard h=new AdminDashboard();
        h.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_panelhomeMouseClicked

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buttonback;
    private javax.swing.JLabel buttonhome;
    private javax.swing.JLabel buttonlogout;
    private javax.swing.JLabel buttonlogout1;
    private javax.swing.JLabel buttonlogout2;
    private javax.swing.JLabel buttonrecord;
    private javax.swing.JLabel buttonsearch;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelback;
    private javax.swing.JPanel panelhome;
    private javax.swing.JPanel panellogout;
    private javax.swing.JPanel panellogout1;
    private javax.swing.JPanel panellogout2;
    private javax.swing.JPanel panelrecord;
    private javax.swing.JPanel panelsearch;
    private javax.swing.JPanel panelsidebar;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
