package cn.lwkang.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EqController {
    @GetMapping("eq")
    public String eq(ModelMap map){
        map.addAttribute("name","kk");
        map.addAttribute("age",12);
        map.addAttribute("flag","yes");
        return "eq";
    }
}
