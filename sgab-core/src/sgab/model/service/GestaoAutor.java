package sgab.model.service;

import jdk.jfr.Experimental;
import sgab.model.dao.GestaoAutorDAO;
import sgab.model.dto.Autor;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * GRUPO F
 * @author Marcos Paulo
 * @implNote Como o projeto depende do maffort para proseguir com o banco de dados, esse
 * arquivo apenas salva os autores em um arrayList. Provavelmente antes do fim da sprint 1 será
 * incluido o banco de dados. O codigo abaixo não foi testado pelo fato do projeto
 * não ter um arquivo main ou algo do genero.
 * @apiNote Toda a estrutura interna dos métodos abaixo deve mudar com a adição de um banco de dados ao projeto
 * então tenha em mente que a assinatura dos mesmos também pode variar conforme novas versões.
 */

@Experimental
public class GestaoAutor implements GestaoAutorDAO {
    ArrayList<Autor> mock = new ArrayList<>();

    public Autor getAutor(String nome) throws IllegalArgumentException {
        if (nome != null && !nome.trim().equals("")) {
            for (Autor autor : mock) {
                if (autor.getNome().equals(nome)) {
                    return autor;
                }
            }
            return null;
        } else {
            throw new IllegalArgumentException("o parametro nome é invalido");
        }
    }

    public Autor getAutor(int id) throws IllegalArgumentException {
        if (id >= 0) {
            for (Autor autor : mock) {
                if (autor.getId() == id) {
                    return autor;
                }
            }
            return null;
        } else {
            throw new IllegalArgumentException("o parametro id é invalido");
        }
    }

    public String getInfoAutor(int id) throws IllegalArgumentException {
        if (id >= 0) {
            for (Autor autor : mock) {
                if (autor.getId() == id) {
                    return autor.biografia();
                }
            }
            return null;
        } else {
            throw new IllegalArgumentException("o parametro id é invalido");
        }
    }

    public String getInfoAutor(String nome) throws IllegalArgumentException {
        if (nome != null && !nome.trim().equals("")) {
            for (Autor autor : mock) {
                if (autor.getNome().equals(nome)) {
                    return autor.biografia();
                }
            }
            return null;
        } else {
            throw new IllegalArgumentException("o parametro nome é invalido");
        }
    }

    public Autor[] getAutores() {
        return Arrays.copyOf(mock.toArray(), mock.size(), Autor[].class);
    }

    public Autor[] getAutoresPorGenero(String genero) throws IllegalArgumentException {
        if (genero != null && !genero.trim().equals("")) {
            ArrayList<Autor> filtrado = new ArrayList<>();
            for (Autor autor : mock) {
                if (autor.getGenero().equals(genero)) {
                    filtrado.add(autor);
                }
            }
            return Arrays.copyOf(filtrado.toArray(), filtrado.size(), Autor[].class);
        } else {
            throw new IllegalArgumentException("o parametro genero é invalido");
        }
    }

    public Autor[] getAutoresPorNacionalidade(String nacionalidade) throws IllegalArgumentException{
        if (nacionalidade != null && !nacionalidade.trim().equals("")) {
            ArrayList<Autor> filtrado = new ArrayList<>();
            for (Autor autor : mock) {
                if (autor.getNacionalidade().equals(nacionalidade)) {
                    filtrado.add(autor);
                }
            }
            return Arrays.copyOf(filtrado.toArray(), filtrado.size(), Autor[].class);
        } else {
            throw new IllegalArgumentException("o parametro nacionalidade é invalido");
        }
    }

    public void removeAutor(int id) throws IllegalArgumentException{
        if (id >= 0) {
            for (int i = 0; i < mock.size(); i++) {
                if (mock.get(i).getId() == id){
                    mock.remove(i);
                    break;
                }
            }
            throw new IllegalArgumentException("O valor do parametro id não pertence a nenhum autor");
        } else {
            throw new IllegalArgumentException("o parametro id é invalido");
        }
    }

    public void removeAutor(String nome) {
        if (nome != null && !nome.trim().equals("")) {
            ArrayList<Autor> filtrado = new ArrayList<>();
            for (int i = 0; i < mock.size(); i++) {
                if (mock.get(i).getNome().equals(nome)){
                    mock.remove(i);
                    break;
                }
            }
            throw new IllegalArgumentException("O valor do parametro nome não pertence a nenhum autor");
        } else {
            throw new IllegalArgumentException("o parametro nacionalidade é invalido");
        }
    }

    public void adicionarAutor(String nome, String nacionalidade, String nascimento, String genero) {
        Autor autor = new Autor(nome, nacionalidade, nascimento, genero);
        mock.add(autor);
    }

    public int getNumeroDeAutores() {
        return mock.size();
    }
}
