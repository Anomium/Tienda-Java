package View;

import javax.swing.ImageIcon;

import Controller.ProductoController;
import Model.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class RegistrarProducto extends javax.swing.JFrame {

    private ProductoController proco = new ProductoController();
    private Object index = null;
    
    private int x, y;
    
    public RegistrarProducto() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Img/logod.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btn_PagosMenu1 = new javax.swing.JButton();
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
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btn_VentaMenu = new javax.swing.JButton();
        btn_VendedoresMenu = new javax.swing.JButton();
        btn_PagosMenu = new javax.swing.JButton();
        btn_InformacionMenu = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

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

        jLabel2.setText("ID del Producto:");

        jLabel3.setText("Precio unidad:");

        jLabel4.setText("Cantidad:");

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

        btn_PagosMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pagos.png"))); // NOI18N
        btn_PagosMenu1.setText("Pagos");
        btn_PagosMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PagosMenu1MouseClicked(evt);
            }
        });
        btn_PagosMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PagosMenu1ActionPerformed(evt);
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
                        .addComponent(btn_PagosMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(btn_VentaMenu1)
                    .addComponent(btn_InformacionMenu1)
                    .addComponent(btn_VendedoresMenu1)
                    .addComponent(btn_PagosMenu1))
                .addContainerGap())
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

        jLabel5.setText("Cantidad:");

        jLabel6.setText("ID del Producto:");

        jLabel7.setText("Nombre:");

        jLabel8.setText("Precio unidad:");

        btn_CancelarModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_CancelarModificar.setText("Cancelar");
        btn_CancelarModificar.setEnabled(false);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btn_GuadarModificar))
        );

        jTabbedPane3.addTab("Modificar", jPanel4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        jButton5.setText("Buscar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

        btn_PagosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pagos.png"))); // NOI18N
        btn_PagosMenu.setText("Pagos");
        btn_PagosMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PagosMenuMouseClicked(evt);
            }
        });
        btn_PagosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PagosMenuActionPerformed(evt);
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
                        .addComponent(btn_PagosMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(btn_VentaMenu)
                    .addComponent(btn_InformacionMenu)
                    .addComponent(btn_VendedoresMenu)
                    .addComponent(btn_PagosMenu))
                .addContainerGap())
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
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btn_VentaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VentaMenuMouseClicked
        Venta venta = new Venta();
        venta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VentaMenuMouseClicked

    private void btn_VendedoresMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendedoresMenuMouseClicked
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VendedoresMenuMouseClicked

    private void btn_PagosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PagosMenuMouseClicked
        Pagos pagos = new Pagos();
        pagos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_PagosMenuMouseClicked

    private void btn_InformacionMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InformacionMenuMouseClicked
        Informacion informacion = new Informacion();
        informacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_InformacionMenuMouseClicked

    private void btn_InformacionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformacionMenuActionPerformed
            
        Informacion informacion = new Informacion();
        informacion.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_InformacionMenuActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9MouseClicked

    private void btn_PagosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PagosMenuActionPerformed
        
    }//GEN-LAST:event_btn_PagosMenuActionPerformed

    private void btn_InformacionMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InformacionMenu1MouseClicked
        
        Informacion informacion = new Informacion();
        informacion.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_InformacionMenu1MouseClicked

    private void btn_InformacionMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformacionMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InformacionMenu1ActionPerformed

    private void btn_PagosMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PagosMenu1MouseClicked
        
        Pagos pagos = new Pagos();
        pagos.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_PagosMenu1MouseClicked

    private void btn_PagosMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PagosMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_PagosMenu1ActionPerformed

    private void btn_VendedoresMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendedoresMenu1MouseClicked
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VendedoresMenu1MouseClicked

    private void btn_VentaMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VentaMenu1MouseClicked
       Venta venta = new Venta();
        venta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VentaMenu1MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10MouseClicked

    private void btn_RegistarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistarProductoActionPerformed
        
        proco.create(new Producto(txt_IDProducto.getText(),
                txt_NombreProducto.getText(),
                Double.parseDouble(txt_PrecioProducto.getText()),
                Integer.parseInt(txt_CantidaProducto.getText())));
        
        Listar((DefaultTableModel) tbl_RegistrarProducto.getModel(), proco.ReadAll());
        Listar((DefaultTableModel) tbl_RegistrarProducto1.getModel(), proco.ReadAll());
    }//GEN-LAST:event_btn_RegistarProductoActionPerformed

    private void btn_ModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarProductoActionPerformed
    
        
        
    }//GEN-LAST:event_btn_ModificarProductoActionPerformed

    private void tbl_RegistrarProducto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_RegistrarProducto1MouseClicked
        
        btn_ModificarProducto.setEnabled(true);
        btn_CancelarModificar.setEnabled(true);
        btn_EliminarModificar.setEnabled(true);
        index = tbl_RegistrarProducto1.getSelectedRow();
        
    }//GEN-LAST:event_tbl_RegistrarProducto1MouseClicked

    private void btn_EliminarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarModificarActionPerformed
            
        proco.Delete((int) index);
        
        
    }//GEN-LAST:event_btn_EliminarModificarActionPerformed

    private void btn_GuadarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuadarModificarActionPerformed
           
        proco.Update((int)index, new Producto(txt_IDModificar.getText(),
                txt_NombreModificar.getText(),
                Double.parseDouble(txt_PrecioModificar.getText()),
                Integer.parseInt(txt_CantidadModificar.getText())));
        
        Listar((DefaultTableModel) tbl_RegistrarProducto1.getModel(), proco.ReadAll());
        
    }//GEN-LAST:event_btn_GuadarModificarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CancelarModificar;
    private javax.swing.JButton btn_EliminarModificar;
    private javax.swing.JButton btn_GuadarModificar;
    private javax.swing.JButton btn_InformacionMenu;
    private javax.swing.JButton btn_InformacionMenu1;
    private javax.swing.JButton btn_ModificarProducto;
    private javax.swing.JButton btn_PagosMenu;
    private javax.swing.JButton btn_PagosMenu1;
    private javax.swing.JButton btn_RegistarProducto;
    private javax.swing.JButton btn_VendedoresMenu;
    private javax.swing.JButton btn_VendedoresMenu1;
    private javax.swing.JButton btn_VentaMenu;
    private javax.swing.JButton btn_VentaMenu1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_RegistrarProducto;
    private javax.swing.JTable tbl_RegistrarProducto1;
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
