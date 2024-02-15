/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_examination_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class DBConnection {
    
    private static final String username ="root"; 
   private static final String password ="Campmake96"; 
   private static final String dataconnect ="jdbc:mysql://localhost:3306/online_testing_system"; 
   
    Connection connect = null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    int q ,i;
    
      public void updateDB() 
    {
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect =DriverManager.getConnection(dataconnect ,username ,password);

    }  catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "There was an error adding to the registering student");
       }
    }
    
    
}
