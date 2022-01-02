package sgab.model.service;

import sgab.model.dto.Pessoa;
import sgab.model.dto.util.PessoaHelper;
import sgab.model.dto.Obra;
/**
 *
 * @author maffort <maffort@gmail.com>
 */
public class GestaoPessoas {

    void cadastrarPessoa(Pessoa pessoa) {

        if (!PessoaHelper.validarPessoa(pessoa))
            throw new RuntimeException("Os dados da pessoa não são válidos");
        
        // chamar dao de pessoa para persistir dado
            
    }
    
    void alterarObra(Obra obra){
        
    }
    
    void pesquisarObra(Obra obra){
        
    }
    
}
