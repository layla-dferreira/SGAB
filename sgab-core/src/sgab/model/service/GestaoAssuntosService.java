package sgab.model.service;

import sgab.model.dto.Assunto;
import java.util.ArrayList;

public class GestaoAssuntosService implements GestaoDeAssuntosDAO {
    ArrayList<Assunto> assuntoLista = new ArrayList<>();
    private int quantidadeAssuntosInseridos = 0;
    

    public void cadastrarAssunto(String nome){
        Assunto assunto = new Assunto(nome);
        if (assuntoLista.contains(nome)){
            throw new IllegalArgumentException("Erro: assunto já existente");
        }
        assuntoLista.add(assunto);
    }

    public Assunto pesquisarAssunto(String nome) {
        if (nome != null) {
            for (Assunto assunto : assuntoLista) {
                if (assunto.getNome().equals(nome)) {
                    return assunto;
                }
            }
            return null;
        }
        return null;
    }
    public Assunto pesquisarAssunto(int id) {
        if (id >= 0) {
            for (Assunto assunto : assuntoLista) {
                if (assunto.getId() == id) {
                    return assunto;
                }
            }
            return null;
        }
        return null;
    }

    public void removerAssunto (String nome) {
         for (int i = 0; i < this.quantidadeAssuntosInseridos; i++) {
             Assunto a = this.getNome()[i];
             if (a.getNome().equals(nome)){
                 for (int j = i; j < this.quantidadeAssuntosInseridos; j++) {
                     if (j + 1 < this.getNome().length) {
                         this.getNome()[j] = this.getNome()[j + 1];
                     }
                     this.quantidadeAssuntosInseridos--;
                     return;
                 }
             } else {
                 throw new IllegalArgumentException("Esse assunto já foi removido");
             }
         }
    }
    public void editarAssunto(String oldNome, String newNome){
        Assunto assunto = this.getNome(oldNome);
        if(assunto != null){
            assunto.setNome(newNome);
        }
    }

}
