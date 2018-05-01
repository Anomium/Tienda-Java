package Model;
public class Vendedorm {
    private String nombre;
    private String NumDocumento;
    private String ID;
    private String Telefono;

    public Vendedorm(String nombre, String NumDocumento, String ID, String Telefono) {
        this.nombre = nombre;
        this.NumDocumento = NumDocumento;
        this.ID = ID;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumDocumento() {
        return NumDocumento;
    }

    public void setNumDocumento(String NumDocumento) {
        this.NumDocumento = NumDocumento;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
