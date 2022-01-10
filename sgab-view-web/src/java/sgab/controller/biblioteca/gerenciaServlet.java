import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sgab.model.dto.Biblioteca;
import sgab.model.service.GestaoBiblioteca;

@WebServlet(urlPatterns = {"/gerenciaServlet"})
public class gerenciaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            String nome = request.getParameter("nome");
            Long pesquisarId = Long.parseLong(request.getParameter("pesquisarId"));
            String pesquisarNome = request.getParameter("pesquisarNome");
            String alterarNomeInput = request.getParameter("alterarNomeInput");
            Long alterarIDInput = Long.parseLong(request.getParameter("alterarIDInput"));
            String alterarUnidadeOrgInput = request.getParameter("adicionarUnidadeOrgInput");

            GestaoBiblioteca gestao = new GestaoBiblioteca();
            Biblioteca biblioteca;

            if(pesquisarId!=null){
                biblioteca = gestao.pesquisarId(pesquisarId);
                request.setAttribute("nome", biblioteca.getNome());
                request.setAttribute("id", biblioteca.getId());
                request.setAttribute("unidadeOrg", biblioteca.getUnidadeOrg());
                response.sendRedirect("../../../web/core/biblioteca/pesquisado.jsp");
            }

            else if(pesquisarNome!=null){
                biblioteca = gestao.pesquisarNome(pesquisarNome);
                request.setAttribute("nome", biblioteca.getNome());
                request.setAttribute("id", biblioteca.getId());
                request.setAttribute("unidadeOrg", biblioteca.getUnidadeOrg());
                response.sendRedirect("../../../web/core/biblioteca/pesquisado.jsp");
            }

            else if(alterarNomeInput!=null){
                gestao.alterarNome(nome,alterarNomeInput);
                response.sendRedirect("../../../web/core/biblioteca/resposta.jsp");
            }

            else if(alterarIDInput!=null){
                gestao.alterarId(nome,alterarIDInput);
                response.sendRedirect("../../../web/core/biblioteca/resposta.jsp");
            }

            else if(alterarUnidadeOrgInput!=null){
                gestao.alterarUnidadeOrganizacional(nome,alterarUnidadeOrgInput);
                response.sendRedirect("../../../web/core/biblioteca/resposta.jsp");
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}