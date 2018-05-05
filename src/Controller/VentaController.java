package Controller;

import Model.Producto;
import Model.VentaM;
import java.util.ArrayList;

public class VentaController {

    private static ArrayList<VentaM> venta = new ArrayList<VentaM>();
    private static ArrayList<VentaM> BackupA = new ArrayList<VentaM>();
    private ProductoController proco = new ProductoController();

    public void Create(VentaM vent) {
        venta.add(vent);
    }

    public void Delete(int index) {
        venta.remove(index);
    }

    public void Update(int index, VentaM vent) {
        venta.set(index, vent);
    }

    public ArrayList<String[]> ReadAll() {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < venta.size(); i++) {

            Get.add(new String[]{
                venta.get(i).getID(),
                venta.get(i).getNombre(),
                String.valueOf(venta.get(i).getPrecio()),
                String.valueOf(venta.get(i).getCantidad()),
                String.valueOf(venta.get(i).getSubtotal())});

        }

        return Get;
    }

    public ArrayList<String[]> Read(String filter, int cant) {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < proco.getProducto().size(); i++) {
            if (proco.getProducto().get(i).getID().contains(filter)) {
                proco.Update(i, new Producto(proco.getProducto().get(i).getID(),
                        proco.getProducto().get(i).getNombre(),
                        proco.getProducto().get(i).getPrecio(), proco.getProducto().get(i).getCantidad() + cant));
            }
        }
        return Get;
    }

    public void Backup() {

        BackupA.removeAll(BackupA);

        for (int i = 0; i < venta.size(); i++) {
            BackupA.add(new VentaM(venta.get(i).getID(), venta.get(i).getNombre(),
                    (double) venta.get(i).getPrecio(), (int) venta.get(i).getCantidad(),
                    venta.get(i).getVendedor(), venta.get(i).getSubtotal()));
        }
    }

    public void BorrarCompra() {

        venta.removeAll(venta);

        for (int i = 0; i < BackupA.size(); i++) {
            venta.add(new VentaM(BackupA.get(i).getID(), BackupA.get(i).getNombre(),
                    (double) BackupA.get(i).getPrecio(), (int) BackupA.get(i).getCantidad(),
                    BackupA.get(i).getVendedor(), BackupA.get(i).getSubtotal()));
        }

    }

    public static ArrayList<VentaM> getVenta() {
        return venta;
    }

    public static void setVenta(ArrayList<VentaM> venta) {
        VentaController.venta = venta;
    }

}
