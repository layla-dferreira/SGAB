import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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
            
            
            String adicionarAtendenteInput = request.getParameter("adicionarAtendenteInput"); 
            String adicionarBibliotecarioInput = request.getParameter("adicionarBibliotecarioInput");
            String removerAtendenteInput = request.getParameter("removerAtendenteInput");
            String removerBibliotecarioInput = request.getParameter("removerBibliotecarioInput");
            String alterarAtendenteInput = request.getParameter("alterarAtendenteInput");
            String alterarBibliotecarioInput = request.getParameter("alterarBibliotecarioInput");
            String alterarNomeInput = request.getParameter("alterarNomeInput");
            String alterarIDInput = request.getParameter("alterarIDInput");
            String pesquisarAtendenteInput = request.getParameter("pesquisarAtendenteInput");
            String pesquisarBibliotecarioInput = request.getParameter("pesquisarBibliotecarioInput");
            String gerenciarBibliotecasInput = request.getParameter("gerenciarBibliotecasInput");
            String mudarBibliotecasInput = request.getParameter("mudarBibliotecasInput");
            String excluirBibliotecasInput = request.getParameter("excluirBibliotecasInput");
            
            String adicionarAtendenteInput2 = request.getParameter("adicionarAtendenteInput2"); 
            String adicionarBibliotecarioInput2 = request.getParameter("adicionarBibliotecarioInput2");
            String adicionarAcervoInput = request.getParameter("adicionarAcervoInput");
            String adicionarUnidadeOrgInput = request.getParameter("adicionarUnidadeOrgInput");
            String adicionarNomeInput = request.getParameter("adicionarNomeInput");
            String adicionarIDInput = request.getParameter("adicionarIDInput");
            
            request.setAttribute("adicionarAtendenteInput", adicionarAtendenteInput);
            request.setAttribute("adicionarBibliotecarioInput", adicionarBibliotecarioInput);
            request.setAttribute("removerAtendenteInput", removerAtendenteInput);
            request.setAttribute("removerBibliotecarioInput", removerBibliotecarioInput);
            request.setAttribute("alterarAtendenteInput", alterarAtendenteInput);
            request.setAttribute("alterarBibliotecarioInput", alterarBibliotecarioInput);
            request.setAttribute("alterarNomeInput", alterarNomeInput);
            request.setAttribute("alterarIDInput", alterarIDInput);
            request.setAttribute("pesquisarAtendenteInput", pesquisarAtendenteInput);
            request.setAttribute("pesquisarBibliotecarioInput", pesquisarBibliotecarioInput);
            request.setAttribute("gerenciarBibliotecasInput", gerenciarBibliotecasInput);
            request.setAttribute("mudarBibliotecasInput", mudarBibliotecasInput);
            request.setAttribute("excluirBibliotecasInput", excluirBibliotecasInput);
            
            request.setAttribute("adicionarAtendenteInput2", adicionarAtendenteInput2);
            request.setAttribute("adicionarBibliotecarioInput2", adicionarBibliotecarioInput2);
            request.setAttribute("adicionarAcervoInput", adicionarAcervoInput);
            request.setAttribute("adicionarUnidadeOrgInput", adicionarUnidadeOrgInput);
            request.setAttribute("adicionarNomeInput", adicionarNomeInput);
            request.setAttribute("adicionarIDInput", adicionarIDInput);
            
            //Teste pega variavel
            //out.println("<h1>Teste Pega variavel " + "</h1>");
            
            //out.println( "Variavel = " + adicionarAtendenteInput2);
            
            /*request.getRequestDispatcher(".jsp").forward(request, response);*/
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
