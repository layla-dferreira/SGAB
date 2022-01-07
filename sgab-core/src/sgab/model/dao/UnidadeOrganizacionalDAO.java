package sgab.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sgab.model.dto.UnidadeOrganizacional;

public class UnidadeOrganizacionalDAO implements GenericDAO<UnidadeOrganizacional, Long>  {
    
    private Map<Long, UnidadeOrganizacional> table = new HashMap<>();
    private static UnidadeOrganizacionalDAO dao = null;
 
    private UnidadeOrganizacionalDAO() { }
    
    public static UnidadeOrganizacionalDAO getInstance() {
        if (dao == null)
           dao = new UnidadeOrganizacionalDAO();
        
        return dao;
    }
    
    @Override
    public void inserir(UnidadeOrganizacional entidade) {
        table.put(entidade.getId(), entidade);
    }

    @Override
    public void alterar(UnidadeOrganizacional entidade) {
        table.remove(entidade.getId());
        inserir(entidade);
    }

    @Override
    public UnidadeOrganizacional pesquisar(Long key) {
        
        return table.get(key);
    }

    @Override
    public List<UnidadeOrganizacional> pesquisar(List<BasicPair<Long, UnidadeOrganizacional>> parameterList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
