package com.ws.mybatis.test;

import com.ws.mybatis.mapper.UserMapper;
import com.ws.mybatis.pojo.User;
import com.ws.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

//    @Test
//    public void testInsert() throws IOException {
//        InputStream is = Resources.getResourceAsStream("mybatis_config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        int result = userMapper.insertUser();
//        System.out.println("result: " + result);
//        //sqlSession.commit();
//        sqlSession.close();
//    }
//
//    @Test
//    public void testUpdate() {
//        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        userMapper.updateUser();
//        sqlSession.close();
//    }
//
//    @Test
//    public void deleteUpdate() {
//        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        userMapper.deleteUser();
//        sqlSession.close();
//    }
//
//    @Test
//    public void testGetById() {
//        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        User user = userMapper.getUserById();
//        System.out.println(user);
//        sqlSession.close();
//    }
//
//    @Test
//    public void testGetAllUsers() {
//        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<User> allUsers = userMapper.getAllUsers();
//        allUsers.forEach(System.out::println);
//        sqlSession.close();
//    }

    @Test
    public void testJenkins() {
        System.out.println("test of jenkins!");
    }
}
