package zhang.service;


import dao.UserDao;
import model.User;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class UserServicecImp implements UserService{
    @Override
    public void load(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String pass=req.getParameter("pwd");
        HttpSession session=req.getSession();
        User user=(User) req.getAttribute("user");
        if(user!=null&&user.getUname().equals("root")&&pass.equals(user.getUpassword())){
            List<User> list=new UserDao().selectAllUser();
            session.setAttribute("userList",list);
            req.getRequestDispatcher("../jsp/allUser.jsp").forward(req,resp);
        }else if(user!=null&&pass.equals(user.getUpassword())){
            session.setAttribute("username",username);
            session.setAttribute("user",user);
            req.getRequestDispatcher("../jsp/success.jsp").forward(req,resp);
        }
        else{
            session.setAttribute("error","请重新登录...");
            resp.sendRedirect("../jsp/load.jsp");
        }
    }
}
