/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package root.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import root.model.dao.MasterClienteDAO;
import root.model.entities.MasterCliente;

/**
 *
 * @author micke
 */
@WebServlet(name = "Controller", urlPatterns = {"/controller"})
public class Controller extends HttpServlet {

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
      // asignación valores recibidos del post
      String ID = request.getParameter("id");
      String nombres = request.getParameter("nombres");
      String apellido_1 = request.getParameter("apellido_1");
      String apellido_2 = request.getParameter("apellido_2");
      //String fecha_nac = request.getParameter("fecha_nac");
      String mail = request.getParameter("mail");

      // obj entity asignando valores capturados
      MasterCliente cliente = new MasterCliente();
      cliente.setCliIdentificacion(ID);
      cliente.setCliNombres(nombres);
      cliente.setCliApellido1(apellido_1);
      cliente.setCliApellido2(apellido_2);
      cliente.setCliCorreo(mail);
      
      //obj DAO
      MasterClienteDAO dao = new MasterClienteDAO();
    try {
      dao.create(cliente);
      Logger.getLogger("log").log(Level.INFO, "valor id cliente: {0}", cliente.getCliIdentificacion());
    } catch (Exception ex) {
      Logger.getLogger("log").log(Level.SEVERE, "Se presentó un nerror al intentar insertar un cliente", ex.getMessage());
    }
    request.getRequestDispatcher("salida.jsp").forward(request, response);
      
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
