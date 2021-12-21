package sgab.model.dto.util;

import sgab.model.dto.Pessoa;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class PessoaHelper {
    public static int validarPessoa(Pessoa pessoa, ArrayList<Pessoa> pessoas) {
        if(!validarEmail(pessoa.getEmail())){
            return -1;
        }
        
        if(!validarSenha(pessoa.getSenha())){
            return -2;
        }


        for(Pessoa p : pessoas) {
            if(pessoa.getCpf() == p.getCpf()) {
                return -3;
            }
        }

        if(!validarNome(pessoa.getNome())){
            return -4;
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

    public static boolean validarSenha(String senha) {
        String regexSenha = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$";
        Pattern validaSenha = Pattern.compile(regexSenha);
        Matcher matcher = validaSenha.matcher(senha);

        return matcher.matches();
    }

    public static boolean validarEmail(String email){
        String regexEmail = "^[^0-9][A-z0-9_]+([.][A-z0-9_]+)*[@][A-z0-9_]+([.][A-z0-9_]+)*[.][A-z]{2,4}$";
        Pattern validaEmail = Pattern.compile(regexEmail);
        Matcher matcher = validaEmail.matcher(email);
        
        return matcher.matches();
    }
}