package sgab.model.dto;

/**
 * GRUPO F
 * @author luisf
 */
class Autor extends Pessoa {
    
    private String nacionalidade;   
    private String nascimento;      // (dd/mm/aaaa)
    private String genero;
    
    // Caso seja membro de uma lista, sujeito a alteração
    private Autor prox;             // Aponta para o próximo autor
    
    // Construtor
    public Autor(long id){
        setId(id);
        setNome("");
        this.nacionalidade = "";
        this.nascimento = "";
        this.genero = "";
        this.prox = null;
    }
    
    // Getters e Setters
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }
    public String getNascimento(){
        return nascimento;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }
    // Sujeito a alteração
    public void setProx(Autor proxAutor){
        this.prox = proxAutor;
    }
    public Autor getProx(){
        return prox;
    }
    
    // Retorna os dados do autor
    public String biografia(){
        String resultado = this.getNome() + ", " + nacionalidade + ", " + nascimento + ", " + genero + "."; 
        return resultado;    
    }   
}
