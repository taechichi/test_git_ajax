package net.datasa.test_ajax_db;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping({"/", "", "home"})
    public String home() {
        log.debug("home method called.");
        return "home";
    }
}
