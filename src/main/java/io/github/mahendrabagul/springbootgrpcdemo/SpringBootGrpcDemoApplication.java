package io.github.mahendrabagul.springbootgrpcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGrpcDemoApplication {

    @GetMapping
    public String getMessage() {
        return "Mahendra Bagul";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGrpcDemoApplication.class, args);
    }

}
