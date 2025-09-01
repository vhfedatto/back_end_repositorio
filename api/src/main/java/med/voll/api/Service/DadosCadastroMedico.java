package med.voll.api.Service;

import med.voll.api.Model.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade) {
    
}
