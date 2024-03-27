
package cuoiky;

import bean.DanhMucBean;

import cuoiky.DAO.ChuyenManHinhController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AMIN
 */
public class MainJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame2() {
        initComponents();
         Toolkit toolkit = getToolkit();
       Dimension size = toolkit.getScreenSize();
       setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        setTitle("Quản Lý Clb bóng đá ");
        ChuyenManHinhController controller = new  ChuyenManHinhController(jpnView);
        controller.setView(jpnTrangChu,jlbTrangChu);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu",jpnTrangChu,jlbTrangChu));
        listItem.add(new DanhMucBean("CauThu",jpnCauThu,jlbCauThu));
        listItem.add(new DanhMucBean("HuanLuyenVien",jpnhuanluyenvien,jlbhuanluyenvien));
        //listItem.add(new DanhMucBean("Nhanvien",jpnnhanvien,jlbnhanvien));
        listItem.add(new DanhMucBean("Phongtap",jpnphongtap,jlbphongtap));
        listItem.add(new DanhMucBean("Trandau",jpntrandau,jlbtrandau));
        
        controller.setEvent(listItem);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnCauThu = new javax.swing.JPanel();
        jlbCauThu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpnhuanluyenvien = new javax.swing.JPanel();
        jlbhuanluyenvien = new javax.swing.JLabel();
        jpnphongtap = new javax.swing.JPanel();
        jlbphongtap = new javax.swing.JLabel();
        jpntrandau = new javax.swing.JPanel();
        jlbtrandau = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setBackground(new java.awt.Color(255, 255, 255));

        jpnMenu.setBackground(new java.awt.Color(32, 42, 68));

        jpnTrangChu.setBackground(new java.awt.Color(32, 42, 68));

        jlbTrangChu.setBackground(new java.awt.Color(0, 0, 0));
        jlbTrangChu.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jlbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTrangChu.setText("Trang Chủ");
        jlbTrangChu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbTrangChu)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpnCauThu.setBackground(new java.awt.Color(32, 42, 68));

        jlbCauThu.setBackground(new java.awt.Color(0, 0, 0));
        jlbCauThu.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jlbCauThu.setForeground(new java.awt.Color(255, 255, 255));
        jlbCauThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCauThu.setText("Cầu Thủ");
        jlbCauThu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jpnCauThuLayout = new javax.swing.GroupLayout(jpnCauThu);
        jpnCauThu.setLayout(jpnCauThuLayout);
        jpnCauThuLayout.setHorizontalGroup(
            jpnCauThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCauThuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jpnCauThuLayout.setVerticalGroup(
            jpnCauThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCauThuLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlbCauThu)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuoiky/image/fca56.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(195, 195));

        jpnhuanluyenvien.setBackground(new java.awt.Color(32, 42, 68));

        jlbhuanluyenvien.setBackground(new java.awt.Color(0, 0, 0));
        jlbhuanluyenvien.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jlbhuanluyenvien.setForeground(new java.awt.Color(255, 255, 255));
        jlbhuanluyenvien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbhuanluyenvien.setText("Huấn Luyện Viên");
        jlbhuanluyenvien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jpnhuanluyenvienLayout = new javax.swing.GroupLayout(jpnhuanluyenvien);
        jpnhuanluyenvien.setLayout(jpnhuanluyenvienLayout);
        jpnhuanluyenvienLayout.setHorizontalGroup(
            jpnhuanluyenvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnhuanluyenvienLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbhuanluyenvien, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnhuanluyenvienLayout.setVerticalGroup(
            jpnhuanluyenvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnhuanluyenvienLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlbhuanluyenvien)
                .addContainerGap())
        );

        jpnphongtap.setBackground(new java.awt.Color(32, 42, 68));

        jlbphongtap.setBackground(new java.awt.Color(0, 0, 0));
        jlbphongtap.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jlbphongtap.setForeground(new java.awt.Color(255, 255, 255));
        jlbphongtap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbphongtap.setText("Phòng tập");
        jlbphongtap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jpnphongtapLayout = new javax.swing.GroupLayout(jpnphongtap);
        jpnphongtap.setLayout(jpnphongtapLayout);
        jpnphongtapLayout.setHorizontalGroup(
            jpnphongtapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnphongtapLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbphongtap, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnphongtapLayout.setVerticalGroup(
            jpnphongtapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnphongtapLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlbphongtap)
                .addContainerGap())
        );

        jpntrandau.setBackground(new java.awt.Color(32, 42, 68));

        jlbtrandau.setBackground(new java.awt.Color(0, 0, 0));
        jlbtrandau.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jlbtrandau.setForeground(new java.awt.Color(255, 255, 255));
        jlbtrandau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbtrandau.setText("Trận đấu");
        jlbtrandau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jpntrandauLayout = new javax.swing.GroupLayout(jpntrandau);
        jpntrandau.setLayout(jpntrandauLayout);
        jpntrandauLayout.setHorizontalGroup(
            jpntrandauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpntrandauLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbtrandau, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpntrandauLayout.setVerticalGroup(
            jpntrandauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpntrandauLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlbtrandau)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnCauThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnhuanluyenvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnphongtap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpntrandau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnCauThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnhuanluyenvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnphongtap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpntrandau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jpnView.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbCauThu;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JLabel jlbhuanluyenvien;
    private javax.swing.JLabel jlbphongtap;
    private javax.swing.JLabel jlbtrandau;
    private javax.swing.JPanel jpnCauThu;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel jpnhuanluyenvien;
    private javax.swing.JPanel jpnphongtap;
    private javax.swing.JPanel jpntrandau;
    // End of variables declaration//GEN-END:variables
}
