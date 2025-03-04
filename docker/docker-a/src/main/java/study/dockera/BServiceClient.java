package study.dockera;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "docker-b", url = "${docker.b.url}")
public interface BServiceClient {
    @GetMapping("/hello")
    public String getHello();
}