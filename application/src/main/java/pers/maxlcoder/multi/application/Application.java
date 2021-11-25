package pers.maxlcoder.multi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.maxlcoder.multi.service.MyService;

@SpringBootApplication(scanBasePackages = "pers.maxlcoder.multi")
@RestController
public class Application {
    private final MyService myService;

    public Application(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home() {
        System.out.println(myService.message());
        return myService.message();
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
