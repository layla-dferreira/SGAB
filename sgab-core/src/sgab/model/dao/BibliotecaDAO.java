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


public class BibliotecaDAO implements GenericDAO<Biblioteca, Integer> {
    private static Map<Integer, Biblioteca> bibliotecas = new HashMap<>();
    
    @Override
    public void inserir(Biblioteca biblioteca){
        this.bibliotecas.put(biblioteca.getId(), biblioteca);
    }
    
    
    @Override
    public void alterar(Biblioteca biblioteca){
        this.bibliotecas.put(biblioteca.getId(), biblioteca);
    }
   
    @Override
    public Biblioteca pesquisar(Integer key){
        return (this.bibliotecas.get(key));
    }
    
    @Override
    public List pesquisar(List listaparametro){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public List pesquisar(String nome){
        ArrayList<Biblioteca> resultados = new ArrayList();
        for(Integer key : this.bibliotecas.keySet()){
            
            Biblioteca valor = this.bibliotecas.get(key);
            if(valor.getNome().equals(nome)){
                resultados.add(valor);
            }
        }
        return resultados;
    }
    
}
