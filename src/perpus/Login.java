package perpus;
import java.sql.Connection;
import java.awt.Color;
import javax.swing.JOptionPane;
import main.Admin;
import main.AdminP;
import main.Anggota;
import main.AnggotaP;
import main.User;
import static main.connect.configDB;
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        User adm= new Admin("admin", 1234);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        username_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Tidak memiliki akun ? Hubungi admin.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        password_field.setBackground(new java.awt.Color(255, 255, 255));
        password_field.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        password_field.setForeground(new java.awt.Color(102, 0, 102));
        password_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password_field.setBorder(null);
        password_field.setOpaque(false);
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 290, 180, -1));

        username_field.setBackground(new java.awt.Color(255, 255, 255));
        username_field.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        username_field.setForeground(new java.awt.Color(204, 0, 204));
        username_field.setBorder(null);
        username_field.setOpaque(false);
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 230, 200, -1));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 360, 185, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Prak PBO, Sistem perpustakaan (1).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // ini untuk uji coba tanpa database
        /*
        String username=username_field.getText();
        String password=password_field.getText();
        if (username.equals("admin")&&password.equals("123")) {
            boolean s=true;
            AdminP a=new AdminP();
            a.setVisible(s);
            setVisible(false);
        } else if (username.equals("user")&password.equals("321")) {
            boolean s=true;
            AnggotaP u=new AnggotaP();
            u.setVisible(s);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Salah cuy");
        }
        */
        
        try {
            String id=username_field.getText();
            String passwordd=new String(password_field.getPassword());
            String sql="SELECT * FROM data_mahasiswa where NIM ='"+
                    id+"'AND Password = '"+ passwordd+"'";
            java.sql.Connection conn=(Connection)configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs=pst.executeQuery(sql);
            if (id.equals("admin")&&passwordd.equals("123")) {
                boolean s=true;
                AdminP a=new AdminP();
                a.setVisible(s);
                setVisible(false);
            }else if (rs.next()) {
                if (id.equals(rs.getString("NIM"))
                        &&passwordd.equals(rs.getString("Password"))) {
                    Anggota anggta=new Anggota();
                    anggta.setID(rs.getString("NIM"));
                    anggta.setJurusan(rs.getString("Jurusan"));
                    anggta.setNama(rs.getString("Nama"));
                    JOptionPane.showMessageDialog(null, "berhasil masuk");
                    // Hapus page skrg dan Tampilkan page selanjutnya
                    this.dispose();
                    AnggotaP run= new AnggotaP();
                    run.setVisible(true);
                }
            }else{
                    JOptionPane.showMessageDialog(null,"Nim atau password salah");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NIM atau password salah");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Login().setVisible(true);
        
        
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
