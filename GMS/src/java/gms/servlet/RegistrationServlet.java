/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gms.model.Person_details_model;
import gms.controller.Person_details_controller;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author janaka
 */
public class RegistrationServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            String fname = request.getParameter("firstname");
            String lname = request.getParameter("lastname");
            String contact = request.getParameter("contact");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String confirm_password = request.getParameter("confirm_password");
            if (fname.isEmpty() || lname.isEmpty() || contact.isEmpty() || email.isEmpty() || password.isEmpty() || confirm_password.isEmpty()) {
                request.setAttribute("success msg", "Fill All The Fields.");
                RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
                rd.forward(request, response);
            }  else if (!fname.matches("[a-zA-Z]*")) {
                request.setAttribute("success msg", "First Name Enter Only Letrers.");
                RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
                rd.forward(request, response);
            } else if (!lname.matches("[a-zA-Z]*")) {
                request.setAttribute("success msg", "Last Name Enter Only Letrers.");
                RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
                rd.forward(request, response);

            }else if (!contact.matches("[0-9]{10}")) {
                request.setAttribute("success msg", "Contact Number Should Include 10 Digit.");
                RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
                rd.forward(request, response);
            } else if (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=]).{8,}$")) {
                request.setAttribute("success msg", "a digit must occur at least once.  a lower case letter must occur at least once.  a special character must occur at least once.  anything, at least eight places though.");
                RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
                rd.forward(request, response);

            } else if (!password.matches(confirm_password)) {
                request.setAttribute("success msg", "Not Match Password and confirm password.");
                RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
                rd.forward(request, response);
            }else {

                Person_details_model registration_model = new Person_details_model();
                //System.out.println("fname" +request.getParameter("firstname"));
                registration_model.setFname(fname);
                registration_model.setLname(lname);
                registration_model.setContact(contact);
                registration_model.setEmail(email);
                registration_model.setPassword(password);

                out.println("<h1>" + fname + "</h1>");
                Person_details_controller registration_controller = new Person_details_controller();
                boolean b = registration_controller.registre(registration_model);

                if (b) {
                    request.setAttribute("success msg", "successfully Register.");
                    RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
                    rd.forward(request, response);
                } else {
                    request.setAttribute("success msg", "Registertion Fails.");
                    RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
                    rd.forward(request, response);
                }
            }
           //out.println("<h1>"+b+"<h1>");
            // out.println("<h1>"+fname+"<h1>"); 
        } catch (Exception ex) {
            System.out.println("Registration Servlet : " + ex);
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
