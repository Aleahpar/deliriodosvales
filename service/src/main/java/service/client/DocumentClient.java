package service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "documents", url = "http://localhost:8082/document/teste")
public interface DocumentClient {

    @GetMapping
    void teste();

}
