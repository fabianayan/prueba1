package ClasesJava;

import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Marca {
    private String codigo;
    private String descripcion;
    
    
   public Marca (String codigo, String descripcion) {
            this.codigo=codigo;
            this.descripcion=descripcion;
    
     } 
   public Marca() {
        codigo="";
        descripcion="";
       
   }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

     @Override
    public String toString() {
        //return "marca{" + "codigo=" + codigo + ", descripcion=" + descripcion + '}';
        return  codigo +  " - " +descripcion ;
    }
   
   public void Imprimir(){  
    System.out.println("-------------------------------------------");
    System.out.println(" Codigo Marca: " + this.codigo );
    System.out.println(" Descripcion Marca: " + this.descripcion );
    System.out.println("-------------------------------------------");
}
   
    public void addMarca( Marca c) {
        
      Marca.this.addMarca(c);
      

    }

    
    }
