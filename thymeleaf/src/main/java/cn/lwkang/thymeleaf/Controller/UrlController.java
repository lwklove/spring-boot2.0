package cn.lwkang.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UrlController {
    @GetMapping("/url")
    public String url(ModelMap map){
        map.addAttribute("type","link");
        map.addAttribute("pageId","spring-boot");
        map.addAttribute("img","http://www.ityouknow.com/assets/images/neo.jpg");
        return "url";
    }
}
