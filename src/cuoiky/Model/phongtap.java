
package cuoiky.Model;

/**
 *
 * @author AMIN
 */
public class phongtap {
    private int sno;
    private String name;
    private String theloai;
    private String mota;
    private int soluong;
    private int cauthuid;
    private int huanluyenvienid;

    public phongtap(int sno, String name, String theloai, String mota, int soluong, int cauthuid, int huanluyenvienid) {
        this.sno = sno;
        this.name = name;
        this.theloai = theloai;
        this.mota = mota;
        this.soluong = soluong;
        this.cauthuid = cauthuid;
        this.huanluyenvienid = huanluyenvienid;
    }

    public phongtap(String name, String theloai, String mota, int soluong, int cauthuid, int huanluyenvienid) {
        this.name = name;
        this.theloai = theloai;
        this.mota = mota;
        this.soluong = soluong;
        this.cauthuid = cauthuid;
        this.huanluyenvienid = huanluyenvienid;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getCauthuid() {
        return cauthuid;
    }

    public void setCauthuid(int cauthuid) {
        this.cauthuid = cauthuid;
    }

    public int getHuanluyenvienid() {
        return huanluyenvienid;
    }

    public void setHuanluyenvienid(int huanluyenvienid) {
        this.huanluyenvienid = huanluyenvienid;
    }
    
    
    
}
