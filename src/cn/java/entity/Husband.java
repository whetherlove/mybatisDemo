package cn.java.entity;

/**
 * 
 * Description: 老公<br/>
 * date: 上午10:47:39 <br/>
 *
 * @author dingP
 * @version
 */
public class Husband {
    private Long husid;

    private String husname;

    private String gender;

    private Integer age;

    private Float privatemoney;

    private Wife wife;// 老婆

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public Long getHusid() {
        return husid;
    }

    public void setHusid(Long husid) {
        this.husid = husid;
    }

    public String getHusname() {
        return husname;
    }

    public void setHusname(String husname) {
        this.husname = husname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getPrivatemoney() {
        return privatemoney;
    }

    public void setPrivatemoney(Float priavemoney) {
        this.privatemoney = priavemoney;
    }

    @Override
    public String toString() {
        return "Husband [husid=" + husid + ", husname=" + husname + ", gender=" + gender + ", age=" + age
                + ", privatemoney=" + privatemoney + ", wife=" + wife + "]";
    }

}
