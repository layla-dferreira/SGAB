
package sgab.model.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sgab.model.dto.Obra;

public class ObraDAO implements GenericDAO<Obra, Integer>{
    private Map<Integer, Obra> obras = new HashMap<>();

    
    @Override
    public void inserir(Obra entidade) {
        obras.put(entidade.getId(), entidade);
    }
    
    

    @Override
    public void alterar(Obra entidade) {
    }

    @Override
    public Obra pesquisar(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List pesquisar(List parameterList) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
     
}
