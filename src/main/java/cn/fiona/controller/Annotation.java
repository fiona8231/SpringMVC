package cn.fiona.controller;


import cn.fiona.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) //把msg="miaomiao"存入到session域中
public class Annotation {

    @RequestMapping("testRequestParam")
    public String testRequestParam( @RequestParam("name") String username){
        System.out.println(username);
        return "success";

    }
    //@PathVariable
    @RequestMapping("/testPathVariable/{myid}")
    public String testPathVariable( @PathVariable(name ="myid") String id){
        System.out.println(id);
        return "success";

    }


    @RequestMapping("/testModelAtrribute")
    public String testModelAtrribute(User u){
        System.out.println("testNoModelAtrribute executing");
        System.out.println(u);
        return "success";
    }

    //ModelAttribute-> 有返回值
//    @ModelAttribute
//    public User showUser(String username){
//        System.out.println("showUser执行了。。。");
//        // 通过用户查询数据库（模拟）
//        User u = new User();
//        u.setUsername(username);
//        u.setAge(20);
//        u.setBirthday(new Date());
//        return u;
//    }
    @RequestMapping("/testModelAttributeMapParam")
    public String testModelAttributeMap(@ModelAttribute("ddd") User user){
        System.out.println("testModelAttributeMapParam controller executing...");
        System.out.println(user);
        return "success";
    }

    //ModelAttribute-> 没有返回值
    @ModelAttribute
    public void showUser(String username, Map<String, User> map){
        System.out.println("MapParam model attribute executing...");
        User u = new User();
        u.setUsername(username);
        u.setAge(20);
        u.setBirthday(new Date());
        map.put("ddd", u);
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        //底层会存储到request的域对象中
        model.addAttribute("msg","妙妙");
        return "success";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(Model model){
       String msg = (String) model.getAttribute("msg");
        System.out.println(msg);
        return "success";
    }

    @RequestMapping("/deleteSessionAttributes")
    public String deleteSessionAttributes(SessionStatus status){
        System.out.println("delete session...");
        status.setComplete();
        return "success";
    }

}
