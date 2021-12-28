package sgab.model.dto;

/**
 * @author Victor Schneider
 */

import java.util.*;

public class Biblioteca<E>{

    private E unidadeorg;
    private String nome;
    private E id;
    private E acervo;
    
    ArrayList<Pessoa> Atendentes = new ArrayList<>();
    ArrayList<Pessoa> Bibliotecarios = new ArrayList<>();

    
    //construtor
    public void Biblioteca(E unidadeorg, String nome, E id, E acervo, Pessoa atendente, Pessoa bibliotecario){
        
        this.unidadeorg = unidadeorg;
        this.nome = nome;
        this.id = id;
        this.acervo = acervo;
        this.Atendentes.add(atendente);
        this.Bibliotecarios.add(bibliotecario);
    }
    
    //setters
    public void setUnidadeOrg(E unidadeorg){
    
        this.unidadeorg = unidadeorg;
    }
    public void setNome(String Nome){
    
        this.nome = nome;
    }
    public void setId(E id){
    
        this.id = id;
    }
    public void setAcervo(E acervo){
    
        this.acervo = acervo;
    }
    
    //getters
    public E getUnidadeOrg(){
        return unidadeorg;
    }
    public String getNome(){
        return nome;
    }
    public E getId(){
        return id;
    }
    public E getAcervo(){
        return acervo;
    } 
    public ArrayList getAtendente(){
        return Atendentes;
    }
    public ArrayList getBibliotecario(){
        return Bibliotecarios;
    }
}
