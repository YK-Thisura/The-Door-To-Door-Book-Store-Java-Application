/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Codes.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class Main extends javax.swing.JFrame {

   Connection conn = null;
   PreparedStatement pst = null;
   ResultSet rs = null ;
           
           
    public Main() {
        initComponents();
        conn = DBConnect.connect();
        tableload();
        
    }

   public void tableload(){
       try{
           
           String sql = "SELECT id AS ID ,name AS Name,author AS Author ,quantity AS Quantity FROM book";
           pst = conn.prepareStatement (sql);
           rs = pst.executeQuery();
           btable.setModel(DbUtils.resultSetToTableModel(rs));
           
           
       }catch (Exception e){
           
           JOptionPane.showMessageDialog(null,e);
       }
   }
    
   public void tabledata (){
       
       int r = btable.getSelectedRow();
       
       String id = btable.getValueAt(r, 0).toString();
       String name = btable.getValueAt (r, 1).toString();
       String author = btable.getValueAt (r, 2).toString();
       String quantity = btable.getValueAt (r, 3).toString();
       
       bid.setText(id);
       bname.setText(name);
       bauthor.setText(author);
       bquantity.setText(quantity);
       
       
   } 
   
   public void search(){
       
       String srch = searchbox.getText();
       
       try{
           
           String sql = "SELECT * FROM book WHERE name LIKE '%"+srch+"%' OR id LIKE '%"+srch+"%' OR author LIKE '%"+srch+"%'";
           pst = conn.prepareStatement (sql);
           rs = pst.executeQuery();
           btable.setModel(DbUtils.resultSetToTableModel(rs));
           
       }catch(Exception e){
           
           JOptionPane.showMessageDialog(null, e);
       }
       
   }
   
   
   public void clear(){
       
       searchbox.setText("");
       bid.setText("ID");
       bname.setText("");
       bauthor.setText("");
       bquantity.setText("");
       
       
   }
   
   public void update(){
       
       String Id = bid.getText();
       String Name = bname.getText();
       String Author =bauthor.getText();
       String Quantity =bquantity.getText();
       
       try{
           
           String sql = "UPDATE book SET name='"+Name+"',author='"+Author+"',quantity='"+Quantity+"' WHERE id='"+Id+"'";
           pst = conn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null, " Successfully Updated ");
           
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Sorry Something Went Wrong ");
       }
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        insertbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        bname = new javax.swing.JTextField();
        bauthor = new javax.swing.JTextField();
        bquantity = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        bid = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(223, 185, 10));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btable.setBackground(new java.awt.Color(0, 102, 102));
        btable.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btable.setForeground(new java.awt.Color(255, 255, 204));
        btable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        btable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btableMouseClicked(evt);
            }
        });
        btable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(btable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 17, 330, 440));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 500));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Welcome To Door To Door Book Store ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Book ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Book Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Book Author");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Book Quantity");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        insertbtn.setBackground(new java.awt.Color(255, 255, 204));
        insertbtn.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        insertbtn.setForeground(new java.awt.Color(223, 185, 10));
        insertbtn.setText("Insert");
        insertbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });
        jPanel2.add(insertbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 70, 30));

        exitbtn.setBackground(new java.awt.Color(255, 255, 204));
        exitbtn.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(223, 185, 10));
        exitbtn.setText("Exit");
        exitbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel2.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 60, 30));

        deletebtn.setBackground(new java.awt.Color(255, 255, 204));
        deletebtn.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(223, 185, 10));
        deletebtn.setText("Delete");
        deletebtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel2.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 80, 30));

        updatebtn.setBackground(new java.awt.Color(255, 255, 204));
        updatebtn.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(223, 185, 10));
        updatebtn.setText("Update");
        updatebtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel2.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 80, 30));

        clearbtn.setBackground(new java.awt.Color(255, 255, 204));
        clearbtn.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(223, 185, 10));
        clearbtn.setText("Clear");
        clearbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 60, 30));

        bname.setBackground(new java.awt.Color(255, 255, 204));
        bname.setToolTipText("Enter Book Name");
        jPanel2.add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 220, 30));

        bauthor.setBackground(new java.awt.Color(255, 255, 204));
        bauthor.setToolTipText("Enter Book Author");
        jPanel2.add(bauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 220, 30));

        bquantity.setBackground(new java.awt.Color(255, 255, 204));
        bquantity.setToolTipText("Enter Book Quantity");
        jPanel2.add(bquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 220, 30));

        jPanel3.setBackground(new java.awt.Color(223, 185, 10));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEARCH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbox.setBackground(new java.awt.Color(255, 255, 204));
        searchbox.setForeground(new java.awt.Color(51, 51, 51));
        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });
        jPanel3.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 250, 60));

        bid.setBackground(new java.awt.Color(51, 51, 51));
        bid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bid.setForeground(new java.awt.Color(51, 51, 51));
        bid.setText("ID");
        jPanel2.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        setSize(new java.awt.Dimension(716, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
      
        String bkname;
        String bkauthor;
        int bkquantity;
        
        bkname = bname.getText();
        bkauthor = bauthor.getText();
        bkquantity = Integer.parseInt(bquantity.getText());
        
        try {
            
            String sql = "INSERT INTO book (name,author,quantity)VALUES ('"+bkname+"','"+bkauthor+"','"+bkquantity+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
           
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null,e);
            
        }
        
        tableload();
        clear();
        
    }//GEN-LAST:event_insertbtnActionPerformed

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        
      
     update();
     tableload();
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void btableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btableMouseClicked
        
        tabledata();
        
    }//GEN-LAST:event_btableMouseClicked

    private void btableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btableKeyReleased
       
        tabledata();
    }//GEN-LAST:event_btableKeyReleased

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        
        search();
        
    }//GEN-LAST:event_searchboxKeyReleased

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
       
      int check = JOptionPane.showConfirmDialog(null, " Do You Want To Delete This !");
      
      if(check==0){
          
          String id = bid.getText();
          
          try{
              
           String sql = "DELETE FROM book WHERE id='"+id+"'";  
           pst = conn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null," Successfully Deleted! ");
              
          }catch (Exception e){
             
           JOptionPane.showMessageDialog(null," Sorry Something went wrong! ");
          }
          
      }
        
      tableload();
      clear();
    }//GEN-LAST:event_deletebtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        
      clear();
        
    }//GEN-LAST:event_clearbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_exitbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bauthor;
    private javax.swing.JLabel bid;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField bquantity;
    private javax.swing.JTable btable;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton insertbtn;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
