package Controllers;

import Model.M_Categoria;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class C_Categoria 
{
    public Object[][] cargarTabla() 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> categoria = new ArrayList<String>();
        
        try
        {
            Statement Auto = con.conexion.createStatement();
            String query = "select id_categoria, nombre, descripcion from TB_Categoria;";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                categoria.add(resultado.getString("id_categoria"));
                categoria.add(resultado.getString("nombre"));
                categoria.add(resultado.getString("descripcion"));
            }
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[categoria.size()/3][3];
        for(int j = 0; j < categoria.size()/3;j++)
        {
            for(int i = 0; i < 3; i++)
            {
                caract[j][i] = categoria.get(i+(j*3));
            }
        }
        return caract;      
    }
    
    public int Guardar(String nombre, String descripcion) throws SQLException
    {
        Conexion_Controller con = new Conexion_Controller();
        int id = 0;
        con.crearConexion();
        String query = "insert into TB_Categoria (nombre, descripcion) values ('"+nombre+"', '"+descripcion+"');";
        
        try(
                PreparedStatement detalle = con.conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)
            )
        {
           detalle.executeUpdate();
           try(ResultSet generateKeys = detalle.getGeneratedKeys()){
               if(generateKeys.next()){
                   id = (int) generateKeys.getLong(1);
               }else{
                   throw new SQLException("Error al generar la categoria");
               }
           }
        }
      con.CerrarConexion();
      return id;  
    }
    
    public boolean Eliminar(int id_categoria) throws SQLException
    {
        
        Conexion_Controller con = new Conexion_Controller();
        String sql = "delete from TB_Categoria where id_categoria  = "+id_categoria+";";
        return con.ejecutarSQL(sql);   
    }
    
    public boolean Modificar(int id, String nom, String descripcion)
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
           
        try
        {
            Statement moda = con.conexion.createStatement();
            moda.executeUpdate("update TB_Categoria set nombre = '"+nom+"',detalles = '"+descripcion+"' where id_categoria = "+id+";");
        }
        catch (SQLException ex) 
        { 
            return false;
        }
        con.CerrarConexion();
        return true;   
    }
    
    public Object[][] cargarTablaIdCategoria(int id_categoria) 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> categorias = new ArrayList<String>();
        
        try
        {
            Statement Auto = con.conexion.createStatement();
            String query = "select id_categoria, nombre, descripcion from TB_Cliente where id_cliente = "+id_categoria+";";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                categorias.add(resultado.getString("id_categoria"));
                categorias.add(resultado.getString("nombre"));
                categorias.add(resultado.getString("descripcion"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[categorias.size()/3][3];
        for(int j =0; j < categorias.size()/3;j++)
        {
            for(int i =0; i < 3;i++)
            {
                caract[j][i] = categorias.get(i+(j*3));
            }
        }
        return caract;      
    }
    
    public Object[][] cargarTabladescripcion(String descripcion) 
    {   
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> des = new ArrayList<String>();
        
        try{
            Statement Auto = con.conexion.createStatement();
            String query = "select id_categoria, nombre, descripcion from TB_Categoria where descripcion like '%"+descripcion+"%';";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                des.add(resultado.getString("id_categoria"));
                des.add(resultado.getString("nombre"));
                des.add(resultado.getString("descripcion"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[des.size()/3][3];
        for(int j =0; j < des.size()/3;j++)
        {
            for(int i =0; i < 3;i++)
            {
                caract[j][i] = des.get(i+(j*3));
            }
        }
        return caract;      
    }
    
    



}
