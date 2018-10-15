package cn.lwkang.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
    @GetMapping("/string")
    public String string(ModelMap map){
        map.addAttribute("username","ityouknow");
        return "string";
    }
}
