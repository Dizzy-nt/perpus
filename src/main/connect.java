package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class connect {
    private static Connection Koneksii;
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/user",
                    user="root",
                    pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Koneksii=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage());
        }
        /*
        try {
            String teks="";
            String sql="SELECT * FROM data_mahasiswa where nim ='"+
                    1+"'AND password = '"+1+"'";
            java.sql.Connection conn=(Connection)configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs=pst.executeQuery(sql);
            if (rs.next()) {
                if (teks.equals(rs.getString("nim"))
                        &&teks.equals(rs.getString("password"))) {
                    JOptionPane.showMessageDialog(null, "berhasil masuk");
                    /* Hapus page skrg dan Tampilkan page selanjutnya
                    this.setVisible(false);
                    new masuk.setVisible(true);
                    /
                }
            }else{
                    JOptionPane.showMessageDialog(null,"Nim atau password salah");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NIM atau password salah");
        }
        */
        return Koneksii;

    }
}
