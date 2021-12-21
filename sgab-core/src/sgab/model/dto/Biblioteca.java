package sgab.model.dto;

/**
 * @author Victor Schneider
 */

public class Biblioteca<E> implements BibliotecaDAO{

    private E unidadeorg;
    private String nome;
    private E id;
    private E acervo;
    
    ArrayList<Pessoa> Atendentes = new ArrayList<>();
    ArrayList<Pessoa> Bibliotecarios = new ArrayList<>();

    
    //construtor
    public void Biblioteca(E unidadeorg, String nome, E id, E acervo, E atendente, E bibliotecario){
        
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
    public E id(){
    
        return id;
    }
    public E getAcervo(){
    
        return acervo;
    } 
    public E getAtendente(){
    
        return Atendentes;
    }
    public E getBibliotecario(){
    
        return Bibliotecarios;
    }
    
    //metodos da interface
    //metodos com bibliotecario
    @Override
    public void adicionaBibliotecario(Pessoa bibliotecario){
    
        this.Bibliotecarios.add(bibliotecario);
    }
    
    @Override
    public void removeBibliotecarioPorNome(String nome){
        
         for each(bibliotecario : Bibliotecarios){
             
             if(bibliotecario.nome == nome){
                 
                 Bibliotecarios.remove(bibliotecario);
             }
         }
    }
    
    @Override 
    public Pessoa pesquisaBibliotecarioPorNome(String nome){
    
        for each(bibliotecario : Bibliotecarios){
             
             if(bibliotecario.nome == nome)  
                 return bibliotecario;
             else 
                 return null;
        }
    }
    
    //metodos com atendente
    
    @Override
    public void adicionaAtendente(Pessoa atendente){
    
        this.Atendentes.add(atendente);
    }
    
    @Override
    public void removeAtendentePorNome(String nome){
        
        for each(atendente : Atendentes){
             
             if(atendente.nome == nome){
                 
                 Atendentes.remove(atendente);
             }
         }
    }
    
    @Override
    public Pessoa pesquisaAtendentePorNome(String nome){
        
         for each(atendente : Atendentes){
             
             if(atendente.nome == nome)  
                 return atendente;
             else 
                 return null;
        }
    }
    
}
