package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Cambiar estos datos según su configuración de MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/facturacion";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "1234"; // <-- Aquí va la contraseña de su servidor MySQL

    private static Connection conexion;

    public static Connection getConexion() {
        if (conexion == null) {
            try {
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
                System.out.println("Conexión exitosa a la base de datos.");
            } catch (SQLException e) {
                System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            }
        }
        return conexion;
    }
}
