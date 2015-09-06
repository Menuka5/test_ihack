/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gms.controller;

import gms.model.Person_details_model;
import gms.util.config.DbConnection;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author janaka
 */
public class Person_details_controller {
   
    public boolean registre(Person_details_model registration_model){
        
        try{
            String toEnc = registration_model.getPassword(); // Value to hash
            MessageDigest mdEnc = MessageDigest.getInstance("MD5");
            mdEnc.update(toEnc.getBytes(), 0, toEnc.length());
            String password = new BigInteger(1, mdEnc.digest()).toString(16);

            //System.out.println("fname"+registration_model.getFname());
        String qry = "INSERT INTO person_details VALUES (null,'"+registration_model.getFname()+"', '"+registration_model.getLname()+"', '"+registration_model.getEmail()+"', '"+registration_model.getContact()+"','"+password+"')";
        //Connection con = gms.util.config.DbConnection;
            System.out.println("qry : "+qry);
        DbConnection connection = new DbConnection();
        int i = connection.update(qry);
        if(i>0){
            return true;
        }else{
            return false;
        }
        }catch(Exception ex){
            System.out.println("registre : " +ex);
        }
        return false;
    }
    
    public static ArrayList<Person_details_model> getAllMembers() throws SQLException{
        String quary = "select * from person_details";
        DbConnection connection = new DbConnection();
        ResultSet rs = connection.execute(quary);
        Person_details_model rm;// = new Registration_model();
        ArrayList<Person_details_model> registra_arraylist = new ArrayList<>();
        while (rs.next()) {
            /*
            rm.setFname(rs.getString(1));
            rm.setLname(rs.getString(2));
            rm.setLname(rs.getString(3));
            rm.setLname(rs.getString(4));
            */
            rm = new Person_details_model(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            registra_arraylist.add(rm);
        }
        
        return registra_arraylist;
    }
    
    
}
