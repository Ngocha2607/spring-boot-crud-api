package management_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getListUsers() {
        return "<html><body><font color=\"green\">"
                + "<h1>WELCOME To GeeksForGeeks</h1>"
                + "</font></body></html>";
    }

}
