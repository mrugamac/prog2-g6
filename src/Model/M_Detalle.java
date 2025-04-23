package Model;

public class M_Detalle 
{
    public int num_detalle;
    public int factura;
    public int producto;
    public int cantidad;
    public float precio;

    public M_Detalle(int factura, int producto, int cantidad, float precio) 
    {
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getNum_detalle() 
    {
        return num_detalle;
    }

    public void setNum_detalle(int num_detalle) 
    {
        this.num_detalle = num_detalle;
    }

    public int getFactura() 
    {
        return factura;
    }

    public void setFactura(int factura) 
    {
        this.factura = factura;
    }

    public int getCantidad() 
    {
        return cantidad;
    }

    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }

    public float getPrecio() 
    {
        return precio;
    }

    public void setPrecio(float precio) 
    {
        this.precio = precio;
    }

    public int getProducto() 
    {
        return producto;
    }

    public void setProducto(int producto) 
    {
        this.producto = producto;
    }
    
    
    
    
    
}
