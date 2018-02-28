package com.sallylee.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/helloworld")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "helloworld";
    }

    @RequestMapping("/welcome")
    public String home(@RequestParam(value="message", required=false, defaultValue="I'm sleepy") String message, Model model) {
        model.addAttribute("message", message);
        return "welcome";
    }

}