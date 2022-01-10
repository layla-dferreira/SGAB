/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.dao;


import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sgab.model.dto.Biblioteca;


public class BibliotecaDAO implements GenericDAO<Biblioteca, Long> {
    private static Map<Long, Biblioteca> bibliotecas = new HashMap<>();
    
    @Override
    public void inserir(Biblioteca biblioteca){
        this.bibliotecas.put(biblioteca.getId(), biblioteca);
    }
    
    
    @Override
    public void alterar(Biblioteca biblioteca){
        this.bibliotecas.put(biblioteca.getId(), biblioteca);
    }
    
    public void alterarId(String nome,Long id){
        for(Long key : this.bibliotecas.keySet()){
            
            Biblioteca valor = this.bibliotecas.get(key);
            if(valor.getNome().equals(nome)){
                valor.setId(id);
                break;
            }
        }
    }
    
    public void alterarUnidadeOrg(String nome, String org){
        for(Long key : this.bibliotecas.keySet()){
            
            Biblioteca valor = this.bibliotecas.get(key);
            if(valor.getNome().equals(nome)){
                valor.setUnidadeOrg(org);
                break;
            }
        }
    }
    
    public void alterarNome(String nomeAntigo, String nomeNovo){
        for(Long key : this.bibliotecas.keySet()){
            
            Biblioteca valor = this.bibliotecas.get(key);
            if(valor.getNome().equals(nomeAntigo)){
                valor.setNome(nomeNovo);
                break;
            }
        }
    }
   
    @Override
    public Biblioteca pesquisar(Long key){
        return (this.bibliotecas.get(key));
    }
    
    @Override
    public List pesquisar(List listaparametro){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public Biblioteca pesquisar(String nome){
        Biblioteca resultado = new Biblioteca();
        for(Long key : this.bibliotecas.keySet()){
            
            Biblioteca valor = this.bibliotecas.get(key);
            if(valor.getNome().equals(nome)){
                resultado = valor;
                break;
            }
        }
        return resultado;
    }
    
}
