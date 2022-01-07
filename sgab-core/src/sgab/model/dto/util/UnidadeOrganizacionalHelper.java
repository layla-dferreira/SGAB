package sgab.model.dto.util;

import sgab.model.dto.UnidadeOrganizacional;

public class UnidadeOrganizacionalHelper {
    
    private static Long idCount;
    {
        UnidadeOrganizacionalHelper.idCount = Long.valueOf(0L);
    }

    public static Long getNextId() {
        return UnidadeOrganizacionalHelper.idCount++;
    }

    public static boolean validadarUOrg(UnidadeOrganizacional uorg) {
        
        
        return true;
    }
    
}
