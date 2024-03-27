
package cuoiky.DAO;


import cuoiky.Model.phongtap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AMIN
 */
public class PhongTapModify {
           public static List<phongtap> findAll() {
        List<phongtap> phongtapList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        
        try{
// lay tat ca danh sach cau thu
        connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2","root","phandien05");
 //query
       String sql="select * from phongtap";
       statement = connection.createStatement();
       
       ResultSet resultSet = statement.executeQuery(sql);
       
       while(resultSet.next()){
           phongtap pt = new phongtap(resultSet.getInt("sno"),
                   resultSet.getString("name"),
                   resultSet.getString("theloai"),
                   resultSet.getString("mota"),
                   resultSet.getInt("soluong"),
                   resultSet.getInt("cauthuid"),
                   resultSet.getInt("huanluyenvienid"));
            phongtapList.add(pt);
           
       }
       
    }catch(SQLException ex){
        Logger.getLogger(PhongTapModify.class.getName()).log(Level.SEVERE,null,ex);
    }finally{
            if(statement != null){
                try{
                statement.close();
                }catch(SQLException ex){
        Logger.getLogger(PhongTapModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            if(connection != null){
                try{
                    connection.close();
                }catch(SQLException ex){
        Logger.getLogger(PhongTapModify.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        
      }
        //ket thuc
        return phongtapList;
   }
   public static void insert(phongtap pt) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyclb2", "root", "phandien05");
            
            //query
            String sql = "insert into phongtap(sno,name,theloai,mota,soluong,cauthiid,huanluyenvienid) values(?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
             statement.setInt(1, pt.getSno());
             statement.setString(2,pt.getName());
             statement.setString(3,pt.getTheloai());
             statement.setString(4,pt.getMota());
             statement.setInt(5,pt.getSoluong());
             statement.setInt(6,pt.getCauthuid());
             statement.setInt(7,pt.getHuanluyenvienid());
              
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CauThuModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
}
