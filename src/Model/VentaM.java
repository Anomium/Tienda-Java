package Model;
public class VentaM extends Producto {
    
    private String Vendedor;
    
    public VentaM(String ID, String nombre, double precio, int cantidad, String Vendedor) {
        super(ID, nombre, precio, cantidad);
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }
    
    

}
