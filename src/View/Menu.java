package View;

import com.sun.awt.AWTUtilities;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    private int x, y;

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Img/logod.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btn_VentaMenu = new javax.swing.JButton();
        btn_VendedoresMenu = new javax.swing.JButton();
        btn_PagosMenu = new javax.swing.JButton();
        btn_InformacionMenu = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Imagen1.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Imagen5.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 20));

        btn_VentaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/venta.png"))); // NOI18N
        btn_VentaMenu.setText("Venta");
        btn_VentaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VentaMenuMouseClicked(evt);
            }
        });
        getContentPane().add(btn_VentaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btn_VendedoresMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/vendedores.png"))); // NOI18N
        btn_VendedoresMenu.setText("Vendedores");
        btn_VendedoresMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VendedoresMenuMouseClicked(evt);
            }
        });
        getContentPane().add(btn_VendedoresMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        btn_PagosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pagos.png"))); // NOI18N
        btn_PagosMenu.setText("Pagos");
        btn_PagosMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PagosMenuMouseClicked(evt);
            }
        });
        getContentPane().add(btn_PagosMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 110, 100, -1));

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
        getContentPane().add(btn_InformacionMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 120, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logot.png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 28, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Papyrus", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("koda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 36, 143, 62));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Imagen6.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 150, 420, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento para pasar a la ventana Venta
    private void btn_VentaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VentaMenuMouseClicked
        Venta venta = new Venta();
        venta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VentaMenuMouseClicked

    //Evento para pasar a la ventana Vendedor
    private void btn_VendedoresMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendedoresMenuMouseClicked
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VendedoresMenuMouseClicked

    //Evento para pasar a la ventana Pagos
    private void btn_PagosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PagosMenuMouseClicked
        Pagos pagos = new Pagos();
        pagos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_PagosMenuMouseClicked

    //Evento para pasar a la ventana Informacion
    private void btn_InformacionMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InformacionMenuMouseClicked
        Informacion informacion = new Informacion();
        informacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_InformacionMenuMouseClicked
    
    //Evento para cerrar el programa
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    //Evento para maximizar la Ventana en la que se encuentra
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_InformacionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformacionMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InformacionMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_InformacionMenu;
    private javax.swing.JButton btn_PagosMenu;
    private javax.swing.JButton btn_VendedoresMenu;
    private javax.swing.JButton btn_VentaMenu;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
