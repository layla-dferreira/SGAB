package sgab.model.service;

import sgab.model.dao.PessoasDAO;
import sgab.model.dto.Pessoa;
import sgab.model.dto.util.PessoaHelper;

public class GestaoPessoasService {
    PessoasDAO pessoas = new PessoasDAO();
    Pessoa pessoa;

    public void cadastrarPessoa(Pessoa pessoa) {
        switch(PessoaHelper.validarPessoa(pessoa, pessoas)){
            case 0:
                pessoas.inserir(pessoa);
                break;
            case -1:
                throw new RuntimeException("O email da pessoa não é válido.");
            case -2:
                throw new RuntimeException("A senha da pessoa precisa ter 8 caracteres, pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial.");
            case -3:
                throw new RuntimeException("O CPF inserido já foi cadastrado.");
            case -4:
                throw new RuntimeException("O nome da pessoa não é válido.");
            case -5:
                throw new RuntimeException("O CPF inserido não é válido");
        }
    }

    public Pessoa pesquisarCpf(Long cpf){
        if(!PessoaHelper.validarCpf(cpf)){
            throw new RuntimeException("Cpf Inválido!");
        } else {
            return pessoas.pesquisar(cpf);
        }
    }

    public Pessoa pesquisarNome(String nome){
        if(!PessoaHelper.validarNome(nome)){
            throw new RuntimeException("Nome Inválido!");
        } else {
            return pessoas.pesquisar(nome);
        }
    }

    public void excluir(Long cpf){
        if(!PessoaHelper.validarCpf(cpf)){
            throw new RuntimeException("Cpf Inválido!");
        } else {
            pessoas.delete(cpf);
        }
    }

    public void alterar(Pessoa pessoa){
        if(!PessoaHelper.validarNome(pessoa.getNome()) && !PessoaHelper.validarEmail(pessoa.getEmail()) && !PessoaHelper.validarSenha(pessoa.getSenha())){
            throw new RuntimeException("Dados Inválidos!");
        } else {
            pessoas.alterar(pessoa);
        }
    }
}
