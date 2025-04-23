package Model;

public class M_Cliente 
{
    public int id_cliente;
    private String nomcliente;
    private String apecliente;
    private String direcliente;
    private String Fecha_nacimiento;
    private String telcliente;
    private String ecliente;
    
    public M_Cliente(int id_cliente, String nomcliente, String apecliente, String direcliente, String Fecha_nacimiento, String telcliente, String ecliente)
    {
        this.id_cliente = id_cliente;
        this.nomcliente = nomcliente;
        this.apecliente = apecliente;
        this.direcliente = direcliente;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.telcliente = telcliente;
        this.ecliente = ecliente;
    }

    public int getId_cliente() 
    {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) 
    {
        this.id_cliente = id_cliente;
    }

    public String getNomcliente() 
    {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) 
    {
        this.nomcliente = nomcliente;
    }

    public String getApecliente() 
    {
        return apecliente;
    }

    public void setApecliente(String apecliente) 
    {
        this.apecliente = apecliente;
    }

    public String getDirecliente() 
    {
        return direcliente;
    }

    public void setDirecliente(String direcliente) 
    {
        this.direcliente = direcliente;
    }

    public String getFecha_nacimiento() 
    {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) 
    {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public String getTelcliente() 
    {
        return telcliente;
    }

    public void setTelcliente(String telcliente) 
    {
        this.telcliente = telcliente;
    }

    public String getEcliente() 
    {
        return ecliente;
    }

    public void setEcliente(String ecliente) 
    {
        this.ecliente = ecliente;
    }
    
    
    
}

/**
 * id_cliente int auto_increment primary key not null,
nombre varchar(20) not null,
apellido varchar(20) not null,
direccion varchar(50) not null,
nacimiento date,
telefono varchar(20) not null,
email varchar(50) not null
 */