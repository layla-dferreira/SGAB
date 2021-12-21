package sgab.model.dao;

import sgab.model.dto.Pessoa;

public interface GestaoPessoasDAO{
    void cadastrarPessoa(Long cpf, String nome, String email, String senha);
    Pessoa pesquisar(Long cpf);
    void excluir(Long cpf);
    void alterar(Long cpf, String nome, String email, String senha);
}