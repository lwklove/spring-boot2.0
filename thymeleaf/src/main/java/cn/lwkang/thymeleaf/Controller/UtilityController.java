package cn.lwkang.thymeleaf.Controller;

import cn.lwkang.thymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class UtilityController {
    @GetMapping("/utility")
    public String utility(ModelMap map) {
        map.addAttribute("users", getUsers());
        map.addAttribute("name", "kk");
        map.addAttribute("date", new Date());
        map.addAttribute("count",12);
        return "utility";
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("kk", 12, "man"));
        users.add(new User("ll", 15, "woman"));
        return users;
    }
}
