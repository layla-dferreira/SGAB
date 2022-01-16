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
public class ServletBibliotecarios extends HttpServlet {

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
            String inputNomeBibliotecarioCadastrar = request.getParameter("inputNomeBibliotecarioCadastrar");
            String inputEmailBibliotecarioCadastrar = request.getParameter("inputEmailBibliotecarioCadastrar");
            String inputSenhaBibliotecarioCadastrar = request.getParameter("inputSenhaBibliotecarioCadastrar");
            String inputIdentBibliotecarioHabilitar = request.getParameter("inputIdentBibliotecarioHabilitar");
            String inputEmailBibliotecarioHabilitar = request.getParameter("inputEmailBibliotecarioHabilitar");
            String inputIdentBibliotecarioEditar = request.getParameter("inputIdentBibliotecarioEditar");
            String inputEmailBibliotecarioEditar = request.getParameter("inputEmailBibliotecarioEditar");
            String inputIdentBibliotecarioEditConfir = request.getParameter("inputIdentBibliotecarioEditConfir");
            String inputEmailBibliotecarioEditConfir = request.getParameter("inputEmailBibliotecarioEditConfir");
            String inputNascBibliotecarioEditConfir = request.getParameter("inputNascBibliotecarioEditConfir");
            String inputAfiliBibliotecarioEditConfir = request.getParameter("inputAfiliBibliotecarioEditConfir");
            String inputIdentBibliotecarioDesativar = request.getParameter("inputIdentBibliotecarioDesativar");
            String inputEmailBibliotecarioDesativar = request.getParameter("inputEmailBibliotecarioDesativar");
            
            request.setAttribute("adminpsw", adminpsw);
            request.setAttribute("inputNomeBibliotecarioCadastrar", inputNomeBibliotecarioCadastrar);
            request.setAttribute("inputEmailBibliotecarioCadastrar", inputEmailBibliotecarioCadastrar);
            request.setAttribute("inputSenhaBibliotecarioCadastrar", inputSenhaBibliotecarioCadastrar);
            request.setAttribute("inputIdentBibliotecarioHabilitar", inputIdentBibliotecarioHabilitar);
            request.setAttribute("inputEmailBibliotecarioHabilitar", inputEmailBibliotecarioHabilitar);
            request.setAttribute("inputIdentBibliotecarioEditar", inputIdentBibliotecarioEditar);
            request.setAttribute("inputEmailBibliotecarioEditar", inputEmailBibliotecarioEditar);
            request.setAttribute("inputIdentBibliotecarioEditConfir", inputIdentBibliotecarioEditConfir);
            request.setAttribute("inputEmailBibliotecarioEditConfir", inputEmailBibliotecarioEditConfir);
            request.setAttribute("inputNascBibliotecarioEditConfir", inputNascBibliotecarioEditConfir);
            request.setAttribute("inputAfiliBibliotecarioEditConfir", inputAfiliBibliotecarioEditConfir);
            request.setAttribute("inputIdentBibliotecarioDesativar", inputIdentBibliotecarioDesativar);
            request.setAttribute("inputEmailBibliotecarioDesativar", inputEmailBibliotecarioDesativar);
            
            
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
