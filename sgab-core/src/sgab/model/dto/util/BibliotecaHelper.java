/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.dto.util;

import sgab.model.dto.Biblioteca;

public class BibliotecaHelper {
    
    public static boolean validarBiblioteca(Biblioteca biblioteca){
        boolean resultado = true;
                
        if(biblioteca.getNome().length() <= 1){
            resultado = false;
        }
        
        else if(biblioteca.getId() <= 0){
            resultado = false;
        }

        return resultado;
    }
     
    public static boolean validarId(Biblioteca biblioteca){
        if(biblioteca.getId() <= 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    public static boolean validarNome(Biblioteca biblioteca){
        if(biblioteca.getNome().length() <= 1){
            return false;
        }
        else{
            return true;
        }
    }
    
}
