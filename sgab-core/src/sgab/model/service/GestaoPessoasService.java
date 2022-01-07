package sgab.model.service;

import java.util.ArrayList;

import sgab.model.dao.GestaoPessoasDAO;
import sgab.model.dto.Pessoa;
import sgab.model.dto.util.PessoaHelper;

public class GestaoPessoasService implements GestaoPessoasDAO{
    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Long cpf, String nome, String email, String senha) {
        Pessoa novaPessoa = new Pessoa(cpf,nome,email,senha);

        switch(PessoaHelper.validarPessoa(novaPessoa, pessoas)){
            case 0:
                break;
            case -1:
                throw new RuntimeException("O email da pessoa não é válido.");
            case -2:
                throw new RuntimeException("A senha da pessoa precisa ter 8 caracteres, pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial.");
            case -3:
                throw new RuntimeException("O CPF inserido já foi cadastrado.");
            case -4:
                throw new RuntimeException("O nome da pessoa não é válido.");
        }

        pessoas.add(novaPessoa);
    }

    public Pessoa pesquisar(Long cpf){
        for(Pessoa p : pessoas) {
            if(cpf == p.getCpf() && p.getHabilitado()) {
                return p;
            }
        }

        return null;
    }

    public void excluir(Long cpf){
        Pessoa p = pesquisar(cpf);
        
        if(p == null){
            throw new RuntimeException("Esse cpf não está cadastrado.");
        }

        p.setHabilitado(false);
    }

    public void alterar(Long cpf, String nome, String email, String senha){
        Pessoa p = pesquisar(cpf);

        if(p == null){
            throw new RuntimeException("Esse cpf não está cadastrado.");
        }

        if(PessoaHelper.validarNome(nome) && PessoaHelper.validarEmail(email) && PessoaHelper.validarSenha(senha)){
            p.setNome(nome);
            p.setEmail(email);
            p.setSenha(senha);
        } else {
            throw new RuntimeException("A alteração não é válida. Insira novos dados válidos.");
        }
        
    }
}
