package Controller;

import Model.Producto;
import Model.VentaM;
import Controller.VendedorController;
import com.sun.swing.internal.plaf.basic.resources.basic;
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

    public void UpdateB(int index, VentaM vent) {
        BackupOrdenado.set(index, vent);
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

    public void Read(String filter, int cant) {

        for (int i = 0; i < proco.getProducto().size(); i++) {
            if (proco.getProducto().get(i).getID().equals(filter)) {
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
            if (Backup.get(i).getCodigoVend().equals(filter)) {
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

        Registro.clear();
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

    /*public ArrayList<String[]> ReadTotalOrdenado() {
        double total = 0;
        boolean val = true;
        double subtotal = 0;
        ArrayList<String[]> Get = new ArrayList<>();
        Get.clear();
        BackupOrdenado.clear();
        for (int i = 0; i < vendeco.getVendedor().size(); i++) {
            System.out.println(vendeco.getVendedor().get(i).getNombre());
            for (int j = 0; j < Backup.size(); j++) {

                if (vendeco.getVendedor().get(i).getNombre().equalsIgnoreCase(Backup.get(j).getVendedor())) {

                    if (Backup.get(j).getCantidad() >= 1 && Backup.get(j).getCantidad() < 30) {
                        total = total + Backup.get(j).getSubtotal() * 0.3;

                        subtotal = subtotal + Backup.get(j).getPrecio() * Backup.get(j).getCantidad();
                        val = false;
                    } else if (Backup.get(j).getCantidad() >= 30 && Backup.get(j).getCantidad() < 50) {
                        total = total + (Backup.get(j).getSubtotal() * 0.3) + (Backup.get(j).getSubtotal() * 0.05);

                        subtotal = subtotal + Backup.get(j).getPrecio() * Backup.get(j).getCantidad();
                        val = false;
                    } else if (Backup.get(j).getCantidad() >= 51 && Backup.get(j).getCantidad() < 100) {
                        total = total + (Backup.get(j).getSubtotal() * 0.3) + (Backup.get(j).getSubtotal() * 0.1);

                        subtotal = subtotal + Backup.get(j).getPrecio() * Backup.get(j).getCantidad();
                        val = false;
                    } else if (Backup.get(j).getCantidad() >= 101) {
                        total = total + (Backup.get(j).getSubtotal() * 0.3) + (Backup.get(j).getSubtotal() * 0.15) - (Backup.get(j).getSubtotal() * 0.08);
                        subtotal = subtotal + Backup.get(j).getPrecio() * Backup.get(j).getCantidad();
                        val = false;
                    }
                }

            }
            int cont = 0;
            for (int j = 0; j < vendeco.getVendedor().size(); j++) {
                cont++;
                if (vendeco.getVendedor().size() == 2) {
                    CreateBO(new VentaM("", "", 0, 0, "", 0, ""));
                } else if (vendeco.getVendedor().size() == 0) {
                    CreateBO(new VentaM("", "", 0, 0, "", 0, ""));
                    CreateBO(new VentaM("", "", 0, 0, "", 0, ""));
                    CreateBO(new VentaM("", "", 0, 0, "", 0, ""));
                } else if (vendeco.getVendedor().size() == 1) {
                    CreateBO(new VentaM("", "", 0, 0, "", 0, ""));
                    CreateBO(new VentaM("", "", 0, 0, "", 0, ""));
                }
            }
            try {
                if (val == false) {
                    CreateBO(new VentaM(String.valueOf(subtotal), Backup.get(i).getNombre(),
                            Backup.get(i).getPrecio(), Backup.get(i).getCantidad(),
                            Backup.get(i).getVendedor(), total, Backup.get(i).getCodigoVend()));
                    val = true;
                }
            } catch (Exception e) {
                System.out.println("ERROR");
            }

            total = 0;
            subtotal = 0;
        }

        Collections.sort(BackupOrdenado);

        for (int i = 0; i < BackupOrdenado.size(); i++) {
            Get.add(new String[]{BackupOrdenado.get(i).getCodigoVend(),
                BackupOrdenado.get(i).getVendedor(), BackupOrdenado.get(i).getID(),
                String.valueOf(BackupOrdenado.get(i).getSubtotal())});

        }
        subtotal = 0;
        return Get;
    }*/
    public void Ordenamiento() {
        double total = 0;
        boolean bol = false;
        BackupOrdenado.clear();
        for (int i = 0; i < vendeco.getVendedor().size(); i++) {

            for (int j = 0; j < Backup.size(); j++) {
                if (vendeco.getVendedor().get(i).getID().equals(Backup.get(j).getCodigoVend())) {
                    bol = true;
                    total = 0;
                    for (int k = 0; k < BackupOrdenado.size(); k++) {

                        try {
                            if (Backup.get(j).getCodigoVend().equals(BackupOrdenado.get(k).getCodigoVend())) {

                                int cant = Backup.get(j).getCantidad() + BackupOrdenado.get(k).getCantidad();
                                double pre = Backup.get(j).getPrecio() + BackupOrdenado.get(k).getPrecio();
                                double sub = Backup.get(j).getSubtotal() + BackupOrdenado.get(k).getSubtotal();
                                UpdateB(k, new VentaM(Backup.get(j).getID(), Backup.get(j).getNombre(), pre,
                                        cant, Backup.get(j).getVendedor(), sub, Backup.get(j).getCodigoVend(), 0.0));
                                bol = false;
                            }
                        } catch (Exception e) {
                            break;
                        }

                    }

                    if (bol == true) {
                        CreateBO(new VentaM(Backup.get(j).getID(), Backup.get(j).getNombre(), Backup.get(j).getPrecio(),
                                Backup.get(j).getCantidad(), Backup.get(j).getVendedor(), Backup.get(j).getSubtotal(), Backup.get(j).getCodigoVend(), 0));
                    }

                }
            }

        }

    }

     public void UpdateBS() {
        double sueldo = 0;
        double ventas = 0;
        int cant = 0;
        boolean bol = true;
        for (int i = 0; i < BackupOrdenado.size(); i++) {
            cant = 0;
            for (int k = 0; k < Backup.size(); k++) {
                if (BackupOrdenado.get(i).getCodigoVend().equals(Backup.get(k).getCodigoVend())) {
                    cant = cant + Backup.get(k).getCantidad();
                }
            }
            for (int j = 0; j < Backup.size(); j++) {

                if (BackupOrdenado.get(i).getCodigoVend().equals(Backup.get(j).getCodigoVend())) {
                    sueldo = sueldo + (cant * Backup.get(j).getPrecio()) * 0.3;
                    bol = false;
                    ventas = sueldo;
                    if (cant >= 30 && cant <= 50) {
                        ventas = sueldo + (cant * Backup.get(j).getPrecio()) * 0.05;
                    } else if (cant >= 51 && cant <= 100) {
                        ventas = sueldo + (cant * Backup.get(j).getPrecio()) * 0.1;
                    } else if (cant >= 101) {
                        ventas = sueldo + (cant * Backup.get(j).getPrecio()) * 0.15;
                        ventas = sueldo - (ventas * 0.4) + (ventas * 0.4);

                    }
                    break;
                }
            }

            if (bol == false) {

                System.out.println(sueldo);
                System.out.println(ventas);
                UpdateB(i, new VentaM(BackupOrdenado.get(i).getID(), BackupOrdenado.get(i).getNombre(),
                        BackupOrdenado.get(i).getPrecio(), BackupOrdenado.get(i).getCantidad(),
                        BackupOrdenado.get(i).getVendedor(), BackupOrdenado.get(i).getSubtotal(),
                        BackupOrdenado.get(i).getCodigoVend(), ventas));
                bol = true;
                ventas = 0;
                sueldo = 0;
                cant = 0;
            }

        }

    }

    public ArrayList<String[]> ReadTO() {
        ArrayList<String[]> Get = new ArrayList<>();
        Get.clear();
        Collections.sort(BackupOrdenado);
        for (int i = 0; i < BackupOrdenado.size(); i++) {
            Get.add(new String[]{BackupOrdenado.get(i).getCodigoVend(),
                BackupOrdenado.get(i).getVendedor(), String.valueOf(BackupOrdenado.get(i).getSubtotal()),
                String.valueOf(BackupOrdenado.get(i).getSueldo())});

        }
        return Get;
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
