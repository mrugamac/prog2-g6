package Controllers;

import Model.M_Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class C_Cliente 
{
    public Object[][] cargarTabla() 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> Clientes = new ArrayList<String>();
        
        try
        {
            Statement Auto = con.conexion.createStatement();
            String query = "select id_cliente, nombre, apellido, direccion, nacimiento, telefono, email from TB_Cliente;";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                Clientes.add(resultado.getString("id_cliente"));
                Clientes.add(resultado.getString("nombre"));
                Clientes.add(resultado.getString("apellido"));
                Clientes.add(resultado.getString("direccion"));
                Clientes.add(resultado.getString("nacimiento"));
                Clientes.add(resultado.getString("telefono"));
                Clientes.add(resultado.getString("email"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[Clientes.size()/4][4];
        for(int j =0; j < Clientes.size()/4;j++)
        {
            for(int i =0; i < 4;i++)
            {
                caract[j][i] = Clientes.get(i+(j*4));
            }
        }
       
        return caract;      
    }
    
    public int Guardar(String nombre, String apellidos, String direccion, String nacimiento, String telefono, String email) throws SQLException
    {

        Conexion_Controller con = new Conexion_Controller();
        int id = 0;
        con.crearConexion();
        String query = "insert into TB_Cliente (nombre, apellido, direccion, nacimiento, telefono, email) values"
                + "('"+nombre+"','"+apellidos+"', '"+direccion+"','"+nacimiento+"','"+telefono+"','"+email+"');";
        
        try(
                PreparedStatement Cliente = con.conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)
            )
        {
           Cliente.executeUpdate();
           try(ResultSet generateKeys = Cliente.getGeneratedKeys()){
               if(generateKeys.next()){
                   id = (int) generateKeys.getLong(1);
               }else{
                   throw new SQLException("Error al generar el Código de Autor");
               }
           }
        }
      con.CerrarConexion();
      return id;  
    }
    
    public boolean Eliminar(int id_cliente) throws SQLException
    {
        
        Conexion_Controller con = new Conexion_Controller();
        String sql = "delete from TB_Autor where Codigo_Autor  = "+id_cliente+";";
        return con.ejecutarSQL(sql);   
    }
    
    public boolean Modificar(int CodAut, String Nombre, String Nacionalidad, String FechaN)
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
           
        try
        {
            Statement moda = con.conexion.createStatement();
            moda.executeUpdate("update TB_Autor set Nombre = '"+Nombre+"', Nacionalidad = '"+Nacionalidad+"', Fecha_nacimiento = '"+FechaN+"'  where Codigo_Autor = "+CodAut+";");
        }
        catch (SQLException ex) 
        { 
            return false;
        }
        con.CerrarConexion();
        return true;   
    }
    
    public Object[][] cargarTablaIdCliente(int id_cliente) 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> Cliente = new ArrayList<String>();
        
        try
        {
            Statement Auto = con.conexion.createStatement();
            String query = "select id_cliente, nombre, apellido, direccion, nacimiento, telefono, email from TB_Cliente where id_cliente = "+id_cliente+";";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                Cliente.add(resultado.getString("id_cliente"));
                Cliente.add(resultado.getString("nombre"));
                Cliente.add(resultado.getString("apellido"));
                Cliente.add(resultado.getString("nacimiento"));
                Cliente.add(resultado.getString("telefono"));
                Cliente.add(resultado.getString("email"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[Cliente.size()/4][4];
        for(int j =0; j < Cliente.size()/4;j++)
        {
            for(int i =0; i < 4;i++)
            {
                caract[j][i] = Cliente.get(i+(j*4));
            }
        }
        return caract;      
    }
    
    public Object[][] cargarTablaNombre(String nomb) 
    {   
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> Cliente = new ArrayList<String>();
        
        try{
            Statement Auto = con.conexion.createStatement();
            String query = "select id_cliente, nombre, apellido, direccion, nacimiento, telefono, email from TB_Cliente where nombre like '%"+nomb+"%';";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                Cliente.add(resultado.getString("id_cliente"));
                Cliente.add(resultado.getString("nombre"));
                Cliente.add(resultado.getString("apellido"));
                Cliente.add(resultado.getString("nacimiento"));
                Cliente.add(resultado.getString("telefono"));
                Cliente.add(resultado.getString("email"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[Cliente.size()/4][4];
        for(int j =0; j < Cliente.size()/4;j++)
        {
            for(int i =0; i < 4;i++)
            {
                caract[j][i] = Cliente.get(i+(j*4));
            }
        }
        return caract;      
    }
}
