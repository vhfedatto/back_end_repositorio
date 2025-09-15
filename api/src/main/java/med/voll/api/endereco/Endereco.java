package med.voll.api.endereco;

import med.voll.api.Service.DadosEndereco;

@SuppressWarnings("unused")
public class Endereco {
        public Endereco(DadosEndereco dados) {
                this.logradouro = dados.logradouro();
                this.bairro = dados.bairro();
                this.cep = dados.cep();
                this.uf = dados.uf();
                this.cidade = dados.cidade();
                this.numero = dados.numero();
                this.complemento = dados.complemento();
    }
        private String logradouro;
        private String bairro;
        private String cep;
        private String numero;
        private String complemento;
        private String cidade;
        private String uf;
}