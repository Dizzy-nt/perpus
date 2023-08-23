package perpus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class koneksi {
    private static Connection Koneksi;
    public static Connection getKoneksi() {
        if (Koneksi==null) {
                String host="jdbc:mysql://localhost:3306/user",
                user="root",
                pass="";
            try {
                Koneksi=DriverManager.getConnection(host,user,pass);
                JOptionPane.showMessageDialog(null, "Sukses");
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err.getMessage());
            }
        }
        return Koneksi;
    }
    static Object getConnection(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    
