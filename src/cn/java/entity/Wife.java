package cn.java.entity;

/**
 * 
 * Description: 老婆<br/>
 * date: 上午10:47:48 <br/>
 *
 * @author dingP
 * @version
 */
public class Wife {
    private Long wifeid;

    private String wifename;

    private String sex;

    private String facetype;

    private Float height;

    public Long getWifeid() {
        return wifeid;
    }

    public void setWifeid(Long wifeid) {
        this.wifeid = wifeid;
    }

    public String getWifename() {
        return wifename;
    }

    public void setWifename(String wifename) {
        this.wifename = wifename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFacetype() {
        return facetype;
    }

    public void setFacetype(String facetype) {
        this.facetype = facetype;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wife [wifeid=" + wifeid + ", wifename=" + wifename + ", sex=" + sex + ", facetype=" + facetype
                + ", height=" + height + "]";
    }

}