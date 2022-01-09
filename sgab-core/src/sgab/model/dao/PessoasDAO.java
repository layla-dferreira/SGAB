package sgab.model.dao;

import sgab.model.dto.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class PessoasDAO implements GenericDeleteDAO<Pessoa, Long>{
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    @Override
    public void inserir(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    
    @Override
    public void alterar(Pessoa pessoa) throws RuntimeException{
        boolean encontrado = false;
        for(int i = 0; i < this.pessoas.size(); i++){
            if(this.pessoas.get(i).getCpf() == pessoa.getCpf()){
                encontrado = true;
                this.pessoas.set(i, pessoa);
            }
        }
        if(!encontrado){
            throw new RuntimeException("Pessoa não encontrada");
        }
    }

    @Override
    public Pessoa pesquisar(Long cpf) {
        for(Pessoa p : pessoas) {
            if(cpf == p.getCpf() && p.getHabilitado()) {
                return p;
            }
        }

        return null;
    }

    public Pessoa pesquisar(String nome) {
        for(Pessoa p : pessoas) {
            if(nome == p.getNome() && p.getHabilitado()) {
                return p;
            }
        }

        return null;
    }

    @Override
    public List<Pessoa> pesquisar(List<BasicPair<Long, Pessoa>> parameterList) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


    @Override
    public void delete(Long cpf) throws RuntimeException{
        Pessoa p = pesquisar(cpf);
        
        if(p == null){
            throw new RuntimeException("Esse cpf não está cadastrado.");
        }

        p.setHabilitado(false);
    }
    
}