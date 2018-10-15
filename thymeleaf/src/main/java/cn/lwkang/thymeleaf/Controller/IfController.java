package cn.lwkang.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IfController {
    @GetMapping("/ifunless")
    public String ifunless(ModelMap map){
        map.addAttribute("flag","yes");
        return "ifunless";
    }
}
