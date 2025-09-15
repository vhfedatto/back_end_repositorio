package med.voll.api.medico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import med.voll.api.Controller.Medico;
import med.voll.api.Controller.MedicoRepository;
import med.voll.api.Service.DadosCadastroMedico;

public class MedicoController {
    @Autowired
    private MedicoRepository repository;
    
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
}
