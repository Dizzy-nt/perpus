package main;
import java.sql.*;
public class DAO extends koneksi{
    Connection con;
    PreparedStatement psmt;
    Statement smt;
    ResultSet rs;
    String query;
    public DAO() {
        try {
            koneksi mysqlCon = new koneksi();
            con = mysqlCon.getKoneksi();
        } catch (Exception e) {
        }
    }
    public ResultSet tampilkanDataBuku(){
        query = "SELECT * FROM data_buku";
        try {
            smt = con.createStatement();
            rs=smt.executeQuery(query);
        } catch (Exception e) {
        }
        return rs;
    }
    public ResultSet tampilkanDataMahasiswa(){
        query = "SELECT * FROM data_mahasiswa";
        try {
            smt = con.createStatement();
            rs=smt.executeQuery(query);
        } catch (Exception e) {
        }
        return rs;
    }

}
