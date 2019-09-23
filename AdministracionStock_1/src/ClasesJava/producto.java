package ClasesJava;
public class producto {
    private int codigo;
    private String producto;
    private Marca cod_marca;
    private float precio;

    public producto(int codigo, String producto, Marca cod_marca, float precio) {
        this.codigo = codigo;
        this.producto = producto;
        this.cod_marca = cod_marca;
        this.precio = precio;
    }
     public producto (){
         
     }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Marca getCod_marca() {
        return cod_marca;
    }

    public void setCod_marca(Marca cod_marca) {
        this.cod_marca = cod_marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "producto{" + "codigo=" + codigo + ",  producto=" + producto + ", cod_marca=" + cod_marca + ", precio=" + precio + '}';
    }
    
    public void Imprimir(){  
    System.out.println("-------------------------------------------");
    System.out.println("  Codigo Producto: " + this.codigo );
    System.out.println("  Nombre: " + this.producto );
    System.out.println("  Marca: " + this.cod_marca );
    System.out.println("  Precio: " + this.precio );
    System.out.println("-------------------------------------------");
}
   
  }
    

   
    