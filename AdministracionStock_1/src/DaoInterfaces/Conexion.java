/**DAO: SEPARA LA LOGICA DE NEGOCIO CON LA DE LA BASE DE DATOS PARA TENER ORDEN EN EL CODIGO**/
package DaoInterfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion { //DAO: DATA ACCESS OBJECT "PATRON DE DISEÑO ESTANDAR"
   // root@localhost:3306
    protected Connection coneccion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "root@localhost:3306/";
    private final String BASE_DATO = "administ_stock";
    private final String USER = "root";
    private final String PASS = "morita03" ; //  "morita03";
    
    public void conectar()throws Exception{
    
        try {
            
           // Class.forName(JDBC_DRIVER); //primero esto para reconocer
            //coneccion = DriverManager.getConnection(DB_URL+BASE_DATO,USER,PASS);
             Connection coneccion=DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/" + "administ_stock", "root", "morita03");
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void cerrar() throws SQLException{
    
        if (coneccion != null) {
            if (!coneccion.isClosed()) {
                coneccion.close();
            }
        }
    }
    
}
