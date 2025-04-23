package Model;

public class M_Factura 
{
    public int num_factura;
    public int num_pago;
    private String fecha;
    private String nombre;

    public M_Factura(int num_factura, int num_pago, String fecha, String nombre) 
    {
        this.num_factura = num_factura;
        this.num_pago = num_pago;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public int getNum_factura() 
    {
        return num_factura;
    }

    public void setNum_factura(int num_factura) 
    {
        this.num_factura = num_factura;
    }

    public int getNum_pago() 
    {
        return num_pago;
    }

    public void setNum_pago(int num_pago) 
    {
        this.num_pago = num_pago;
    }

    public String getFecha() 
    {
        return fecha;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    
    
    
    
    
    
}
