package Model;


public class M_ModoPago 
{
    public int num_pago;
    private String nombre;
    private String detalles;

    public M_ModoPago(int num_pago, String nombre, String detalles) 
    {
        this.num_pago = num_pago;
        this.nombre = nombre;
        this.detalles = detalles;
    }

    
    public int getNum_pago() 
    {
        return num_pago;
    }

    public void setNum_pago(int num_pago) 
    {
        this.num_pago = num_pago;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getDetalles() 
    {
        return detalles;
    }

    public void setDetalles(String detalles) 
    {
        this.detalles = detalles;
    }
    
    
    
    
}
