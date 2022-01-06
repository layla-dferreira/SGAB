import model.dto.Assunto;

public interface GenericAssuntoDAO {
    void cadastrarAssunto(String tag);
    Assunto pesquisar(int codigo);
    Assunto pesquisar(String tag);
    void editarAssunto(String tag, int codigo); //o código passado é referente ao assunto a ser editado
    void excluir(int codigo);
}