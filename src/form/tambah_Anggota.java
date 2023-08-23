package form;
import java.sql.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.koneksi;
public class tambah_Anggota extends javax.swing.JFrame {
    public tambah_Anggota() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaBaru_field = new javax.swing.JTextField();
        nimBaru_field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jurusanBaru_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        password_field2 = new javax.swing.JPasswordField();
        password_field1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tambah Anggota");
        setPreferredSize(new java.awt.Dimension(220, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Nama     :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 60, 16);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("NIM         :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 60, 16);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Konfirmasi Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 240, 140, 16);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Tambah Anggota");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 130, 19);
        getContentPane().add(namaBaru_field);
        namaBaru_field.setBounds(20, 60, 170, 24);
        getContentPane().add(nimBaru_field);
        nimBaru_field.setBounds(20, 110, 170, 24);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 300, 100, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Jurusan :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 70, 16);
        getContentPane().add(jurusanBaru_field);
        jurusanBaru_field.setBounds(20, 160, 170, 24);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Password :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 70, 16);
        getContentPane().add(password_field2);
        password_field2.setBounds(20, 260, 170, 22);
        getContentPane().add(password_field1);
        password_field1.setBounds(20, 210, 170, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Query Untuk menambah anggota
        /*
        INSERT INTO `data_mahasiswa` (`NIM`, `Nama`, `Jurusan`, `Password`)
        VALUES ('220605110042', 'R. ABDURROSYID', 'Teknik Informatika', '1111');
        */
        //ini buat nyimpen password semntara, buat dicocokin
        String pas1=new String(password_field1.getPassword()),
                pas2=new String(password_field2.getPassword());
        //ini buat konfirmasi password
        if (pas1.equals(pas2)) {
            try{
            // ini query buat sql-nya
            String sql = "INSERT INTO data_mahasiswa (NIM,Nama,Jurusan,Password) VALUES ('" + nimBaru_field.getText()
            + "','" + namaBaru_field.getText() + "','"+jurusanBaru_field.getText()+"','"+ pas1+"')";
            koneksi k=new koneksi();
            Connection conn = k.getKoneksi();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
            this.dispose();
            }catch (HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Konfirmasi Password tidak sesuai");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tambah_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambah_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambah_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambah_Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambah_Anggota().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jurusanBaru_field;
    private javax.swing.JTextField namaBaru_field;
    private javax.swing.JTextField nimBaru_field;
    private javax.swing.JPasswordField password_field1;
    private javax.swing.JPasswordField password_field2;
    // End of variables declaration//GEN-END:variables
}
