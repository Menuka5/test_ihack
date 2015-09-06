/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gms.servlet;

import gms.controller.Group_details_controller;
import gms.controller.Person_details_controller;
import gms.model.Group_details_model;
import gms.util.config.DbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author janaka
 */
public class createGroupServlet extends HttpServlet {

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

        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String gname = request.getParameter("gname");
            //out.println("<h1>" + gname + "</h1>");
            String gdescription = request.getParameter("gdes");
            String privacy = request.getParameter("privacy");
            String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
            String time = new SimpleDateFormat("HH-mm-ss").format(Calendar.getInstance().getTime());
            String memID = (String) request.getSession(false).getAttribute("sessionMemberID");
            String[] vals = request.getParameterValues("checkPersonID");
            
            int createMemberId = Integer.parseInt(memID);
                Group_details_model gdm = new Group_details_model();
                gdm.setGname(gname);
                gdm.setGdescription(gdescription);
                gdm.setGcreateMemberid(createMemberId);
                gdm.setDate(date);
                gdm.setTime(time);
                gdm.setPrivacy(privacy);
        //String submit = request.getParameter("submit");

                boolean b = Group_details_controller.insert_group_details(gdm);
                out.println("<h1>" + b + "</h1>");
                
            if(b){
                DbConnection con = new DbConnection();
                String quaString = "SELECT * FROM group_details ORDER BY group_id DESC LIMIT 1";
                ResultSet rs = con.execute(quaString);
                //out.println("<h1>" + rs.getString("group_id") + "</h1>");
                rs.next();
                String group_id = rs.getString("group_id");
                String quary;
                
                for (String val : vals) {
                    quary = "insert into group_member_details values (null, "+group_id+", '"+gname+"', "+val+")";
                    con.update(quary);
                }
                    
            }
                
                //out.println("<h1>" + b + "</h1>");
            } catch (SQLException ex) {
                Logger.getLogger(createGroupServlet.class.getName()).log(Level.SEVERE, null, ex);
            }catch(Exception ex){
                System.out.println("create group servlet exception:"+ex);        
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
