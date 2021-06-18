
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @Denisse Mendoza Melo
 */
public class AgregarPedido extends javax.swing.JFrame {

    public AgregarPedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_tiempo = new javax.swing.JTextField();
        lbl_testimado = new javax.swing.JLabel();
        lbl_arreglo = new javax.swing.JLabel();
        txt_IDArreglo = new javax.swing.JTextField();
        lbl_status = new javax.swing.JLabel();
        txt_estatus = new javax.swing.JTextField();
        lbl_pedido = new javax.swing.JLabel();
        txt_IDPedido = new javax.swing.JTextField();
        lbl_empleado = new javax.swing.JLabel();
        txt_IDEmpleado = new javax.swing.JTextField();
        lbl_hinicio = new javax.swing.JLabel();
        txt_hinicio = new javax.swing.JTextField();
        txt_htermino = new javax.swing.JTextField();
        lbl_htermino = new javax.swing.JLabel();
        btn_agregarPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Nuevo Pedido");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/031-binder1.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Pedido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(0, 153, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 153, 0));
        jPanel1.setToolTipText("");

        txt_tiempo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_tiempo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(102, 153, 0))); // NOI18N
        txt_tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tiempoActionPerformed(evt);
            }
        });

        lbl_testimado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_testimado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/019-plant.png"))); // NOI18N
        lbl_testimado.setText("Tiempo Estimado");

        lbl_arreglo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_arreglo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/003-sunflower.png"))); // NOI18N
        lbl_arreglo.setText("ID de Arreglo");

        txt_IDArreglo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_IDArreglo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(102, 153, 0))); // NOI18N
        txt_IDArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDArregloActionPerformed(evt);
            }
        });

        lbl_status.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/010-leaf.png"))); // NOI18N
        lbl_status.setText("Estatus");

        txt_estatus.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_estatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave 2 digitos", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(102, 153, 0))); // NOI18N
        txt_estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estatusActionPerformed(evt);
            }
        });

        lbl_pedido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/009-cactus.png"))); // NOI18N
        lbl_pedido.setText("ID de Pedido ");
        lbl_pedido.setToolTipText("");

        txt_IDPedido.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_IDPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(102, 153, 0))); // NOI18N
        txt_IDPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDPedidoActionPerformed(evt);
            }
        });

        lbl_empleado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/029-id-card1.png"))); // NOI18N
        lbl_empleado.setText("ID de Empleado ");

        txt_IDEmpleado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_IDEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(102, 153, 0))); // NOI18N
        txt_IDEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDEmpleadoActionPerformed(evt);
            }
        });

        lbl_hinicio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_hinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/007-grass.png"))); // NOI18N
        lbl_hinicio.setText("Hora de inicio");

        txt_hinicio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_hinicio.setText("0");
        txt_hinicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(102, 153, 0))); // NOI18N
        txt_hinicio.setEnabled(false);
        txt_hinicio.setOpaque(false);
        txt_hinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hinicioActionPerformed(evt);
            }
        });

        txt_htermino.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txt_htermino.setText("0");
        txt_htermino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(102, 153, 0))); // NOI18N
        txt_htermino.setEnabled(false);
        txt_htermino.setOpaque(false);
        txt_htermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hterminoActionPerformed(evt);
            }
        });

        lbl_htermino.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_htermino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/011-forest.png"))); // NOI18N
        lbl_htermino.setText("Hora de Termino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txt_IDPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lbl_testimado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_arreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(txt_IDArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(txt_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_hinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_hinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_htermino, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_htermino, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(txt_IDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_IDEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IDPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_testimado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_hinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_hinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_htermino, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_htermino, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_IDArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_arreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(367, 367, 367))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1000, 360));

        btn_agregarPedido.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_agregarPedido.setForeground(new java.awt.Color(153, 204, 255));
        btn_agregarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/035-laptop.png"))); // NOI18N
        btn_agregarPedido.setText("Agregar Pedido");
        btn_agregarPedido.setToolTipText("");
        btn_agregarPedido.setBorder(null);
        btn_agregarPedido.setContentAreaFilled(false);
        btn_agregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 320, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964 - copia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1115, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tiempoActionPerformed

    private void txt_IDArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDArregloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDArregloActionPerformed

    private void txt_estatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estatusActionPerformed

    private void txt_IDPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDPedidoActionPerformed

    private void txt_IDEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDEmpleadoActionPerformed

    private void txt_hinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hinicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hinicioActionPerformed

    private void txt_hterminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hterminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hterminoActionPerformed

    private void btn_agregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPedidoActionPerformed
        String IDEmpleado = new String (txt_IDEmpleado.getText());
        String IDArreglo = new String (txt_IDArreglo.getText());
        String IDPedido = new String (txt_IDPedido.getText());
        String estatus = new String (txt_estatus.getText());
        String tiempo = new String (txt_tiempo.getText());
        int inicio = 0;
        int termino = 0;        
        
        String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/floreria";
        Connection con;
        Statement stmt;
               
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url, usuario,clave);
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO pedidos_empleado VALUES ('1','5','2','"+estatus+"','"+tiempo+"','0','0')");            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btn_agregarPedidoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_arreglo;
    private javax.swing.JLabel lbl_empleado;
    private javax.swing.JLabel lbl_hinicio;
    private javax.swing.JLabel lbl_htermino;
    private javax.swing.JLabel lbl_pedido;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_testimado;
    private javax.swing.JTextField txt_IDArreglo;
    private javax.swing.JTextField txt_IDEmpleado;
    private javax.swing.JTextField txt_IDPedido;
    private javax.swing.JTextField txt_estatus;
    private javax.swing.JTextField txt_hinicio;
    private javax.swing.JTextField txt_htermino;
    private javax.swing.JTextField txt_tiempo;
    // End of variables declaration//GEN-END:variables
}
