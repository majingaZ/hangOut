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

    @GetMapping("/NavigationBar")
    public String Main(RedirectAttributes redirectAttributes) {
        return "HangOut/NavigationBar";
    }
}
