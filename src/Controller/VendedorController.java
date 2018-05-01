package Controller;

import java.util.ArrayList;
import Model.Vendedor;

public class VendedorController {
    
    public static ArrayList<Vendedor> vendedor = new ArrayList<Vendedor>();
    
    public void create(Vendedor trabajador){
        vendedor.add(trabajador);
    }
    
    public ArrayList<String[]> Read(String filter){
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).getNombre().contains(filter)) {
                Get.add(new String[]{vendedor.get(i).getID(), vendedor.get(i).getNombre(),
                    vendedor.get(i).getNumDocumento(), vendedor.get(i).getTelefono()});
            }
        }
        return Get;
    }
    
    public void Update(int index, Vendedor trabajador){
        vendedor.set(index, trabajador);
    }
    
    public void Delete(int index){
        vendedor.remove(index);
    }
    
    public static ArrayList<Vendedor> getVendedor() {
        return vendedor;
    }
    
}
