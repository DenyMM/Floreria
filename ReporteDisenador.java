

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
public class ReporteDisenador extends javax.swing.JFrame {

    public ReporteDisenador() {
        initComponents();       
    }
    
    public void mostrarReporte(){
  
     String IDEmpleado = new String (txt_idEmpleado.getText());
     
     if (IDEmpleado.equals("1")){
     mostrarReporte1();
     }else if (IDEmpleado.equals("2")){
     mostrarReporte2();
     }else{
            JOptionPane.showMessageDialog(this, "Ese empleado no tiene reporte");
        } 
    }
    
    public void mostrarReporte1(){
     DefaultTableModel tDReporte = new DefaultTableModel();
     tDReporte.addColumn("NoEmpleado");
     tDReporte.addColumn("Nombre");
     tDReporte.addColumn("Usuario");
     tDReporte.addColumn("Puesto");
     tDReporte.addColumn("ID Arreglo");
     tDReporte.addColumn("Hora de Termino");
     tDReporte.addColumn("Comisiones");
     tDReporte.addColumn("Tiempo de trabajo");
     tablaReporteC.setModel(tDReporte);     
     String[]datos = new String[8];
     
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
            rs = stmt.executeQuery("SELECT t1.NoEmpleado, t1.Nombre, t1.Usuario, t1.Puesto, t2.IDAarreglo, t2.HoraTermino, t1.Comision, t1.TiempoTrabajo FROM empleados t1 INNER JOIN pedidos_empleado t2 ON t1.NoEmpleado = t2.NoEmpleado WHERE t1.NoEmpleado = 1");
            
            while(rs.next()){
              datos[0] = rs.getString(1);
              datos[1] = rs.getString(2);
              datos[2] = rs.getString(3);
              datos[3] = rs.getString(4);
              datos[4] = rs.getString(5);
              datos[5] = rs.getString(6);
              datos[6] = rs.getString(7);
              datos[7] = rs.getString(8);
              tDReporte.addRow(datos);
            }
            tablaReporteC.setModel(tDReporte);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + "Error en la consulta");
        }
    }
    
    public void mostrarReporte2(){
     DefaultTableModel tDReporte = new DefaultTableModel();
     tDReporte.addColumn("NoEmpleado");
     tDReporte.addColumn("Nombre");
     tDReporte.addColumn("Usuario");
     tDReporte.addColumn("Puesto");
     tDReporte.addColumn("ID Arreglo");
     tDReporte.addColumn("Hora de Termino");
     tDReporte.addColumn("Comisiones");
     tDReporte.addColumn("Tiempo de trabajo");
     tablaReporteC.setModel(tDReporte);     
     String[]datos = new String[8];
     
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
            rs = stmt.executeQuery("SELECT t1.NoEmpleado, t1.Nombre, t1.Usuario, t1.Puesto, t2.IDAarreglo, t2.HoraTermino, t1.Comision, t1.TiempoTrabajo FROM empleados t1 INNER JOIN pedidos_empleado t2 ON t1.NoEmpleado = t2.NoEmpleado WHERE t1.NoEmpleado = 2");
            
            while(rs.next()){
              datos[0] = rs.getString(1);
              datos[1] = rs.getString(2);
              datos[2] = rs.getString(3);
              datos[3] = rs.getString(4);
              datos[4] = rs.getString(5);
              datos[5] = rs.getString(6);
              datos[6] = rs.getString(7);
              datos[7] = rs.getString(8);
              tDReporte.addRow(datos);
            }
            tablaReporteC.setModel(tDReporte);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + "Error en la consulta");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_idEmpleado = new javax.swing.JTextField();
        btn_verReporte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReporteC = new javax.swing.JTable();
        btn_excel = new javax.swing.JButton();
        btn_pdf = new javax.swing.JButton();
        btn_correo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte Completo");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/016-invitation4.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/026-dictionary1.png"))); // NOI18N
        jLabel2.setText("Reporte Completo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 290, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/026-dictionary1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 110, 90));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/029-id-card.png"))); // NOI18N
        jLabel3.setText("Insertar ID de Diseñador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        txt_idEmpleado.setBackground(new java.awt.Color(255, 255, 204));
        txt_idEmpleado.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txt_idEmpleado.setForeground(new java.awt.Color(102, 204, 255));
        txt_idEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "numero", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(255, 153, 0))); // NOI18N
        getContentPane().add(txt_idEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 210, 60));

        btn_verReporte.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_verReporte.setForeground(new java.awt.Color(255, 204, 0));
        btn_verReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/016-invitation.png"))); // NOI18N
        btn_verReporte.setText("Ver reporte");
        btn_verReporte.setContentAreaFilled(false);
        btn_verReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_verReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        jScrollPane1.setBorder(null);

        tablaReporteC.setBackground(new java.awt.Color(153, 153, 255));
        tablaReporteC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaReporteC);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 860, 190));

        btn_excel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_excel.setForeground(new java.awt.Color(255, 153, 204));
        btn_excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/003-timetable.png"))); // NOI18N
        btn_excel.setText("Exportar a Excel");
        btn_excel.setContentAreaFilled(false);
        btn_excel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_excel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btn_excel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 230, 110));

        btn_pdf.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_pdf.setForeground(new java.awt.Color(0, 204, 204));
        btn_pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exam.png"))); // NOI18N
        btn_pdf.setText("Exportar a PDF");
        btn_pdf.setContentAreaFilled(false);
        btn_pdf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pdf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pdfActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 250, 110));

        btn_correo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btn_correo.setForeground(new java.awt.Color(153, 204, 255));
        btn_correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-paper-plane.png"))); // NOI18N
        btn_correo.setText("Enviar por correo");
        btn_correo.setContentAreaFilled(false);
        btn_correo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_correo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btn_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 250, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964 - copia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pdfActionPerformed

    private void btn_verReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verReporteActionPerformed
        mostrarReporte();
    }//GEN-LAST:event_btn_verReporteActionPerformed

    public static void main(String args[]) {            
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReporteDisenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteDisenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteDisenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteDisenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteDisenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_correo;
    private javax.swing.JButton btn_excel;
    private javax.swing.JButton btn_pdf;
    private javax.swing.JButton btn_verReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReporteC;
    private javax.swing.JTextField txt_idEmpleado;
    // End of variables declaration//GEN-END:variables
}
