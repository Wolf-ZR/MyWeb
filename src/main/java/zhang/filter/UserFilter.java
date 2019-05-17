package zhang.filter;

import dao.UserDao;
import model.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        request.setCharacterEncoding("utf-8");
        String url=request.getRequestURL().toString();
        int index=url.lastIndexOf("/");
        String target=url.substring(index+1);
        String username=request.getParameter("username");
        if(target.equals("load")){
            User user= new UserDao().selectUserByName(username);
            if(user!=null){
                request.setAttribute("user",user);
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                request.getRequestDispatcher("../jsp/load.jsp").forward(servletRequest,servletResponse);
            }
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
