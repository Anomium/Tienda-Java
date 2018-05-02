package Controller;

import Model.VentaM;
import java.util.ArrayList;

public class VentaController {
    
    public static ArrayList<VentaM> venta = new ArrayList<VentaM>();
    
    public void Create(VentaM vent){
        venta.add(vent);
    }
    
    
}
