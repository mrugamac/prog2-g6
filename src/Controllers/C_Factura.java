package Controllers;

import Model.M_Factura;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class C_Factura 
{
    public Object[][] cargarTabla() 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> factura = new ArrayList<String>();
        
        try
        {
            Statement Auto = con.conexion.createStatement();
            String query = "select num_factura, pago, fecha, nombre from TB_Factura;";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                factura.add(resultado.getString("num_factura"));
                factura.add(resultado.getString("pago"));
                factura.add(resultado.getString("fecha"));
                factura.add(resultado.getString("nombre")); 
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[factura.size()/4][4];
        for(int j = 0; j < factura.size()/4;j++)
        {
            for(int i =0; i < 4;i++)
            {
                caract[j][i] = factura.get(i+(j*4));
            }
        }
        return caract;      
    }
    
    public int Guardar(int num_factura, int num_pago, String fecha, String nombre) throws SQLException
    {

        Conexion_Controller con = new Conexion_Controller();
        int id = 0;
        con.crearConexion();
        String query = "insert into TB_Factura (num_factura, pago, fecha, nombre) values '"+num_factura+"', '"+num_pago+"', '"+fecha+"', '"+nombre+"';";
        
        try(
                PreparedStatement Factura = con.conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)
            )
        {
           Factura.executeUpdate();
           try(ResultSet generateKeys = Factura.getGeneratedKeys()){
               if(generateKeys.next()){
                   id = (int) generateKeys.getLong(1);
               }else{
                   throw new SQLException("Error al generar el Código de cliente");
               }
           }
        }
      con.CerrarConexion();
      return id;  
    }
    
    public boolean Eliminar(int num_factura) throws SQLException
    {
        
        Conexion_Controller con = new Conexion_Controller();
        String sql = "delete from TB_Detalle where num_factura  = "+num_factura+";";
        return con.ejecutarSQL(sql);   
    }
    
    public boolean Modificar(int num_factura, int num_pago, String fecha, String nombre)
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
           
        try
        {
            Statement moda = con.conexion.createStatement();
            moda.executeUpdate("update TB_Detalle set num_factura = '"+num_factura+"', pago = '"+num_pago+"', fecha = '"+fecha+"', nombre = '"+nombre+"'  where num_factura = "+num_factura+";");
        }
        catch (SQLException ex) 
        { 
            return false;
        }
        con.CerrarConexion();
        return true;   
    }
    
    public Object[][] cargarTablanum_factura(int num_factura) 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> factura = new ArrayList<String>();
        
        try
        {
            Statement Auto = con.conexion.createStatement();
            String query = "select num_factura, pago, fecha, nombre from TB_Detalle where num_factura = "+num_factura+";";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                factura.add(resultado.getString("num_factura"));
                factura.add(resultado.getString("pago"));
                factura.add(resultado.getString("fecha"));
                factura.add(resultado.getString("nombre"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[factura.size()/4][4];
        for(int j =0; j < factura.size()/4;j++)
        {
            for(int i =0; i < 4;i++)
            {
                caract[j][i] = factura.get(i+(j*4));
            }
        }
        return caract;      
    }
    
    public Object[][] cargarTablaNombre(String nomb) 
    {   
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> nombres = new ArrayList<String>();
        
        try{
            Statement Auto = con.conexion.createStatement();
            String query = "select num_factura, pago, fecha, nombre from TB_Factura where nombre like '%"+nomb+"%';";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                nombres.add(resultado.getString("num_factura"));
                nombres.add(resultado.getString("pago"));
                nombres.add(resultado.getString("fecha"));
                nombres.add(resultado.getString("nombre"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[nombres.size()/4][4];
        for(int j =0; j < nombres.size()/4;j++)
        {
            for(int i =0; i < 4;i++)
            {
                caract[j][i] = nombres.get(i+(j*4));
            }
        }
        return caract;      
    }
    
}
