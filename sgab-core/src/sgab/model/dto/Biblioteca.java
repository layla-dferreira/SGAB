package sgab.model.dto;

/**
 * @author Victor Schneider
 */

import java.util.*;
import sgab.model.dto.util.BibliotecaStatus;

public class Biblioteca{

    private String unidadeorg;
    private String nome;
    private Long id;
    private BibliotecaStatus status;

    //construtor
    public void Biblioteca(String unidadeorg, String nome, Long id){
        this.unidadeorg = unidadeorg;
        this.nome = nome;
        this.id = id;
        this.status = BibliotecaStatus.ATIVA;
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

    public void setStatus(BibliotecaStatus status) {
        if(this.status != BibliotecaStatus.SUSPENSA){
           this.status = status; 
        }
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
    public BibliotecaStatus getStatus() {
        return status;
    }
}
