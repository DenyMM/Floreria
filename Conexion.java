
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @Denisse Mendoza Melo
 */
public class Conexion {         
         
    public static void main(String[] args) {
        
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
            stmt.executeUpdate("UPDATE pedidos_empleado SET HoraTermino='55' WHERE IDPedidoEmpleado='3'");
            //stmt.executeUpdate("UPDATE pedidos_empleado SET Estatus='EE' WHERE IDPedidoEmpleado='2'");
            //stmt.executeUpdate("UPDATE empleados SET Comision= Comision+25 WHERE NoEmpleado='1'");
            //stmt.executeUpdate("INSERT INTO empleados VALUES (null,'Juan Perez','JuanP','5678','NL','Supervisor','100','300')");
            //stmt.executeUpdate("INSERT INTO pedidos_empleado VALUES ('1', '4','1', 'EE', '50', '0', '0')");
            //stmt.executeUpdate("INSERT INTO catalogo_arreglos VALUES (null, 'Graduacion', '500', '50', '25')");
            //stmt.executeUpdate("INSERT INTO registros VALUES (null,User_add,Pass_add )");
            rs = stmt.executeQuery("SELECT * FROM empleados");
            rs.next();
            do{
                System.out.println(rs.getString("NoEmpleado")+" Nombre: "+rs.getString("Nombre")+" Usuario: "+rs.getString("Usuario")+" Contrasenia: "+rs.getString("Contrasenia")+" Punto de Venta: "+rs.getString("PuntoDeVenta")+" Puesto: "+rs.getString("Puesto")+" Comision: "+rs.getString("Comision")+" Tiempo de Trabajo: "+rs.getString("TiempoTrabajo"));
            }while(rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
