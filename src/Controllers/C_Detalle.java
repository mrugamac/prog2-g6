package Controllers;

import Model.M_Detalle;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class C_Detalle 
{
    public Object[][] cargarTabla() 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> detalle = new ArrayList<String>();
        
        try
        {
            Statement Auto = con.conexion.createStatement();
            String query = "select num_detalle, factura, producto, cantidad, precio from TB_Detalle;";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                detalle.add(resultado.getString("num_detalle"));
                detalle.add(resultado.getString("factura"));
                detalle.add(resultado.getString("producto"));
                detalle.add(resultado.getString("cantidad"));
                detalle.add(resultado.getString("precio"));
            }
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[detalle.size()/5][5];
        for(int j = 0; j < detalle.size()/5;j++)
        {
            for(int i = 0; i < 5; i++)
            {
                caract[j][i] = detalle.get(i+(j*5));
            }
        }
        return caract;      
    }
    
    public int Guardar(int factura, int producto, int cantidad, float precio) throws SQLException
    {

        Conexion_Controller con = new Conexion_Controller();
        int id = 0;
        con.crearConexion();
        String query = "insert into TB_Detalle (factura, producto, cantidad, precio) values ('"+factura+"','"+producto+"', '"+cantidad+"', '"+precio+"');";
        
        try(
                PreparedStatement detalle = con.conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)
            )
        {
           detalle.executeUpdate();
           try(ResultSet generateKeys = detalle.getGeneratedKeys()){
               if(generateKeys.next()){
                   id = (int) generateKeys.getLong(1);
               }else{
                   throw new SQLException("Error al generar el Numero de detalle");
               }
           }
        }
      con.CerrarConexion();
      return id;  
    }
    
    public boolean Eliminar(int num_detalle) throws SQLException
    {
        
        Conexion_Controller con = new Conexion_Controller();
        String sql = "delete from TB_Detalle where num_detalle = "+num_detalle+";";
        return con.ejecutarSQL(sql);   
    }
    
    public boolean Modificar(int num_detalle, int producto, int factura, int cantidad, float precio)
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
           
        try
        {
            Statement moda = con.conexion.createStatement();
            moda.executeUpdate("update TB_Detalle set num_detalle = '"+num_detalle+"', factura = '"+factura+"', producto = '"+producto+"', cantidad = '"+cantidad+"', precio = '"+precio+"'  where num_detalle = "+num_detalle+";");
        }
        catch (SQLException ex) 
        { 
            return false;
        }
        con.CerrarConexion();
        return true;   
    }
    
    public Object[][] cargarTablaNumDetalle(int num_detalle) 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> detalle = new ArrayList<String>();
        
        try
        {
            Statement det = con.conexion.createStatement();
            String query = "select num_detalle, factura, producto, cantidad, precio from TB_Detalle = '"+num_detalle+"';";
            ResultSet resultado = det.executeQuery(query);
            
            while(resultado.next())
            {
                detalle.add(resultado.getString("num_detalle"));
                detalle.add(resultado.getString("factura"));
                detalle.add(resultado.getString("producto"));
                detalle.add(resultado.getString("cantidad"));
                detalle.add(resultado.getString("precio"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[detalle.size()/5][5];
        for(int j =0; j < detalle.size()/5;j++)
        {
            for(int i =0; i < 5;i++)
            {
                caract[j][i] = detalle.get(i+(j*5));
            }
        }
        return caract;      
    }
    
    public Object[][] cargarTablaFactura(int factura) 
    {   
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> detalle = new ArrayList<String>();
        
        try{
            Statement Auto = con.conexion.createStatement();
            String query = "select num_detalle, factura, producto, cantidad, precio from TB_Detalle = '"+factura+"';";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                detalle.add(resultado.getString("num_detalle"));
                detalle.add(resultado.getString("factura"));
                detalle.add(resultado.getString("cantidad"));
                detalle.add(resultado.getString("precio"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[detalle.size()/5][5];
        for(int j =0; j < detalle.size()/5;j++)
        {
            for(int i =0; i < 5;i++)
            {
                caract[j][i] = detalle.get(i+(j*5));
            }
        }
        return caract;      
    }
}
