
package cuoiky.Util;


import cuoiky.DAO.CauThuModify;




import cuoiky.Model.cauthu;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




/**
 *
 * @author AMIN
 */
public class CauThuJPanel2 extends javax.swing.JPanel {
   boolean status;
      DefaultTableModel tableModel;
    List<cauthu> cauthuList = new ArrayList<>();
     
  
    public CauThuJPanel2() {
        initComponents();
         Toolkit toolkit = getToolkit();
       Dimension size = toolkit.getScreenSize();
       setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
         tableModel = (DefaultTableModel) tablecauthu.getModel();
        
        showCauthu();
    }
   
  private void showCauthu() {
        cauthuList = CauThuModify.findAll();
        
        tableModel.setRowCount(0);
        
        cauthuList.forEach((cauthu) -> {
            tableModel.addRow(new Object[] {cauthu.getId() , cauthu.getName(),cauthu.getAge(),cauthu.getSex(),
                cauthu.getPrice(),cauthu.getBonus(),cauthu.getPosition(),cauthu.getNational(),cauthu.getWeight(),cauthu.getHeight(), cauthu.getStatus(),cauthu.getImagename()
              });
        });
    }
     
        
        
        
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnRoot = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablecauthu = new javax.swing.JTable();
        txtimagename = new javax.swing.JLabel();
        btimages = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btntinhluong = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtweight = new javax.swing.JTextField();
        txtheight = new javax.swing.JTextField();
        txtsalary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtsex = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtbonus = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        cbnational = new javax.swing.JTextField();
        cbposition = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        search = new javax.swing.JTextField();

        jpnRoot.setBackground(new java.awt.Color(0, 42, 84));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("National:");

