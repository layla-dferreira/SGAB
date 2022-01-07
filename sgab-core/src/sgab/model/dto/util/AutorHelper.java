package sgab.model.dto.util;

import jdk.jfr.Experimental;
import sgab.model.dto.Autor;

/**
 * @author Marcos Paulo
 * Grupo F
 */

@Experimental
public class AutorHelper {
    boolean validarAutor(Autor autor){
        if (autor.getNome() != null && !autor.getNome().trim().equals("")){
            if (autor.getNacionalidade() != null && !autor.getNacionalidade().trim().equals("")){
                if (autor.getGenero() != null && !autor.getGenero().trim().equals(""))
                    return autor.getNascimento() != null && !autor.getNascimento().trim().equals("");
            }
        }
        return false;
    }
}
