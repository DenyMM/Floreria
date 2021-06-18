
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @Denisse Mendoza Melo
 */
public class ListaPedidos extends javax.swing.JFrame {
    
    public ListaPedidos() {
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
     tablaPedidos.setModel(tpedidos);     
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
            tablaPedidos.setModel(tpedidos);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + "Error en la consulta");
        }     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_aceptarP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Pedidos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/025-notebook-1_1.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_aceptarP.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_aceptarP.setForeground(new java.awt.Color(255, 204, 51));
        btn_aceptarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/015-clock2.png"))); // NOI18N
        btn_aceptarP.setText("Aceptar Pedido");
        btn_aceptarP.setToolTipText("");
        btn_aceptarP.setBorder(null);
        btn_aceptarP.setContentAreaFilled(false);
        btn_aceptarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarPActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aceptarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 283, 84));

        jScrollPane1.setBackground(new java.awt.Color(102, 0, 204));
        jScrollPane1.setForeground(new java.awt.Color(204, 204, 255));

        tablaPedidos.setBackground(new java.awt.Color(204, 204, 255));
        tablaPedidos.setForeground(new java.awt.Color(102, 0, 255));
        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1060, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964 - copia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1212, 712));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarPActionPerformed
        IniciarPedido IPVista = new IniciarPedido();
        IPVista.setVisible(true);
    }//GEN-LAST:event_btn_aceptarPActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptarP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPedidos;
    // End of variables declaration//GEN-END:variables
}
