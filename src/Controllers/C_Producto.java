package Controllers;

import Model.M_Producto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class C_Producto 
{
    public Object[][] cargarTabla() 
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
        ArrayList<String> productos = new ArrayList<String>();
        
        try
        {
            Statement Auto = con.conexion.createStatement();
            String query = "select id_producto, nombre, precio, stock, moneda from TB_Producto;";
            ResultSet resultado = Auto.executeQuery(query);
            
            while(resultado.next())
            {
                productos.add(resultado.getString("id_prodcuto"));
                productos.add(resultado.getString("nombre"));
                productos.add(resultado.getString("precio"));
                productos.add(resultado.getString("stock"));
                productos.add(resultado.getString("moneda"));
            } 
        }
        catch(Exception ex) 
        {
            
        }
        
        Object[][] caract = new Object[productos.size()/5][5];
        for(int j = 0; j < productos.size()/5;j++)
        {
            for(int i =0; i < 7;i++)
            {
                caract[j][i] = productos.get(i+(j*5));
            }
        }
        return caract;      
    }
    
    public int Guardar(int num_producto, String nombre, float precio, int stock, String moneda) throws SQLException
    {

        Conexion_Controller con = new Conexion_Controller();
        int id = 0;
        con.crearConexion();
        String query = "insert into TB_producto (id_producto, nombre, precio, stock, moneda) values"
                + "('"+num_producto+"', '"+nombre+"','"+precio+"','"+stock+"','"+moneda+"');";
        
        try(
                PreparedStatement producto = con.conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)
            )
        {
           producto.executeUpdate();
           try(ResultSet generateKeys = producto.getGeneratedKeys()){
               if(generateKeys.next()){
                   id = (int) generateKeys.getLong(1);
               }else{
                   throw new SQLException("Error al generar el Código de producto");
               }
           }
        }
      con.CerrarConexion();
      return id;  
    }
    
    public boolean Eliminar(int id_producto) throws SQLException
    {
        
        Conexion_Controller con = new Conexion_Controller();
        String sql = "delete from TB_Producto where num_producto  = "+id_producto+";";
        return con.ejecutarSQL(sql);   
    }
    
    public boolean Modificar(int num_producto, String nombre, float precio, int stock, String moneda)
    {
        Conexion_Controller con = new Conexion_Controller();
        con.crearConexion();
           
        try
        {
            Statement moda = con.conexion.createStatement();
            moda.executeUpdate("update TB_Producto set num_producto = '"+num_producto+"', nombre = '"+nombre+"', precio = '"+precio+"', stock = '"+stock+"', moneda = '"+moneda+"' where num_producto = "+num_producto+";");
        }
        catch (SQLException ex) 
        { 
            return false;
        }
        con.CerrarConexion();
        return true;   
    }
    
    
}
