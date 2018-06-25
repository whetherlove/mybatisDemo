package cn.java.entity;

import java.util.List;

/**
 * @ProjectName: mybatisDemo
 * @Package: cn.java.entity
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/23/023 15:06
 * @UpdateDate: 2018/6/23/023 15:06
 */
public class Customer {

    private long cusId;
    private String cusName;
    private String gender;
    private String cusTel;

    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public long getCusId() {
        return cusId;
    }

    public void setCusId(long cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCusTel() {
        return cusTel;
    }

    public void setCusTel(String cusTel) {
        this.cusTel = cusTel;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", cusName='" + cusName + '\'' +
                ", gender='" + gender + '\'' +
                ", cusTel='" + cusTel + '\'' +
                ", orders=" + orders +
                '}';
    }
}
