package sgab.model.service;

/**
 *
 * @author Victor Schneider
 */

import sgab.model.dto.Biblioteca;
import sgab.model.dao.BibliotecaDAO;
import sgab.model.dto.util.BibliotecaHelper;
import java.util.List;

public class GestaoBiblioteca{
    
    BibliotecaDAO bibliotecas = new BibliotecaDAO();
    Biblioteca biblioteca;
    
    public void cadastrarBiblioteca(Biblioteca biblioteca){
        if(BibliotecaHelper.validarBiblioteca(biblioteca)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            bibliotecas.inserir(biblioteca);
        }
    }
    
    public void alterarBiblioteca(Biblioteca biblioteca){
       if(BibliotecaHelper.validarBiblioteca(biblioteca)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            bibliotecas.alterar(biblioteca);
        } 
    }
    
    public Biblioteca pesquisarId(Integer id){
       if(BibliotecaHelper.validarId(biblioteca)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            return bibliotecas.pesquisar(id);
        } 
    }
    
    public List pesquisarNome(String nome){
       if(BibliotecaHelper.validarNome(biblioteca)==false){
            throw new RuntimeException("Dados Inválidos!");
        }
        else{
            return bibliotecas.pesquisar(nome);
        } 
    }
    
}
