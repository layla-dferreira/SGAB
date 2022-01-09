package sgab.model.dto.util;

import sgab.model.dto.Obra;

public class ObraHelper {
    public void validarObra(Obra obra) throws Exception{
        if (obra.getCategoria().length() <=1){
            throw new RuntimeException("Categoria inválida");
        }
        
        if (obra.getTitulo().length() <= 1) {
            throw new Exception("Título inválido.");
        }
        
        if (obra.getEditora().length() <= 1) {
            throw new Exception("Editora inválida.");
        }
        
        if (obra.getCidadeEditora().length() <= 1) {
            throw new Exception("Cidade da editora inválida.");
        }
        
        if (obra.getVolume() <= 0) {
            throw new Exception("Volume inválido.");
        }
        
        if (obra.getEditora().length() <= 1) {
            throw new Exception("Editora inválida.");
        }
        
        /*if (obra.getAutores().lenght() <= 1){//implementar o metodo length em autores
            return false;
        }*/
    }
    
}