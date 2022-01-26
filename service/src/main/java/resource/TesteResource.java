package resource;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/teste")
@RequiredArgsConstructor
public class TesteResource {

    @GetMapping
    public void teste() {
        System.out.println("Teste service");
    }
}
