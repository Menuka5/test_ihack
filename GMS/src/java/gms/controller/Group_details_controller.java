/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gms.controller;

import gms.model.Group_details_model;
import gms.util.config.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author janaka
 */
public class Group_details_controller {
    
    public static boolean insert_group_details(Group_details_model gdm) throws SQLException{
        
        String quary = "insert into group_details values(null, '"+gdm.getGname()+"', "+gdm.getGcreateMemberid()+", '"+gdm.getDate()+"', '"+gdm.getTime()+"', '"+gdm.getPrivacy()+"', '"+gdm.getGdescription()+"')";
        DbConnection connection = new DbConnection();
        int i = connection.update(quary);
        System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii"+i);
        if(i > 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static ArrayList<Group_details_model> getAssignGroups(int personID) throws SQLException{
        String quary = "select * from group_details where create_member_id = "+personID+"";
        DbConnection connection = new DbConnection();
        ResultSet rs = connection.execute(quary);
        Group_details_model gdm;// = new Registration_model();
        ArrayList<Group_details_model> assign_gruop_arraylist = new ArrayList<>();
        while (rs.next()) {
            /*
            rm.setFname(rs.getString(1));
            rm.setLname(rs.getString(2));
            rm.setLname(rs.getString(3));
            rm.setLname(rs.getString(4));
            */
            gdm = new Group_details_model(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),  rs.getString(7));
            assign_gruop_arraylist.add(gdm);
        }
        
        return assign_gruop_arraylist;
    }
}
