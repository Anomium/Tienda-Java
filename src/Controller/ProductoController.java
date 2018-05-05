package Controller;

import java.util.ArrayList;
import Model.Producto;
import Model.VentaM;
import sun.swing.BakedArrayList;

public class ProductoController {

    private static ArrayList<Producto> producto = new ArrayList<Producto>();
    private static ArrayList<Producto> BackupA = new ArrayList<Producto>();

    public void create(Producto n1) {
        producto.add(n1);
        Backup();
    }

    public ArrayList<String[]> Read(String filter) {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i).getNombre().contains(filter)) {
                Get.add(new String[]{producto.get(i).getID(),
                    producto.get(i).getNombre(),
                    String.valueOf(producto.get(i).getPrecio()),
                    String.valueOf(producto.get(i).getCantidad())});
            }
        }
        return Get;
    }

    public ArrayList<String[]> ReadAll() {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < producto.size(); i++) {

            Get.add(new String[]{producto.get(i).getID(),
                producto.get(i).getNombre(),
                String.valueOf(producto.get(i).getPrecio()),
                String.valueOf(producto.get(i).getCantidad())});
        }

        return Get;
    }

    public void Backup() {

        BackupA.removeAll(BackupA);

        for (int i = 0; i < producto.size(); i++) {
            BackupA.add(new Producto(producto.get(i).getID(), producto.get(i).getNombre(),
                    (double) producto.get(i).getPrecio(), (int) producto.get(i).getCantidad()));
        }
    }

    public void BorrarCompra(ArrayList<VentaM> vent) {
        vent.removeAll(vent);
        producto.removeAll(producto);

        for (int i = 0; i < BackupA.size(); i++) {
            producto.add(new Producto(BackupA.get(i).getID(), BackupA.get(i).getNombre(),
                    (double) BackupA.get(i).getPrecio(), (int) BackupA.get(i).getCantidad()));
        }


    }

    public void Update(int index, Producto product) {
        producto.set(index, product);
    }

    public void Delete(int index) {
        producto.remove(index);
    }

    public static ArrayList<Producto> getProducto() {
        return producto;
    }

    public static ArrayList<Producto> getBackup() {
        return BackupA;
    }

}
