package sgab.model.dto.util;


import sgab.model.dto.Obra;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iulli
 */
public class ObraHelper {
    public static boolean validarObra(Obra obra) {
        if (obra.getTitulo().length() <= 1) {
            return false;
        }
        
        if (obra.getEditora().length() <= 1) {
            return false;
        }
        
        if (obra.getCidadeEditora().length() <= 1) {
            return false;
        }
        
        if (obra.getVolume() <= 0) {
            return false;
        }
        
        if (obra.getAutores().lenght() <= 1){//implementar o metodo length em autores
            return false;
        }
        
        return true;
    }
    
    public static boolean validarID(Integer id){
        if (id <= 0) {
            return false;
        }
        return true;
    }
    
    public static boolean validarParameter(List parameterlist){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}