package cn.fiona.controller;

import cn.fiona.domain.User;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/user")
public class UserController {
   //return string
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("Testing String executing");
        //模拟从数据库中查出User对象
        User user = new User();
        user.setUsername("MEIMEI");
        user.setAge(12);
        //model 对象
        model.addAttribute("user1", user);
        return "success";
    }

    //return void
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {

        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
         return;
    }

    //redirect
    @RequestMapping("/redirect")
    public void redirect(HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.sendRedirect(request.getContextPath() + "/index.jsp" );

        return;
    }

    //getWriter
    @RequestMapping("/getWriter")
    public void getWriter(HttpServletRequest request, HttpServletResponse response) throws Exception {
       //中文乱码解决
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
       response.getWriter().println("绝了");
    }

    //Model and View
    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(){
        //1. create Model and view object
        ModelAndView mv = new ModelAndView();
        //模拟从数据库中查出User对象
        User user = new User();
        user.setUsername("FEIFEI");
        user.setAge(22);

        //2.把user对象存到mv对象当中，也会把user对象存入request对象！
        mv.addObject("user2", user);
        //3.跳转到那个页面
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping(value = "/testAjax", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody User testAjax(@RequestBody User user) {
        System.out.println("ajax executing");
        System.out.println(user);

        user.setUsername("haha");
        user.setAge(88);

        return user;

    }

    @RequestMapping(value = "/textInterceptor")
    public String textInterceptor(){

        System.out.println("testing interception");
        return "success";

    }



}













