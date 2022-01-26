package service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "document", url = "http://localhost:8081/document/teste")
public interface DocumentClient {

    @GetMapping
    void teste();

}
