package sgab.controller;

import jakarta.servlet.http.HttpServletRequest;
import sgab.model.dto.Usuario;
import sgab.model.service.GestaoUsuario;
import java.util.List;
import sgab.model.exception.PersistenciaException;

public class UsuarioController {

    public static String listar(HttpServletRequest request) {
        String jsp = "";
        try {
            GestaoUsuario gestaoUsuario = new GestaoUsuario();
            List<Usuario> listUsuario = gestaoUsuario.pesquisarAtivos();
            if (listUsuario != null) {
                request.setAttribute("listUsuario", listUsuario);
                jsp = "/core/usuario/listar.jsp";
            } else {
                String erro = "Nao existe registro!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }
    
    public static String alterar(HttpServletRequest request) {
        String jsp = "";
        try {
            // lendo a Sigla do Usuario que deseja alterar
            Long usuarioId = Long.parseLong(request.getParameter("usuarioId"));
            GestaoUsuario manterUsuario = new GestaoUsuario();
            Usuario usuario = manterUsuario.pesquisarPorId(usuarioId);
            if (usuario != null) {
                request.setAttribute("usuario", usuario);
                jsp = "/core/usuario/alterar.jsp";
            } else {
                String erro = "Ocorreu erro ao Alterar Usuario!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }    

    public static String excluir(HttpServletRequest request) {
        String jsp = "";
        try {
            // lendo o CodUsuario que se deseja alterar
            Long usuarioId = Long.parseLong(request.getParameter("usuarioId"));
            GestaoUsuario gestaoUsuario = new GestaoUsuario();
            Usuario usuario = gestaoUsuario.pesquisarPorId(usuarioId);
            try {
                gestaoUsuario.excluir(usuario);
                jsp = UsuarioController.listar(request);
            }
            catch(PersistenciaException ex) {
                String erro = "Ocorreu erro ao Excluir Usuario!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }    
    
    public static String gravarAlteracao(HttpServletRequest request) {
        String jsp = "";
        try {

            Long idUsuario = Long.parseLong(request.getParameter("usuarioId"));
            String nome = request.getParameter("login");
            String nomeCompleto = request.getParameter("nome");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");

            Usuario usuario = new Usuario(nome);
            usuario.setId(idUsuario);
            usuario.setNome(nomeCompleto);
            usuario.setEmail(email);
            usuario.setSenha(senha);

            GestaoUsuario gestaoUsuario = new GestaoUsuario();
            try {
                gestaoUsuario.atualizarCadastro(usuario);
                jsp = UsuarioController.listar(request);
            } 
            catch(PersistenciaException ex) {
                String erro = "Nao foi possivel gravar a alteracao desse registro";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }    
    
    public static String gravarInsercao(HttpServletRequest request) {
        String jsp = "";
        try {
            String nomeUsuario = request.getParameter("login");
            String nomeCompleto = request.getParameter("nome");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");

            Usuario usuario = new Usuario(nomeUsuario);
            usuario.setNome(nomeCompleto);
            usuario.setEmail(email);
            usuario.setSenha(senha);

            GestaoUsuario gestaoUsuario = new GestaoUsuario();
            Long usuarioId = gestaoUsuario.cadastrar(usuario);

            if (usuarioId != null) {
                jsp = UsuarioController.listar(request);
            } else {
                String erro = "Nao foi possível gravar esse registro!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }

}
