package Controller;

import java.util.ArrayList;
import Model.Vendedorm;

public class VendedorController {
    
    private static ArrayList<Vendedorm> vendedor = new ArrayList<Vendedorm>();
    
    public void create(Vendedorm trabajador){
        vendedor.add(trabajador);
    }
    
    public ArrayList<String[]> Read(String filter){
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < vendedor.size(); i++) {
            if (vendedor.get(i).getNombre().contains(filter)) {
                Get.add(new String[]{vendedor.get(i).getID(),
                    vendedor.get(i).getNombre(),
                    vendedor.get(i).getNumDocumento(),
                    vendedor.get(i).getTelefono()});
            }
        }
        return Get;
    }
    
    public ArrayList<String[]> ReadAll(){
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < vendedor.size(); i++) {
            
                Get.add(new String[]{vendedor.get(i).getID(),
                    vendedor.get(i).getNombre(),
                    vendedor.get(i).getNumDocumento(),
                    vendedor.get(i).getTelefono()});
            }
        
        return Get;
    }
    
    public void Update(int index, Vendedorm trabajador){
        vendedor.set(index, trabajador);
    }
    
    public void Delete(int index){
        vendedor.remove(index);
    }
    
    public static ArrayList<Vendedorm> getVendedor() {
        return vendedor;
    }
    
}
