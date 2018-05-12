import com.myself.Impl.UserDaoImpl;
import com.myself.dao.UserDAO;
import com.myself.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
public class testmapper {

    public UserDAO userdao;
    @Test
    public void test() throws IOException{

        Reader reader = Resources.getResourceAsReader("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession(true);

        User user = new User();
        userdao = new UserDaoImpl();
        userdao.setSession(session);

        user.setId(1);
        user.setName("zhangsan");
        user.setAge(20);

        userdao.deleteUser(user.getId());
        userdao.insertUser(user);
        //userdao.selectUser(user.getId());
        userdao.selectList();
        userdao.updateUser(user);

        session.close();
    }
}
