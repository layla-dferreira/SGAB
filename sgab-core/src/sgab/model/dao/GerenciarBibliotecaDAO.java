/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.dao;

/**
 *
 * @author gasa1
 */
public interface GerenciarBibliotecaDAO<E> {
    public void GerenciarBiblioteca(BibliotecaDAO biblioteca);
    public void adicionarDados(E[] dados);
    public void alterarDados(E[] dados);
    public E removerDados(E[] dados);
    public E pesquisarDados(String[] nomes);
    public void excluirBiblioteca(String nome);
    public void mudaBiblioteca(BibliotecaDAO biblioteca);
}
