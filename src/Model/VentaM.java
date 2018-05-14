package Model;
import Controller.VentaController;

public class VentaM extends Producto implements Comparable<VentaM> {
    
    private VentaController venco = new VentaController();
    private String Vendedor;
    private double subtotal;
    private String CodigoVend;
    private String CodigoComp;
    private double sueldo;
    private Integer x = (int) subtotal;

    public VentaM(String ID, String nombre, double precio, int cantidad, String Vendedor, double subtotal, String CodigoVend, String CodigoComp) {

        super(ID, nombre, precio, cantidad);
        this.Vendedor = Vendedor;
        this.subtotal = subtotal;
        this.CodigoVend = CodigoVend;
        this.CodigoComp = CodigoComp;
    }

    public VentaM(String ID, String nombre, double precio, int cantidad, String Vendedor, double subtotal, String CodigoVend, double sueldo) {
        super(ID, nombre, precio, cantidad);
        this.Vendedor = Vendedor;
        this.subtotal = subtotal;
        this.CodigoVend = CodigoVend;
        this.sueldo = sueldo;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    @Override
    public int compareTo(VentaM o) {
        if (this.subtotal < o.getSubtotal()) {
            return 1;
        } else if (this.subtotal > o.getSubtotal()) {
            return -1;
        }
        return 0;
    }
    
    

}
