package Model;

public class M_Producto 
{
    public int num_producto;
    private String nombre;
    public float precio;
    public int stock;
    private String moneda;

    public M_Producto(int num_producto, String nombre, float precio, int stock, String moneda) 
    {
        this.num_producto = num_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.moneda = moneda;
    }

    public int getNum_producto() 
    {
        return num_producto;
    }

    public void setNum_producto(int num_producto) 
    {
        this.num_producto = num_producto;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public float getPrecio() 
    {
        return precio;
    }

    public void setPrecio(float precio) 
    {
        this.precio = precio;
    }

    public int getStock() 
    {
        return stock;
    }

    public void setStock(int stock) 
    {
        this.stock = stock;
    }

    public String getMoneda() 
    {
        return moneda;
    }

    public void setMoneda(String moneda)
    {
        this.moneda = moneda;
    }
    
    
}
