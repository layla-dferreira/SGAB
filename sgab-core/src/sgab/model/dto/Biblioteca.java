package sgab.model.dto;

/**
 * @author Victor Schneider
 */

import java.util.*;

public class Biblioteca{

    private String unidadeorg;
    private String nome;
    private Long id;

    //construtor
    public void Biblioteca(String unidadeorg, String nome, Long id){
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
    public void setId(Long id){
    
        this.id = id;
    }
    
    //getters
    public String getUnidadeOrg(){
        return unidadeorg;
    }
    public String getNome(){
        return nome;
    }
    public long getId(){
        return id;
    }
}
