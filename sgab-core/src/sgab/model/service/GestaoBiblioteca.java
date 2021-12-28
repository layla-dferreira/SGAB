package sgab.model.service;

/**
 *
 * @author Victor Schneider
 */

import sgab.model.dto.Biblioteca;

public class GestaoBiblioteca<E>{

    Biblioteca biblioteca = new Biblioteca();
    
  public void GestaoBiblioteca(Biblioteca biblioteca){
    
      this.biblioteca = biblioteca;
  }

  public void mudarId(E id){
      this.biblioteca.setId(id);
  }
  public void mudarOrganizacao(E org){
      this.biblioteca.setUnidadeOrg(org);
  }
  public void mudarNome(String nome){
    this.biblioteca.setNome(nome);
  }
  
  public void mudarAcervo(E acervo){
    this.biblioteca.setAcervo(acervo);
  }
  
  public E pegarId (){
    return (E) this.biblioteca.getId();
  }
  
  public E pegarOrganizacao (){
      return (E)this.biblioteca.getUnidadeOrg();
  }
  
  public String pegarNome (){
      return this.biblioteca.getNome();
  }
  
  public E pegarAcervo (){
      return (E) this.biblioteca.getAcervo();
  }
  
}
