/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sistemas
 */
@WebServlet(name = "SvVideo", urlPatterns = {"/SvVideo"})
public class SvVideo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // aqui vienen los datos por GET
        String idVideo = request.getParameter("idvideo");
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String anio= request.getParameter("anio");
        String categoria = request.getParameter("categoria");
        String url = request.getParameter("url");
        String letra = request.getParameter("letra");
        
        
        System.out.println("idvideo:"+idVideo);
        System.out.println("titulo:"+titulo);
        System.out.println("autor:"+autor);
        System.out.println("anio:"+anio);
        System.out.println("categoria:"+categoria);
        System.out.println("url:"+url);
        System.out.println("letra:"+letra);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
