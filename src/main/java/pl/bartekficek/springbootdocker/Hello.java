package pl.bartekficek.springbootdocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${envname}")
    private String environmentName;

    @GetMapping("/hello")
    public String hello() {
        return "Hello! " + environmentName;
    }
}
