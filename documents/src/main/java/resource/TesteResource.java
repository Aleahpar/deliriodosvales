package resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/document/teste")
public class TesteResource {

    @GetMapping
    public void teste() {
        System.out.println("Teste document");
    }
}
