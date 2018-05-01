package Controller;

import java.util.ArrayList;
import Model.Producto;

public class ProductoController {

    public static ArrayList<Producto> producto = new ArrayList<Producto>();

    public void create(Producto n1) {
        producto.add(n1);
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

    public void Update(int index, Producto product) {
        producto.set(index, product);
    }

    public void Delete(int index) {
        producto.remove(index);
    }

    public static ArrayList<Producto> getProducto() {
        return producto;
    }

}
