package com.myself.dao;

import com.myself.model.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/6/26 0026.
 */
public interface UserDAO {

    public int insertUser(User user);

    public int updateUser(User user);

    public User selectUser(int id,String name);

    public List<User> selectList();

    public int deleteUser(int id);

    public void setSession(SqlSession session);

    public SqlSession getSession();
}
