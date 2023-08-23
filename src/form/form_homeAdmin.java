package form;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.CnD;
import main.DAO;
import main.koneksi;
public class form_homeAdmin extends javax.swing.JPanel implements CnD {
    DefaultTableModel tableModel;
    ResultSet rs;
    DAO dao = new DAO();
    private String namaBuku;
    private String genre;
    private String status;
    private String peminjam;
    private String nim;
    private String nama;
    private String jurusan;
    private String password;
    public form_homeAdmin() {
        initComponents();
        showDataBuku();
        showDataMahasiswa();
    }
    private void showDataBuku() {
        //step 1, samain sama jumlah kolom dan tempat Jtabel
        Object[] row = {"Nama Buku", "Genre", "Status", "Peminjam"};
        tableModel = new DefaultTableModel(null, row);
        tabel_buku.setModel(tableModel);

        try {
            //nyimpen resultset
            rs = dao.tampilkanDataBuku();
            //while looping sampe akhir resultset
            while (rs.next()) {
                //catat! databuku isinya satu baris doang, panjang
                String[] dataBuku = {
                    rs.getString("Nama Buku"),
                    rs.getString("Genre"),
                    rs.getString("Status"),
                    rs.getString("Peminjam")
                };
                //tampilin setiap baris yang udah disimpen di array databuku
                tableModel.addRow(dataBuku);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void showDataMahasiswa(){
        //step 1, samain sama jumlah kolom dan tempat Jtabel
        Object[] row = {"NIM", "Nama", "Jurusan", "Password"};
        tableModel = new DefaultTableModel(null, row);
        tabel_anggota.setModel(tableModel);
        try {
            //nyimpen resultset
            rs = dao.tampilkanDataMahasiswa();
            //while looping sampe akhir resultset
            while (rs.next()) {
                //catat! databuku isinya satu baris doang, panjang
                String[] dataMahasiswa = {
                    rs.getString("NIM"),
                    rs.getString("Nama"),
                    rs.getString("Jurusan"),
                    rs.getString("Password")
                };
                //tampilin setiap baris yang udah disimpen di array databuku
                tableModel.addRow(dataMahasiswa);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        tambahBuku_btn = new javax.swing.JButton();
        hapusBuku_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        tambahAnggota_btn = new javax.swing.JButton();
        hapusAnggota_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_buku = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_anggota = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        tambahBuku_btn.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tambahBuku_btn.setText("Tambah Buku");
        tambahBuku_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBuku_btnActionPerformed(evt);
            }
        });
        panel.add(tambahBuku_btn);

        hapusBuku_btn.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        hapusBuku_btn.setText("Hapus Buku");
        hapusBuku_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBuku_btnActionPerformed(evt);
            }
        });
        panel.add(hapusBuku_btn);

        update_btn.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        panel.add(update_btn);

        tambahAnggota_btn.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tambahAnggota_btn.setText("Tambah Anggota");
        tambahAnggota_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahAnggota_btnActionPerformed(evt);
            }
        });
        panel.add(tambahAnggota_btn);

        hapusAnggota_btn.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        hapusAnggota_btn.setText("Hapus Anggota");
        hapusAnggota_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusAnggota_btnActionPerformed(evt);
            }
        });
        panel.add(hapusAnggota_btn);

        tabel_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Buku", "Genre", "Status", "Peminjam"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_buku.getTableHeader().setReorderingAllowed(false);
        tabel_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_bukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_buku);
        if (tabel_buku.getColumnModel().getColumnCount() > 0) {
            tabel_buku.getColumnModel().getColumn(0).setResizable(false);
            tabel_buku.getColumnModel().getColumn(1).setResizable(false);
            tabel_buku.getColumnModel().getColumn(2).setResizable(false);
            tabel_buku.getColumnModel().getColumn(3).setResizable(false);
        }

        tabel_anggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jurusan", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_anggota.getTableHeader().setReorderingAllowed(false);
        tabel_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_anggotaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_anggota);
        if (tabel_anggota.getColumnModel().getColumnCount() > 0) {
            tabel_anggota.getColumnModel().getColumn(0).setResizable(false);
            tabel_anggota.getColumnModel().getColumn(1).setResizable(false);
            tabel_anggota.getColumnModel().getColumn(2).setResizable(false);
            tabel_anggota.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Daftar Anggota");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Daftar Buku");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tambahBuku_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBuku_btnActionPerformed
        // TODO add your handling code here:
        tambah_Buku tb = new tambah_Buku();
        tb.setVisible(true);
    }//GEN-LAST:event_tambahBuku_btnActionPerformed

    private void hapusAnggota_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusAnggota_btnActionPerformed
        delete();
    }//GEN-LAST:event_hapusAnggota_btnActionPerformed

    private void tambahAnggota_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahAnggota_btnActionPerformed
        // TODO add your handling code here:
        create();
    }//GEN-LAST:event_tambahAnggota_btnActionPerformed

    private void tabel_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_bukuMouseClicked
        // TODO add your handling code here:
        int i=tabel_buku.getSelectedRow();
        if (i>-1) {
            setNamaBuku(tabel_buku.getValueAt(i, 0).toString());
            setGenre(tabel_buku.getValueAt(i, 1).toString());
            setStatus(tabel_buku.getValueAt(i, 2).toString());
            setPeminjam(tabel_buku.getValueAt(i, 3).toString());  
        }
    }//GEN-LAST:event_tabel_bukuMouseClicked

    private void hapusBuku_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBuku_btnActionPerformed
        String query="DELETE FROM data_buku WHERE `data_buku`.`Nama Buku` = '"+getNamaBuku()+"'";
        Connection con= new koneksi().getKoneksi();
        try {
            con.createStatement().executeUpdate(query);
            showDataBuku();
        } catch (SQLException ex) {
            Logger.getLogger(form_homeAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hapusBuku_btnActionPerformed

    private void tabel_anggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_anggotaMouseClicked
        int i=tabel_anggota.getSelectedRow();
        if (i>-1) {
            setNim(tabel_anggota.getValueAt(i, 0).toString());
            setNama(tabel_anggota.getValueAt(i, 1).toString());
            setJurusan(tabel_anggota.getValueAt(i, 2).toString());
            setPassword(tabel_anggota.getValueAt(i, 3).toString());  
        }
    }//GEN-LAST:event_tabel_anggotaMouseClicked

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        showDataBuku();
        showDataMahasiswa();
    }//GEN-LAST:event_update_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapusAnggota_btn;
    private javax.swing.JButton hapusBuku_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabel_anggota;
    private javax.swing.JTable tabel_buku;
    private javax.swing.JButton tambahAnggota_btn;
    private javax.swing.JButton tambahBuku_btn;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void create() {
        tambah_Anggota ta = new tambah_Anggota();
        ta.setVisible(true);
    }
    @Override
    public void delete() {
        String query="DELETE FROM data_mahasiswa WHERE `data_mahasiswa`.`NIM` = '"+getNim()+"'";
        Connection con= new koneksi().getKoneksi();
        try {
            con.createStatement().executeUpdate(query);
            showDataMahasiswa();
        } catch (SQLException ex) {
            Logger.getLogger(form_homeAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getNamaBuku() {
        return namaBuku;
    }
    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPeminjam() {
        return peminjam;
    }
    public void setPeminjam(String peminjam) {
        this.peminjam = peminjam;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
