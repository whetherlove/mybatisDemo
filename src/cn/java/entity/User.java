package cn.java.entity;

/**
 * @ProjectName: mybatisDemo
 * @Package: cn.java.entity
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/14/014 11:15
 * @UpdateDate: 2018/6/14/014 11:15
 */
public class User {

    private long id;
    private String username;
    private String pwd;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
