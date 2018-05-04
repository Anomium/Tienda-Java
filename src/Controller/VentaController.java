package Controller;

import Model.VentaM;
import java.util.ArrayList;

public class VentaController {

    private static ArrayList<VentaM> venta = new ArrayList<VentaM>();
    
    public void Create(VentaM vent) {
        venta.add(vent);
    }

    public ArrayList<String[]> ReadAll() {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < venta.size(); i++) {
            
            Get.add(new String[]{
                venta.get(i).getNombre(),
                String.valueOf(venta.get(i).getPrecio()),
                String.valueOf(venta.get(i).getCantidad()),
                String.valueOf(venta.get(i).getSubtotal())});
            
        }
        
        return Get;
    }
    
    
    public double subtotal(double PrecioUnidad, int cantidad){
        double resultado;
        resultado = PrecioUnidad * cantidad;
        return resultado;
    }

    public static ArrayList<VentaM> getVenta() {
        return venta;
    }

    public static void setVenta(ArrayList<VentaM> venta) {
        VentaController.venta = venta;
    }
    
    

}
