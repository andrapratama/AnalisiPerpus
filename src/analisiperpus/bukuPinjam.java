/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * bukuPinjam.java
 *
 * Created on 09 Jun 16, 13:50:59
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
import java.text.SimpleDateFormat;

/**
 *
 *
 * @author andra
 */
public class bukuPinjam extends javax.swing.JFrame {

    /** Creates new form bukuPinjam */
    public bukuPinjam() {
        initComponents();
        dataTable();
        dataTableTransaksi();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        TabelTransaksi = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNPM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TglPinjam = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        TglKembali = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        txtJudul = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelBuku = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelBukuPinjam = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCari1 = new javax.swing.JTextField();
        btnCari1 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnHapusBukuTabel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuDaftarBuku = new javax.swing.JMenuItem();
        menuTambahBuku = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuDaftarTransaksi = new javax.swing.JMenuItem();
        menuTambahTransaksi = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        TabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabelTransaksi);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tambah Transaksi");
        setBackground(new java.awt.Color(60, 60, 221));

        jPanel1.setBackground(new java.awt.Color(74, 147, 221));

        jLabel3.setText("Nama");

        txtNama.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtNPM.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel4.setText("NPM");

        jLabel5.setText("Tanggal Pinjam");

        jLabel6.setText("Tanggal Kembali");

        jLabel1.setText("Masukkan Judul Buku");

        jLabel8.setText("Judul Buku");

