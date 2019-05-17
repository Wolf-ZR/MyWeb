package dao;


import model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import util.DBUtil;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private Logger logger= Logger.getLogger(UserDao.class);
    //添加一个用户并返回id
    public int addUser(User user){
        SqlSession sqlSession=null;
        int id=0;
        try {
            sqlSession= DBUtil.getSqlSessionFactory("company").openSession();
            sqlSession.insert("mapper.UserMapper.addUser",user);
            id=user.getUid();
            sqlSession.commit();
        } catch (Exception e) {
            logger.error(e);
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
        return id;
    }
    //根据id查询
    public User selectUserById(int id){
        SqlSession sqlSession=null;
        User user=null;
        try {
            sqlSession= DBUtil.getSqlSessionFactory("company").openSession();
            user=sqlSession.selectOne("mapper.UserMapper.selectUserById",id);
        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();
        } finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
        return user;
    }
    //根据名字查询
    public User selectUserByName(String name){
        SqlSession sqlSession=null;
        User user=null;
        try {
            sqlSession= DBUtil.getSqlSessionFactory("company").openSession();
            user=sqlSession.selectOne("mapper.UserMapper.selectUserByName",name);
        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();
        } finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
        return user;
    }
    //查询所有用户
    public List<User> selectAllUser(){
        List<User> list=new ArrayList<>();
        SqlSession sqlSession=null;
        try {
            sqlSession=DBUtil.getSqlSessionFactory("company").openSession();
            list=sqlSession.selectList("mapper.UserMapper.selectUsers");
        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
        return list;
    }
}
