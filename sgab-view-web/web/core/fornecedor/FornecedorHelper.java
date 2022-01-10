package sgab.model.dto.util;

import sgab.model.dto.Fornecedor;

public class FornecedorHelper{
    public static int validarFornecedor(Fornecedor fornecedor){
        
        if(fornecedor.getCnpj() == 0){

            return 1;

        }
        
        if(fornecedor.getNomeFornecedor() == null){

            return 2;

        }

        if(fornecedor.getEmail() == null){

            return 3;

        }

        if(fornecedor.getTelefone() == 0){

            return 4;

        }

        if(fornecedor.getCep() == 0){

            return 5;

        }
        
        if(fornecedor.getEndereco() == null){

            return 6;

        }

        return 0;
        
    }
     public static boolean validarNome(String nome){
        if(nome == null || nome.trim().equals("")){
            return false;
        }
        
        String regexNomeCompleto = "^[A-z]+(\s[A-z]+)+";
        Pattern validarNome = Pattern.compile(regexNomeCompleto);
        Matcher matcher = validarNome.matcher(nome);

        if(matcher.matches() == false){
            return false;
        }

        return true;
    }

    public static boolean validarEmail(String email){
        String regexEmail = "^[^0-9][A-z0-9_]+([.][A-z0-9_]+)*[@][A-z0-9_]+([.][A-z0-9_]+)*[.][A-z]{2,4}$";
        Pattern validaEmail = Pattern.compile(regexEmail);
        Matcher matcher = validaEmail.matcher(email);
        
        return matcher.matches();
    }
    
    public static boolean validarTelefone(Long telefone){
        String regexTelefone = "^[^0-9][A-z0-9_]+([.][A-z0-9_]+)*[@][A-z0-9_]+([.][A-z0-9_]+)*[.][A-z]{2,4}$";
        Pattern validaTelefone = Pattern.compile(regexTelefone);
        Matcher matcher = validaTelefone.matcher(telefone);
        
        return matcher.matches();
    }
}