/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesJava;

/**
 *
 * @author Lenovo
 */
public class stock_Prod {
    
    private producto Producto;
    private int cant_Minima;
    private int cantidad;

    public stock_Prod(producto Producto, int cant_Minima, int cantidad) {
        this.Producto = Producto;
        this.cant_Minima = cant_Minima;
        this.cantidad = cantidad;
        
    }
    
    public stock_Prod(){
        
    }

    public producto getProducto() {
        return Producto;
    }

    public void setProducto(producto Producto) {
        this.Producto = Producto;
    }

    public int getCant_Minima() {
        return cant_Minima;
    }

    public void setCant_Minima(int cant_Minima) {
        this.cant_Minima = cant_Minima;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "stock_Prod{" + "Producto=" + Producto + ", cant_Minima=" + cant_Minima + ", cantidad=" + cantidad + '}';
    }
    
    
    public Boolean HayStock(producto Producto){
          //  public boolean addDocumento(Documentos c) {
        boolean result = false;
        if(cantidad == 0)
            System.out.println("No hay stock de este producto " + Producto.getProducto());
 
    result= true;
    return result;
    
    
   }  
   

           
        
 
}
