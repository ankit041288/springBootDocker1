package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World - re jar again";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*

    docker login --username ankit041288 --password Getgoing01
    docker tag gs-spring-boot-docker ankit041288/springBoot
    docker run -p 8080:8080 -t ankit041288/springboot
    mvn package docker:build -DpushImage
    docker ps
    docker stop /ImageName
    docker Images

     */

}
