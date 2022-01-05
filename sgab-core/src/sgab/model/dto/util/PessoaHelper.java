package sgab.model.dto.util;

import sgab.model.dto.Pessoa;

/**
 *
 * @author maffort <maffort@gmail.com>
 */
public class PessoaHelper {
    public static boolean validarPessoa(Pessoa pessoa) {
        
        if (pessoa.getId() < 0) {
            return false;
        }
        
        if (pessoa.getNome().length() <= 1){
            return false;
        }
        
        return true;
    }
}
