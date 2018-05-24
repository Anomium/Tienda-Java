package View;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import Controller.ProductoController;
import Controller.VentaController;
import Controller.VendedorController;
import Model.Producto;
import Model.Vendedorm;
import Model.VentaM;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class Venta extends javax.swing.JFrame {

    private int x, y;
    private ProductoController proco = new ProductoController();
    private VentaController venco = new VentaController();
    private VendedorController vendeco = new VendedorController();
    private Object Index = null;
    private Object IndexCmbx = null;

    public Venta() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Img/logod.png")).getImage());
        Subtotal(tp_TotalPagarVenta);
        ListarCombobox(cmbx_VendedorVenta, vendeco.getVendedor());
        ListarTodo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_MenuVenta = new javax.swing.JButton();
        btn_InformacionVenta = new javax.swing.JButton();
        btn_ProductosVenta = new javax.swing.JButton();
        btn_VendedoresVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ProductosVenta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_CarritoVenta = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tp_TotalPagarVenta = new javax.swing.JTextPane();
        btn_AgregarVenta = new javax.swing.JButton();
        btn_RetirarVenta = new javax.swing.JButton();
        btn_BuscarVenta = new javax.swing.JButton();
        txt_BuscarProductoVenta = new javax.swing.JTextField();
        btn_ComprarVenta = new javax.swing.JButton();
        btn_CancelarBusquedaProdVenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_Cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        cmbx_VendedorVenta = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btn_CancelarCompra = new javax.swing.JButton();
        txt_CodigoComprador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_RegistroVenta = new javax.swing.JTable();
        btn_BuscarRegistroVenta = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_TotalRegistroVenta = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        txt_BuscarRegistroVenta = new javax.swing.JTextField();
        btn_CancelarBusquedaRegistroVenta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Imagen1.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Imagen5.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/koda.png"))); // NOI18N
        jLabel5.setText("Koda..");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(493, 493, 493)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Total a pagar:");

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Papyrus", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("koda");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logot.png"))); // NOI18N

        btn_MenuVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        btn_MenuVenta.setText("Menu");
        btn_MenuVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuVentaMouseClicked(evt);
            }
        });

        btn_InformacionVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/informacion.png"))); // NOI18N
        btn_InformacionVenta.setText("Informacion");
        btn_InformacionVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InformacionVentaMouseClicked(evt);
            }
        });

        btn_ProductosVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        btn_ProductosVenta.setText("Productos ");
        btn_ProductosVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProductosVentaMouseClicked(evt);
            }
        });
        btn_ProductosVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductosVentaActionPerformed(evt);
            }
        });

        btn_VendedoresVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/vendedores.png"))); // NOI18N
        btn_VendedoresVenta.setText("Vendedores");
        btn_VendedoresVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VendedoresVentaMouseClicked(evt);
            }
        });

        tbl_ProductosVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio Unidad", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ProductosVenta.getTableHeader().setReorderingAllowed(false);
        tbl_ProductosVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ProductosVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ProductosVenta);
        if (tbl_ProductosVenta.getColumnModel().getColumnCount() > 0) {
            tbl_ProductosVenta.getColumnModel().getColumn(0).setResizable(false);
            tbl_ProductosVenta.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_ProductosVenta.getColumnModel().getColumn(1).setResizable(false);
            tbl_ProductosVenta.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_ProductosVenta.getColumnModel().getColumn(2).setResizable(false);
            tbl_ProductosVenta.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbl_ProductosVenta.getColumnModel().getColumn(3).setResizable(false);
            tbl_ProductosVenta.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        tbl_CarritoVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio Unidad", "Cantidad", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_CarritoVenta.getTableHeader().setReorderingAllowed(false);
        tbl_CarritoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CarritoVentaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_CarritoVenta);
        if (tbl_CarritoVenta.getColumnModel().getColumnCount() > 0) {
            tbl_CarritoVenta.getColumnModel().getColumn(0).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(1).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(2).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(3).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(4).setResizable(false);
        }

        tp_TotalPagarVenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tp_TotalPagarVenta.setText("0.0");
        tp_TotalPagarVenta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tp_TotalPagarVenta.setEnabled(false);
        jScrollPane4.setViewportView(tp_TotalPagarVenta);

        btn_AgregarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/comprar.png"))); // NOI18N
        btn_AgregarVenta.setText("Agregar");
        btn_AgregarVenta.setEnabled(false);
        btn_AgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarVentaActionPerformed(evt);
            }
        });

        btn_RetirarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_RetirarVenta.setText("Retirar");
        btn_RetirarVenta.setEnabled(false);
        btn_RetirarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetirarVentaActionPerformed(evt);
            }
        });

        btn_BuscarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        btn_BuscarVenta.setText("Buscar");
        btn_BuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarVentaActionPerformed(evt);
            }
        });

        txt_BuscarProductoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarProductoVentaKeyTyped(evt);
            }
        });

        btn_ComprarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/agrgar.png"))); // NOI18N
        btn_ComprarVenta.setText("Comprar");
        btn_ComprarVenta.setEnabled(false);
        btn_ComprarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComprarVentaActionPerformed(evt);
            }
        });

        btn_CancelarBusquedaProdVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_CancelarBusquedaProdVenta.setText("Cancelar Busqueda");
        btn_CancelarBusquedaProdVenta.setEnabled(false);
        btn_CancelarBusquedaProdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarBusquedaProdVentaActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad");

        txt_Cantidad.setEnabled(false);
        txt_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CantidadActionPerformed(evt);
            }
        });
        txt_Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CantidadKeyTyped(evt);
            }
        });

        jLabel4.setText("Nombre");

        txt_nombre.setEnabled(false);

        cmbx_VendedorVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_VendedorVentaActionPerformed(evt);
            }
        });

        jLabel6.setText("Vendedor");

        btn_CancelarCompra.setText("Cancelar Compra");
        btn_CancelarCompra.setEnabled(false);
        btn_CancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarCompraActionPerformed(evt);
            }
        });

        txt_CodigoComprador.setEnabled(false);
        txt_CodigoComprador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CodigoCompradorKeyTyped(evt);
            }
        });

        jLabel7.setText("Codigo del Comprador");

        jLabel11.setText("Nombre del producto para buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_BuscarProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_BuscarVenta))
                    .addComponent(jLabel11))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_CancelarBusquedaProdVenta)
                                .addGap(304, 304, 304)
                                .addComponent(btn_AgregarVenta)
                                .addGap(16, 16, 16)
                                .addComponent(btn_RetirarVenta))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbx_VendedorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel6))))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel24)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ComprarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_CodigoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel4))
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel2))
                                            .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane2)
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_MenuVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_VendedoresVenta)
                                .addGap(18, 18, 18)
                                .addComponent(btn_InformacionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ProductosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_CancelarCompra)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_BuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_BuscarProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_CancelarBusquedaProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel24)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ComprarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbx_VendedorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(5, 5, 5)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(5, 5, 5)
                                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_AgregarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_RetirarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_CodigoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_CancelarCompra)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_VendedoresVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_InformacionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_ProductosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_MenuVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))))
        );

        jTabbedPane1.addTab("Ventas", jPanel2);

        tbl_RegistroVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Vendedor", "Codigo del Vendedor", "Codigo del Comprador", "Codigo del Producto", "Precio por Unidad", "Cantidad Vendida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_RegistroVenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_RegistroVenta);
        if (tbl_RegistroVenta.getColumnModel().getColumnCount() > 0) {
            tbl_RegistroVenta.getColumnModel().getColumn(0).setResizable(false);
            tbl_RegistroVenta.getColumnModel().getColumn(1).setResizable(false);
            tbl_RegistroVenta.getColumnModel().getColumn(2).setResizable(false);
            tbl_RegistroVenta.getColumnModel().getColumn(3).setResizable(false);
            tbl_RegistroVenta.getColumnModel().getColumn(4).setResizable(false);
            tbl_RegistroVenta.getColumnModel().getColumn(5).setResizable(false);
        }

        btn_BuscarRegistroVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        btn_BuscarRegistroVenta.setText("Buscar");
        btn_BuscarRegistroVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarRegistroVentaActionPerformed(evt);
            }
        });

        txt_TotalRegistroVenta.setEditable(false);
        txt_TotalRegistroVenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_TotalRegistroVenta.setText("0.0");
        jScrollPane5.setViewportView(txt_TotalRegistroVenta);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Total venta:");

        txt_BuscarRegistroVenta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_BuscarRegistroVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarRegistroVentaKeyTyped(evt);
            }
        });

        btn_CancelarBusquedaRegistroVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_CancelarBusquedaRegistroVenta.setText("Cancelar Busqueda");
        btn_CancelarBusquedaRegistroVenta.setEnabled(false);
        btn_CancelarBusquedaRegistroVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarBusquedaRegistroVentaActionPerformed(evt);
            }
        });

        jLabel10.setText("Codigo del vendedor para buscar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_CancelarBusquedaRegistroVenta)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txt_BuscarRegistroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(btn_BuscarRegistroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_BuscarRegistroVenta)
                    .addComponent(txt_BuscarRegistroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_CancelarBusquedaRegistroVenta)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Registro de Ventas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento para pasar a la ventana Menu
    private void btn_MenuVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuVentaMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_MenuVentaMouseClicked

    //Evento para pasar a la ventana Vendedor
    private void btn_VendedoresVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendedoresVentaMouseClicked
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VendedoresVentaMouseClicked

    //Evento para pasar a la ventana Informacion
    private void btn_InformacionVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InformacionVentaMouseClicked
//        try {
        Informacion infomacion = new Informacion();
        infomacion.setVisible(true);
        this.dispose();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "No puede acceder a esta opcion, primero se necesita una venta.", "Error", 0);
