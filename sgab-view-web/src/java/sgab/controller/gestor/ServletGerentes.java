/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.joao.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author adria
 */
@WebServlet(name = "ServletTest", urlPatterns = {"/ServletTest"})
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
            String inputNomeGerenteCadastrar = request.getParameter("inputNomeGerenteCadastrar");
            String inputEmailGerenteCadastrar = request.getParameter("inputEmailGerenteCadastrar");
            String inputSenhaGerenteCadastrar = request.getParameter("inputSenhaGerenteCadastrar");
            String inputIdentGerenteHabilitar = request.getParameter("inputIdentGerenteHabilitar");
            String inputEmailGerenteHabilitar = request.getParameter("inputEmailGerenteHabilitar");
            String inputIdentGerenteEditar = request.getParameter("inputIdentGerenteEditar");
            String inputEmailGerenteEditar = request.getParameter("inputEmailGerenteEditar");
            String inputIdentGerenteEditConfir = request.getParameter("inputIdentGerenteEditConfir");
            String inputEmailGerenteEditConfir = request.getParameter("inputEmailGerenteEditConfir");
            String inputNascGerenteEditConfir = request.getParameter("inputNascGerenteEditConfir");
            String inputAfiliGerenteEditConfir = request.getParameter("inputAfiliGerenteEditConfir");
            String inputIdentGerenteDesativar = request.getParameter("inputIdentGerenteDesativar");
            String inputEmailGerenteDesativar = request.getParameter("inputEmailGerenteDesativar");
            
            request.setAttribute("adminpsw", adminpsw);
            request.setAttribute("inputNomeGerenteCadastrar", inputNomeGerenteCadastrar);
            request.setAttribute("inputEmailGerenteCadastrar", inputEmailGerenteCadastrar);
            request.setAttribute("inputSenhaGerenteCadastrar", inputSenhaGerenteCadastrar);
            request.setAttribute("inputIdentGerenteHabilitar", inputIdentGerenteHabilitar);
            request.setAttribute("inputEmailGerenteHabilitar", inputEmailGerenteHabilitar);
            request.setAttribute("inputIdentGerenteEditar", inputIdentGerenteEditar);
            request.setAttribute("inputEmailGerenteEditar", inputEmailGerenteEditar);
            request.setAttribute("inputIdentGerenteEditConfir", inputIdentGerenteEditConfir);
            request.setAttribute("inputEmailGerenteEditConfir", inputEmailGerenteEditConfir);
            request.setAttribute("inputNascGerenteEditConfir", inputNascGerenteEditConfir);
            request.setAttribute("inputAfiliGerenteEditConfir", inputAfiliGerenteEditConfir);
            request.setAttribute("inputIdentGerenteDesativar", inputIdentGerenteDesativar);
            request.setAttribute("inputEmailGerenteDesativar", inputEmailGerenteDesativar);
            
            
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

