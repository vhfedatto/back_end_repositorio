package med.voll.api.medico;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import med.voll.api.Service.Especialidade;
import med.voll.api.endereco.Endereco;

@Table(name= "medicos")
@Entity(name = "Medico")
@SuppressWarnings("unused") //Remover isso aqui depois - foi adicionado por mim.
public class Medico {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private String email;
        private String crm;

        @Enumerated(EnumType.STRING)
        private Especialidade especialidade;

        @Embedded
        private Endereco endereco;
 }
