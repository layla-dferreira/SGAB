package sgab.model.service;

import java.util.List;
import sgab.model.dto.util.ObraHelper;
import sgab.model.dto.Obra;
import sgab.model.dao.ObraDAO;
/**
 *
 * @author maffort <maffort@gmail.com>
 */
public class GestaoObras {
    
    ObraDAO pesquisa = new ObraDAO();
    Obra obra;

    public void cadastrarObra(Obra obra) {

        if (ObraHelper.validarObra(obra))
            throw new RuntimeException("Os dados da pessoa não são válidos");
        
                    
    }
    
    public void alterarObra(Obra obra){
        if (ObraHelper.validarObra(obra))
            throw new RuntimeException("Os dados da pessoa não são válidos");
    }
    
    public Obra pesquisarObra(Integer id){
        if (ObraHelper.validarID(id))
            throw new RuntimeException("O ID não é válidos");
        obra = pesquisa.pesquisar(id);
        return obra;
    }
    
    
    public List pesquisarObra(List parameterList){
        ObraHelper.validarParameter(parameterList);
        return list;
    }
}
