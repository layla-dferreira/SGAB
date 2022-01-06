package sgab.model.dao;
/**
 *
 * @author Helio
 */
public interface GestaoDeAssuntosDAO {
    Assunto getAssunto(String nome); // pesquisa por nome
    Assunto getAssunto(String tag); // pesquisa por tag
    Assunto getAssunto(int id); // pesquisa por id

    void adcionarAssunto(String nome);

    void removerAssunto(int id); // remover pelo id
    void removerAssunto(String nome); // remover pelo nome

    void editarAssunto(String assunto, String assuntoNovo); // editar o assunto
}