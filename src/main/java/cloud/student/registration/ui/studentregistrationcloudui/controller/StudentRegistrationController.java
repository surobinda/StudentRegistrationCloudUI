package cloud.student.registration.ui.studentregistrationcloudui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentRegistrationController {

    @GetMapping("/")
    public String home() {
        System.out.println("Request received at controller: Surobinda");
        return "home";
    }

}
