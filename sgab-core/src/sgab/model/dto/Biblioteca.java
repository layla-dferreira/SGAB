package sgab.model.dto;

/**
 * @author Victor Schneider
 */

import java.util.*;

public class Biblioteca<Integer>{

    private String unidadeorg;
    private String nome;
    private Integer id;

    //construtor
    public void Biblioteca(String unidadeorg, String nome, Integer id){
        
        this.unidadeorg = unidadeorg;
        this.nome = nome;
        this.id = id;
    }
    
    //setters
    public void setUnidadeOrg(String unidadeorg){
    
        this.unidadeorg = unidadeorg;
    }
    public void setNome(String Nome){
    
        this.nome = nome;
    }
    public void setId(Integer id){
    
        this.id = id;
    }
    
    //getters
    public String getUnidadeOrg(){
        return unidadeorg;
    }
    public String getNome(){
        return nome;
    }
    public Integer getId(){
        return id;
    }
}
