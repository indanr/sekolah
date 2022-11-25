/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siswa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SMKM
 */
public class koneksi {
    

    /**
     * @param args the command line arguments
     */
    

    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private static Connection MySQLConfig;
    
    public  static Connection configDB()throws SQLException{ 
   try {
    String dbURL ="jdbc:mysql://localhost/sekolah";
    String user ="root";
    String pass ="";
    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    MySQLConfig = DriverManager.getConnection(dbURL,user,pass);
        }catch (SQLException ex){
            System.out.println("Periksa Config");
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE,null,ex);
        }
        return MySQLConfig;
    
       }
        

 
}

