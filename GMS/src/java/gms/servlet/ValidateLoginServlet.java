/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gms.servlet;

import gms.controller.Group_details_controller;
import gms.controller.Person_details_controller;
import gms.model.Group_details_model;
import gms.model.Person_details_model;
import gms.util.config.DbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author janaka
 */
public class ValidateLoginServlet extends HttpServlet {

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
            throws ServletException, IOException, NoSuchAlgorithmException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        DbConnection con = new DbConnection();
        HttpSession session = request.getSession(true);

        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            String toEnc = password; // Value to hash
            MessageDigest mdEnc = MessageDigest.getInstance("MD5");
            mdEnc.update(toEnc.getBytes(), 0, toEnc.length());
            password = new BigInteger(1, mdEnc.digest()).toString(16);

            String sql = "select * from person_details where email='" + username + "' and password='" + password + "'";
            ResultSet rs = con.execute(sql);

            if (rs.next()) {
                session.setAttribute("sessionMemberID", rs.getString(1));
                
                ArrayList<Person_details_model> rmlis = Person_details_controller.getAllMembers();
                request.setAttribute("rmlis", rmlis);

                String person = (String) request.getSession(false).getAttribute("sessionMemberID");
                int personID = Integer.parseInt(person);
                ArrayList<Group_details_model> groupList = Group_details_controller.getAssignGroups(personID);
                
                request.setAttribute("groupList", groupList);
                

                RequestDispatcher rd = request.getRequestDispatcher("deletegroup.jsp");
                rd.forward(request, response);
            } else {
                out.println("<script>alert('Invalid Login');</script>");
            }
        } catch (SQLException e) {
            System.err.println(e);
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
        try {
            processRequest(request, response);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ValidateLoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ValidateLoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold
}
