/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javawithsqlite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Javawithsqlite {
static PreparedStatement ss;
static String query;
    public static void main(String[] args) {
        try{
         Connection r =DriverManager.getConnection("jdbc:sqlite:zoz.db");
         
          query="insert into st values (?,?,?)";
          query="CREATE TABLE IF NOT EXISTS st (\n" +
"    id INTEGER PRIMARY KEY,\n" +
"    name TEXT,\n" +
"    degree INTEGER\n" +
")";
   ss=r.prepareStatement(query);
//    ss.setInt(1, 12);
//    ss.setString(2, "zoz");
//    ss.setInt(3,500);
//    
    ss.execute();
         
        }
        catch(SQLException ee){
            System.err.println(ee.getMessage());
        
        }
        
        }
    
}
