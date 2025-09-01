package med.voll.api.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Não é mais classe Java -> Quem vai gerenciar agora é o Spring
@RequestMapping("medicos") //Requisição para "/medicos" ele sabe para onde mandar.
public class MedicoController {
    
    public void cadastrar(){
        
    }
}