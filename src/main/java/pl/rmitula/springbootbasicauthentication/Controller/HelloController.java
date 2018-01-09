package pl.rmitula.springbootbasicauthentication.Controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/public")
    public String HelloPublic() {

        return "Hello Public!";
    }

    @Secured("ROLE_USER")
    @GetMapping("/private")
    public String HelloPrivate() {

        return "Hello Private!";
    }
}
