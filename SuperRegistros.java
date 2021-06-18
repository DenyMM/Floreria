
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
public class SuperRegistros extends javax.swing.JFrame {

    public SuperRegistros() {
        initComponents();
        mostrarRegistro();
    }
    
    public void mostrarRegistro(){
     DefaultTableModel tRegistro = new DefaultTableModel();
     tRegistro.addColumn("NoRegistro");
     tRegistro.addColumn("Usuario");
     tRegistro.addColumn("Contrasenia");
     tablaRegistro.setModel(tRegistro);     
     String[]datos = new String[3];
        
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
            rs = stmt.executeQuery("SELECT * FROM registros");
            
            while(rs.next()){
              datos[0] = rs.getString(1);
              datos[1] = rs.getString(2);
              datos[2] = rs.getString(3);
              tRegistro.addRow(datos);
            }
            tablaRegistro.setModel(tRegistro);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + "Error en la consulta");
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Comisiones = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Registros");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/028-whiteboard1.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Comisiones.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_Comisiones.setForeground(new java.awt.Color(255, 102, 255));
        btn_Comisiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/027-diploma.png"))); // NOI18N
        btn_Comisiones.setText("Revisar Comisiones");
        btn_Comisiones.setToolTipText("");
        btn_Comisiones.setBorder(null);
        btn_Comisiones.setContentAreaFilled(false);
        btn_Comisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComisionesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Comisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 300, 80));

        tablaRegistro.setBackground(new java.awt.Color(204, 255, 204));
        tablaRegistro.setForeground(new java.awt.Color(51, 153, 0));
        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaRegistro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 670, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964 - copia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 740, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ComisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComisionesActionPerformed
        Comisiones SCOVista = new Comisiones();
        SCOVista.setVisible(true); 
    }//GEN-LAST:event_btn_ComisionesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Comisiones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
}
