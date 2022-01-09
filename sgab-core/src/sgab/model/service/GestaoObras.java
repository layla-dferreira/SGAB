package sgab.model.service;

import java.util.LinkedList;
import sgab.model.dto.util.ObraHelper;
import sgab.model.dto.Obra;
import sgab.model.dao.ObraDAO;

public class GestaoObras {
    
    private ObraHelper helper = new ObraHelper();
    private ObraDAO dao = new ObraDAO();
    private Obra obra;
    private static int idsObra = 0;
    

    public void cadastrarObra(Obra obra) throws Exception{
        
        helper.validarObra(obra);
        
        obra.setId(idsObra);
        idsObra++;
        dao.inserir(obra);
    }
    
    public void alterarObra(Obra obra) throws Exception{
        helper.validarObra(obra);
        
        dao.alterar(obra);
    }
    
    public Obra pesquisarObra(Integer id) throws Exception{
        if(id<0){
            throw new Exception("Id inválido");
        } 
        
        obra = dao.pesquisar(id);
        if(obra==null){
            throw new Exception("Obra não encontrada");
        }
        
        return obra;
    }
    
    public LinkedList<Obra> pesquisarObra(String nome) throws Exception{
        if(nome.length()<=1){
            throw new Exception("O nome não é válido");
        }
        
        LinkedList<Obra> resultados = dao.pesquisar(nome);
        if(resultados.isEmpty()){
            throw new Exception("Nenhuma obra econtrada");
        }
        
        return resultados;
    }
    
    
    /*public List pesquisarObra(List parameterList){
        ObraHelper.validarParameter(parameterList);
        return list;
    }*/
}
