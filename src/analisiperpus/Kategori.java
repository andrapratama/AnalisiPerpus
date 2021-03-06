/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Kategori.java
 *
 * Created on 23 Okt 16, 15:38:15
 */

package analisiperpus;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import javax.swing.JOptionPane;
import Koneksi.connect;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author andra
 */
public class Kategori extends javax.swing.JFrame {

    /** Creates new form Kategori */
    public Kategori() {
        initComponents();
        dataTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtKategori = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKategori = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuTambahBuku = new javax.swing.JMenu();
        menuDaftarBuku = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuTambahKategori = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuDaftarTransaksi = new javax.swing.JMenuItem();
        menuTambahTransaksi = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuApriori = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(74, 147, 221));

        jPanel1.setBackground(new java.awt.Color(74, 147, 221));

        txtKategori.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama Kategori");

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        tblKategori.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblKategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Kategori", "Nama Kategori"
            }
        ));
        tblKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKategori);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKembali))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(btnTambah)
                                .addGap(14, 14, 14)
                                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKembali)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        menuTambahBuku.setText("Buku");

        menuDaftarBuku.setText("Daftar Buku");
        menuDaftarBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarBukuActionPerformed(evt);
            }
        });
        menuTambahBuku.add(menuDaftarBuku);

        jMenuItem2.setText("Tambah Buku");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuTambahBuku.add(jMenuItem2);

        menuTambahKategori.setText("Tambah Kategori");
        menuTambahKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTambahKategoriActionPerformed(evt);
            }
        });
        menuTambahBuku.add(menuTambahKategori);

        jMenuBar1.add(menuTambahBuku);

        jMenu2.setText("Transaksi");

        menuDaftarTransaksi.setText("Daftar Transaksi");
        menuDaftarTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarTransaksiActionPerformed(evt);
            }
        });
        jMenu2.add(menuDaftarTransaksi);

        menuTambahTransaksi.setText("Tambah Transaksi");
        menuTambahTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTambahTransaksiActionPerformed(evt);
            }
        });
        jMenu2.add(menuTambahTransaksi);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Analisis");

        menuApriori.setText("Apriori");
        menuApriori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAprioriActionPerformed(evt);
            }
        });
        jMenu3.add(menuApriori);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuDaftarBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarBukuActionPerformed
        // TODO add your handling code here:
        new daftarBuku().show();
        dispose();
    }//GEN-LAST:event_menuDaftarBukuActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new Buku().show();
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuTambahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTambahKategoriActionPerformed
        // TODO add your handling code here:
        new Kategori().show();
        dispose();
    }//GEN-LAST:event_menuTambahKategoriActionPerformed

    private void menuDaftarTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarTransaksiActionPerformed
        // TODO add your handling code here:
        new Transaksi().show();
        dispose();
    }//GEN-LAST:event_menuDaftarTransaksiActionPerformed

    private void menuTambahTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTambahTransaksiActionPerformed
        // TODO add your handling code here:
        new bukuPinjam().show();
        dispose();
    }//GEN-LAST:event_menuTambahTransaksiActionPerformed

    private void menuAprioriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAprioriActionPerformed
        // TODO add your handling code here:
        new Apriori(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_menuAprioriActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new Home ().show();
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    String id;
    private void tblKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKategoriMouseClicked
        // TODO add your handling code here:
        id = (tblKategori.getValueAt(tblKategori.getSelectedRow(), 0).toString());
        txtKategori.setText(tblKategori.getValueAt(tblKategori.getSelectedRow(), 1).toString());

    }//GEN-LAST:event_tblKategoriMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        String kategori = txtKategori.getText().toString(); 
        try {
        Statement statement = (Statement)
                connect.GetConnection().createStatement();
        statement.executeUpdate
                ("update tbl_kategori set nama_kategori = '"+kategori+"' where id_kategori = '"+id+"'");
        dataTable();
        reset();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        }catch(Exception t){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:

         try {
        Statement statement = (Statement)
                connect.GetConnection().createStatement();
        statement.executeUpdate
                ("delete from tbl_kategori where id_kategori = '" +id+"'");

        dataTable();
        reset();
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        }catch(Exception t){
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String kategori = txtKategori.getText();

        try {
        Statement statement = (Statement)
                connect.GetConnection().createStatement();
        statement.executeUpdate
                ("insert into tbl_kategori values(NULL, '"+kategori+"');");
        dataTable();
        reset();

        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        }catch(Exception t){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    public void dataTable() {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id Kategori");
            model.addColumn("Nama Kategori");
            tblKategori.setModel(model);
            try {
                Statement statement = (Statement)connect.GetConnection().createStatement();
                ResultSet res = statement.executeQuery
                        ("select * from tbl_kategori order by id_kategori");
                while(res.next())
                {
                    model.addRow(new Object[]{
                        res.getString("id_kategori"),
                        res.getString("nama_kategori")
                    });
                    tblKategori.setModel(model);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Salah");
            }
    }

    public void reset() {
        txtKategori.setText("");
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuApriori;
    private javax.swing.JMenuItem menuDaftarBuku;
    private javax.swing.JMenuItem menuDaftarTransaksi;
    private javax.swing.JMenu menuTambahBuku;
    private javax.swing.JMenuItem menuTambahKategori;
    private javax.swing.JMenuItem menuTambahTransaksi;
    private javax.swing.JTable tblKategori;
    private javax.swing.JTextField txtKategori;
    // End of variables declaration//GEN-END:variables

}
