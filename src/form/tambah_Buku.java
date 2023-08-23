/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.connect;

/**
 *
 * @author User
 */
public class tambah_Buku extends javax.swing.JFrame {

    /**
     * Creates new form tambah_Anggota
     */
    public tambah_Buku() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bukuBaru_field = new javax.swing.JTextField();
        genreBaru_field = new javax.swing.JTextField();
        tambahBaru_field = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tambah Buku");
        setPreferredSize(new java.awt.Dimension(220, 270));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Nama Buku    :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 100, 16);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Genre              :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 100, 16);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Tambah Buku");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 130, 19);

        bukuBaru_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukuBaru_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(bukuBaru_field);
        bukuBaru_field.setBounds(20, 70, 170, 24);

        genreBaru_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreBaru_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(genreBaru_field);
        genreBaru_field.setBounds(20, 130, 170, 24);

        tambahBaru_field.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tambahBaru_field.setText("Tambah");
        tambahBaru_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBaru_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(tambahBaru_field);
        tambahBaru_field.setBounds(60, 180, 100, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bukuBaru_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukuBaru_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bukuBaru_fieldActionPerformed

    private void genreBaru_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreBaru_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreBaru_fieldActionPerformed

    private void tambahBaru_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBaru_fieldActionPerformed
        // Syntax untuk Query sql
        //INSERT INTO `data_buku` (`Nama Buku`, `Genre`, `Status`, `Peminjam`) 
        //VALUES ('Al-Qur\'an Hadist', 'Pelajaran', '1', '0');
        String bukuBaru=bukuBaru_field.getText();
        String genreBaru=genreBaru_field.getText();
        //ini nyoba sendiri, syntax dapat dari mysql langsung
        try {
            String sql="INSERT INTO `data_buku` (`Nama Buku`, `Genre`, `Status`, `Peminjam`)"
                    + " VALUES ('"+ bukuBaru +"', '"+ genreBaru+"', '1', '0');";
            Connection koneksi= connect.configDB();
            PreparedStatement pst= koneksi.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil menambah data buku");
        } catch (Exception e) {
        }
        //ini dari chatGPT
        //Cobe analisis, kenapa ini tidak berhasil
        /*
        String sql = "INSERT INTO data_buku (Nama Buku, Genre, Status, Peminjam) VALUES ('"+ bukuBaru+"', '"+ genreBaru+"','"+1+"','"+0+"')";
        try {
            Connection koneksi=connect.configDB();
            PreparedStatement statement =koneksi.prepareStatement(sql); 
            int rowsAffected = statement.executeUpdate(sql);
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Berhasil menambahkan data buku");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menambahkan data buku");
            }
        } catch (SQLException e) {
        System.err.println("Error: " + e.getMessage());
        } 
        */
    }//GEN-LAST:event_tambahBaru_fieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(tambah_Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambah_Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambah_Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambah_Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambah_Buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bukuBaru_field;
    private javax.swing.JTextField genreBaru_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton tambahBaru_field;
    // End of variables declaration//GEN-END:variables
}