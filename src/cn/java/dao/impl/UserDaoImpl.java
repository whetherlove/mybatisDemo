package cn.java.dao.impl;

import cn.java.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: mybatisDemo
 * @Package: cn.java.dao.impl
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/14/014 9:57
 * @UpdateDate: 2018/6/14/014 9:57
 */
public class UserDaoImpl {

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
    public void selectUser() throws Exception {
        Map<String,Object> aMap = session.selectOne("cn.java.dao.impl.UserDaoImpl.selectUser");
        System.out.println(aMap);
    }

    @Test
    public void selectUser2() throws Exception {
        User user = session.selectOne("cn.java.dao.impl.UserDaoImpl.selectUser2",1L);
        System.out.println(user);
    }

    @Test
    public void selectAllUsers() {
        List<Map<String,Object>> userList = session.selectList("cn.java.dao.impl.UserDaoImpl.selectAllUsers");
        userList.forEach(System.out::println);
    }

    @Test
    public void selectAllUsers2() {
        List<User> userList = session.selectList("cn.java.dao.impl.UserDaoImpl.selectAllUsers2");
        userList.forEach(System.out::println);
    }

    @Test
    public void vagueSelect() {
        String target = "j";
        List<User> userList = session.selectList("cn.java.dao.impl.UserDaoImpl.vagueSelect",target);
        userList.forEach(System.out::println);
    }

    @Test
    public void dynamicSelect() {
        Map<String,Object> map = new HashMap<>();
        //map.put("brand","lenovo");
        List<Map<String,Object>> userList = session.selectList("cn.java.dao.impl.UserDaoImpl.dynamicSelect",map);
        userList.forEach(System.out::println);
    }

    @Test
    public void insertUser() throws Exception {
        //通过session对象调用sql
        Map<String,Object> user = new HashMap<>();
        user.put("username","damao");
        user.put("pwd","2222");
        int result = session.insert("cn.java.dao.impl.UserDaoImpl.insertUser", user);
        session.commit();
    }

    @Test
    public void insertUser2() throws Exception {
        User user = new User();
        user.setUsername("xiaomao");
        user.setPwd("2222");
        int result = session.insert("cn.java.dao.impl.UserDaoImpl.insertUser", user);
        session.commit();
    }

    @Test
    public void deleteUser() {
        int result = session.delete("cn.java.dao.impl.UserDaoImpl.deleteUser",4L);
        session.commit();
    }
}
