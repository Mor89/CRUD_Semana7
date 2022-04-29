
package recursohumano;

import java.sql.*;

public class ConexionCRUD {
 /* Ruta de la base de datos el servidor 127.0.0.1, el puerto 3306 y el nombre 
    de la base de datos bd_recurso_humano*/
    private final String servidor = "jdbc:mysql://127.0.0.1:3306";
    //Nombre del usuario (root por defecto) de la base de datos
    private final String usuario = "root";
    //Clave del usuario de la base de datos
    private final String clave = "";
    //Libreria de mysql
    private final String driverConector = "com.msql.jdbc.Driver";
    //Objeto de la clase Connection del paquete de java.sql
    private static Connection conexion;
}
