package sgab.model.dto;

/**
 * GRUPO F
 * @author luisf, Marcos Paulo
 */

public class Autor{
    private String nome;
    private int id;

    public Autor(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
