package med.voll.api.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.Service.DadosCadastroMedico;

@RestController //Não é mais classe Java -> Quem vai gerenciar agora é o Spring
@RequestMapping("medicos") //Requisição para "/medicos" ele sabe para onde mandar.
public class MedicoController {
    
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        
    }
}