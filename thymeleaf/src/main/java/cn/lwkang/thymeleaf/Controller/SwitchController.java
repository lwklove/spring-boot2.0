package cn.lwkang.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwitchController {
    @GetMapping("/switch")
    public String switchCase(ModelMap map){
        map.addAttribute("gender","mm");
        return "switch";
    }
}
