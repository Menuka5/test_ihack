/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gms.util.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Python
 */
public class DbConnection {
    private final String url;
    private final String userName;
    private final String password;
    Connection con;

    public DbConnection() {
        url = "jdbc:mysql://localhost:3306/GMS";
        userName = "root";
        password = "";
    }
    public DbConnection(String url, String userName, String password){
        this.url = url;
        this.userName = userName;
        this.password = password;
    }
    
    public ResultSet execute(String sql) throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            ResultSet rs;
            con = DriverManager.getConnection(url, userName, password); 
            con.setAutoCommit(false);
            Statement st = con.createStatement();
                rs = st.executeQuery(sql);
                //rs.close();                       
            return rs;           
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }        
        return null;
    }
    
    public int update(String sql) throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            int i;
            con = DriverManager.getConnection(url, userName, password); 
            Statement st = con.createStatement();
                i = st.executeUpdate(sql);
                //rs.close();                       
            return i;           
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }        
        return -1;
    }
    public void close() throws SQLException{
        con.close();
    }
}
