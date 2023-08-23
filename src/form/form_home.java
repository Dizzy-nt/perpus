package form;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.Anggota;
import main.CnD;
import main.DAO;
import main.connect;

public class form_home extends javax.swing.JPanel implements CnD{
    DefaultTableModel tableModel;
    ResultSet rs;
    DAO dao = new DAO();
    private String namaBuku;
    private String genre;
    private String status;
    private String peminjam;
    Anggota anggota=new Anggota();
    public form_home() {
        initComponents();
        showDataBuku();
        showBukuDipinjam();
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
    private void showBukuDipinjam() {
        //step 1, samain sama jumlah kolom dan tempat Jtabel
        Object[] row = {"Nama Buku", "Genre", "Status", "Peminjam"};
        tableModel = new DefaultTableModel(null, row);
        tabel_buku2.setModel(tableModel);
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
                if (rs.getString("Peminjam") == null ? Anggota.getID() == null : rs.getString("Peminjam").equals(Anggota.getID())) {
                    tableModel.addRow(dataBuku);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        tombol_pinjam = new javax.swing.JButton();
        tombol_kembalikan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_buku = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_buku2 = new javax.swing.JTable();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        tombol_pinjam.setText("Pinjam");
        tombol_pinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_pinjamActionPerformed(evt);
            }
        });
        panel.add(tombol_pinjam);

        tombol_kembalikan.setText("Kembalikan");
        tombol_kembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_kembalikanActionPerformed(evt);
            }
        });
        panel.add(tombol_kembalikan);

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Buku yang dipinjam");

        tabel_buku2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_buku2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabel_buku2);
        if (tabel_buku2.getColumnModel().getColumnCount() > 0) {
            tabel_buku2.getColumnModel().getColumn(0).setResizable(false);
            tabel_buku2.getColumnModel().getColumn(1).setResizable(false);
            tabel_buku2.getColumnModel().getColumn(2).setResizable(false);
            tabel_buku2.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void tombol_pinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_pinjamActionPerformed
        // TODO add your handling code here:
        try {
            String sql="update data_buku set Peminjam = '"+ anggota.getID()+"', Status = '0' WHERE `Nama Buku` ='"+getNamaBuku()+"'";
            Connection koneksi= connect.configDB();
            koneksi.createStatement().executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Berhasil meminjam");
            showDataBuku();
            showBukuDipinjam();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_tombol_pinjamActionPerformed

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

    private void tombol_kembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_kembalikanActionPerformed
        // TODO add your handling code here:
        try {
            String sql="update data_buku set Peminjam = '"+0+"', Status = '1' WHERE `Nama Buku` ='"+getNamaBuku()+"'";
            Connection koneksi= connect.configDB();
            koneksi.createStatement().executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Berhasil mengembalikan buku");
            showDataBuku();
            showBukuDipinjam();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_tombol_kembalikanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabel_buku;
    private javax.swing.JTable tabel_buku2;
    private javax.swing.JButton tombol_kembalikan;
    private javax.swing.JButton tombol_pinjam;
    // End of variables declaration//GEN-END:variables

    @Override
    public void create() {
        
    }

    @Override
    public void delete() {
        
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
}