//        }


    }//GEN-LAST:event_btn_InformacionVentaMouseClicked

    //Evento para cerrar el programa
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    //Evento para maximizar la Ventana en la que se encuentra
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btn_ProductosVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosVentaMouseClicked

        RegistrarProducto registrarproducto = new RegistrarProducto();
        registrarproducto.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_ProductosVentaMouseClicked

    private void btn_ProductosVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductosVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ProductosVentaActionPerformed

    private void btn_BuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarVentaActionPerformed
        BuscarTodo(txt_BuscarProductoVenta.getText().toUpperCase(), tbl_ProductosVenta, proco.Read(txt_BuscarProductoVenta.getText().toUpperCase()), btn_CancelarBusquedaProdVenta);
    }//GEN-LAST:event_btn_BuscarVentaActionPerformed

    private void btn_CancelarBusquedaProdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarBusquedaProdVentaActionPerformed
        ListarTodo();
        btn_CancelarBusquedaProdVenta.setEnabled(false);

    }//GEN-LAST:event_btn_CancelarBusquedaProdVentaActionPerformed

    private void txt_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CantidadActionPerformed

    private void tbl_ProductosVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ProductosVentaMouseClicked
        try {
            if (evt.getButton() != 3 && evt.getButton() != 2) {
                Index = null;
                SelecTable(tbl_ProductosVenta, btn_AgregarVenta, true);
                txt_Cantidad.setEnabled(true);
                txt_CodigoComprador.setEnabled(true);
                txt_nombre.setText(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 1).toString());
                btn_RetirarVenta.setEnabled(false);
            } else {
                Index = null;
                txt_nombre.setText(null);
                txt_Cantidad.setText(null);
                txt_CodigoComprador.setText(null);
            }

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            Index = null;
            txt_nombre.setText(null);
            txt_nombre.setText(null);
            txt_Cantidad.setText(null);
            txt_CodigoComprador.setText(null);
        }


    }//GEN-LAST:event_tbl_ProductosVentaMouseClicked

    private void tbl_CarritoVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CarritoVentaMouseClicked
        try {
            Index = null;
            SelecTable(tbl_CarritoVenta, btn_RetirarVenta, true);
            txt_Cantidad.setEnabled(true);
            txt_nombre.setText(tbl_CarritoVenta.getValueAt(tbl_CarritoVenta.getSelectedRow(), 1).toString());
            btn_AgregarVenta.setEnabled(false);
            Index = tbl_CarritoVenta.getSelectedRow();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Para seleccionar un producto es con clic izquierdo.");
        }

    }//GEN-LAST:event_tbl_CarritoVentaMouseClicked

    private void btn_AgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarVentaActionPerformed

        try {
            if (ValCeroEspacio(txt_nombre.getText(), txt_Cantidad.getText(), txt_CodigoComprador.getText())) {
                if (Integer.parseInt(txt_Cantidad.getText()) <= Integer.parseInt(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 3).toString()) && Integer.parseInt(txt_Cantidad.getText()) >= 1) {
                    venco.CreateB(new VentaM(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 0).toString(),
                            tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 1).toString(),
                            Double.parseDouble(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 2).toString()),
                            Integer.parseInt(txt_Cantidad.getText()), (String) cmbx_VendedorVenta.getSelectedItem(),
                            Double.parseDouble(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 2).toString())
                            * Integer.parseInt(txt_Cantidad.getText()), vendeco.getVendedor().get((int) IndexCmbx).getID(), txt_CodigoComprador.getText()));

                    proco.Update(tbl_ProductosVenta.getSelectedRow(), new Producto(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 0).toString(), tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 1).toString(),
                            Double.parseDouble(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 2).toString()), proco.getProducto().get(tbl_ProductosVenta.getSelectedRow()).getCantidad() - Integer.parseInt(txt_Cantidad.getText())));
                    System.out.println(" 1 ");
                    btn_AgregarVenta.setEnabled(false);
                    btn_ComprarVenta.setEnabled(true);
                    //btn_CancelarCompra.setEnabled(true);

                    System.out.println(" 2 ");
                    Subtotal(tp_TotalPagarVenta);
                    ListarTodo();
                    txt_nombre.setText(null);
                    txt_Cantidad.setText(null);
                    txt_BuscarRegistroVenta.setText(null);
                    txt_BuscarProductoVenta.setText(null);
                    txt_Cantidad.setEnabled(false);
                    txt_CodigoComprador.setEnabled(false);

                    System.out.println(" 3 ");
                } else if (Integer.parseInt(tbl_ProductosVenta.getValueAt(tbl_ProductosVenta.getSelectedRow(), 3).toString()) == 0) {
                    JOptionPane.showMessageDialog(null, "No existe disponibilidad del producto en estos momentos.", "Error", 0);

                } else if (Integer.parseInt(txt_Cantidad.getText()) == 0) {
                    JOptionPane.showMessageDialog(null, "Cantidad no admitida", "Error", 0);
                } else if (Integer.parseInt(txt_Cantidad.getText()) < 0) {
                    JOptionPane.showMessageDialog(null, "No se pueden ingresar datos negativos", "Error", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad a comprar es superior a la cantidad almacenada.", "Error", 0);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que este cumpliendo con todos los campos.", "Error", 0);
        }


    }//GEN-LAST:event_btn_AgregarVentaActionPerformed

    private void btn_RetirarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetirarVentaActionPerformed
        try {
            if (Integer.parseInt(txt_Cantidad.getText()) <= Integer.parseInt(tbl_CarritoVenta.getValueAt(tbl_CarritoVenta.getSelectedRow(), 3).toString()) && Integer.parseInt(txt_Cantidad.getText()) > 1) {
                venco.Read(tbl_CarritoVenta.getValueAt(tbl_CarritoVenta.getSelectedRow(), 0).toString(), Integer.parseInt(txt_Cantidad.getText()));
                ListarTodo();
                System.out.println((int) Index);
                venco.Update((int) Index, new VentaM(tbl_CarritoVenta.getValueAt((int) Index,
                        0).toString(), tbl_CarritoVenta.getValueAt((int) Index, 1).toString(),
                        Double.parseDouble(tbl_CarritoVenta.getValueAt((int) Index, 2).toString()),
                        Integer.parseInt(tbl_CarritoVenta.getValueAt((int) Index, 3).toString())
                        - Integer.parseInt(txt_Cantidad.getText()), venco.getVenta().get((int) Index).getVendedor(),
                        Double.parseDouble(tbl_CarritoVenta.getValueAt((int) Index, 4).toString()) - (Integer.parseInt(txt_Cantidad.getText()) * Double.parseDouble(tbl_CarritoVenta.getValueAt((int) Index, 2).toString())), vendeco.getVendedor().get(cmbx_VendedorVenta.getSelectedIndex()).getID(), txt_CodigoComprador.getText()));
                Subtotal(tp_TotalPagarVenta);
                ListarTodo();

                if (venco.getVenta().get((int) Index).getCantidad() == 0) {
                    venco.Delete((int) Index);
                    Subtotal(tp_TotalPagarVenta);
                    ListarTodo();
                }
                if (venco.getVenta().size() == 0) {
                    btn_CancelarCompra.setEnabled(false);
                }

                txt_nombre.setText(null);
                txt_Cantidad.setText(null);
                txt_BuscarRegistroVenta.setText(null);
                txt_BuscarProductoVenta.setText(null);
                txt_Cantidad.setEnabled(false);
                txt_CodigoComprador.setEnabled(false);

                btn_RetirarVenta.setEnabled(false);

                System.out.println(" 3 ");
            } else if (Integer.parseInt(txt_Cantidad.getText()) >= Integer.parseInt(tbl_CarritoVenta.getValueAt(tbl_CarritoVenta.getSelectedRow(), 3).toString())) {
                JOptionPane.showMessageDialog(null, "Al retirar, la cantidad no debe de ser mayor a la del carrito de compra.", "Error", 0);
            } else if (Integer.parseInt(txt_Cantidad.getText()) <= Integer.parseInt(tbl_CarritoVenta.getValueAt(tbl_CarritoVenta.getSelectedRow(), 3).toString())) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que este cumpliendo con todos los campos.", "Error", 0);
        }
    }//GEN-LAST:event_btn_RetirarVentaActionPerformed

    private void btn_CancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarCompraActionPerformed
        /*btn_AgregarVenta.setEnabled(false);
        btn_RetirarVenta.setEnabled(false);
        btn_ComprarVenta.setEnabled(false);
        proco.BorrarCompra(venco.getVenta());
        Subtotal(tp_TotalPagarVenta);
        ListarTodo();
        btn_CancelarCompra.setEnabled(false);
        Index = null;*/
    }//GEN-LAST:event_btn_CancelarCompraActionPerformed

    private void btn_ComprarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComprarVentaActionPerformed
        venco.Registro();
        venco.BackupV();
        venco.BorrarRegistro();
        txt_Cantidad.setEnabled(false);
        txt_CodigoComprador.setEnabled(false);
        btn_RetirarVenta.setEnabled(false);
        btn_AgregarVenta.setEnabled(false);
        txt_Cantidad.setText(null);
        txt_nombre.setText(null);
        txt_CodigoComprador.setText(null);
        ListarTodo();
        Subtotal(tp_TotalPagarVenta);
        btn_ComprarVenta.setEnabled(false);
        venco.Ordenamiento();
        txt_CodigoComprador.setText(null);
    }//GEN-LAST:event_btn_ComprarVentaActionPerformed

    private void cmbx_VendedorVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_VendedorVentaActionPerformed
        IndexCmbx = cmbx_VendedorVenta.getSelectedIndex();
    }//GEN-LAST:event_cmbx_VendedorVentaActionPerformed

    private void btn_BuscarRegistroVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarRegistroVentaActionPerformed
        BuscarTodo(txt_BuscarRegistroVenta.getText().toUpperCase(), tbl_RegistroVenta, venco.ReadRegistroVenta(txt_BuscarRegistroVenta.getText(), txt_TotalRegistroVenta), btn_CancelarBusquedaRegistroVenta);

    }//GEN-LAST:event_btn_BuscarRegistroVentaActionPerformed

    private void btn_CancelarBusquedaRegistroVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarBusquedaRegistroVentaActionPerformed
        ListarTodo();
        txt_TotalRegistroVenta.setText("0.0");
        btn_CancelarBusquedaRegistroVenta.setEnabled(false);
    }//GEN-LAST:event_btn_CancelarBusquedaRegistroVentaActionPerformed

    private void txt_CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CantidadKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txt_CantidadKeyTyped

    private void txt_CodigoCompradorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CodigoCompradorKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txt_CodigoCompradorKeyTyped

    private void txt_BuscarProductoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarProductoVentaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (txt_CodigoComprador.getText().length() >= 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 8 digitos.", "Informacion", 1);
        }
    }//GEN-LAST:event_txt_BuscarProductoVentaKeyTyped

    private void txt_BuscarRegistroVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarRegistroVentaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txt_BuscarRegistroVentaKeyTyped

    //Metodo para listar todas la tablas de la vista modificar producto
    private void ListarTodo() {
        Listar((DefaultTableModel) tbl_ProductosVenta.getModel(), proco.ReadAll());
        Listar((DefaultTableModel) tbl_CarritoVenta.getModel(), venco.ReadAll());
        Listar((DefaultTableModel) tbl_RegistroVenta.getModel(), venco.ReadVentas());
    }

    public void ListarCombobox(JComboBox cmbx, ArrayList<Vendedorm> Array) {
        cmbx.removeAllItems();

        for (Vendedorm vendedor : Array) {
            cmbx.addItem(vendedor.getNombre());
        }
    }

    //Este Metodo Sirve Para Listar las Tablas
    private void Listar(DefaultTableModel Tabla, ArrayList<String[]> Lista) {
        //Elimino todas las filas
        while (Tabla.getRowCount() != 0) {
            Tabla.removeRow(0);
        }
        //Agrego las Filas
        for (String[] Row : Lista) {
            Tabla.addRow(Row);
        }
    }

    private void BuscarTodo(String Filter, JTable Tabla, ArrayList Array, JButton Cancelar) {
        //Valido la entrada del buscar
        if (Filter.isEmpty() || Filter == null) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
        } else if (Array.size() <= 0 || Array == null) {
            JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias", "No se han encontrado", 1);
        } else {
            Listar((DefaultTableModel) Tabla.getModel(), Array);
            Cancelar.setEnabled(true);
        }
    }

    //Metodo para habilitar Botones de la vista Modificar producto
    private void HabilitarBotones(JButton comprar, boolean Cond) {
        comprar.setEnabled(Cond);

    }

    //Metodo para hacer la confirmacion por cuadro de dialogo
    private boolean ConfirmDialog(String texto) {
        int num = JOptionPane.showConfirmDialog(null, texto);
        if (num == JOptionPane.YES_OPTION) {
            return true;
        } else if (num == JOptionPane.NO_OPTION) {
            return false;
        } else {
            HabilitarBotones(btn_ComprarVenta, false);
            Index = null;
            return false;
        }

    }

    //Metodo para cuando seleccione un elemento de una tabla y asi mismo cuando termina el proceso
    private void SelecTable(JTable Tabla, JButton Boton, boolean Cond) {
        if (Index == null || Cond == false) {

            Boton.setEnabled(Cond);
        }
        if (Cond) {
            Index = Integer.parseInt(Tabla.getValueAt(Tabla.getSelectedRow(), 0).toString());
        } else {
            Index = null;
        }
    }

    private void Subtotal(JTextPane panel) {
        double total = 0;
        for (int i = 0; i < venco.getVenta().size(); i++) {
            total = total + venco.getVenta().get(i).getSubtotal();
        }
        panel.setText(String.valueOf(total));
    }

    public boolean ValCeroEspacio(String nombre, String cantidad, String id) {
        try {
            if (nombre.isEmpty() || nombre == null || id.isEmpty() || id == null || cantidad == null || cantidad.isEmpty()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarVenta;
    private javax.swing.JButton btn_BuscarRegistroVenta;
    private javax.swing.JButton btn_BuscarVenta;
    private javax.swing.JButton btn_CancelarBusquedaProdVenta;
    private javax.swing.JButton btn_CancelarBusquedaRegistroVenta;
    private javax.swing.JButton btn_CancelarCompra;
    private javax.swing.JButton btn_ComprarVenta;
    private javax.swing.JButton btn_InformacionVenta;
    private javax.swing.JButton btn_MenuVenta;
    private javax.swing.JButton btn_ProductosVenta;
    private javax.swing.JButton btn_RetirarVenta;
    private javax.swing.JButton btn_VendedoresVenta;
    private javax.swing.JComboBox<String> cmbx_VendedorVenta;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_CarritoVenta;
    private javax.swing.JTable tbl_ProductosVenta;
    private javax.swing.JTable tbl_RegistroVenta;
    private javax.swing.JTextPane tp_TotalPagarVenta;
    private javax.swing.JTextField txt_BuscarProductoVenta;
    private javax.swing.JTextField txt_BuscarRegistroVenta;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_CodigoComprador;
    private javax.swing.JTextPane txt_TotalRegistroVenta;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
