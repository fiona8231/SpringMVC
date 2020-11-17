package cn.fiona.controller;

import cn.fiona.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String textParam(String username, String password){
        System.out.println("Executing");

        System.out.println(username);
        System.out.println(password);
        return "success";
    }


    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("Executing");
        System.out.println(account);
        return "success";
    }
    //原生API

    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request){
        System.out.println("Executing..");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        return "success";
    }
}
