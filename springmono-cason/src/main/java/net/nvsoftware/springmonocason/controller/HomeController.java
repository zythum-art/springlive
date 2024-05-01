package net.nvsoftware.springmonocason.controller;
import net.nvsoftware.springmonocason.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "NVSoftware Home";
    }
    @RequestMapping("/user", method = RequestMethod.POST)
    public User user() {
        User user = new User();
        user.setId("3100");
        user.setName("NVSoftware");
        user.setEmail("info@nvsoftware.com");
        return user;
    }
}
