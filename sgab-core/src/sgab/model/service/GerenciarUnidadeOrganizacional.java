/*Author : @agatha
  FR002 -> Gestão de Unidades Organizacionais;
  FR002 -> Gestão de Unidades Organizacionais: Grupo D;
  FR002 -> Gestão de Unidades Organizacionais Grupo D: @Letícia, @Agatha, @GabrielLucas & @MatheusGaston*/
package service;
import java.util.Scanner;
import dto.UnidadeOrganizacionalDTO;
import dto.ListaUnidadeOrganizacionalDTO;
import dao.UnidadeOrganizacionalHelper;

public class GerenciarUnidadeOrganizacional {
    Scanner sc = new Scanner(System.in);
    UnidadeOrganizacionalDTO unidadeDTO = new UnidadeOrganizacionalDTO();
    ListaUnidadeOrganizacionalDTO listaDTO = new ListaUnidadeOrganizacionalDTO();
    
    public void adicionarUnidade(String nome, String email, Integer cep, String endereco){
        unidadeDTO.setId(listaDTO.listaUO.size());
        unidadeDTO.setNome(nome);
        unidadeDTO.setEmail(email);
        unidadeDTO.setCep(cep);
        unidadeDTO.setNome(endereco);

        UnidadeOrganizacionalDTO unidadeDTO = new UnidadeOrganizacionalDTO(true, listaDTO.listaUO.size(), nome, email, cep, endereco);
        
        if(UnidadeOrganizacionalHelper.validarUnidadeOrganizacional(unidadeDTO)){
            listaDTO.listaUO.add(unidadeDTO);
        }else{
            throw new RuntimeException("Dados Inválidos!");
        }
    }
     
    public void editarUnidade(int posicao, String nome, String email, Integer cep, String endereco){
        //AJUDAR MAFFORT : COMO MODIFICAR ITEM NO ARRAYLIST???
        //GAMBIARRA:
        unidadeDTO.setId(posicao);
        unidadeDTO.setNome(nome);
        unidadeDTO.setEmail(email);
        unidadeDTO.setCep(cep);
        unidadeDTO.setNome(endereco);
        
        UnidadeOrganizacionalDTO unidadeDTO = new UnidadeOrganizacionalDTO(true, posicao, nome, email, cep, endereco);
        if(UnidadeOrganizacionalHelper.validarUnidadeOrganizacional(unidadeDTO)){
            listaDTO.listaUO.remove(posicao);
            listaDTO.listaUO.add(posicao, unidadeDTO);
        }else{
            throw new RuntimeException("Dados Inválidos!");
        }
    }
    
    public void des_habilitarUnidade(int posicao){
        //"remover"
        if(unidadeDTO.getHabilitado() == true){
            unidadeDTO.setHabilitado(false);
        }else{
            unidadeDTO.setHabilitado(true);
        }
        listaDTO.listaUO.remove(posicao);
        listaDTO.listaUO.add(posicao, unidadeDTO);
    }
    
    public int pesquisarUnidade(){
        System.out.println("Pesquisar Por:\n"
                + "1 - nome\n"
                + "2 - id");
                int op = sc.nextInt();
        int posicao=0; 
        switch (op){
            case 1:
                System.out.print("digite nome: ");
                String nome = sc.nextLine();
                posicao = listaDTO.listaUO.indexOf(nome);
                break;
            case 2:
                System.out.print("digite codigo: ");
                long id = sc.nextInt();
                posicao = listaDTO.listaUO.indexOf(id);
                break;
        }
        listaDTO.printarElemento(posicao);
        return posicao;
    }    
        
    public void verListaUnidades(){
        
        listaDTO.toString();
    }
}
