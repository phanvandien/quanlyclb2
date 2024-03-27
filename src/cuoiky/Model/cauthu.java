
package cuoiky.Model;



/**
 *
 * @author AMIN
 */
public class cauthu {
    private int id;
    private String name;
    private int age;
    private String sex;
    private double price;
    private double bonus;
    private String position;
    private String national;
    private double weight;
    private double height;
   
    private String status;
    private String imagename;

    public cauthu() {
    }

    public cauthu(int id, String name, int age, String sex, double price, double bonus, String position, String national, double weight, double height,String status, String imagename) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
        this.bonus = bonus;
        this.position = position;
        this.national = national;
        this.weight = weight;
        this.height = height;
        
        this.status=status;
        this.imagename = imagename;
    }

    public cauthu(String name, int age, String sex, double price, double bonus, String position, String national, double weight, double height,String status, String imagename) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
        this.bonus = bonus;
        this.position = position;
        this.national = national;
        this.weight = weight;
        this.height = height;
        
        this.status=status;
        this.imagename = imagename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

 
    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
