package cn.java.entity;

/**
 * @ProjectName: mybatisDemo
 * @Package: cn.java.entity
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/23/023 15:08
 * @UpdateDate: 2018/6/23/023 15:08
 */
public class Order {

    private long orderId;
    private String address;
    private float price;
    private long cId;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getcId() {
        return cId;
    }

    public void setcId(long cId) {
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", cId=" + cId +
                '}';
    }
}
