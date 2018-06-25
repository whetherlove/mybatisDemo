package cn.java.dao.impl;

import cn.java.entity.Customer;
import cn.java.entity.Husband;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ProjectName: mybatisDemo
 * @Package: cn.java.dao.impl
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/19/019 11:42
 * @UpdateDate: 2018/6/19/019 11:42
 */
public class HusbandDaoImpl {

    SqlSession session;

    @Before
    public void init() throws IOException {
        //获取builder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //将xml文件变成流
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = builder.build(ins);
        session = factory.openSession();
    }

    @Test
    public void selectHusband() {
        String husname = "田旺";
        Husband husband = session.selectOne("cn.java.dao.impl.HusbandDaoImpl.selectHusband",husname);
        System.out.println(husband);
    }

    @Test
    public void selectOrders() {
        Customer customer = session.selectOne("cn.java.dao.impl.HusbandDaoImpl.selectOrders","小韩韩");
        System.out.println(customer);
    }
}
