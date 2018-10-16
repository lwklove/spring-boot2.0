package cn.lwkang.thymeleaf.Controller;

import cn.lwkang.thymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListController {
    @GetMapping("/list")
    public String getUserList(ModelMap map){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("xiao ming",12,"男"));
        users.add(new User("xiao gang",12,"男"));
        users.add(new User("xiao hong",12,"女"));
        map.addAttribute("users",users);
        return "list";
    }
}
