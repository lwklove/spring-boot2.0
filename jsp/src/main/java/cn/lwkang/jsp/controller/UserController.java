package cn.lwkang.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/user")
    public String user(Map<String, Object> model, HttpServletRequest request) {
        model.put("username","kk");
        model.put("salary",666);
        request.getSession().setAttribute("count",3);
        return "user";
    }
}
