package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class koneksi {
    private Connection Koneksi;
    public Connection getKoneksi() {
        String host="jdbc:mysql://localhost:3306/user",
                user="root",
                pass="";
        try {
            Koneksi=DriverManager.getConnection(host,user,pass);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        return Koneksi;
    } 
}
