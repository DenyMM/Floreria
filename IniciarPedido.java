
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @Denisse Mendoza Melo
 */
public class IniciarPedido extends javax.swing.JFrame  {
    
    Hilos h;
    
    public IniciarPedido() {
        initComponents();
        h = new Hilos();
        h.recibeTiempo(tiempo);
        h.recibeAlarma(alarma);
        h.horaTermino();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_iniciar = new javax.swing.JButton();
        btn_detener = new javax.swing.JButton();
        tiempo = new javax.swing.JLabel();
        clock1 = new javax.swing.JButton();
        clock3 = new javax.swing.JButton();
        alarma = new javax.swing.JLabel();
        Trof1 = new javax.swing.JButton();
        Trof2 = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Pedido");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/015-clock_1.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/imagenes/020-alarm-clock.png")))); // NOI18N
        jPanel1.setOpaque(false);

        btn_iniciar.setBackground(new java.awt.Color(51, 255, 204));
        btn_iniciar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        btn_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/036-test.png"))); // NOI18N
        btn_iniciar.setText("Iniciar");
        btn_iniciar.setBorder(null);
        btn_iniciar.setBorderPainted(false);
        btn_iniciar.setContentAreaFilled(false);
        btn_iniciar.setHideActionText(true);
        btn_iniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_iniciar.setInheritsPopupMenu(true);
        btn_iniciar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        btn_detener.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_detener.setForeground(new java.awt.Color(255, 255, 255));
        btn_detener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/030-folder.png"))); // NOI18N
        btn_detener.setText("Detener");
        btn_detener.setBorder(null);
        btn_detener.setBorderPainted(false);
        btn_detener.setContentAreaFilled(false);
        btn_detener.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_detener.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_detener.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detenerActionPerformed(evt);
            }
        });

        tiempo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        tiempo.setForeground(new java.awt.Color(255, 255, 255));

        clock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/20-alarm-clock.png"))); // NOI18N
        clock1.setBorder(null);
        clock1.setContentAreaFilled(false);

        clock3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/20-alarm-clock.png"))); // NOI18N
        clock3.setBorder(null);
        clock3.setContentAreaFilled(false);

        alarma.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        alarma.setForeground(new java.awt.Color(255, 153, 255));

        Trof1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/034-trophy.png"))); // NOI18N
        Trof1.setBorder(null);
        Trof1.setContentAreaFilled(false);

        Trof2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/034-trophy.png"))); // NOI18N
        Trof2.setBorder(null);
        Trof2.setContentAreaFilled(false);

        btn_registrar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/034-trophy.png"))); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.setBorderPainted(false);
        btn_registrar.setContentAreaFilled(false);
        btn_registrar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_registrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Trof1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alarma)
                .addGap(37, 37, 37)
                .addComponent(Trof2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(clock1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_iniciar)
                        .addGap(83, 83, 83)
                        .addComponent(btn_detener)
                        .addGap(69, 69, 69)
                        .addComponent(btn_registrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(clock3)
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tiempo)
                    .addComponent(clock1)
                    .addComponent(clock3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(alarma))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Trof2)
                            .addComponent(Trof1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_iniciar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_detener, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 820, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964 - copia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        h.start();
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
            stmt.executeUpdate("UPDATE pedidos_empleado SET Estatus='EE' WHERE Estatus='AS'");           
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detenerActionPerformed
        h.stop();
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
            stmt.executeUpdate("UPDATE pedidos_empleado SET Estatus='SI' WHERE Estatus='EE'");
            stmt.executeUpdate("UPDATE empleados SET Comision= Comision+25 WHERE NoEmpleado='1'");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_detenerActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
         h.horaTermino();
    }//GEN-LAST:event_btn_registrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Trof1;
    private javax.swing.JButton Trof2;
    private javax.swing.JLabel alarma;
    private javax.swing.JButton btn_detener;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton clock1;
    private javax.swing.JButton clock3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}


