package sgab.model.dao;

import jdk.jfr.Experimental;
import sgab.model.dto.Autor;
/**
 * @author Marcos Paulo
 * Grupo F
 * */
@Experimental
public interface GestaoAutorDAO {
    Autor getAutor(String nome);

    Autor getAutor(int id);

    Autor[] getAutores();

    void removeAutor(int id);

    void removeAutor(String nome);

    void adicionarAutor(String nome);

    int getNumeroDeAutores();

    void alterarAutor(String nomeAntigo, String novoNome);

    void alterarAutor(int id, String novoNome);
}
