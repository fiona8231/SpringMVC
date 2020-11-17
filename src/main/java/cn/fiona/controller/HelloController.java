package cn.fiona.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping( value = "/hello", method={RequestMethod.GET} )
    public String sayHello(){
        System.out.println("hello mvc");
        return "success";
    }
}
