package sgab.model.service;

import java.util.List;
import sgab.model.dto.util.ObraHelper;
import sgab.model.dto.Obra;
/**
 *
 * @author maffort <maffort@gmail.com>
 */
public class GestaoObras {

    public void cadastrarObra(Obra obra) {

        if (!ObraHelper.validarObra(obra))
            throw new RuntimeException("Os dados da pessoa não são válidos");
        
        // chamar dao de pessoa para persistir dado
            
    }
    
    public void alterarObra(Obra obra){
        
    }
    
    public Obra pesquisarObra(Integer id){
        
        return;
    }
    
    
    public List pesquisarObra(List parameterList){
        
        return list;
    }
}
