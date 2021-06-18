
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @Denisse Mendoza Melo
 */
public class Hilos extends Thread {
    javax.swing.JLabel tiempo;
    javax.swing.JLabel alarma;
    int contador;
    int sugerido = 50;
    int Termino;

    public Hilos(){
        contador=1;
    }
    
    public void run(){
        while(true){
            tiempo.setText("Tiempo: "+contador++);
            Alarma();
            horaTermino();
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Alarma(){
       if(contador == sugerido){
         alarma.setText("Tiempo sugerido de elaboracion al 90%");
       }
    }
    
    public void recibeTiempo(javax.swing.JLabel tiempo){
        this.tiempo= tiempo;
    }
    
    public void recibeAlarma(javax.swing.JLabel alarma){
        this.alarma= alarma;
    }   
    
    public void horaTermino(){
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
            stmt.executeUpdate("UPDATE pedidos_empleado SET HoraTermino=HoraTermino+'"+contador+"' WHERE Estatus='EE'");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
