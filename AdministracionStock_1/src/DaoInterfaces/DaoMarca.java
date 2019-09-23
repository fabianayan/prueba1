/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoInterfaces;

import ClasesJava.Marca;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DaoMarca {
    
    private Marca unaMarca = new Marca();
          
    public DaoMarca(Marca auxMarca) {
        unaMarca = auxMarca;
    
    }
  public DaoMarca() {
      unaMarca.setCodigo("");
      unaMarca.setDescripcion("");
    
    }
    
    public  void insertarMarca() throws SQLException, Exception{
        Conexion conn = new Conexion();
        conn.conectar();
        String stringInsert = "insert into marca values (";
        stringInsert = stringInsert + " " + unaMarca.getCodigo() ;
        stringInsert = stringInsert + ", '" + unaMarca.getDescripcion() + "')";
        
        PreparedStatement query =conn.coneccion.prepareStatement(stringInsert);
                
                
                
    }
    
    public void updateMarca() throws SQLException, Exception{
        Conexion conn = new Conexion();
        conn.conectar();
        String stringInsert = "update marca set descripcion= ";
        
        stringInsert = stringInsert + " '" + unaMarca.getDescripcion() + "'";
        stringInsert = stringInsert + " where codigo= " + unaMarca.getCodigo() ;
        
        
        PreparedStatement query =conn.coneccion.prepareStatement(stringInsert);
                
                
        
                
    }
    
    public static ArrayList<Marca> ConsultarTodasLasMarcas(){
         
        ArrayList<Marca> marcas = new ArrayList<>();
        
       Conexion miconn = new Conexion();
              try {
                  miconn.conectar();
                  String stringInsert = "Select * from marca";
        
        Statement   miStatement;
        miStatement = miconn.coneccion.createStatement();
        ResultSet miquery = miStatement.executeQuery(stringInsert);
        Marca unaMarca = new Marca();
        while (miquery.next()){
           unaMarca.setCodigo( miquery.getString("codigo"));
           unaMarca.setDescripcion(miquery.getString("descripcion"));
           marcas.add(unaMarca);
        }
       
                          
              } catch (Exception ex) {
                  Logger.getLogger(DaoMarca.class.getName()).log(Level.SEVERE, null, ex);
              }
        
        
        
        return marcas;
    }
    
    public void deleteMarca() throws SQLException, Exception{
        Conexion conn = new Conexion();
        conn.conectar();
        String stringInsert = "delete marca ";
        
        stringInsert = stringInsert + " where codigo= " + unaMarca.getCodigo() ;
        
        
        PreparedStatement query =conn.coneccion.prepareStatement(stringInsert);
                
                
        
                
    }
          
    
}
