
package cuoiky.DAO;

import bean.DanhMucBean;
import cuoiky.Util.CauThuJPanel2;
import cuoiky.Util.HuanLuyenVienJPanel2;

import cuoiky.Util.PhongTapJPanel2;
import cuoiky.Util.TranDauJPanel2;
import cuoiky.Util.TrangChuJPanel2;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

/**
 *
 * @author AMIN
 */
public class ChuyenManHinhController {
    private JPanel root;
    private String kindSelected ="";
    
    List<DanhMucBean> listItem = null;
    
    public ChuyenManHinhController (JPanel jpnRoot){
        this.root =jpnRoot;
    }
    
    public void setView(JPanel jpnItem , JLabel jlbItem){
        kindSelected = "TrangChu";
         jlbItem.setBackground(new Color(32,42,68));
           jpnItem.setBackground(new Color(32,42,68));
           jlbItem.setForeground(new Color(255,255,255));
        
         root.removeAll();
         root.setLayout(new BorderLayout());
         root.add(new TrangChuJPanel2());
         root.validate();
         root.repaint();
    }
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
        
    }
    class LabelEvent implements MouseListener{
        
        private JPanel node;
        
        private String kind;
        
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

       
        
        @Override
        public void mouseClicked(MouseEvent e) {
           switch(kind){
               case "TrangChu":
               node = new TrangChuJPanel2();
               break;
               case "CauThu":
                   node= new CauThuJPanel2();
                   break;
               case "HuanLuyenVien":
                   node = new HuanLuyenVienJPanel2();
                   break;
                   
                   case "Phongtap":
                   node = new PhongTapJPanel2();
                   break;
                   case "Trandau":
                   node = new TranDauJPanel2();
                   break;
               default:
                    node = new TrangChuJPanel2();
                   break;
                   
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
           setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
           kindSelected = kind;
          jlbItem.setBackground(new Color(32,42,68));
           jpnItem.setBackground(new Color(32,42,68));
           jlbItem.setForeground(new Color(255,255,255));
           
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
             jlbItem.setBackground(new Color(32,42,68));
           jpnItem.setBackground(new Color(32,42,68));
           jlbItem.setForeground(new Color(255,255,255));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(kindSelected.equalsIgnoreCase(kind)){
             jlbItem.setBackground(new Color(32,42,68));
           jpnItem.setBackground(new Color(32,42,68));
           jlbItem.setForeground(new Color(255,255,255));
            }
        }
        
    }
    private void setChangeBackground(String kind){
        for(DanhMucBean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                 item.getJpn().setBackground(new Color(32,42,68));
           item.getJlb().setBackground(new Color(32,42,68));
           item.getJlb().setForeground(new Color(255,255,255));
            }else{
                    item.getJpn().setBackground(new Color(32,42,68));
           item.getJlb().setBackground(new Color(32,42,68));
           item.getJlb().setForeground(new Color(255,255,255));
            }
        }
    }
}
