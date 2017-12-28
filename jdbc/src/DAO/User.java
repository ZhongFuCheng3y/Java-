package DAO;

/**
 * Created by asd on 2016/10/12.
 */
/*
    实体表
        用于表示数据库中的user表
    特点:
        字段叫什么名,属性就叫什么名
 */
public class User {

    private int id;
    private String name;
    private String passworld;
    private int money ;
    private String email;
    private int deptno;

    public User() {
    }

    public User(int id, String name, String passworld, int money, String email, int deptno) {

        this.id = id;
        this.name = name;
        this.passworld = passworld;
        this.money = money;
        this.email = email;
        this.deptno = deptno;
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

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passworld='" + passworld + '\'' +
                ", money=" + money +
                ", email='" + email + '\'' +
                ", deptno=" + deptno +
                '}';
    }
}
