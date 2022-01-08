package sgab.model.service;

/**
 *
 * @author Luiz Fernando
 */
import sgab.model.dto.Autor;
import sgab.model.dao.AutorDAO;
import sgab.model.dto.util.AutorHelper;

public class GestaoAutor {
    AutorDAO autores = new AutorDAO();
    Autor autor;

    public void cadastrarAutor(Autor autor){
        if (!AutorHelper.validarAutor(autor)) {

            throw new RuntimeException("Dados Inválidos!");
        } else {
            autores.inserir(autor);
        }
    }

    public void alterarAutor(Autor autor){
        if (!AutorHelper.validarAutor(autor)) {

            throw new RuntimeException("Dados Inválidos!");
        } else {
            autores.alterar(autor);
        }
    }

    public Autor pesquisarId(Integer id){
        if (!AutorHelper.validarAutor(autor)) {

            throw new RuntimeException("Dados Inválidos!");
        } else {
            return autores.pesquisar(id);
        }
    }

    public Autor pesquisarNome(String nome){
        if (!AutorHelper.validarAutor(autor)) {

            throw new RuntimeException("Dados Inválidos!");
        } else {
            return autores.pesquisar(nome);
        }
    }
}
