package zhang.controller;

import zhang.service.UserServicecImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url=req.getRequestURL().toString();
        int index=url.lastIndexOf("/");
        String target=url.substring(index+1);
        if("load".equals(target)){
            new UserServicecImp().load(req,resp);
        }else{
            resp.sendRedirect("../jsp/load.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
