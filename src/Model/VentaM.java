package Model;
public class VentaM extends Producto {
    
    private String Vendedor;
    private double subtotal;
    
    public VentaM(String ID, String nombre, double precio, int cantidad, String Vendedor, double subtotal) {
        super(ID, nombre, precio, cantidad);
    }
    

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }
    
    

}
