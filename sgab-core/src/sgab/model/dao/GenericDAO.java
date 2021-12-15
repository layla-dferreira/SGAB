package sgab.model.dao;

import java.util.List;


public interface GenericDAO<E, K> {
    void inserir(E entidade);
    void alterar(E entidade);
    E pesquisar(K key);
    List<E> pesquisar(List<BasicPair<K, E>> parameterList);
}
