package com.hangout.Controller;

import jdk.jfr.Enabled;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("HangOut")
@RequiredArgsConstructor

public class MainController {

    @GetMapping("/Main")
    public String Main(RedirectAttributes redirectAttributes) {
        return "HangOut/Main";
    }

    @GetMapping("/NavigationBar")
    public String NavigationBar(RedirectAttributes redirectAttributes) {
        return "HangOut/NavigationBar";
    }
}