        txtKode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        txtJudul.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });

        jButton1.setText("Tambahkan Buku");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TabelBuku.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelBuku);

        jLabel2.setText("Buku yang dipinjam");

        TabelBukuPinjam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TabelBukuPinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Judul", "Kategori"
            }
        ));
        TabelBukuPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelBukuPinjamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelBukuPinjam);

        jButton3.setText("Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel7.setText("Tambah Transaksi Peminjaman Buku");

        txtCari.setFont(new java.awt.Font("Arial", 0, 14));
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        jLabel9.setText("Kode Buku");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Masukkan Judul Buku");

        btnCari1.setText("Cari");
        btnCari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCari1ActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnHapusBukuTabel.setText("Hapus");
        btnHapusBukuTabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusBukuTabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnHapusBukuTabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(457, 457, 457))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                                .addGap(111, 111, 111)
                                                .addComponent(jLabel2)
                                                .addGap(72, 72, 72))
                                            .addComponent(jLabel8))
                                        .addGap(531, 531, 531)))
                                .addGap(6622, 6622, 6622))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCari1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCari1))
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(6623, 6623, 6623))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNPM, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnCari))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TglKembali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TglPinjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel7)))
                .addContainerGap(6623, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TglPinjam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(TglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(btnHapusBukuTabel))
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(btnHapus)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCari1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari1))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jMenu1.setText("Buku");

        menuDaftarBuku.setText("Daftar Buku");
        menuDaftarBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarBukuActionPerformed(evt);
            }
        });
        jMenu1.add(menuDaftarBuku);

        menuTambahBuku.setText("Tambah Buku");
        menuTambahBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTambahBukuActionPerformed(evt);
            }
        });
        jMenu1.add(menuTambahBuku);

        jMenuItem2.setText("Tambah Kategori");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

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

        jMenuItem1.setText("Apriori");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String notrans_lama;
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         new Apriori(this, rootPaneCheckingEnabled).setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuDaftarBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarBukuActionPerformed
        // TODO add your handling code here:
        new daftarBuku().show();
        dispose();
    }//GEN-LAST:event_menuDaftarBukuActionPerformed

    private void menuTambahBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTambahBukuActionPerformed
        // TODO add your handling code here:
        new Buku().show();
        dispose();
    }//GEN-LAST:event_menuTambahBukuActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String kode = txtKode.getText();
        String judul = txtJudul.getText();

        Object[] row = { kode, judul, kategori };

        DefaultTableModel model = (DefaultTableModel) TabelBukuPinjam.getModel();

        model.addRow(row);
}//GEN-LAST:event_jButton1ActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode");
        model.addColumn("Judul");
        model.addColumn("Kategori");
        model.addColumn("Pengarang");
        model.addColumn("Penerbit");
        model.addColumn("Tahun");
        TabelBuku.setModel(model);
        try {
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery
                    ("select * from tbl_buku where judul_buku like '%"+txtCari.getText()+"%' ");
            while(res.next()) {
                model.addRow(new Object[]{
                    res.getString("kode_buku"),
                    res.getString("judul_buku"),
                    res.getString("nama_kategori"),
                    res.getString("pengarang"),
                    res.getString("penerbit"),
                    res.getString("tahun_terbit")
                });
            }
            TabelBuku.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah");
        }
}//GEN-LAST:event_btnCariActionPerformed

    String kategori;
    private void TabelBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelBukuMouseClicked
        // TODO add your handling code here:
        txtKode.setText(TabelBuku.getValueAt(TabelBuku.getSelectedRow(), 0).toString());
        txtJudul.setText(TabelBuku.getValueAt(TabelBuku.getSelectedRow(), 1).toString());
        kategori = (TabelBuku.getValueAt(TabelBuku.getSelectedRow(), 2).toString());
}//GEN-LAST:event_TabelBukuMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String tampilan = "yyyy-MM-dd";
        SimpleDateFormat format = new SimpleDateFormat(tampilan);
        int no = 0;
        String nama = txtNama.getText();
        String npm = txtNPM.getText();
        String tglpinjam = String.valueOf(format.format(TglPinjam.getDate()));
        String tglkembali = String.valueOf(format.format(TglKembali.getDate()));

        try {
            Statement statement = (Statement)
                    connect.GetConnection().createStatement();
            statement.executeUpdate
                    ("insert into tbl_transaksi values(Null);");

            ResultSet res = statement.executeQuery
                    ("select * from tbl_transaksi ORDER BY no_transaksi ASC");
            res.last();
            String hasil =res.getString("no_transaksi");
            no = Integer.parseInt(hasil);


            for(int x=0;x<TabelBukuPinjam.getRowCount();x++){
                String kode = TabelBukuPinjam.getValueAt(x, 0).toString();
                String buku = TabelBukuPinjam.getValueAt(x, 1).toString();
                String kat = TabelBukuPinjam.getValueAt(x, 2).toString();
                connect.GetConnection().createStatement();
                statement.executeUpdate
                        ("insert into tbl_transaksi_det values('"+no+"','"+kode+"','"+buku+"','"+kat+"','"+nama+"','"+npm+"','"+tglpinjam+"','"+tglkembali+"');");
            }
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        }catch(Exception t){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }

        dataTable();
        dataTableTransaksi();
        reset();
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Home().show();
        dispose();
}//GEN-LAST:event_jButton3ActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtJudulActionPerformed

    private void btnCari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCari1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor Transaksi");
        model.addColumn("Kode");
        model.addColumn("Judul");
        model.addColumn("Nama Peminjam");
        model.addColumn("NPM");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Tanggal Kembali");
        TabelTransaksi.setModel(model);
        try {
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery
                    ("select * from tbl_transaksi_det where judul_buku like '%"+txtCari1.getText()+"%' ");
            while(res.next()) {
                model.addRow(new Object[]{
                    res.getString("no_transaksi"),
                    res.getString("kode_buku"),
                    res.getString("judul_buku"),
                    res.getString("nama_peminjam"),
                    res.getString("npm"),
                    res.getString("tgl_pinjam"),
                    res.getString("tgl_kembali"),
                });
            }
            TabelTransaksi.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah");
        }
}//GEN-LAST:event_btnCari1ActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:

            try {
                Statement statement = (Statement)
                        connect.GetConnection().createStatement();
                statement.executeUpdate
                        ("delete a.*, b.* from tbl_transaksi_det a, tbl_transaksi b where a.no_transaksi = '" +notrans_lama+"' and b.no_transaksi = '" +notrans_lama+"'");

                dataTable();
                dataTableTransaksi();
                reset();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            }catch(Exception t){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
            }
}//GEN-LAST:event_btnHapusActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void TabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelTransaksiMouseClicked
        // TODO add your handling code here:
        txtNama.setText(TabelTransaksi.getValueAt(TabelTransaksi.getSelectedRow(), 4).toString());
        txtNPM.setText(TabelTransaksi.getValueAt(TabelTransaksi.getSelectedRow(), 5).toString());
        notrans_lama = TabelTransaksi.getValueAt(TabelTransaksi.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_TabelTransaksiMouseClicked

    private void TabelBukuPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelBukuPinjamMouseClicked
        // TODO add your handling code here:
        txtKode.setText(TabelBukuPinjam.getValueAt(TabelBukuPinjam.getSelectedRow(), 0).toString());
        txtJudul.setText(TabelBukuPinjam.getValueAt(TabelBukuPinjam.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_TabelBukuPinjamMouseClicked

    private void btnHapusBukuTabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusBukuTabelActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TabelBukuPinjam.getModel();
        int x = TabelBukuPinjam.getSelectedRow();
        model.removeRow(x);
    }//GEN-LAST:event_btnHapusBukuTabelActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         new Kategori().show();
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public void dataTable() {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Kode");
            model.addColumn("Judul");
            model.addColumn("Kategori");
            model.addColumn("Pengarang");
            model.addColumn("Penerbit");
            model.addColumn("Tahun");
            TabelBuku.setModel(model);
            try {
                Statement statement = (Statement)connect.GetConnection().createStatement();
                ResultSet res = statement.executeQuery
                        ("select * from tbl_buku");
                while(res.next())
                {
                    model.addRow(new Object[]{
                        res.getString("kode_buku"),
                        res.getString("judul_buku"),
                        res.getString("nama_kategori"),
                        res.getString("pengarang"),
                        res.getString("penerbit"),
                        res.getString("tahun_terbit")
                    });
                    TabelBuku.setModel(model);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Salah");
            }
    }

    public void dataTableTransaksi() {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nomor Transaksi");
            model.addColumn("Kode Buku");
            model.addColumn("Judul Buku");
            model.addColumn("Kategori");
            model.addColumn("Nama Peminjam");
            model.addColumn("NPM");
            model.addColumn("Tanggal Pinjam");
            model.addColumn("Tanggal Kembali");
            TabelTransaksi.setModel(model);
            try {
                Statement statement = (Statement)connect.GetConnection().createStatement();
                ResultSet res = statement.executeQuery
                        ("select * from tbl_transaksi_det");
                while(res.next())
                {
                    model.addRow(new Object[]{
                        res.getString("no_transaksi"),
                        res.getString("kode_buku"),
                        res.getString("judul_buku"),
                        res.getString("nama_kategori"),
                        res.getString("nama_peminjam"),
                        res.getString("npm"),
                        res.getString("tgl_pinjam"),
                        res.getString("tgl_kembali")
                    });
                    TabelTransaksi.setModel(model);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Salah");
            }
    }

    public void reset() {
        txtKode.setText("");
        txtNama.setText("");
        txtNPM.setText("");
        txtKode.setText("");
        txtJudul.setText("");
        TglPinjam.setDate(null);
        TglKembali.setDate(null);


        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Kode");
            model.addColumn("Judul");
            model.addColumn("Kategori");
            TabelBukuPinjam.setModel(model);
    }


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bukuPinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelBuku;
    private javax.swing.JTable TabelBukuPinjam;
    private javax.swing.JTable TabelTransaksi;
    private com.toedter.calendar.JDateChooser TglKembali;
    private com.toedter.calendar.JDateChooser TglPinjam;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCari1;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapusBukuTabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem menuDaftarBuku;
    private javax.swing.JMenuItem menuDaftarTransaksi;
    private javax.swing.JMenuItem menuTambahBuku;
    private javax.swing.JMenuItem menuTambahTransaksi;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCari1;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNPM;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

}
