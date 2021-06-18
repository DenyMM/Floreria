
/**
 *
 * @Denisse Mendoza Melo
 */
public class disenador extends javax.swing.JFrame {

    public disenador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDesing = new javax.swing.JPanel();
        btn_VerPedidos = new javax.swing.JButton();
        btn_IniciarPedido = new javax.swing.JButton();
        btn_chat = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diseñador");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-mushroom.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDesing.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-mushroom.png")))); // NOI18N
        PanelDesing.setOpaque(false);

        btn_VerPedidos.setBackground(new java.awt.Color(51, 51, 51));
        btn_VerPedidos.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        btn_VerPedidos.setForeground(new java.awt.Color(204, 204, 0));
        btn_VerPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/025-notebook-1.png"))); // NOI18N
        btn_VerPedidos.setText("Lista de Pedidos");
        btn_VerPedidos.setBorder(null);
        btn_VerPedidos.setBorderPainted(false);
        btn_VerPedidos.setContentAreaFilled(false);
        btn_VerPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_VerPedidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_VerPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VerPedidosMouseClicked(evt);
            }
        });
        btn_VerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerPedidosActionPerformed(evt);
            }
        });

        btn_IniciarPedido.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        btn_IniciarPedido.setForeground(new java.awt.Color(153, 0, 153));
        btn_IniciarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/015-clock.png"))); // NOI18N
        btn_IniciarPedido.setText("Iniciar Pedido");
        btn_IniciarPedido.setToolTipText("");
        btn_IniciarPedido.setBorder(null);
        btn_IniciarPedido.setBorderPainted(false);
        btn_IniciarPedido.setContentAreaFilled(false);
        btn_IniciarPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_IniciarPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_IniciarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_IniciarPedidoMouseClicked(evt);
            }
        });
        btn_IniciarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarPedidoActionPerformed(evt);
            }
        });

        btn_chat.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_chat.setForeground(new java.awt.Color(255, 204, 102));
        btn_chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/talk.png"))); // NOI18N
        btn_chat.setText("Chat");
        btn_chat.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sun.png")))); // NOI18N
        btn_chat.setContentAreaFilled(false);
        btn_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDesingLayout = new javax.swing.GroupLayout(PanelDesing);
        PanelDesing.setLayout(PanelDesingLayout);
        PanelDesingLayout.setHorizontalGroup(
            PanelDesingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDesingLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btn_VerPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(btn_IniciarPedido)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDesingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
        );
        PanelDesingLayout.setVerticalGroup(
            PanelDesingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDesingLayout.createSequentialGroup()
                .addGroup(PanelDesingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_IniciarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_VerPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_chat)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(PanelDesing, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 580));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964 - copia.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 870, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VerPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VerPedidosMouseClicked
        ListaPedidos LPDVista = new ListaPedidos();
        LPDVista.setVisible(true);          
    }//GEN-LAST:event_btn_VerPedidosMouseClicked

    private void btn_IniciarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_IniciarPedidoMouseClicked
        IniciarPedido IPDVista = new IniciarPedido();
        IPDVista.setVisible(true);          
    }//GEN-LAST:event_btn_IniciarPedidoMouseClicked

    private void btn_VerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_VerPedidosActionPerformed

    private void btn_IniciarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_IniciarPedidoActionPerformed

    private void btn_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chatActionPerformed
        Cliente ClienteVista = new Cliente();
            ClienteVista.setVisible(true);
    }//GEN-LAST:event_btn_chatActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(disenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(disenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(disenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(disenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new disenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDesing;
    private javax.swing.JButton btn_IniciarPedido;
    private javax.swing.JButton btn_VerPedidos;
    private javax.swing.JButton btn_chat;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
