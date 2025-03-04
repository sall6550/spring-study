package study.dockera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DockerAApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerAApplication.class, args);
    }

}
