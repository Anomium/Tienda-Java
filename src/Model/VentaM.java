package Model;
public class VentaM extends Producto {
    
    private String Vendedor;
    private double subtotal;
    private String CodigoVend;
    private String CodigoComp;
    


    public VentaM(String ID, String nombre, double precio, int cantidad, String Vendedor, double subtotal, String CodigoVend, String CodigoComp) {
        
        super(ID, nombre, precio, cantidad);
        this.Vendedor = Vendedor;
        this.subtotal = subtotal;
        this.CodigoVend = CodigoVend;
        this.CodigoComp = CodigoComp;
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

    public String getCodigoVend() {
        return CodigoVend;
    }

    public void setCodigoVend(String CodigoVend) {
        this.CodigoVend = CodigoVend;
    }

    public String getCodigoComp() {
        return CodigoComp;
    }

    public void setCodigoComp(String CodigoComp) {
        this.CodigoComp = CodigoComp;
    }
    
    

}
