import dao.UserDao;
import model.User;
import org.junit.Test;

public class UserTest {
    private UserDao userDao=new UserDao();
    @Test
    public void addUserTest(){
        User user=new User("ruirui","789987","贵州",
                "17730663668","17730663998@163.com");
        userDao.addUser(user);
    }
    @Test
    public void selectUserTest(){
        User user=userDao.selectUserByName("张瑞");
        System.out.println(user);
    }
    @Test
    public void selectUserByIdTest(){
        User user=userDao.selectUserById(1);
        System.out.println(user);
    }
}
