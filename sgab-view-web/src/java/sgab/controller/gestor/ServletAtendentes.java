/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sgab.controller.gestor;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 *
 * @author adria
 */
@WebServlet(name = "ServletAtendentes", urlPatterns = {"/ServletAtendentes"})
public class ServletAtendentes extends HttpServlet {

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
            String adminpsw = request.getParameter("adminpsw"); 
            String inputNomeAtendenteCadastrarOuHabilitar = request.getParameter("inputNomeAtendenteCadastrarOuHabilitar");
            String inputIdentAtendenteCadastrarOuHabilitar = request.getParameter("inputIdentAtendenteCadastrarOuHabilitar");
            String inputEmailAtendenteCadastrarOuHabilitar = request.getParameter("inputEmailAtendenteCadastrarOuHabilitar");
            String inputSenhaAtendenteCadastrarOuHabilitar = request.getParameter("inputSenhaAtendenteCadastrarOuHabilitar");
            String inputIdentAtendenteEditarOuDesativar = request.getParameter("inputIdentAtendenteEditarOuDesativar");
            String inputEmailAtendenteEditarOuDesativar = request.getParameter("inputEmailAtendenteEditarOuDesativar");
            String inputIdentAtendenteEditConfir = request.getParameter("inputIdentAtendenteEditConfir");
            String inputEmailAtendenteEditConfir = request.getParameter("inputEmailAtendenteEditConfir");
            String inputNascAtendenteEditConfir = request.getParameter("inputNascAtendenteEditConfir");
            String inputAfiliAtendenteEditConfir = request.getParameter("inputAfiliAtendenteEditConfir");
            
            request.setAttribute("adminpsw", adminpsw);
            request.setAttribute("inputNomeAtendenteCadastrarOuHabilitar", inputNomeAtendenteCadastrarOuHabilitar);
            request.setAttribute("inputIdentAtendenteCadastrarOuHabilitar", inputIdentAtendenteCadastrarOuHabilitar);
            request.setAttribute("inputEmailAtendenteCadastrarOuHabilitar", inputEmailAtendenteCadastrarOuHabilitar);
            request.setAttribute("inputSenhaAtendenteCadastrarOuHabilitar", inputSenhaAtendenteCadastrarOuHabilitar);
            request.setAttribute("inputIdentAtendenteEditarOuDesativar", inputIdentAtendenteEditarOuDesativar);
            request.setAttribute("inputEmailAtendenteEditarOuDesativar", inputEmailAtendenteEditarOuDesativar);
            request.setAttribute("inputIdentAtendenteEditConfir", inputIdentAtendenteEditConfir);
            request.setAttribute("inputEmailAtendenteEditConfir", inputEmailAtendenteEditConfir);
            request.setAttribute("inputNascAtendenteEditConfir", inputNascAtendenteEditConfir);
            request.setAttribute("inputAfiliAtendenteEditConfir", inputAfiliAtendenteEditConfir);
            
            
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

