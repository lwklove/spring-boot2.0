package cn.lwkang.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InLineController {
    @GetMapping("/inline")
    public String inner(ModelMap map){
        map.addAttribute("username","kk");
        return "inline";
    }
}
