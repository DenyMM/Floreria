
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
public class Comisiones extends javax.swing.JFrame {

    public Comisiones() {
        initComponents();
        mostrarComisiones();
    }
    
    public void mostrarComisiones(){
     DefaultTableModel tComisiones = new DefaultTableModel();
     tComisiones.addColumn("NoEmpleado");
     tComisiones.addColumn("Nombre");
     tComisiones.addColumn("Usuario");
     //tComisiones.addColumn("Contraseña");
     tComisiones.addColumn("PuntoDeVenta");
     tComisiones.addColumn("Puesto");
     tComisiones.addColumn("Comision");
     //tComisiones.addColumn("TiempoTrabajo");
     tablaComisiones.setModel(tComisiones);     
     String[]datos = new String[6];
     
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
            rs = stmt.executeQuery("SELECT NoEmpleado, Nombre, Usuario, PuntoDeVenta, Puesto, Comision  FROM empleados");
            
            while(rs.next()){
              datos[0] = rs.getString(1);
              datos[1] = rs.getString(2);
              datos[2] = rs.getString(3);
              datos[3] = rs.getString(4);
              datos[4] = rs.getString(5);
              datos[5] = rs.getString(6);
              //datos[6] = rs.getString(7);
              //datos[7] = rs.getString(8);
              tComisiones.addRow(datos);
            }
            tablaComisiones.setModel(tComisiones);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + "Error en la consulta");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaComisiones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comisiones");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/027-diploma1.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaComisiones.setBackground(new java.awt.Color(204, 255, 204));
        tablaComisiones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaComisiones.setForeground(new java.awt.Color(51, 153, 0));
        tablaComisiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaComisiones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 17, 820, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 870, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comisiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaComisiones;
    // End of variables declaration//GEN-END:variables
}
