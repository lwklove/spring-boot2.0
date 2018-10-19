package cn.lwkang.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ObjectController {
    @GetMapping("/object")
    public String object(HttpServletRequest request){
        request.setAttribute("request","i am request!");
        request.getSession().setAttribute("session" , "i am sesion");
        return "object";
    }
}
