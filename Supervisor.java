
/**
 *
 * @Denisse Mendoza Melo
 */
public class Supervisor extends javax.swing.JFrame {

    public Supervisor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_SLista = new javax.swing.JButton();
        btn_SRegistro = new javax.swing.JButton();
        btn_SReporte = new javax.swing.JButton();
        btn_chat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supervisor");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/033-glasses.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/imagenes/033-glasses.png")))); // NOI18N
        jPanel1.setOpaque(false);

        btn_SLista.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        btn_SLista.setForeground(new java.awt.Color(255, 204, 0));
        btn_SLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/023-notebook.png"))); // NOI18N
        btn_SLista.setText("Lista de Pedidos");
        btn_SLista.setAutoscrolls(true);
        btn_SLista.setBorder(null);
        btn_SLista.setContentAreaFilled(false);
        btn_SLista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_SLista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_SLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SListaActionPerformed(evt);
            }
        });

        btn_SRegistro.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        btn_SRegistro.setForeground(new java.awt.Color(255, 204, 255));
        btn_SRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/028-whiteboard.png"))); // NOI18N
        btn_SRegistro.setText("Lista de Registros");
        btn_SRegistro.setToolTipText("");
        btn_SRegistro.setAutoscrolls(true);
        btn_SRegistro.setBorder(null);
        btn_SRegistro.setContentAreaFilled(false);
        btn_SRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_SRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_SRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SRegistroActionPerformed(evt);
            }
        });

        btn_SReporte.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        btn_SReporte.setForeground(new java.awt.Color(255, 153, 204));
        btn_SReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/026-dictionary.png"))); // NOI18N
        btn_SReporte.setText("Reportes");
        btn_SReporte.setBorder(null);
        btn_SReporte.setContentAreaFilled(false);
        btn_SReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_SReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_SReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SReporteActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_SLista, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_SRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_SRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_SReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btn_chat)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 890, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964 - copia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 940, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SListaActionPerformed
        SuperLista SLVista = new SuperLista();
        SLVista.setVisible(true); 
    }//GEN-LAST:event_btn_SListaActionPerformed

    private void btn_SRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SRegistroActionPerformed
        SuperRegistros SRVista = new SuperRegistros();
        SRVista.setVisible(true); 
    }//GEN-LAST:event_btn_SRegistroActionPerformed

    private void btn_SReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SReporteActionPerformed
        SuperReporte SRepoVista = new SuperReporte();
        SRepoVista.setVisible(true); 
    }//GEN-LAST:event_btn_SReporteActionPerformed

    private void btn_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chatActionPerformed
        Cliente ClienteVista = new Cliente();
            ClienteVista.setVisible(true);
    }//GEN-LAST:event_btn_chatActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SLista;
    private javax.swing.JButton btn_SRegistro;
    private javax.swing.JButton btn_SReporte;
    private javax.swing.JButton btn_chat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
