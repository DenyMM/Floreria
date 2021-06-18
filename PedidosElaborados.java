
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
 * @author user
 */
public class PedidosElaborados extends javax.swing.JFrame {

    public PedidosElaborados() {
        initComponents();
        mostrarElaborados();
    }
    
    public void mostrarElaborados(){
     DefaultTableModel tElaborados = new DefaultTableModel();
     tElaborados.addColumn("NoEmpleado");
     tElaborados.addColumn("IDPedidoEmpleado");
     tElaborados.addColumn("IDArreglo");
     tElaborados.addColumn("Estatus");
     tElaborados.addColumn("TiempoEstimado");
     tElaborados.addColumn("HoraInicio");
     tElaborados.addColumn("HoraTermino");
     tablaPElabor.setModel(tElaborados);     
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
            rs = stmt.executeQuery("SELECT * FROM pedidos_empleado WHERE Estatus='EE'");
            
            while(rs.next()){
              datos[0] = rs.getString(1);
              datos[1] = rs.getString(2);
              datos[2] = rs.getString(3);
              datos[3] = rs.getString(4);
              datos[4] = rs.getString(5);
              datos[5] = rs.getString(6);
              datos[6] = rs.getString(7);
              tElaborados.addRow(datos);
            }
            tablaPElabor.setModel(tElaborados);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + "Error en la consulta");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_pAsignados = new javax.swing.JButton();
        btn_pTerminados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPElabor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedidos en Elaboracion");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/021-pencil-case1.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_pAsignados.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_pAsignados.setForeground(new java.awt.Color(153, 0, 255));
        btn_pAsignados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/022-book.png"))); // NOI18N
        btn_pAsignados.setText("Pedidos Asignados");
        btn_pAsignados.setContentAreaFilled(false);
        btn_pAsignados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pAsignadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pAsignados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 320, 80));

        btn_pTerminados.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_pTerminados.setForeground(new java.awt.Color(255, 204, 204));
        btn_pTerminados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/024-briefcase.png"))); // NOI18N
        btn_pTerminados.setText("Pedidos Terminados");
        btn_pTerminados.setContentAreaFilled(false);
        btn_pTerminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pTerminadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pTerminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 350, 80));

        tablaPElabor.setBackground(new java.awt.Color(204, 255, 255));
        tablaPElabor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaPElabor.setForeground(new java.awt.Color(0, 153, 153));
        tablaPElabor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPElabor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 30, 900, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 990, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pTerminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pTerminadosActionPerformed
        PedidosTerminados SPTVista = new PedidosTerminados();
        SPTVista.setVisible(true);
    }//GEN-LAST:event_btn_pTerminadosActionPerformed

    private void btn_pAsignadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pAsignadosActionPerformed
        PedidosAsignados SPAVista = new PedidosAsignados();
        SPAVista.setVisible(true);
    }//GEN-LAST:event_btn_pAsignadosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidosElaborados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pAsignados;
    private javax.swing.JButton btn_pTerminados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPElabor;
    // End of variables declaration//GEN-END:variables
}
