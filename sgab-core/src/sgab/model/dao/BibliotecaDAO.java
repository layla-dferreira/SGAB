/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.dao;

Import sgab.model.dto;
/**
 *
 * @author gasa1
 */
public interface BibliotecaDAO<E>{
    
    public void adicionaBibliotecario(Pessoa bibliotecario);
    public void adicionaAtendente(Pessoa atendente);
    
    public void removeBibliotecarioPorNome(String nome);
    public Pessoa pesquisaBibliotecarioPorNome(String nome);
    
    public void removeAtendentePorNome(String nome);
    public Pessoa pesquisaAtendentePorNome(String nome);
}
