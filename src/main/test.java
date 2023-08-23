package main;
import java.sql.*;
public class test {
    public static void main(String[] args) throws SQLException {
        DAO test=new DAO();
        ResultSet rs=test.tampilkanDataMahasiswa();
        System.out.println(rs);
        while (rs.next()) {            
            System.out.print(rs.getString("NIM")+",");
            System.out.print(rs.getString("Nama")+",");
            System.out.print(rs.getString("Jurusan")+",");
            System.out.print(rs.getString("Password")+",");
            System.out.println("");
        }
    }
}
