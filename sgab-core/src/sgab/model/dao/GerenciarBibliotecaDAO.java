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
    public void adicionarAtendente(E atendente);
    public void adicionarBibliotecario(E bibliotecario);
    public void alterarAtendente(E atendente);
    public void alterarBibliotecario(E bibliotecario);
    public E removerAtendente(E atendente);
    public E removerBibliotecario(E bibliotecario);
    public E pesquisarAtendente(String nome);
    public E pesquisarBibliotecario(String nome);
    public void excluirBiblioteca(String nome);
    public void mudarBiblioteca(BibliotecaDAO biblioteca);
}
