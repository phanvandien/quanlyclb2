
package cuoiky.Util;

import cuoiky.DAO.CauThuModify;
import cuoiky.DAO.TranDauModify;
import cuoiky.Model.Trandau;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AMIN
 */
public class TranDauJPanel2 extends javax.swing.JPanel {
       DefaultTableModel tableModel;
    List<Trandau> trandauList = new ArrayList<>();
   
    public TranDauJPanel2() {
        initComponents();
         tableModel = (DefaultTableModel) jTable1.getModel();
        
        showtrandau();
    }
    private void showtrandau() {
        trandauList = TranDauModify.findAll();
        
        tableModel.setRowCount(0);
        
        trandauList.forEach((Trandau) -> {
            tableModel.addRow(new Object[] {Trandau.getId(), Trandau.getTengiai(),Trandau.getTheloai(),Trandau.getTinhtrang(),Trandau.getNgaythidau(),Trandau.getKetqua(),
                Trandau.getGiave(),Trandau.getCauthuid(),Trandau.getHuanluyenvienid()
              });
        });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txttengiai = new javax.swing.JTextField();
        txttheloai = new javax.swing.JTextField();
        txttinhtrang = new javax.swing.JTextField();
        txtngaythidau = new javax.swing.JTextField();
        txtketqua = new javax.swing.JTextField();
        txtgiave = new javax.swing.JTextField();
        txtcauthuid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txthuanluyenvienid = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 42, 84));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID:", "Tengiai:", "Theloai:", "Tinhtrang:", "Ngaythidau:", "Ketqua:", "Giave:", "Cauthuid:", "Huanluyenvienid:"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tengiai:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Theloai:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tinhtrang:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ngaythidau:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ketqua:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Giave:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cauthuid:");

        txttengiai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttengiaiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Huanluyenvienid:");

        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Search:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btninsert, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtid)
                            .addComponent(txttengiai)
                            .addComponent(txttheloai)
                            .addComponent(txttinhtrang))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtngaythidau)
                            .addComponent(txtketqua)
                            .addComponent(txtgiave)
                            .addComponent(txtcauthuid))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthuanluyenvienid, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(search)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngaythidau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txttengiai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtketqua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthuanluyenvienid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txttheloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgiave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txttinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcauthuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsert)
                    .addComponent(btnreset)
                    .addComponent(btnupdate))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txttengiaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttengiaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttengiaiActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtid.getText());
        String tengiai = txttengiai.getText();
        String theloai = txttheloai.getText();
        String tinhtrang =txttinhtrang.getText();
        String ngaythidau =txtngaythidau.getText();
        String ketqua = txtketqua.getText();
        double giave =Double.parseDouble(txtgiave.getText());
        int cauthuid =Integer.parseInt(txtcauthuid.getText());
        int huanluyenvienid = Integer.parseInt(txthuanluyenvienid.getText());
        
        Trandau td = new Trandau(id, tengiai, theloai,tinhtrang,ngaythidau,ketqua,giave,cauthuid,huanluyenvienid);
        TranDauModify.insert(td);
        showtrandau();
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txtid.setText("");
        txttengiai.setText("");
        txttheloai.setText("");
        txttinhtrang.setText("");
        txtngaythidau.setText("");
        txtketqua.setText("");
        txtgiave.setText("");
        txtcauthuid.setText("");
        txthuanluyenvienid.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
         int id = Integer.parseInt(txtid.getText());
        String tengiai = txttengiai.getText();
        String theloai = txttheloai.getText();
        String tinhtrang =txttinhtrang.getText();
        String ngaythidau =txtngaythidau.getText();
        String ketqua = txtketqua.getText();
        double giave =Double.parseDouble(txtgiave.getText());
        int cauthuid =Integer.parseInt(txtcauthuid.getText());
        int huanluyenvienid = Integer.parseInt(txthuanluyenvienid.getText());
        
        Trandau td = new Trandau(id, tengiai, theloai,tinhtrang,ngaythidau,ketqua,giave,cauthuid,huanluyenvienid);
        TranDauModify.update(td);
        showtrandau();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int row = jTable1.getSelectedRow();
        if(row<0)
        {
            return;
        }
        txtid.setText(jTable1.getValueAt(row, 0).toString());
        txttengiai.setText(jTable1.getValueAt(row,1).toString());
        txttheloai.setText(jTable1.getValueAt(row, 2).toString());
        txttinhtrang.setText(jTable1.getValueAt(row, 3).toString());
        txtngaythidau.setText(jTable1.getValueAt(row, 4).toString());
        txtketqua.setText(jTable1.getValueAt(row, 5).toString());
        txtgiave.setText(jTable1.getValueAt(row, 6).toString());
        txtcauthuid.setText(jTable1.getValueAt(row, 7).toString());
        txthuanluyenvienid.setText(jTable1.getValueAt(row, 8).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchKeyReleased

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
         Connection connection = null;
        PreparedStatement statement = null;
       
       try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
           //query
           String sql = "select * from trandau where ngaythidau like ?";
            statement = connection.prepareCall(sql);
            
           statement.setString(1, search.getText());
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               String setid = rs.getString("id");
               txtid.setText(setid);
               String settengiai = rs.getString("tengiai");
               txttengiai.setText(settengiai);
               String settheloai = rs.getString("theloai");
               txttheloai.setText(settheloai);
               String settinhtrang = rs.getString("tinhtrang");
               txttinhtrang.setText(settinhtrang);
               String setngaythidau = rs.getString("ngaythidau");
               txtngaythidau.setText(setngaythidau);
               String setketqua =rs.getString("ketqua");
               txtketqua.setText(setketqua);
               String setgiave =rs.getString("giave");
               txtgiave.setText(setgiave);
               String setcauthuid=rs.getString("cauthuid");
               txtcauthuid.setText(setcauthuid);
               String sethuanluyenvienid =rs.getString("huanluyenvienid");
               txthuanluyenvienid.setText(sethuanluyenvienid);
           }
            } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_searchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnupdate;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField search;
    private javax.swing.JTextField txtcauthuid;
    private javax.swing.JTextField txtgiave;
    private javax.swing.JTextField txthuanluyenvienid;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtketqua;
    private javax.swing.JTextField txtngaythidau;
    private javax.swing.JTextField txttengiai;
    private javax.swing.JTextField txttheloai;
    private javax.swing.JTextField txttinhtrang;
    // End of variables declaration//GEN-END:variables
}
