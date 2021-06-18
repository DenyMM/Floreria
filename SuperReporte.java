
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
public class SuperReporte extends javax.swing.JFrame {

    public SuperReporte() {
        initComponents();
        mostrarDisenadores();
    }
    
    public void mostrarDisenadores(){
     DefaultTableModel tDisenadores = new DefaultTableModel();
     tDisenadores.addColumn("NoEmpleado");
     tDisenadores.addColumn("Nombre");
     tDisenadores.addColumn("Usuario");
     tDisenadores.addColumn("Punto de venta");
     tDisenadores.addColumn("Puesto");
     tablaDisenadores.setModel(tDisenadores);     
     String[]datos = new String[5];
     
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
            rs = stmt.executeQuery("SELECT NoEmpleado, Nombre, Usuario, PuntoDeVenta, Puesto FROM empleados");
            
            while(rs.next()){
              datos[0] = rs.getString(1);
              datos[1] = rs.getString(2);
              datos[2] = rs.getString(3);
              datos[3] = rs.getString(4);
              datos[4] = rs.getString(5);
              tDisenadores.addRow(datos);
            }
            tablaDisenadores.setModel(tDisenadores);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + "Error en la consulta");
        }
    } 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_generaReporte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDisenadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Diseñadores");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/006-tree.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_generaReporte.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_generaReporte.setForeground(new java.awt.Color(255, 153, 204));
        btn_generaReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/026-dictionary1.png"))); // NOI18N
        btn_generaReporte.setText("General reporte completo");
        btn_generaReporte.setBorder(null);
        btn_generaReporte.setContentAreaFilled(false);
        btn_generaReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generaReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generaReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 460, 80));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-mushroom1.png"))); // NOI18N
        jLabel2.setText("Lista de Diseñadores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 330, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-mushroom1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 90, -1));

        jScrollPane1.setBorder(null);

        tablaDisenadores.setForeground(new java.awt.Color(204, 0, 204));
        tablaDisenadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDisenadores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 910, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964 - copia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generaReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generaReporteActionPerformed
        ReporteDisenador SRDisenaVista = new ReporteDisenador();
        SRDisenaVista.setVisible(true); 
    }//GEN-LAST:event_btn_generaReporteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generaReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDisenadores;
    // End of variables declaration//GEN-END:variables
}
