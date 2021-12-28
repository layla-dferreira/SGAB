/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.dao;

import sgab.model.dto.Pessoa;

/**
 *
 * @author gasa1
 */
public interface GerenciarBibliotecaDAO<E> {
    public void mudarId(E id);
    public void mudarOrganizacao(E org);
    public void mudarNome(String nome);
    public void mudarAcervo(E acervo);
    public E pegarId ();
    public E pegarOrganizacao ();
    public String pegarNome ();
    public E pegarAcervo ();
}
