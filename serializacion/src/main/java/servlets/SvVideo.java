/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import com.umariana.mundo.Video;
import java.io.IOException;
import java.util.ArrayList;
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
    
    ArrayList<Video> misVideos = new ArrayList<>();
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               String idVideo = request.getParameter("idVideo");
        // aqui vienen los datos por GET
        
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String anio= request.getParameter("anio");
        String categoria = request.getParameter("categoria");
        String url = request.getParameter("url");
        String letra = request.getParameter("letra");
        
        
       /*
        System.out.println("idvideo:"+idVideo);
        System.out.println("titulo:"+titulo);
        System.out.println("autor:"+autor);
        System.out.println("anio:"+anio);
        System.out.println("categoria:"+categoria);
        System.out.println("url:"+url);
        System.out.println("letra:"+letra);*/
    
        Video miVideo = new Video(Integer.parseInt(idVideo),titulo,autor,anio,categoria,url,letra);
         misVideos.add(miVideo);
         // agregar el aarrayList al objeto de solicitud como tributo
         request.setAttribute("misVideos", misVideos);
         
         //redireccionar a la pagina web destino
         request.getRequestDispatcher("listarVideos.jsp").forward(request, response);
         
        /* for(Video v:misVideos)
         {
             System.out.println("idVideo:"+v.getIdVideo());
             System.out.println("titulo:"+v.getTitulo());
             System.out.println("autor"+v.getAutor());
             System.out.println("año:"+v.getAnio());
             System.out.println("categoria:"+v.getCategoria());
             System.out.println("url:"+v.getUrl());
             System.out.println("letra"+v.getLetra());
             System.out.println("=========================");
         }*/
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
