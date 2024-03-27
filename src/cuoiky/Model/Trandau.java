
package cuoiky.Model;

/**
 *
 * @author AMIN
 */
public class Trandau {
    private int id;
    private String tengiai;
    private String theloai;
    private String tinhtrang;
    private String ngaythidau;
    private String ketqua;
    private double giave;
    private int cauthuid;
    private int huanluyenvienid;

    public Trandau(int id, String tengiai, String theloai, String tinhtrang, String ngaythidau, String ketqua, double giave, int cauthuid, int huanluyenvienid) {
        this.id = id;
        this.tengiai = tengiai;
        this.theloai = theloai;
        this.tinhtrang = tinhtrang;
        this.ngaythidau = ngaythidau;
        this.ketqua = ketqua;
        this.giave = giave;
        this.cauthuid = cauthuid;
        this.huanluyenvienid = huanluyenvienid;
    }

    public Trandau(String tengiai, String theloai, String tinhtrang, String ngaythidau, String ketqua, double giave, int cauthuid, int huanluyenvienid) {
        this.tengiai = tengiai;
        this.theloai = theloai;
        this.tinhtrang = tinhtrang;
        this.ngaythidau = ngaythidau;
        this.ketqua = ketqua;
        this.giave = giave;
        this.cauthuid = cauthuid;
        this.huanluyenvienid = huanluyenvienid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTengiai() {
        return tengiai;
    }

    public void setTengiai(String tengiai) {
        this.tengiai = tengiai;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getNgaythidau() {
        return ngaythidau;
    }

    public void setNgaythidau(String ngaythidau) {
        this.ngaythidau = ngaythidau;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }

    public double getGiave() {
        return giave;
    }

    public void setGiave(double giave) {
        this.giave = giave;
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
