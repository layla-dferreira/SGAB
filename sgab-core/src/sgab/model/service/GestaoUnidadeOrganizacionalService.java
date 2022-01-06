package sgab.model.service;

import sgab.model.dao.UnidadeOrganizacionalDAO;
import sgab.model.dto.UnidadeOrganizacional;
import sgab.model.dto.util.UnidadeOrganizacionalHelper;

public class GestaoUnidadeOrganizacionalService {
    
    UnidadeOrganizacionalDAO uOrgDAO;
    
    public GestaoUnidadeOrganizacionalService () {
        this.uOrgDAO = UnidadeOrganizacionalDAO.getInstance();
    }
    
    public void cadastrar(UnidadeOrganizacional uOrg) {
        if (!UnidadeOrganizacionalHelper.validadarUOrg(uOrg))
            throw new RuntimeException("Unidade organizacional inválida!");
        
        uOrgDAO.inserir(uOrg);        
    }
    
    // altarar
    
    // consultar
    
}
