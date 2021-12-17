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

    String getInfoAutor(int id);

    String getInfoAutor(String nome);

    Autor[] getAutores();

    Autor[] getAutoresPorGenero(String genero);

    Autor[] getAutoresPorNacionalidade(String nacionalidade);

    void removeAutor(int id);

    void removeAutor(String nome);

    void adicionarAutor(String nome, String nacionalidade, String nascimento, String genero);

    int getNumeroDeAutores();
}
