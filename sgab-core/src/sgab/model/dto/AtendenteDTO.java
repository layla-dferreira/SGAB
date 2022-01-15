/*Author : @agatha
  FR005 -> Gestão de Atendentes;
  FR005 -> Gestão de Atendentes: Grupo D;
  FR005 -> Gestão de Atendentes: Grupo D: @Letícia, @Agatha, @GabrielLucas & @MatheusGaston*/

package dto;
import dto.PessoaDTO; //FR001 -> Gestão de Pessoas: Grupo B;
import dto.UsuarioDTO; //FR001 -> Gestão de Pessoas: Grupo B;
import dto.GestorDTO; //FR001 -> Gestão de Pessoas: Grupo B;

public class AtendenteDTO extends PessoaDTO{
    
    //Supervisor do Atendente
    private Gestor gestor; //FR004 -> Gestão de Gestores: Grupo C;
    
    public AtendenteDTO(){}
    
    public AtendenteDTO(Gestor gestor) {
        this.gestor = gestor;
    }

//    private Biblioteca biblioteca; -> Deveria ter em gestor
//    public AtendenteDTO(Gestor gestor, Biblioteca biblioteca) {
//        this.gestor = gestor;
//        this.biblioteca = biblioteca;
//    }
    
}
