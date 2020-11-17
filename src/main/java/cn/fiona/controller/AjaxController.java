package cn.fiona.controller;


import cn.fiona.domain.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/ajax")
public class AjaxController {

    public AjaxController() throws ParseException {
    }

    @RequestMapping("/a1")
    public void ajax(String name, HttpServletResponse r) throws IOException {
        if(name.equals("ad")){
         r.getWriter().print("ture");
        }else{
            r.getWriter().print("false");
        }

    }

    String sDate1="31/12/1998";
    Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);



    @RequestMapping(value = "/a2", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<User> ajax2(){
        List<User> list = new ArrayList<>();
        User u1 = new User("xiaomao", 12, date1);
        User u2 = new User("xiaohong", 33, date1);
        User u3 = new User("xiaoyue", 40, date1);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }

    @RequestMapping("/a3")
    @ResponseBody
    public String ajax3(String name, String pwd){
        String msg = "";

        if(name != null) {
            if (name.equals("adm")) {
                msg = "ok";
            } else {
                msg = "User name is Wrong";
            }
        }

        if(pwd != null) {
            if (pwd.equals("12")) {
                msg = "ok";
            } else {
                msg = "Pwd is inCorrect";
            }
        }
        return msg;
    }

}


