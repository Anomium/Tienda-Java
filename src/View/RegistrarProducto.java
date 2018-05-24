package View;

import javax.swing.ImageIcon;

import Controller.ProductoController;
import Model.Producto;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RegistrarProducto extends javax.swing.JFrame {

    private ProductoController proco = new ProductoController();
    private Object index = null;

    private int x, y;

    public RegistrarProducto() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Img/logod.png")).getImage());
        ListarTodo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Pop_Modificar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Pop_Eliminar = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_RegistrarProducto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_NombreProducto = new javax.swing.JTextField();
        txt_IDProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_PrecioProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_CantidaProducto = new javax.swing.JTextField();
        btn_RegistarProducto = new javax.swing.JButton();
        btn_InformacionMenu1 = new javax.swing.JButton();
        btn_VendedoresMenu1 = new javax.swing.JButton();
        btn_VentaMenu1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_RegistrarProducto1 = new javax.swing.JTable();
        txt_IDModificar = new javax.swing.JTextField();
        txt_CantidadModificar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_NombreModificar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_PrecioModificar = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btn_CancelarModificar = new javax.swing.JButton();
        btn_ModificarProducto = new javax.swing.JButton();
        btn_EliminarModificar = new javax.swing.JButton();
        btn_GuadarModificar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_BuscarModificar = new javax.swing.JButton();
        txt_BuscarModificar = new javax.swing.JTextField();
        btn_CancelarBusqueda = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_VentaMenu = new javax.swing.JButton();
        btn_VendedoresMenu = new javax.swing.JButton();
        btn_InformacionMenu = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        Pop_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modif.png"))); // NOI18N
        Pop_Modificar.setText("Modificar");
        Pop_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pop_ModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Pop_Modificar);
        jPopupMenu1.add(jSeparator1);

        Pop_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/elim.png"))); // NOI18N
        Pop_Eliminar.setText("Eliminar");
        Pop_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pop_EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Pop_Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tbl_RegistrarProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RegistrarProducto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_RegistrarProducto);
        if (tbl_RegistrarProducto.getColumnModel().getColumnCount() > 0) {
            tbl_RegistrarProducto.getColumnModel().getColumn(0).setResizable(false);
            tbl_RegistrarProducto.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_RegistrarProducto.getColumnModel().getColumn(1).setResizable(false);
            tbl_RegistrarProducto.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_RegistrarProducto.getColumnModel().getColumn(2).setResizable(false);
            tbl_RegistrarProducto.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbl_RegistrarProducto.getColumnModel().getColumn(3).setResizable(false);
            tbl_RegistrarProducto.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jLabel1.setText("Nombre:");

        txt_NombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreProductoKeyTyped(evt);
            }
        });

        txt_IDProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IDProductoKeyTyped(evt);
            }
        });

        jLabel2.setText("ID del Producto:");

        jLabel3.setText("Precio unidad:");

        txt_PrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PrecioProductoKeyTyped(evt);
            }
        });

        jLabel4.setText("Cantidad:");

        txt_CantidaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CantidaProductoActionPerformed(evt);
            }
        });
        txt_CantidaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CantidaProductoKeyTyped(evt);
            }
        });

        btn_RegistarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/registarpro.png"))); // NOI18N
        btn_RegistarProducto.setText("Registrar");
        btn_RegistarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistarProductoActionPerformed(evt);
            }
        });

        btn_InformacionMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/informacion.png"))); // NOI18N
        btn_InformacionMenu1.setText("Informacion");
        btn_InformacionMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InformacionMenu1MouseClicked(evt);
            }
        });
        btn_InformacionMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InformacionMenu1ActionPerformed(evt);
            }
        });

        btn_VendedoresMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/vendedores.png"))); // NOI18N
        btn_VendedoresMenu1.setText("Vendedores");
        btn_VendedoresMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VendedoresMenu1MouseClicked(evt);
            }
        });

        btn_VentaMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/venta.png"))); // NOI18N
        btn_VentaMenu1.setText("Venta");
        btn_VentaMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VentaMenu1MouseClicked(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        jButton10.setText("Menu");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_IDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_CantidaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addComponent(btn_RegistarProducto)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_VentaMenu1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_VendedoresMenu1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_InformacionMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_RegistarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_IDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CantidaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(btn_VentaMenu1)
                    .addComponent(btn_InformacionMenu1)
                    .addComponent(btn_VendedoresMenu1))
                .addGap(19, 19, 19))
        );

        jTabbedPane2.addTab("Registrar", jPanel1);

        tbl_RegistrarProducto1.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_RegistrarProducto1.setComponentPopupMenu(jPopupMenu1);
        tbl_RegistrarProducto1.getTableHeader().setReorderingAllowed(false);
        tbl_RegistrarProducto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_RegistrarProducto1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_RegistrarProducto1);
        if (tbl_RegistrarProducto1.getColumnModel().getColumnCount() > 0) {
            tbl_RegistrarProducto1.getColumnModel().getColumn(0).setResizable(false);
            tbl_RegistrarProducto1.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_RegistrarProducto1.getColumnModel().getColumn(1).setResizable(false);
            tbl_RegistrarProducto1.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_RegistrarProducto1.getColumnModel().getColumn(2).setResizable(false);
            tbl_RegistrarProducto1.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbl_RegistrarProducto1.getColumnModel().getColumn(3).setResizable(false);
            tbl_RegistrarProducto1.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        txt_IDModificar.setEnabled(false);
        txt_IDModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IDModificarKeyTyped(evt);
            }
        });

        txt_CantidadModificar.setEnabled(false);
        txt_CantidadModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CantidadModificarKeyTyped(evt);
            }
        });

        jLabel5.setText("Cantidad:");

        jLabel6.setText("ID del Producto:");

        txt_NombreModificar.setEnabled(false);
        txt_NombreModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreModificarKeyTyped(evt);
            }
        });

        jLabel7.setText("Nombre:");

        jLabel8.setText("Precio unidad:");

        txt_PrecioModificar.setEnabled(false);
        txt_PrecioModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PrecioModificarKeyTyped(evt);
            }
        });

        btn_CancelarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_CancelarModificar.setText("Cancelar");
        btn_CancelarModificar.setEnabled(false);
        btn_CancelarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarModificarActionPerformed(evt);
            }
        });

        btn_ModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modificar.png"))); // NOI18N
        btn_ModificarProducto.setText("Modificar");
        btn_ModificarProducto.setEnabled(false);
        btn_ModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarProductoActionPerformed(evt);
            }
        });

        btn_EliminarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btn_EliminarModificar.setText("Eliminar");
        btn_EliminarModificar.setEnabled(false);
        btn_EliminarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarModificarActionPerformed(evt);
            }
        });

        btn_GuadarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.png"))); // NOI18N
        btn_GuadarModificar.setText("Guardar");
        btn_GuadarModificar.setEnabled(false);
        btn_GuadarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuadarModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_GuadarModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ModificarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btn_EliminarModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_CancelarModificar)
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_CancelarModificar)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_EliminarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ModificarProducto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btn_GuadarModificar)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Modificar", jPanel4);

        btn_BuscarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        btn_BuscarModificar.setText("Buscar");
        btn_BuscarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarModificarActionPerformed(evt);
            }
        });

        txt_BuscarModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarModificarKeyTyped(evt);
            }
        });

        btn_CancelarBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_CancelarBusqueda.setText("Cancelar Busqueda");
        btn_CancelarBusqueda.setEnabled(false);
        btn_CancelarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarBusquedaActionPerformed(evt);
            }
        });

        jLabel10.setText("Buscar producto por nombre");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_BuscarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_CancelarBusqueda))
                        .addGap(36, 36, 36)
                        .addComponent(btn_BuscarModificar)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_BuscarModificar)
                    .addComponent(txt_BuscarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_CancelarBusqueda))
        );

        jTabbedPane3.addTab("Buscar", jPanel5);

        btn_VentaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/venta.png"))); // NOI18N
        btn_VentaMenu.setText("Venta");
        btn_VentaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VentaMenuMouseClicked(evt);
            }
        });

        btn_VendedoresMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/vendedores.png"))); // NOI18N
        btn_VendedoresMenu.setText("Vendedores");
        btn_VendedoresMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VendedoresMenuMouseClicked(evt);
            }
        });

        btn_InformacionMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/informacion.png"))); // NOI18N
        btn_InformacionMenu.setText("Informacion");
        btn_InformacionMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InformacionMenuMouseClicked(evt);
            }
        });
        btn_InformacionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InformacionMenuActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        jButton9.setText("Menu");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_NombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_PrecioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_IDModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_CantidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_VentaMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_VendedoresMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_InformacionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_NombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_PrecioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_IDModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_CantidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jTabbedPane3))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(btn_VentaMenu)
                    .addComponent(btn_InformacionMenu)
                    .addComponent(btn_VendedoresMenu))
                .addGap(23, 23, 23))
        );

        jTabbedPane2.addTab("Modificar", jPanel2);

        jTabbedPane1.addTab("Producto", jTabbedPane2);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/koda.png"))); // NOI18N
        jLabel9.setText("Koda..");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(371, 371, 371)
                    .addComponent(jLabel9)
                    .addContainerGap(371, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jLabel9)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento para cerrar el programa
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    //Evento para maximizar la Ventana en la que se encuentra
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9MouseClicked

    private void btn_InformacionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformacionMenuActionPerformed

    }//GEN-LAST:event_btn_InformacionMenuActionPerformed

    private void btn_InformacionMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InformacionMenuMouseClicked
        try {
            Informacion infomacion = new Informacion();
            infomacion.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No puede acceder a esta opcion, primero se necesta una venta.", "Error", 0);
        }
    }//GEN-LAST:event_btn_InformacionMenuMouseClicked

    private void btn_VendedoresMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendedoresMenuMouseClicked
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VendedoresMenuMouseClicked

    private void btn_VentaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VentaMenuMouseClicked
        Venta venta = new Venta();
        venta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VentaMenuMouseClicked

    //Evento cancelar busqueda que lista todas la tablas de la vista Registrar
    private void btn_CancelarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarBusquedaActionPerformed
        ListarTodo();
        btn_CancelarBusqueda.setEnabled(false);
    }//GEN-LAST:event_btn_CancelarBusquedaActionPerformed

    private void btn_BuscarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarModificarActionPerformed
        BuscarTodo(txt_BuscarModificar.getText().toUpperCase(), tbl_RegistrarProducto1, proco.Read(txt_BuscarModificar.getText().toUpperCase()), btn_CancelarBusqueda);
    }//GEN-LAST:event_btn_BuscarModificarActionPerformed

    //Evento para guardar las modificaciones de la vista Modificar producto
    private void btn_GuadarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuadarModificarActionPerformed
        try {
            if (ValCeroEspacio(txt_NombreModificar.getText(), txt_IDModificar.getText(), Integer.parseInt(txt_CantidadModificar.getText()), Double.parseDouble(txt_PrecioModificar.getText()))) {
                if (ConfirmDialog("¿Desea guardar los cambios?")) {
                    proco.Update((int) index, new Producto(txt_IDModificar.getText().toUpperCase(),
                            txt_NombreModificar.getText().toUpperCase(),
                            Double.parseDouble(txt_PrecioModificar.getText()),
                            Integer.parseInt(txt_CantidadModificar.getText())));
                    HabilitarBotones(btn_ModificarProducto, btn_EliminarModificar, btn_CancelarModificar, false);
                    HabilitarTxtField(txt_NombreModificar, txt_PrecioModificar, txt_IDModificar, txt_CantidadModificar, false);
                    btn_GuadarModificar.setEnabled(false);
                    ListarTodo();
                } else {
                    JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
                }

                txt_NombreModificar.setText("");
                txt_PrecioModificar.setText("");
                txt_IDModificar.setText("");
                txt_CantidadModificar.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que los campos han sido llenados correctamente.", "Error", 0);
        }


    }//GEN-LAST:event_btn_GuadarModificarActionPerformed

    //Evento para eliminar un item de la vista Modificar producto
    private void btn_EliminarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarModificarActionPerformed
        try {
            if (ConfirmDialog("¿Desea eliminar el producto?")) {
                proco.Delete((int) index);
                HabilitarBotones(btn_ModificarProducto, btn_EliminarModificar, btn_CancelarModificar, false);
                HabilitarTxtField(txt_NombreModificar, txt_PrecioModificar, txt_IDModificar, txt_CantidadModificar, false);
                btn_GuadarModificar.setEnabled(false);
                txt_NombreModificar.setText("");
                txt_PrecioModificar.setText("");
                txt_IDModificar.setText("");
                txt_CantidadModificar.setText("");
                ListarTodo();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Puede que no exista mas item para eliminar.", "Error", 0);
        }

    }//GEN-LAST:event_btn_EliminarModificarActionPerformed

    //Evento para confirmar si desea editar un producto de la vista Modificar producto
    private void btn_ModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarProductoActionPerformed
        try {
            if (ConfirmDialog("¿Desea editar el producto?")) {
                btn_GuadarModificar.setEnabled(true);
                btn_ModificarProducto.setEnabled(false);
                HabilitarTxtField(txt_NombreModificar, txt_PrecioModificar, txt_IDModificar, txt_CantidadModificar, true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que los campos han sido llenados correctamente.", "Error", 0);
        }

    }//GEN-LAST:event_btn_ModificarProductoActionPerformed

    //Evento para Cancelar todo en la vista modificar producto
    private void btn_CancelarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarModificarActionPerformed
        HabilitarBotones(btn_ModificarProducto, btn_EliminarModificar, btn_CancelarModificar, false);
        HabilitarTxtField(txt_NombreModificar, txt_PrecioModificar, txt_IDModificar, txt_CantidadModificar, false);
        btn_GuadarModificar.setEnabled(false);
        txt_NombreModificar.setText("");
        txt_PrecioModificar.setText("");
        txt_IDModificar.setText("");
        txt_CantidadModificar.setText("");
        index = null;
    }//GEN-LAST:event_btn_CancelarModificarActionPerformed

    //Evento de la tabla de la vista modificar producto
    private void tbl_RegistrarProducto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RegistrarProducto1MouseClicked
        try {
            //btn_CancelarModificar.doClick();
            if (evt.getButton() != 3 && evt.getButton() != 2) {

                HabilitarBotones(btn_ModificarProducto, btn_EliminarModificar, btn_CancelarModificar, true);
                index = tbl_RegistrarProducto1.getSelectedRow();
                txt_IDModificar.setText(tbl_RegistrarProducto1.getValueAt(tbl_RegistrarProducto1.getSelectedRow(), 0).toString());
                txt_NombreModificar.setText(tbl_RegistrarProducto1.getValueAt(tbl_RegistrarProducto1.getSelectedRow(), 1).toString());
                txt_PrecioModificar.setText(tbl_RegistrarProducto1.getValueAt(tbl_RegistrarProducto1.getSelectedRow(), 2).toString());
                txt_CantidadModificar.setText(tbl_RegistrarProducto1.getValueAt(tbl_RegistrarProducto1.getSelectedRow(), 3).toString());
            }

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Para seleccionar un producto es con clic izquierdo.");
            //btn_CancelarModificar.doClick();
        }
    }//GEN-LAST:event_tbl_RegistrarProducto1MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10MouseClicked

    private void btn_VentaMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VentaMenu1MouseClicked
        Venta venta = new Venta();
        venta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VentaMenu1MouseClicked

    private void btn_VendedoresMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendedoresMenu1MouseClicked
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VendedoresMenu1MouseClicked

    private void btn_InformacionMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformacionMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InformacionMenu1ActionPerformed

    private void btn_InformacionMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InformacionMenu1MouseClicked
        try {
            Informacion infomacion = new Informacion();
            infomacion.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No puede acceder a esta opcion, primero se necesta una venta.", "Error", 0);
        }
    }//GEN-LAST:event_btn_InformacionMenu1MouseClicked

    private void btn_RegistarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistarProductoActionPerformed
        proco.Backup();
        try {
            if (ValCodigo(txt_IDProducto.getText())) {
                if (ConfirmDialog("¿Desea registrar?")) {
                    if (ValCeroEspacio(txt_NombreProducto.getText(), txt_IDProducto.getText(), Integer.parseInt(txt_CantidaProducto.getText()), Double.parseDouble(txt_PrecioProducto.getText()))) {
                        proco.create(new Producto(txt_IDProducto.getText().toUpperCase(),
                                txt_NombreProducto.getText().toUpperCase(),
                                Double.parseDouble(txt_PrecioProducto.getText()),
                                Integer.parseInt(txt_CantidaProducto.getText())));
                        txt_NombreProducto.setText("");
                        txt_PrecioProducto.setText("");
                        txt_IDProducto.setText("");
                        txt_CantidaProducto.setText("");
                        ListarTodo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "El ID del producto ya existe.", "Error", 0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que los campos han sido llenados correctamente.", "Error", 0);
        }


    }//GEN-LAST:event_btn_RegistarProductoActionPerformed

    private void txt_PrecioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PrecioProductoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }

    }//GEN-LAST:event_txt_PrecioProductoKeyTyped

    private void txt_CantidaProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CantidaProductoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }

    }//GEN-LAST:event_txt_CantidaProductoKeyTyped

    private void txt_IDProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IDProductoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (txt_IDProducto.getText().length() >= 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 8 digitos.", "Informacion", 1);
        }

    }//GEN-LAST:event_txt_IDProductoKeyTyped

    private void txt_NombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreProductoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (txt_IDProducto.getText().length() >= 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 8 digitos.", "Informacion", 1);
        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NombreProductoKeyTyped

    private void txt_NombreModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreModificarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_NombreModificarKeyTyped

    private void txt_PrecioModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PrecioModificarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_PrecioModificarKeyTyped

    private void txt_IDModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IDModificarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (txt_IDModificar.getText().length() >= 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 8 digitos.", "Informacion", 1);
        }

    }//GEN-LAST:event_txt_IDModificarKeyTyped

    private void txt_CantidadModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CantidadModificarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_CantidadModificarKeyTyped

    private void txt_BuscarModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarModificarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_BuscarModificarKeyTyped

    private void txt_CantidaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CantidaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CantidaProductoActionPerformed

    private void Pop_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pop_EliminarActionPerformed
        try {
            if (proco.getProducto().size() > 0 && index != null) {
                if (ConfirmDialog("¿Desea eliminar el producto?")) {
                    proco.Delete((int) index);
                    HabilitarBotones(btn_ModificarProducto, btn_EliminarModificar, btn_CancelarModificar, false);
                    HabilitarTxtField(txt_NombreModificar, txt_PrecioModificar, txt_IDModificar, txt_CantidadModificar, false);
                    btn_GuadarModificar.setEnabled(false);
                    btn_GuadarModificar.setEnabled(false);
                    txt_NombreModificar.setText("");
                    txt_PrecioModificar.setText("");
                    txt_IDModificar.setText("");
                    txt_CantidadModificar.setText("");
                    ListarTodo();
                }
            } else if (proco.getProducto().size() == 0) {
                JOptionPane.showMessageDialog(null, "No exite producto para eliminar", "Aviso", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un item con el clic izquierdo", "Aviso", 1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Puede que no exista mas item para eliminar.", "Error", 0);
        }
    }//GEN-LAST:event_Pop_EliminarActionPerformed

    private void Pop_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pop_ModificarActionPerformed
        try {
            if (proco.getProducto().size() > 0 && index != null) {
                if (ConfirmDialog("¿Desea editar el producto?")) {
                    btn_GuadarModificar.setEnabled(true);
                    btn_ModificarProducto.setEnabled(false);
                    HabilitarTxtField(txt_NombreModificar, txt_PrecioModificar, txt_IDModificar, txt_CantidadModificar, true);
                }
            } else if (proco.getProducto().size() == 0) {
                JOptionPane.showMessageDialog(null, "No exite producto para eliminar", "Aviso", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un item con el clic izquierdo", "Aviso", 1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise que los campos han sido llenados correctamente.", "Error", 0);
        }
    }//GEN-LAST:event_Pop_ModificarActionPerformed

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

    //Metodo para hacer la confirmacion por cuadro de dialogo
    private boolean ConfirmDialog(String texto) {
        int num = JOptionPane.showConfirmDialog(null, texto);
        if (num == JOptionPane.YES_OPTION) {
            return true;
        } else if (num == JOptionPane.NO_OPTION) {
            return false;
        } else {
            HabilitarBotones(btn_ModificarProducto, btn_EliminarModificar, btn_CancelarModificar, false);
            HabilitarTxtField(txt_NombreModificar, txt_PrecioModificar, txt_IDModificar, txt_CantidadModificar, false);
            btn_GuadarModificar.setEnabled(false);
            index = null;
            return false;
        }

    }

    //Metodo para habilitar Botones de la vista Modificar producto
    private void HabilitarBotones(JButton Modificar, JButton Eliminar, JButton Cancelar, boolean Cond) {
        Modificar.setEnabled(Cond);
        Eliminar.setEnabled(Cond);
        Cancelar.setEnabled(Cond);
    }

    //Metodo para habilitar JTextField de la vista Modificar producto
    private void HabilitarTxtField(JTextField nombre, JTextField precio, JTextField producto, JTextField cantidad, boolean Cond) {
        nombre.setEnabled(Cond);
        precio.setEnabled(Cond);
        producto.setEnabled(Cond);
        cantidad.setEnabled(Cond);
    }

    //Metodo para listar todas la tablas de la vista modificar producto
    private void ListarTodo() {
        Listar((DefaultTableModel) tbl_RegistrarProducto1.getModel(), proco.ReadAll());
        Listar((DefaultTableModel) tbl_RegistrarProducto.getModel(), proco.ReadAll());
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

    public boolean ValCeroEspacio(String nombre, String id, int cantidad, double precio) {
        try {
            if (nombre.isEmpty() || nombre == null || id.isEmpty() || id == null || cantidad == 0 || precio == 0) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }

    }

    //Metodo para validar que el codigo no se repita
    public boolean ValCodigo(String codigo) {
        for (int i = 0; i < proco.getProducto().size(); i++) {
            if (proco.getProducto().get(i).getID().equals(codigo)) {
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Pop_Eliminar;
    private javax.swing.JMenuItem Pop_Modificar;
    private javax.swing.JButton btn_BuscarModificar;
    private javax.swing.JButton btn_CancelarBusqueda;
    private javax.swing.JButton btn_CancelarModificar;
    private javax.swing.JButton btn_EliminarModificar;
    private javax.swing.JButton btn_GuadarModificar;
    private javax.swing.JButton btn_InformacionMenu;
    private javax.swing.JButton btn_InformacionMenu1;
    private javax.swing.JButton btn_ModificarProducto;
    private javax.swing.JButton btn_RegistarProducto;
    private javax.swing.JButton btn_VendedoresMenu;
    private javax.swing.JButton btn_VendedoresMenu1;
    private javax.swing.JButton btn_VentaMenu;
    private javax.swing.JButton btn_VentaMenu1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tbl_RegistrarProducto;
    private javax.swing.JTable tbl_RegistrarProducto1;
    private javax.swing.JTextField txt_BuscarModificar;
    private javax.swing.JTextField txt_CantidaProducto;
    private javax.swing.JTextField txt_CantidadModificar;
    private javax.swing.JTextField txt_IDModificar;
    private javax.swing.JTextField txt_IDProducto;
    private javax.swing.JTextField txt_NombreModificar;
    private javax.swing.JTextField txt_NombreProducto;
    private javax.swing.JTextField txt_PrecioModificar;
    private javax.swing.JTextField txt_PrecioProducto;
    // End of variables declaration//GEN-END:variables
}
