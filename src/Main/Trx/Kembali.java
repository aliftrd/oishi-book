/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Trx;

import Config.Database;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Illuminate
 */
public class Kembali extends javax.swing.JFrame {
    private DefaultTableModel tbl;
    /**
     * Creates new form Kembalik
     */
    public Kembali() {
        initComponents();
        this.datatables();
        tgl_pinjam.setDateFormatString("yyyy-MM-dd");
        tgl_kembali.setDateFormatString("yyyy-MM-dd");
    }
    
    protected void datatables() {
        tbl = new DefaultTableModel();
        tbl.addColumn("INFORMATION");
        tbl.addRow(new Object[] {
            "Data Detail Akan Tampil Disini Setelah Memilih Transaksi"
        });
        detail_table.setModel(tbl);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ZeroLayout = new javax.swing.JPanel();
        btn_back = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Topbar = new javax.swing.JPanel();
        tanggal_hari_ini = new javax.swing.JLabel();
        trx_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btn_search = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_petugas = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_anggota = new javax.swing.JTextField();
        harga_total = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tgl_pinjam = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tgl_kembali = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        detail_table = new javax.swing.JTable();
        btn_resetAll = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnBook_submit = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ZeroLayout.setBackground(new java.awt.Color(255, 255, 255));
        ZeroLayout.setMaximumSize(new java.awt.Dimension(1920, 1080));
        ZeroLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setBackground(new java.awt.Color(22, 30, 84));
        btn_back.setMinimumSize(new java.awt.Dimension(0, 720));
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        btn_back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout_x1.png"))); // NOI18N
        btn_back.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 66, 66));

        ZeroLayout.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 66, 66));

        Topbar.setBackground(new java.awt.Color(20, 39, 155));
        Topbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tanggal_hari_ini.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tanggal_hari_ini.setForeground(new java.awt.Color(255, 255, 255));
        tanggal_hari_ini.setText("24 Desember 2077");
        Topbar.add(tanggal_hari_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 26, -1, -1));

        ZeroLayout.add(Topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1240, 66));
        ZeroLayout.add(trx_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 181, 29));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Petugas");
        ZeroLayout.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 30));

        btn_search.setBackground(new java.awt.Color(22, 30, 84));
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchMouseClicked(evt);
            }
        });
        btn_search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cari");
        btn_search.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        ZeroLayout.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 60, 29));

        txt_petugas.setEditable(false);
        txt_petugas.setEnabled(false);
        ZeroLayout.add(txt_petugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 250, 29));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("ID TRX");
        ZeroLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Anggota");
        ZeroLayout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 30));

        txt_anggota.setEditable(false);
        txt_anggota.setEnabled(false);
        ZeroLayout.add(txt_anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 250, 29));

        harga_total.setEditable(false);
        harga_total.setEnabled(false);
        ZeroLayout.add(harga_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 250, 29));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Tanggal Pinjam");
        ZeroLayout.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 30));

        tgl_pinjam.setEnabled(false);
        ZeroLayout.add(tgl_pinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 250, 29));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Harga Total");
        ZeroLayout.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Tanggal Kembali");
        ZeroLayout.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, 30));

        tgl_kembali.setEnabled(false);
        ZeroLayout.add(tgl_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 250, 29));

        detail_table = new javax.swing.JTable() {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        detail_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(detail_table);

        ZeroLayout.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 820, -1));

        btn_resetAll.setBackground(new java.awt.Color(22, 30, 84));
        btn_resetAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resetAllMouseClicked(evt);
            }
        });
        btn_resetAll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Reset");
        btn_resetAll.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        ZeroLayout.add(btn_resetAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 70, 30));

        btnBook_submit.setBackground(new java.awt.Color(255, 92, 88));
        btnBook_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBook_submitMouseClicked(evt);
            }
        });
        btnBook_submit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Submit");
        btnBook_submit.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        ZeroLayout.add(btnBook_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ZeroLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ZeroLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        new Main.Transaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked
        String query;
        try {
            query = "SELECT * FROM transaksi JOIN anggota ON transaksi.id_anggota = anggota.id_anggota JOIN petugas ON transaksi.id_petugas = petugas.id_petugas WHERE id_transaksi = '" + trx_id.getText() + "'";
            Connection conn = (Connection)Database.GetConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            if(result.next()) {
                if(!result.getString("transaksi.status").equals("Dipinjam")) {
                    this._resetText();
                    JOptionPane.showMessageDialog(rootPane, "Transaksi sudah dikembalikan pada tanggal " + result.getString("tanggal_dikembalikan") + "!");
                } else {
                    tbl = new DefaultTableModel();
                    tbl.addColumn("ID Buku");
                    tbl.addColumn("Nama Buku");
                    detail_table.setModel(tbl);
                    txt_petugas.setText(result.getString("petugas.nama"));
                    txt_anggota.setText(result.getString("anggota.nama"));
                    harga_total.setText(result.getString("transaksi.harga_total"));
                    tgl_pinjam.setDate(Date.valueOf(result.getString("transaksi.tanggal_dibuat")));
                    tgl_kembali.setDate(Date.valueOf(result.getString("transaksi.tanggal_kembali")));
                    try {
                        query = "SELECT detail_transaksi.*, buku.* FROM detail_transaksi JOIN buku ON detail_transaksi.id_buku = buku.id_buku WHERE detail_transaksi.id_transaksi = '" + trx_id.getText() + "'";
                        PreparedStatement pst = conn.prepareStatement(query);
                        ResultSet results = pst.executeQuery();
                        while(results.next()) {
                            tbl.addRow(new Object[] {
                                results.getString("buku.id_buku"),
                                results.getString("buku.nama"),
                            });
                        }
                        detail_table.setModel(tbl);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(rootPane, "Maaf, terjadi kesalahan saat mengambil detail silahkan coba kembali!");
                    }
                }
            } else {
                this._resetText();
                JOptionPane.showMessageDialog(rootPane, "Maaf, id transaksi tidak ditemukan silahkan periksa kembali!");
            }
            ps.close();
            conn.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btn_searchMouseClicked

    private void btn_resetAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetAllMouseClicked
        this._resetText();
    }//GEN-LAST:event_btn_resetAllMouseClicked

    private void btnBook_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook_submitMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Semua data sudah benar?", "Peringatan", JOptionPane.OK_CANCEL_OPTION);
        if(confirm == 0) {
            if(!trx_id.getText().equals("")) {
                String query;
                PreparedStatement ps;
                try {
                    query = "UPDATE transaksi SET status = 'dikembalikan', tanggal_dikembalikan = NOW() WHERE id_transaksi = '" + trx_id.getText() + "'";
                    Connection conn = (Connection)Database.GetConnection();
                    try {
                        conn.setAutoCommit(false);
                        ps = conn.prepareStatement(query);
                        ps.execute();
                        Vector data = tbl.getDataVector();
                        for(int i = 0; i < data.toArray().length; i++) {
                            String id_buku = tbl.getValueAt(i, 0).toString();
                            query = "UPDATE buku SET stock = stock + 1 WHERE id_buku = " + id_buku;
                            ps = conn.prepareStatement(query);
                            ps.execute();
                        }
                        conn.commit();
                        this._resetText();
                        JOptionPane.showMessageDialog(this, "Berhasil mengubah data");
                    } catch(Exception ex) {
                        conn.rollback();
                        System.out.println(ex.getMessage());
                        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menambahkan data");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan dengan database");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak boleh kosong");
            }
        }
    }//GEN-LAST:event_btnBook_submitMouseClicked

    protected void resetDetailTable() {
        tbl = new DefaultTableModel();
        tbl.addColumn("INFORMATION");
        tbl.addRow(new Object[] {
            "Data Detail Akan Tampil Disini Setelah Memilih Transaksi"
        });
        detail_table.setModel(tbl);
    }
    
    protected void _resetText() {
        trx_id.setText("");
        txt_petugas.setText("");
        txt_anggota.setText("");
        harga_total.setText("");
        tgl_pinjam.setDate(null);
        tgl_kembali.setDate(null);
        this.resetDetailTable();
    }
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
            java.util.logging.Logger.getLogger(Kembali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kembali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kembali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kembali.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kembali().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Topbar;
    private javax.swing.JPanel ZeroLayout;
    private javax.swing.JPanel btnBook_submit;
    private javax.swing.JPanel btn_back;
    private javax.swing.JPanel btn_resetAll;
    private javax.swing.JPanel btn_search;
    private javax.swing.JTable detail_table;
    private javax.swing.JTextField harga_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tanggal_hari_ini;
    private com.toedter.calendar.JDateChooser tgl_kembali;
    private com.toedter.calendar.JDateChooser tgl_pinjam;
    private javax.swing.JTextField trx_id;
    private javax.swing.JTextField txt_anggota;
    private javax.swing.JTextField txt_petugas;
    // End of variables declaration//GEN-END:variables
}
