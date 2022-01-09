package sgab.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sgab.model.dto.Obra;
import sgab.model.service.GestaoObras;

/**
 *
 * @author HP
 */
@WebServlet(name = "AlteraObra", urlPatterns = {"/AlteraObra"})
public class AlteraObra extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            GestaoObras obras = new GestaoObras();
            
            String categoria = (String) request.getAttribute("categoria");
            String titulo = (String) request.getAttribute("titulo");
            String nota = (String) request.getAttribute("nota");
            int ano = (Integer) request.getAttribute("ano");
            String editora = (String) request.getAttribute("editora");
            String cidEditora = (String) request.getAttribute("cidEditora");
            String edicao = (String) request.getAttribute("edicao");
            int volume = (Integer) request.getAttribute("volume");
            
            Obra obra = new Obra(categoria, titulo, nota, ano, editora, cidEditora, edicao, volume);
            try{
                obras.alterarObra(obra);
            }
            catch(Exception e){
                //redirecionar página de erro
                
                //vi que esta página já existe, mas preciso dar pull request para atualizar
                //meu branch e poder utilizá-la
            }
            out.println("<script>window.location.replace(\"alteraObraSucesso.html\")</script>");
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