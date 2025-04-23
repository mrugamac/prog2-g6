package Controllers;

import Model.M_ModoPago;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class C_ModoPago 
{
    public Object[][] cargarTabla() 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> ModoPago = new ArrayList<String>();
        
        try
        {
            Statement Auto = con.conexion.createStatement();
            String query = "select num_pago, nombre, otros_detalles from TB_ModoPago;";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                ModoPago.add(resultado.getString("num_pago"));
                ModoPago.add(resultado.getString("nombre"));
                ModoPago.add(resultado.getString("otros_detalles"));  
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[ModoPago.size()/3][3];
        for(int j = 0; j < ModoPago.size()/3;j++)
        {
            for(int i =0; i < 3;i++)
            {
                caract[j][i] = ModoPago.get(i+(j*3));
            }
        }
        return caract;      
    }
    
    public int Guardar(String nombre, String detalles) throws SQLException
    {
        Conexion_Controller con = new Conexion_Controller();
        int id = 0;
        con.crearConexion();
        String query = "insert into TB_ModoPago (nombre, otros_detalles) values ('"+nombre+"','"+detalles+"');";
        
        try(
                PreparedStatement Pago = con.conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)
            )
        {
           Pago.executeUpdate();
           try(ResultSet generateKeys = Pago.getGeneratedKeys()){
               if(generateKeys.next()){
                   id = (int) generateKeys.getLong(1);
               }else{
                   throw new SQLException("Error al generar el Numero de pago");
               }
           }
        }
      con.CerrarConexion();
      return id;  
    }
    
    public boolean Eliminar(String nombre) throws SQLException
    {
        Conexion_Controller con = new Conexion_Controller();
        String sql = "delete from TB_ModoPago where nombre  = "+nombre+";";
        return con.ejecutarSQL(sql);   
    }
    
    public boolean Modificar(int num_pago, String nombre, String detalles)
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        
        try
        {
            Statement moda = con.conexion.createStatement();
            moda.executeUpdate("update TB_ModoPago set num_pago = '"+num_pago+"', nombre = '"+nombre+"', otros_detalles = '"+detalles+"'  where nombre = "+nombre+";");
        }
        catch (SQLException ex) 
        { 
            return false;
        }
        con.CerrarConexion();
        return true;   
    }
    
    public Object[][] cargarTablaNumPago(int num_pago) 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> Pago = new ArrayList<String>();
        
        try
        {
            Statement Auto = con.conexion.createStatement();
            String query = "select num_pago, nombre, otros_detalles from TB_ModoPago;";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                Pago.add(resultado.getString("num_pago"));
                Pago.add(resultado.getString("nombre"));
                Pago.add(resultado.getString("otros_detalles"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[Pago.size()/3][3];
        for(int j =0; j < Pago.size()/3;j++)
        {
            for(int i =0; i < 3;i++)
            {
                caract[j][i] = Pago.get(i+(j*3));
            }
        }
        return caract;      
    }
    
    public Object[][] cargarTablaNombre(String nomb) 
    {   
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> Mod = new ArrayList<String>();
        
        try{
            Statement Auto = con.conexion.createStatement();
            String query = "select num_pago, nombre, otros_detalles from TB_ModoPago;";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                Mod.add(resultado.getString("num_pago"));
                Mod.add(resultado.getString("nombre"));
                Mod.add(resultado.getString("otros_detalles"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[Mod.size()/3][3];
        for(int j =0; j < Mod.size()/3;j++)
        {
            for(int i =0; i < 3;i++)
            {
                caract[j][i] = Mod.get(i+(j*7));
            }
        }
        return caract;      
    }
}
