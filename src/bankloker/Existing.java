
package bankloker;

import IrisRecog.GUI;
import IrisRecog.IrisRecog;
import java.sql.*;
import javax.swing.JOptionPane;


public class Existing extends javax.swing.JFrame {
    static int accno;
    static String aa;

    /** Creates new form Existing */
    public Existing() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        eac = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 375));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 170, 30);

        eac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eacActionPerformed(evt);
            }
        });
        jPanel1.add(eac);
        eac.setBounds(200, 130, 190, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankloker/login-button.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 210, 140, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24));
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("ACCOUNT NO:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 130, 170, 40);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 30, 320, 170);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankloker/Back_1.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(270, 210, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankloker/Eye3.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 420, 350);

        hid.setBackground(new java.awt.Color(153, 0, 255));
        hid.setEditable(false);
        hid.setForeground(new java.awt.Color(153, 0, 255));
        hid.setText("a");
        hid.setCaretColor(new java.awt.Color(153, 0, 255));
        hid.setDisabledTextColor(new java.awt.Color(153, 0, 255));
        hid.setEnabled(false);
        hid.setSelectedTextColor(new java.awt.Color(153, 0, 204));
        hid.setSelectionColor(new java.awt.Color(153, 0, 255));
        hid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidActionPerformed(evt);
            }
        });
        jPanel1.add(hid);
        hid.setBounds(7, 79, 401, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_hidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:\
        if(eac.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the Account Number");
        }
        aa=eac.getText();
        int aa1=aa.length();
        if(aa1!=10)
        {
            JOptionPane.showMessageDialog(null, "Account Number should be 10 digit");
        }
        else
        {
            String eac1=eac.getText();
             try
                                        {
                                        Connection con;
                                        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iris","root","admin");
        


        Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM details");
    String a=null;
     while(rs.next())
        {
            a=rs.getString("accno");
            
        }
     if(eac1.equals(a))
            {
            //    JOptionPane.showMessageDialog(null, "User already exsiting");
              GUI gui_View = new GUI();

		IrisRecog irg_Model = new IrisRecog(gui_View);

		gui_View.setModel(irg_Model);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Account Number Not Matching");
            }
            
            }catch(Exception e)
             {      }
        
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void eacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eacActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Home1 nf=   new Home1();
             nf.setVisible(true);
             this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Existing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Existing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Existing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Existing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Existing().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField eac;
    public static javax.swing.JTextField hid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
