package main;
public class Anggota{
    private static String ID;
    private static String nama;
    private static String jurusan;
    public Anggota(String Id,String Nama,String Jurusan) {
        setID(Id);
        setNama(Nama);
        setJurusan(Jurusan);
    }
    public Anggota(String Id,String Nama) {
        setID(Id);
        setNama(Nama);
    }
    public Anggota(String Id) {
        setID(Id);
    }
    public Anggota(){
    }
    public void setID(String id) {
        ID=id;
    }
    public static String getID() {
        return ID;
    }
    public static String getNama() {
        return nama;
    }
    public static void setNama(String aNama) {
        nama = aNama;
    }
    public static String getJurusan() {
        return jurusan;
    }
    public static void setJurusan(String aJurusan) {
        jurusan = aJurusan;
    }
}
