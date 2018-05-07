package Controller;

import Model.Producto;
import Model.VentaM;
import Controller.VendedorController;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTextPane;
import sun.swing.BakedArrayList;

public class VentaController {

    private static ArrayList<VentaM> venta = new ArrayList<VentaM>();
    private static ArrayList<VentaM> Registro = new ArrayList<VentaM>();
    private static ArrayList<VentaM> Backup = new ArrayList<VentaM>();
    private static ArrayList<VentaM> BackupOrdenado = new ArrayList<VentaM>();
    private ProductoController proco = new ProductoController();
    private VendedorController vendeco = new VendedorController();

    public void CreateB(VentaM vent) {
        venta.add(vent);
        Registro.add(vent);
    }

    public void Create(VentaM vent) {
        Backup.add(vent);
    }

    private void CreateBO(VentaM vent) {
        BackupOrdenado.add(vent);
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

    public ArrayList<String[]> ReadVentas() {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < Backup.size(); i++) {

            Get.add(new String[]{
                Backup.get(i).getVendedor(),
                Backup.get(i).getCodigoVend(),
                Backup.get(i).getCodigoComp(),
                Backup.get(i).getID(),
                String.valueOf(Backup.get(i).getPrecio()),
                String.valueOf(Backup.get(i).getCantidad())});
        }

        return Get;
    }

    public void asd(){
        
    }

    public void Read(String filter, int cant) {

        for (int i = 0; i < proco.getProducto().size(); i++) {
            if (proco.getProducto().get(i).getID().contains(filter)) {
                proco.Update(i, new Producto(proco.getProducto().get(i).getID(),
                        proco.getProducto().get(i).getNombre(),
                        proco.getProducto().get(i).getPrecio(), proco.getProducto().get(i).getCantidad() + cant));
            }
        }

    }

    public ArrayList<String[]> ReadRegistroVenta(String filter, JTextPane totalventa) {
        ArrayList<String[]> Get = new ArrayList<>();
        double total = 0;
        for (int i = 0; i < Backup.size(); i++) {
            if (Backup.get(i).getCodigoVend().contains(filter)) {
                Get.add(new String[]{Backup.get(i).getVendedor(),
                    Backup.get(i).getCodigoVend(), Backup.get(i).getCodigoComp(),
                    Backup.get(i).getID(), String.valueOf(Backup.get(i).getPrecio()),
                    String.valueOf(Backup.get(i).getCantidad())});
                total = total + Backup.get(i).getCantidad() * Backup.get(i).getPrecio();
                totalventa.setText(String.valueOf(total));
            }
        }
        return Get;
    }

    public void Registro() {

        Registro.removeAll(Registro);
        for (int i = 0; i < venta.size(); i++) {
            Registro.add(new VentaM(venta.get(i).getID(), venta.get(i).getNombre(),
                    (double) venta.get(i).getPrecio(), (int) venta.get(i).getCantidad(),
                    venta.get(i).getVendedor(), (double) venta.get(i).getSubtotal(),
                    venta.get(i).getCodigoVend(), venta.get(i).getCodigoComp()));
        }

    }

    public void BackupV() {

        for (int i = 0; i < Registro.size(); i++) {
            Create(new VentaM(Registro.get(i).getID(), Registro.get(i).getNombre(),
                    (double) Registro.get(i).getPrecio(), (int) Registro.get(i).getCantidad(),
                    Registro.get(i).getVendedor(), (double) Registro.get(i).getSubtotal(),
                    Registro.get(i).getCodigoVend(), Registro.get(i).getCodigoComp()));
        }
    }

    public void BorrarRegistro() {
        venta.removeAll(venta);
    }

    public static ArrayList<VentaM> getVenta() {
        return venta;
    }

    public static void setVenta(ArrayList<VentaM> venta) {
        VentaController.venta = venta;
    }

    public static ArrayList<VentaM> getRegistro() {
        return Registro;
    }

    public static void setRegistro(ArrayList<VentaM> Registro) {
        VentaController.Registro = Registro;
    }

}
