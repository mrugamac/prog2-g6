package Controllers;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion_Controller 
{
    public Connection conexion;
    
    public Connection getConexion()
    {
        return conexion;
    }
    
    //creamos el metodo que me permite establecer mi conexion a Base de Datos
    public boolean crearConexion()
    {
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyecto;", "root", "8898");
            
        }
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            return false;
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
            return false;
        }
       return true; 
    }
    
    //creamos el metodo que me permite cerrar 
    public boolean CerrarConexion()
    {
        try
        {
            conexion.close();
        }
        catch (SQLException ex) 
        {
            System.out.println("Error de conexión");
            ex.printStackTrace();
            return false;
        }
        return true; 
    }

    //crear un metodo que me permite ejecuatr sentencia simples 
    public boolean ejecutarSQL(String sql)
    {
        this.crearConexion();
        
        try
        {
           Statement sentencia = conexion.createStatement();
           sentencia.executeUpdate(sql);
        }
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            return false;
        }
        this.CerrarConexion();
        return true;        
    }
}
