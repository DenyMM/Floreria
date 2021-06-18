
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
public class SuperLista extends javax.swing.JFrame {

    public SuperLista() {
        initComponents();
        mostrarLista();
    }
    
    public void mostrarLista(){        
     DefaultTableModel tLista = new DefaultTableModel();
     tLista.addColumn("NoEmpleado");
     tLista.addColumn("IDPedidoEmpleado");
     tLista.addColumn("IDArreglo");
     tLista.addColumn("Estatus");
     tLista.addColumn("TiempoEstimado");
     tLista.addColumn("HoraInicio");
     tLista.addColumn("HoraTermino");
     tablaLista.setModel(tLista);     
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
              tLista.addRow(datos);
            }
            tablaLista.setModel(tLista);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + "Error en la consulta");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_PAsignados = new javax.swing.JButton();
        btn_PElaborados = new javax.swing.JButton();
        btn_PTerminados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Pedidos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/023-notebook11.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_PAsignados.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_PAsignados.setForeground(new java.awt.Color(153, 0, 255));
        btn_PAsignados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/022-book.png"))); // NOI18N
        btn_PAsignados.setText("Pedidos Asignados");
        btn_PAsignados.setBorder(null);
        btn_PAsignados.setContentAreaFilled(false);
        btn_PAsignados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PAsignadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_PAsignados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 280, 100));

        btn_PElaborados.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btn_PElaborados.setForeground(new java.awt.Color(102, 255, 204));
        btn_PElaborados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/021-pencil-case.png"))); // NOI18N
        btn_PElaborados.setText("Pedidos en Elaboracion");
        btn_PElaborados.setBorder(null);
        btn_PElaborados.setContentAreaFilled(false);
        btn_PElaborados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PElaboradosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_PElaborados, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 320, 90));

        btn_PTerminados.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_PTerminados.setForeground(new java.awt.Color(255, 204, 204));
        btn_PTerminados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/024-briefcase.png"))); // NOI18N
        btn_PTerminados.setText("Pedidos Terminados");
        btn_PTerminados.setBorder(null);
        btn_PTerminados.setContentAreaFilled(false);
        btn_PTerminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PTerminadosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_PTerminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 280, 90));

        tablaLista.setBackground(new java.awt.Color(255, 204, 255));
        tablaLista.setForeground(new java.awt.Color(153, 0, 102));
        tablaLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaLista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 930, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964 - copia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 990, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PElaboradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PElaboradosActionPerformed
        PedidosElaborados SPEVista = new PedidosElaborados();
        SPEVista.setVisible(true); 
    }//GEN-LAST:event_btn_PElaboradosActionPerformed

    private void btn_PAsignadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PAsignadosActionPerformed
        PedidosAsignados SPAVista = new PedidosAsignados();
        SPAVista.setVisible(true); 
    }//GEN-LAST:event_btn_PAsignadosActionPerformed

    private void btn_PTerminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PTerminadosActionPerformed
        PedidosTerminados SPTVista = new PedidosTerminados();
        SPTVista.setVisible(true); 
    }//GEN-LAST:event_btn_PTerminadosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_PAsignados;
    private javax.swing.JButton btn_PElaborados;
    private javax.swing.JButton btn_PTerminados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaLista;
    // End of variables declaration//GEN-END:variables
}
