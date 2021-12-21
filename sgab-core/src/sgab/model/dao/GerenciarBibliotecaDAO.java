/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.dao;

Import sgab.model.dto.Pessoa;

/**
 *
 * @author gasa1
 */
public interface GerenciarBibliotecaDAO<E> {
    public void adicionarAtendente(Pessoa atendente);
    public void adicionarBibliotecario(Pessoa bibliotecario);
    public void alterarNome(E nome);
    public void alterarID(E id);
    public void alterarAtendente(Pessoa atendente);
    public void alterarBibliotecario(Pessoa bibliotecario);
    public E removerAtendente(Pessoa atendente);
    public E removerBibliotecario(Pessoa bibliotecario);
    public E pesquisarAtendente(String nome);
    public E pesquisarBibliotecario(String nome);
    public void excluirBiblioteca(String nome);
    public void mudarBiblioteca(BibliotecaDAO biblioteca);
}
