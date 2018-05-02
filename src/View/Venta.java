package View;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import Controller.ProductoController;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Venta extends javax.swing.JFrame {

    private int x, y;
    private ProductoController proco = new ProductoController();

    public Venta() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Img/logod.png")).getImage());
        ListarTodo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_MenuVenta = new javax.swing.JButton();
        btn_InformacionVenta = new javax.swing.JButton();
        btn_ProductosVenta = new javax.swing.JButton();
        btn_VendedoresVenta = new javax.swing.JButton();
        btn_PagosVenta = new javax.swing.JButton();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btn_PagosVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pagos.png"))); // NOI18N
        btn_PagosVenta.setText("Pagos");
        btn_PagosVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PagosVentaMouseClicked(evt);
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
                "Nombre", "Precio Unidad", "Cantidad", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_CarritoVenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_CarritoVenta);
        if (tbl_CarritoVenta.getColumnModel().getColumnCount() > 0) {
            tbl_CarritoVenta.getColumnModel().getColumn(0).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(1).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(2).setResizable(false);
            tbl_CarritoVenta.getColumnModel().getColumn(3).setResizable(false);
        }

        tp_TotalPagarVenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tp_TotalPagarVenta.setText("sdfasda");
        tp_TotalPagarVenta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tp_TotalPagarVenta.setEnabled(false);
        jScrollPane4.setViewportView(tp_TotalPagarVenta);

        btn_AgregarVenta.setText("Agregar");

        btn_RetirarVenta.setText("Retirar");

        btn_BuscarVenta.setText("Buscar");
        btn_BuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarVentaActionPerformed(evt);
            }
        });

        btn_ComprarVenta.setText("Comprar");

        btn_CancelarBusquedaProdVenta.setText("Cancelar Busqueda");
        btn_CancelarBusquedaProdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarBusquedaProdVentaActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(txt_BuscarProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_BuscarVenta)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel24)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_CancelarBusquedaProdVenta)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btn_AgregarVenta)
                .addGap(16, 16, 16)
                .addComponent(btn_RetirarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btn_ComprarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_MenuVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_VendedoresVenta)
                .addGap(18, 18, 18)
                .addComponent(btn_PagosVenta)
                .addGap(18, 18, 18)
                .addComponent(btn_InformacionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ProductosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txt_BuscarProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btn_BuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_CancelarBusquedaProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btn_AgregarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btn_RetirarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_ComprarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_VendedoresVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_MenuVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_PagosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_InformacionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_ProductosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Ventas", jPanel2);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    //Evento para pasar a la ventana Pagos
    private void btn_PagosVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PagosVentaMouseClicked
        Pagos pagos = new Pagos();
        pagos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_PagosVentaMouseClicked

    //Evento para pasar a la ventana Informacion
    private void btn_InformacionVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InformacionVentaMouseClicked
        Informacion infomacion = new Informacion();
        infomacion.setVisible(true);
        this.dispose();
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
    }//GEN-LAST:event_btn_CancelarBusquedaProdVentaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    //Metodo para listar todas la tablas de la vista modificar producto
    private void ListarTodo() {
        Listar((DefaultTableModel) tbl_ProductosVenta.getModel(), proco.ReadAll());

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarVenta;
    private javax.swing.JButton btn_BuscarVenta;
    private javax.swing.JButton btn_CancelarBusquedaProdVenta;
    private javax.swing.JButton btn_ComprarVenta;
    private javax.swing.JButton btn_InformacionVenta;
    private javax.swing.JButton btn_MenuVenta;
    private javax.swing.JButton btn_PagosVenta;
    private javax.swing.JButton btn_ProductosVenta;
    private javax.swing.JButton btn_RetirarVenta;
    private javax.swing.JButton btn_VendedoresVenta;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl_CarritoVenta;
    private javax.swing.JTable tbl_ProductosVenta;
    private javax.swing.JTextPane tp_TotalPagarVenta;
    private javax.swing.JTextField txt_BuscarProductoVenta;
    // End of variables declaration//GEN-END:variables
}
