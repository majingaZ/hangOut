package com.hangout.Controller;

import com.hangout.DTO.PageRequestDTO;
import jdk.jfr.Enabled;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @GetMapping({"/Review"})
    public void Reviewlist(PageRequestDTO pageRequestDTO, Model model) {

        // model.addAttribute("result", service.getList(pageRequestDTO));
    }
}
