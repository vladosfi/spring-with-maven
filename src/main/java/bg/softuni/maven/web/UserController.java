package bg.softuni.maven.web;

import bg.softuni.maven.model.userDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String newUser(){
        return  "newuser";
    }

    @PostMapping
    public  String createUser(Model model, userDTO userDTO){
        System.out.println("Creating new user: " + userDTO);
        model.addAttribute("lname", userDTO.getLname());
        return "usercreated";
    }
}