        tablecauthu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID;", "Name:", "Age:", "Sex:", "Fixed salary", "Bonus:", "Position:", "National:", "Weight:", "Height:", "Status:", "Imagename:"
            }
        ));
        tablecauthu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecauthuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablecauthu);

        txtimagename.setBackground(new java.awt.Color(204, 204, 204));
        txtimagename.setOpaque(true);
        txtimagename.setPreferredSize(new java.awt.Dimension(144, 180));

        btimages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuoiky/image/images.png"))); // NOI18N
        btimages.setText("Browes Images");
        btimages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btimagesActionPerformed(evt);
            }
        });

        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuoiky/image/plus2.png"))); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuoiky/image/update2.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuoiky/image/reset2.png"))); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuoiky/image/delete2.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btntinhluong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuoiky/image/excel.png"))); // NOI18N
        btntinhluong.setText("Tính lương");
        btntinhluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntinhluongActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Weight:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Height:");

        txtweight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtweightActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Position:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Salary:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sex:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fixed salary:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Bonus:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search:");

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
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

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname)
                            .addComponent(txtage)
                            .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(txtsex)
                            .addComponent(txtprice)
                            .addComponent(txtbonus)
                            .addComponent(cbposition))))
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpnRootLayout.createSequentialGroup()
                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpnRootLayout.createSequentialGroup()
                                                .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                                .addGap(0, 164, Short.MAX_VALUE)
                                                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(98, 98, 98)))
                                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btntinhluong, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jpnRootLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(btimages, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jpnRootLayout.createSequentialGroup()
                                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnclear)
                                                .addGap(70, 70, 70))
                                            .addGroup(jpnRootLayout.createSequentialGroup()
                                                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cbnational)
                                                    .addComponent(txtweight, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                                    .addComponent(txtheight, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                                    .addComponent(search))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(txtimagename, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50))))))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnclear)))
                        .addGap(14, 14, 14)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cbnational, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtheight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtimagename, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btimages)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd)
                            .addComponent(btndelete)
                            .addComponent(btnupdate)
                            .addComponent(btnreset)
                            .addComponent(btntinhluong))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btimagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btimagesActionPerformed
        // TODO add your handling code here:
         //Default image Location
        String currentDirectoryPath = "C:\\Users\\AMIN\\Pictures\\picture-demo";
        JFileChooser imageFileChooser = new JFileChooser(currentDirectoryPath);
         int imageChooser = imageFileChooser.showOpenDialog(null);
        imageFileChooser.setDialogTitle("Choose Image ...");
        // only chooser "png","jpg","jpeg" files
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        imageFileChooser.setFileFilter(fnef);
        
        if(imageChooser == JFileChooser.APPROVE_OPTION){
            File imageFile = imageFileChooser.getSelectedFile();
            String imageFileName = imageFile.getName();
            
            
            //Display image name in a textbox
           txtimagename.setText(imageFileName);
        
           
             String imageFilePath = imageFile.getAbsolutePath();
            ImageIcon imageIcon = new ImageIcon(imageFilePath);
           //Resize Image To Filt JLabel
             Image image = imageIcon.getImage().getScaledInstance(txtimagename.getWidth(),txtimagename.getHeight(),Image.SCALE_SMOOTH);
             // display image on jlabel
             ImageIcon resizedImageIcon = new ImageIcon(image);
            txtimagename.setIcon(resizedImageIcon);
            // display image path in JTextfield
           // txtimagepath.setText(imageFilePath);
   }
       

    }//GEN-LAST:event_btimagesActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
          int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        int age =Integer.parseInt(txtage.getText());
        String sex = txtsex.getText();
        double price = Double.parseDouble(txtprice.getText());
        double bonus = Double.parseDouble(txtbonus.getText());
        String position=cbposition.getText();
        String national=cbnational.getText();
        
        double weight = Double.parseDouble(txtweight.getText());
        double height = Double.parseDouble(txtheight.getText());
        String status = txtstatus.getText();
        String imagename= txtimagename.getText();
        
         cauthu ct = new cauthu(id,name,age,sex,price,bonus,position,national,weight,height,status,imagename);
        CauThuModify.insert(ct);
        showCauthu();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        int age =Integer.parseInt(txtage.getText());
        String sex = txtsex.getText();
        double price = Double.parseDouble(txtprice.getText());
        double bonus = Double.parseDouble(txtbonus.getText());
        String position=cbposition.getText();
        String national=cbnational.getText();
        
        double weight = Double.parseDouble(txtweight.getText());
        double height = Double.parseDouble(txtheight.getText());
        String status = txtstatus.getText();
        String imagename= txtimagename.getText();
        
         cauthu ct = new cauthu(id,name,age,sex,price,bonus,position,national,weight,height,status,imagename);
        CauThuModify.update(ct);
        showCauthu();
      
     
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here
          txtid.setText("");
        txtname.setText("");
        txtage.setText("");
        txtsex.setText("");
        txtprice.setText("");
        txtbonus.setText("");
        cbposition.setText("");
        cbnational.setText("");
        txtweight.setText("");
        txtheight.setText("");
        txtsalary.setText("");
        
       txtstatus.setText("");
        txtimagename.setText("");
        txtimagename.setIcon(null);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
         int selectedIndex = tablecauthu.getSelectedRow();
        if(selectedIndex >= 0) {
             cauthu ct = cauthuList.get(selectedIndex);
            
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");
            System.out.println("option : " + option);
            
            if(option == 0) {
                CauThuModify.delete(ct.getId());
                
                showCauthu();
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tablecauthuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecauthuMouseClicked
        // TODO add your handling code here:
        int row = tablecauthu.getSelectedRow();
        if(row<0)
        {
            return;
        }
        txtid.setText(tablecauthu.getValueAt(row, 0).toString());
        txtname.setText(tablecauthu.getValueAt(row,1).toString());
        txtage.setText(tablecauthu.getValueAt(row, 2).toString());
        txtsex.setText(tablecauthu.getValueAt(row, 3).toString());
        txtprice.setText(tablecauthu.getValueAt(row, 4).toString());
        txtbonus.setText(tablecauthu.getValueAt(row, 5).toString());
        cbposition.setText(tablecauthu.getValueAt(row, 6).toString());
        cbnational.setText(tablecauthu.getValueAt(row, 7).toString());
        txtweight.setText(tablecauthu.getValueAt(row, 8).toString());
        txtheight.setText(tablecauthu.getValueAt(row, 9).toString());
        txtstatus.setText(tablecauthu.getValueAt(row, 10).toString());
        txtimagename.setText(tablecauthu.getValueAt(row, 11).toString());
        
    }//GEN-LAST:event_tablecauthuMouseClicked
    
    private void btntinhluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntinhluongActionPerformed
        // TODO add your handling code here:
       if(!txtprice.getText().isEmpty() && !txtbonus.getText().isEmpty()){
           txtsalary.setText(String.valueOf(new DecimalFormat("#,###").format((7*(Double.parseDouble(txtprice.getText()))+(Double.parseDouble(txtbonus.getText()))))));
           JOptionPane.showMessageDialog(null,"Tinh luong thanh cong");
       }else{
           JOptionPane.showMessageDialog(null,"Tinh luong that bai");
       }
    }//GEN-LAST:event_btntinhluongActionPerformed

    private void txtweightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtweightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtweightActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        search.setText("");
        
    }//GEN-LAST:event_btnclearActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
      
    }//GEN-LAST:event_searchKeyReleased

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
         Connection connection = null;
        PreparedStatement statement = null;
       
       try {
          
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
           //query
           String sql = "select * from cauthu where cauthuid like ?";
            statement = connection.prepareCall(sql);
            
           statement.setString(1, search.getText());
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               String setid = rs.getString("cauthuid");
               txtid.setText(setid);
               String setname = rs.getString("name");
               txtname.setText(setname);
               String setage = rs.getString("age");
               txtage.setText(setage);
               String setsex = rs.getString("sex");
               txtsex.setText(setsex);
               String setprice = rs.getString("price");
               txtprice.setText(setprice);
               String setbonus = rs.getString("bonus");
               txtbonus.setText(setbonus);
               String setposition =rs.getString("position");
               cbposition.setText(setposition);
               String setnational = rs.getString("national");
               cbnational.setText(setnational);
               String setweight = rs.getString("weight");
               txtweight.setText(setweight);
               String setheight = rs.getString("height");
               txtheight.setText(setheight);
               String setstatus = rs.getString("status");
               txtstatus.setText(setstatus);
               String setimagename =rs.getString("imagename");
               txtimagename.setText(setimagename);
           }
            } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_searchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btimages;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntinhluong;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cbnational;
    private javax.swing.JTextField cbposition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JTextField search;
    private javax.swing.JTable tablecauthu;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtbonus;
    private javax.swing.JTextField txtheight;
    private javax.swing.JTextField txtid;
    private javax.swing.JLabel txtimagename;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTextField txtsex;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}
