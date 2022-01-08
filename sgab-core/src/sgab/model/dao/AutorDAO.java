package sgab.model.dao;

import sgab.model.dto.Autor;
import java.util.ArrayList;
import java.util.List;

/**
* GRUPO F
* @author Marcos Paulo
*/

public class AutorDAO implements GenericDAO<Autor, Integer>{
    ArrayList<Autor> mock = new ArrayList<Autor>();
    
    public void inserir(Autor autor){
        this.mock.add(autor);
    }

    public void alterar(Autor autor) throws RuntimeException{
        boolean encontrado = false;
        for(int i = 0; i < this.mock.size(); i++){
            if(this.mock.get(i).getId() == autor.getId()){
                encontrado = true;
                this.mock.set(i, autor);
            }
        }
        if(!encontrado){
            throw new RuntimeException("Autor não encontrado");
        }
        
    }

    public Autor pesquisar(Integer key){
        for(Autor a : mock){
            if(a.getId() == key){
                return a;
            }
        }
        return null;
    }

    public Autor pesquisar(String nome){
        for(Autor autor : mock){
            if(autor.getNome().equals(nome)){
                return autor;
            }
        }
        return null;
    }
    
    public List<Autor> pesquisar(List<BasicPair<Integer, Autor>> parameterList){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
