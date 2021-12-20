package sgab.model.dto;

/**
 *
 * @author Victor Schneider
 */
public class Biblioteca<E> implements BibliotecaDAO{

    private E unidadeorg;
    private String nome;
    private E id;
    private E acervo;
    private E[] atendentes;
    private E[] bibliotecarios;
    
    private boolean reservado;
    
    //construtor
    public void Biblioteca(E unidadeorg, String nome, E id, E acervo, E[] atendentes, E[] bibliotecarios){
        
        this.unidadeorg = unidadeorg;
        this.nome = nome;
        this.id = id;
        this.acervo = acervo;
        this.atendentes = atendentes;
        this.bibliotecarios = bibliotecarios;
    }
    
    //setters
    @Override
    public void setUnidadeOrg(E unidadeorg){
    
        this.unidadeorg = unidadeorg;
    }
    @Override
    public void setNome(String Nome){
    
        this.nome = nome;
    }
    @Override
    public void setId(E id){
    
        this.id = id;
    }
    @Override
    public void setAcervo(E acervo){
    
        this.acervo = acervo;
    }
    @Override
    public void setAtendentes(E atendentes){
    
        this.atendentes = atendentes;
    }
    @Override
    public void setBibliotecarios(E bibliotecarios){
    
        this.bibliotecarios = bibliotecarios;
    }
    
    //getters
    
    @Override
    public E getUnidadeOrg(){
    
        return unidadeorg;
    }
    @Override
    public String getNome(){
    
        return nome;
    }
    @Override
    public E id(){
    
        return id;
    }
    @Override
    public E getAcervo(){
    
        return acervo;
    }
    @Override
    public E getAtendentes(){
    
        return atendentes;
    }
    @Override
    public E getBibliotecarios(){
    
        return bibliotecarios;
    }
}
