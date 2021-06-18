
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @Denisse Mendoza Melo
 */
public class usuarios extends javax.swing.JFrame {

    public usuarios() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        usuario_lb = new javax.swing.JLabel();
        usuario_nombre = new javax.swing.JTextField();
        pass_lb = new javax.swing.JLabel();
        tipo_lb = new javax.swing.JLabel();
        tipo_usuario = new javax.swing.JComboBox<>();
        btn_entrar = new javax.swing.JButton();
        passw_numeros = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Floreria \"Para Toda Ocasión\"");
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-tulip.png")).getImage());
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLogin.setBackground(new java.awt.Color(197, 193, 193));
        PanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(102, 153, 0))); // NOI18N

        usuario_lb.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        usuario_lb.setForeground(new java.awt.Color(102, 153, 0));
        usuario_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/008-ladybug.png"))); // NOI18N
        usuario_lb.setText("Usuario");
        usuario_lb.setToolTipText("");

        usuario_nombre.setBackground(new java.awt.Color(102, 153, 0));
        usuario_nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usuario_nombre.setForeground(new java.awt.Color(255, 255, 255));
        usuario_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario_nombre.setToolTipText("");
        usuario_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "nombre", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        usuario_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_nombreActionPerformed(evt);
            }
        });

        pass_lb.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        pass_lb.setForeground(new java.awt.Color(102, 153, 0));
        pass_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/004-sun.png"))); // NOI18N
        pass_lb.setText("Contraseña");

        tipo_lb.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tipo_lb.setForeground(new java.awt.Color(102, 153, 0));
        tipo_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipo_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/014-world.png"))); // NOI18N
        tipo_lb.setText("Tipo");

        tipo_usuario.setBackground(new java.awt.Color(204, 204, 204));
        tipo_usuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tipo_usuario.setForeground(new java.awt.Color(102, 153, 0));
        tipo_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Diseñador", "Supervisor" }));

        btn_entrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_entrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-tulip.png"))); // NOI18N
        btn_entrar.setText("Entrar");
        btn_entrar.setToolTipText("");
        btn_entrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 0), 3));
        btn_entrar.setVerifyInputWhenFocusTarget(false);
        btn_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_entrarMouseClicked(evt);
            }
        });
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        passw_numeros.setBackground(new java.awt.Color(102, 153, 0));
        passw_numeros.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passw_numeros.setForeground(new java.awt.Color(255, 255, 255));
        passw_numeros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "numeros", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(passw_numeros)
                    .addComponent(usuario_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLoginLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLoginLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(pass_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLoginLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(usuario_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLoginLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(tipo_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLoginLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(usuario_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(passw_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipo_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 500, 380));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a12e62d5f2daf2b49f092f92e4715964.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuario_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuario_nombreActionPerformed

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void btn_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseClicked
        String Usuario = "JoseF";
        String Password = "2021";      
        String admin = "DenisseM";
        String pass = "1234";  
        String Superv = "JuanP";
        String Passsup = "5678";
        
        String Pass_add = new String(passw_numeros.getPassword());
        String User_add = new String(usuario_nombre.getText());

        if(User_add.equals(Usuario)&& Pass_add.equals(Password)) {
            admin AVista = new admin();
            AVista.setVisible(true);
        }else if(User_add.equals(admin)&& Pass_add.equals(pass)){
            disenador DVista = new disenador();
            DVista.setVisible(true);
        }else if(User_add.equals(Superv)&& Pass_add.equals(Passsup)){
            Supervisor SuVista = new Supervisor();
            SuVista.setVisible(true);    
        }else{
            JOptionPane.showMessageDialog(this, "Los datos son incorrectos");
        }        
        
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
            stmt.executeUpdate("INSERT INTO registros VALUES (null, '"+User_add+"', '"+Pass_add+"')");            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btn_entrarMouseClicked
                 
    public static void main(String[] args) {
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarios().setVisible(true);
            }
        });
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel pass_lb;
    private javax.swing.JPasswordField passw_numeros;
    private javax.swing.JLabel tipo_lb;
    private javax.swing.JComboBox<String> tipo_usuario;
    private javax.swing.JLabel usuario_lb;
    private javax.swing.JTextField usuario_nombre;
    // End of variables declaration//GEN-END:variables
}
