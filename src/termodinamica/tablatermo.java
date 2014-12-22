/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package termodinamica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 */
public class tablatermo {
    
    public float obtenerh3(float idtemperatura3){
        try{
            Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/tablatermo","root", "");
            Statement st= conexion.createStatement();  
            ResultSet rs = st.executeQuery("select entalpia from tabla where id_dato='"+idtemperatura3+"'");
            if(rs.next()){
                return rs.getFloat(1);
            }
            
        }
        catch (Exception e){
            System.out.println(e);
        }
        return 0;
    }
    
    public float obtenerPr3(float idtemperatura3){
        try{
            Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/tablatermo","root", "");
            Statement st= conexion.createStatement();  
            ResultSet rs = st.executeQuery("select presion from tabla where id_dato='"+idtemperatura3+"'");
            if(rs.next()){
                return rs.getFloat(1);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return 0;
    }
    
    public float obtenerT4(float idpresionr4){
        try{
            Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/tablatermo","root", "");
            Statement st= conexion.createStatement();  
            ResultSet rs = st.executeQuery("select temperatura from tabla where id_dato='"+idpresionr4+"'");
            if(rs.next()){
                return rs.getFloat(1);
            }
            
        }
        catch (Exception e){
            System.out.println(e);
        }
        return 0;
    }
    public float obtenerh4(float idpresionr4){
        try{
            Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/tablatermo","root", "");
            Statement st= conexion.createStatement();  
            ResultSet rs = st.executeQuery("select entalpia from tabla where id_dato='"+idpresionr4+"'");
            if(rs.next()){
                return rs.getFloat(1);
            }
            
        }
        catch (Exception e){
            System.out.println(e);
        }
        return 0;
    }
    
    public float obtenerT4a(float identalpia4a){
        try{
            Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/tablatermo","root", "");
            Statement st= conexion.createStatement();  
            ResultSet rs = st.executeQuery("select temperatura from tabla where id_dato='"+identalpia4a+"'");
            if(rs.next()){
                return rs.getFloat(1);
            }
            
        }
        catch (Exception e){
            System.out.println(e);
        }
        return 0;
    }

   
    
    
}
