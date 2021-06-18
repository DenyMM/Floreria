
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
public class PedidosAsignados extends javax.swing.JFrame {

    public PedidosAsignados() {
        initComponents();
        mostrarAsignados();
    }
    
    public void mostrarAsignados(){
     DefaultTableModel tAsignados = new DefaultTableModel();
     tAsignados.addColumn("NoEmpleado");
     tAsignados.addColumn("IDPedidoEmpleado");
     tAsignados.addColumn("IDArreglo");
     tAsignados.addColumn("Estatus");
     tAsignados.addColumn("TiempoEstimado");
     tAsignados.addColumn("HoraInicio");
     tAsignados.addColumn("HoraTermino");
     tablaPAsignados.setModel(tAsignados);     
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
            rs = stmt.executeQuery("SELECT * FROM pedidos_empleado WHERE Estatus='AS'");
            
            while(rs.next()){
              datos[0] = rs.getString(1);
              datos[1] = rs.getString(2);
              datos[2] = rs.getString(3);
              datos[3] = rs.getString(4);
              datos[4] = rs.getString(5);
              datos[5] = rs.getString(6);
              datos[6] = rs.getString(7);
              tAsignados.addRow(datos);
            }
            tablaPAsignados.setModel(tAsignados);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + "Error en la consulta");
        }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_pElaborados = new javax.swing.JButton();
        btn_pTerminados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPAsignados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedidos Asignados");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/022-book111.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_pElaborados.setBackground(new java.awt.Color(102, 255, 204));
        btn_pElaborados.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_pElaborados.setForeground(new java.awt.Color(51, 255, 204));
        btn_pElaborados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/021-pencil-case.png"))); // NOI18N
        btn_pElaborados.setText("Pedidos en Elaboracion");
        btn_pElaborados.setToolTipText("");
        btn_pElaborados.setBorder(null);
        btn_pElaborados.setBorderPainted(false);
        btn_pElaborados.setContentAreaFilled(false);
        btn_pElaborados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pElaboradosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pElaborados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 330, 80));

        btn_pTerminados.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_pTerminados.setForeground(new java.awt.Color(255, 204, 204));
        btn_pTerminados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/024-briefcase.png"))); // NOI18N
        btn_pTerminados.setText("Pedidos Terminados");
        btn_pTerminados.setBorder(null);
        btn_pTerminados.setContentAreaFilled(false);
        btn_pTerminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pTerminadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pTerminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 350, 80));

        tablaPAsignados.setBackground(new java.awt.Color(204, 204, 255));
        tablaPAsignados.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaPAsignados.setForeground(new java.awt.Color(102, 102, 255));
        tablaPAsignados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPAsignados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 900, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pElaboradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pElaboradosActionPerformed
        PedidosElaborados SPEVista = new PedidosElaborados();
        SPEVista.setVisible(true);
    }//GEN-LAST:event_btn_pElaboradosActionPerformed

    private void btn_pTerminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pTerminadosActionPerformed
        PedidosTerminados SPTVista = new PedidosTerminados();
        SPTVista.setVisible(true);
    }//GEN-LAST:event_btn_pTerminadosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidosAsignados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pElaborados;
    private javax.swing.JButton btn_pTerminados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPAsignados;
    // End of variables declaration//GEN-END:variables
}
