package service;

/**
 * @param
 * @return Author
 * Description
 * @Date
 **/
import entily.User;
import utils.Md5Util;
import java.util.Arrays;
import java.util.List;

public class UserService {
    private List<User> userList;

    /**
     * @return List<User>
     * @Description
     */
    public List<User> init() {
        User[] users = {
                new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "松山湖", "User.jpg"),
                new User(2, "bbb@qq.com", "698d51a19d8a121ce581499d7b701668", "羊山北路", "User.jpg"),
                new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "大学城", "User.jpg")

        };
        userList = Arrays.asList(users);
        return userList;
    }

    /**
     * @return com.login.entity.User
     * @Desciption 用户登录，成功返回用户对象，失败返回null
     */
    public User userLogin(String account, String password) {
        for (User user : userList) {
            if (user.getAccount().equals(account) && user.getPassword().equals(Md5Util.crypt(password))) {
                return user;
            }
        }
        return null;
    }
}