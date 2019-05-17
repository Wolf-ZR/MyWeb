package zhang.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface UserService {
    //登录业务处理
    void load(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
