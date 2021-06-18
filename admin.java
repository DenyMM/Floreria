
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @Denisse Mendoza Melo
 */
public class admin extends javax.swing.JFrame {

    public admin() {
        initComponents();
        mostrarPedidos();
    }
    
    public void mostrarPedidos(){
     DefaultTableModel tpedidos = new DefaultTableModel();
     tpedidos.addColumn("NoEmpleado");
     tpedidos.addColumn("IDPedidoEmpleado");
     tpedidos.addColumn("IDArreglo");
     tpedidos.addColumn("Estatus");
     tpedidos.addColumn("TiempoEstimado");
     tpedidos.addColumn("HoraInicio");
     tpedidos.addColumn("HoraTermino");
     tablaPedidosAsig.setModel(tpedidos);     
     String[]datos = new String[7];
     
     String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/floreria";
        Connection con;
        Statement stmt;
        ResultSet rs;
              
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url, usuario,clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM pedidos_empleado");           
            while(rs.next()){
              datos[0] = rs.getString(1);
              datos[1] = rs.getString(2);
              datos[2] = rs.getString(3);
              datos[3] = rs.getString(4);
              datos[4] = rs.getString(5);
              datos[5] = rs.getString(6);
              datos[6] = rs.getString(7);
              tpedidos.addRow(datos);
            }
            tablaPedidosAsig.setModel(tpedidos);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + "Error en la consulta");
        }     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_agregar = new javax.swing.JButton();
        btn_asignar = new javax.swing.JButton();
        btn_chat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidosAsig = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/018-keys.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_agregar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(153, 204, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/031-binder.png"))); // NOI18N
        btn_agregar.setText("Agregar Pedido");
        btn_agregar.setBorder(null);
        btn_agregar.setContentAreaFilled(false);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 320, 80));

        btn_asignar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_asignar.setForeground(new java.awt.Color(255, 204, 0));
        btn_asignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/029-id-card.png"))); // NOI18N
        btn_asignar.setText("Asignar Pedido");
        btn_asignar.setBorder(null);
        btn_asignar.setContentAreaFilled(false);
        btn_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_asignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

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
        getContentPane().add(btn_chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 240, -1));

        tablaPedidosAsig.setBackground(new java.awt.Color(204, 255, 255));
        tablaPedidosAsig.setForeground(new java.awt.Color(0, 153, 204));
        tablaPedidosAsig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPedidosAsig);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 800, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 986, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignarActionPerformed
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
            stmt.executeUpdate("UPDATE pedidos_empleado SET Estatus='AS' WHERE Estatus='NO'");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_asignarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        AgregarPedido APPVista = new AgregarPedido();
            APPVista.setVisible(true);
    }//GEN-LAST:event_btn_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_asignar;
    private javax.swing.JButton btn_chat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPedidosAsig;
    // End of variables declaration//GEN-END:variables
}
