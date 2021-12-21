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
    public E removerAtendente(String nome);
    public E removerBibliotecario(String nome);
    public E pesquisarAtendente(String nome);
    public E pesquisarBibliotecario(String nome);
    
    public void excluirBiblioteca(String nome);
    public void mudarBiblioteca(BibliotecaDAO biblioteca);
}
