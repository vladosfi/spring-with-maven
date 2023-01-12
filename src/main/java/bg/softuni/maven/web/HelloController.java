package bg.softuni.maven.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class HelloController {

    @GetMapping("/hello-with-path-var/{id}/test")
    public String hello(Model model, @PathVariable("id") Integer id, @RequestParam("name") Optional<String> name){
        model.addAttribute("num", id);
        return "hello";
    }

    @GetMapping("/hello")
    public String hello(Model model ){
        model.addAttribute("num", 3);
        return "hello";
    }

    @GetMapping("/hello-with-param")
    public String hello(Model model, @RequestParam("num") Integer num ){
        model.addAttribute("num", num);
        return "hello";
    }
}
