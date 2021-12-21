package sgab.model.service;

import sgab.model.dto;
import sgab.model.dao.GerenciarBibliotecaDAO;

/**
 *
 * @author Victor Schneider
 */
public class GestaoBiblioteca  {

  public void GestaoBiblioteca(Biblioteca biblioteca){
    
      this.biblioteca = biblioteca;
  }
  
  //metodos interface
  //metodos bibliotecario
  @Override
  public void adicionarBibliotecario(Pessoa bibliotecario){
    
    biblioteca.adicionaBibliotecario(bibliotecario); 
  }
  @Override
  public void removerBibliotecario(String nome){
    
    biblioteca.removeBibliotecarioProNome(nome); 
  }
  @Override
  public Pessoa pesquisarBibliotecario(String nome){
  
    biblioteca.pesquisaBibliotecarioPorNome(nome);
  }
  
  //metodos atendente
  
  @Override
  public void adicionarAtendente(Pessoa atendente){
    
    biblioteca.adicionaAtendente(atendente); 
  }
  @Override
  public void removerAtendente(String nome){
    
    biblioteca.removeAtendenteProNome(nome); 
  }
  @Override
  public Pessoa pesquisarAtendente(String nome){
  
    biblioteca.pesquisaAtendentePorNome(nome);
  }
  
}
