/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.dao;

/**
 *
 * @author gasa1
 */
public interface BibliotecaDAO<E>{
    
    public void Biblioteca(E unidadeorg, String nome, E id, E[] obras);
    public void setUnidadeOrg(E unidadeorg);
    public void setNome(String nome);
    public void setId(E id);
    public void setObras(E[] obras);
    public E getUnidadeOrganizacional();
    public String getNome();
    public E getId();
    public E[] getObras();
}
