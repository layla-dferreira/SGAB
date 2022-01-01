/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgab.model.service;

import java.util.ArrayList;
import sgab.model.dto.Fornecedor;
import sgab.model.dao.FornecedoresDAO;

/**
 *
 * @author T-Gamer
 */
public class GestaoFornecedores implements FornecedoresDAO {
    ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    
    @Override
    public void CadastrarFornecedor(Long cnpj, String nomeFornecedor, String email, Long telefone, Long cep, String endereco) {
        Fornecedor novoFornecedor = new Fornecedor(cnpj, nomeFornecedor, email, telefone, cep, endereco);
        fornecedores.add(novoFornecedor);
    }
    
    public Fornecedor pesquisar(Long cnpj){
        for(Fornecedor fornecedor: fornecedores) {
            if(cnpj == fornecedor.getCnpj()) {
                return fornecedor;
            }
        }

        return null;
    }
    
    @Override
    public void AlterarDados(Long cnpj, String nomeFornecedor, String email, Long telefone, Long cep, String endereco) {
        Fornecedor fornecedor = pesquisar(cnpj);
        
        if(fornecedor == null){
            throw new RuntimeException("Esse cnpj não está cadastrado.");
        }
        
        fornecedor.setCep(cep);
        fornecedor.setEndereco(endereco);
        fornecedor.setNomeFornecedor(nomeFornecedor);
        fornecedor.setTelefone(telefone);
        fornecedor.setEmail(email);
        
    }
    
    @Override
    public void CancelarFornecedor(Long cnpj){
        Fornecedor fornecedor = pesquisar(cnpj);
        
        if(fornecedor == null){
            throw new RuntimeException("Esse cpf não está cadastrado.");
        }
        
        fornecedores.remove(fornecedor);
    }

}
