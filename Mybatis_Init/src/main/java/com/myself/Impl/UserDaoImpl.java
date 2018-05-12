package com.myself.Impl;

import com.myself.dao.UserDAO;
import com.myself.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2017/6/26 0026.
 */
/*若使用Mapper动态代理则此处接口方法无需再写*/
public class UserDaoImpl implements UserDAO{

    private SqlSession session;
    /*
    SqlSession session;
    InputStream inputStream;
    @Before(value = "")
    public void initSession() throws IOException {

        inputStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
    }*/

    public int insertUser(User user){

        //return session.insert("mapper.insertUser", user);
        return 0;
    }

    public int updateUser(User user){

        //return session.update("mapper.updateUser", user);
        return 0;
    }

    public User selectUser(int id,String name){

        //return session.selectOne("mapper.selectUser", id);
        return null;
    }

    public List<User> selectList(){

        //return session.selectList("mapper.selectList");
        return null;
    }

    public int deleteUser(int id){

        //return session.delete("mapper.deleteUser", id);
        return 0;
    }

    /*
    @After(value = "")
    public void destroySession() throws IOException{
        inputStream.close();
        if(session!=null)
            session.close();
    }*/

    public void setSession(SqlSession session) {
        this.session = session;
    }

    public SqlSession getSession() {
        return session;
    }
}
