
package cuoiky.Model;

/**
 *
 * @author AMIN
 */
public class huanluyenvien {
    private int id;
    private String name;
    private int age;
    private String sex;
    private double price;
    private double bonus;
    private String formation;
    private String description;
    private String status;

    public huanluyenvien() {
    }

    public huanluyenvien(int id, String name, int age, String sex, double price, double bonus, String formation, String description, String status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
        this.bonus = bonus;
        this.formation = formation;
        this.description = description;
        this.status = status;
    }

    public huanluyenvien(String name, int age, String sex, double price, double bonus, String formation, String description, String status) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
        this.bonus = bonus;
        this.formation = formation;
        this.description = description;
        this.status = status;
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

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   

   
    
    
}
