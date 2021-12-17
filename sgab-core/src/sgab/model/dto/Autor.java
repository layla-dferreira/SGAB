package sgab.model.dto;

import sgab.model.dao.AutorDAO;

/**
 * GRUPO F
 * @author luisf
 * @implNote Marcos Paulo: Tive que alterar algumas coisas na classe, como o construtor e a variavel prox.
 * O motivo dessas alterações se da pelo fato de não termos um banco de dados em uso no momento, então se
 * torna impraticavel a utilização do parametro ID implemtado na classe Pessoa. A variavel prox foi removida
 * pelo fato de não estar sendo usada uma lista encadeada, mas sim um ArrayList.
 */
public class Autor extends Pessoa implements AutorDAO {
    
    private String nacionalidade;   
    private String nascimento;      // (dd/mm/aaaa)
    private String genero;
    
    // Construtor
    public Autor(String nome, String nacionalidade, String nascimento, String genero) {
        super.setNome(nome);
        this.nacionalidade = nacionalidade;
        this.nascimento = nascimento;
        this.genero = genero;
    }

    // Getters e Setters
    @Override
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    @Override
    public String getNacionalidade(){
        return nacionalidade;
    }
    @Override
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }
    @Override
    public String getNascimento(){
        return nascimento;
    }
    @Override
    public void setGenero(String genero){
        this.genero = genero;
    }
    @Override
    public String getGenero(){
        return genero;
    }

    // Retorna os dados do autor
    @Override
    public String biografia(){
        return this.getNome() + ", " + nacionalidade + ", " + nascimento + ", " + genero + ".";
    }   
}
