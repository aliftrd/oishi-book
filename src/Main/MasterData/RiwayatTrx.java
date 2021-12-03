/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.MasterData;

import Config.Database;
import Main.Date.CurrentDate;
import Main.Master;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Illuminate
 */
public class RiwayatTrx extends javax.swing.JFrame {
    protected String selectedTrxID;
    
    /**
     * Creates new form RiwayatTrx
     */
    public RiwayatTrx() {
        initComponents();
        this._setDate();
        this._datatables();
        // Input Date Format
        tgl_mulai.setDateFormatString("yyyy-MM-dd");
        tgl_akhir.setDateFormatString("yyyy-MM-dd");
    }
    
    private void _setDate() {
        CurrentDate cd = new CurrentDate();
        tanggal_hari_ini.setText(cd.getCurDate());
    }
    
    private void _datatables() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nama Petugas");
        tbl.addColumn("Nama Anggota");
        tbl.addColumn("Total Harga");
        tbl.addColumn("Total Buku");
        tbl.addColumn("Status");
        tbl.addColumn("Tanggal Dibuat");
        tbl.addColumn("Tanggal Kembali");
        tbl.addColumn("Tanggal Dikembalikan");
        riwayat_table.setModel(tbl);
        try {
            String query = "SELECT transaksi.*, petugas.nama AS nama_petugas, anggota.nama AS nama_anggota, COUNT(detail_transaksi.id_transaksi) AS total_buku FROM transaksi JOIN petugas ON transaksi.id_petugas = petugas.id_petugas  JOIN anggota ON transaksi.id_anggota = anggota.id_anggota JOIN detail_transaksi ON transaksi.id_transaksi = detail_transaksi.id_transaksi GROUP BY transaksi.id_transaksi ORDER BY id_transaksi DESC";
            Connection conn = (Connection)Database.GetConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            while(result.next()) {
                tbl.addRow(new Object[] {
                    result.getString("id_transaksi"),
                    result.getString("nama_petugas"),
                    result.getString("nama_anggota"),
                    result.getString("harga_total"),
                    result.getString("total_buku"),
                    result.getString("status"),
                    result.getString("tanggal_dibuat"),
                    result.getString("tanggal_kembali"),
                    result.getString("tanggal_dikembalikan"),
                });
                riwayat_table.setModel(tbl);
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan saat mengambil data");
        }
    }
    
    protected void resetDetailTable() {
        DefaultTableModel tbl = new DefaultTableModel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        detail_table = new javax.swing.JTable();
        btn_reset = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btn_cari = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txt_status = new javax.swing.JComboBox<>();
        tgl_mulai = new com.toedter.calendar.JDateChooser();
        tgl_akhir = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        riwayat_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Master - Riwayat Transaksi");
        setPreferredSize(new java.awt.Dimension(1280, 720));

        ZeroLayout.setBackground(new java.awt.Color(255, 255, 255));
        ZeroLayout.setMaximumSize(new java.awt.Dimension(1920, 1080));
        ZeroLayout.setPreferredSize(new java.awt.Dimension(1280, 720));
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

        detail_table = new javax.swing.JTable() {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        detail_table.setAutoCreateRowSorter(true);
        detail_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Data Detail Akan Tampil Disini Setelah Memilih Transaksi"}
            },
            new String [] {
                "INFORMATION"
            }
        ));
        detail_table.setRowHeight(25);
        detail_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(detail_table);

        ZeroLayout.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 460, 460));

        btn_reset.setBackground(new java.awt.Color(22, 30, 84));
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resetMouseClicked(evt);
            }
        });
        btn_reset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Reset");
        btn_reset.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 30));

        ZeroLayout.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 65, 30));

        btn_cari.setBackground(new java.awt.Color(22, 30, 84));
        btn_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cariMouseClicked(evt);
            }
        });
        btn_cari.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Cari");
        btn_cari.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 30));

        ZeroLayout.add(btn_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 65, 30));

        txt_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Dipinjam", "Dikembalikan" }));
        ZeroLayout.add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 165, 29));

        tgl_mulai.setToolTipText("Start");
        ZeroLayout.add(tgl_mulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 165, 29));

        tgl_akhir.setToolTipText("End");
        ZeroLayout.add(tgl_akhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 165, 29));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel2.setText("Tanggal Terakhir");
        ZeroLayout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setText("Tanggal Mulai");
        ZeroLayout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setText("Status");
        ZeroLayout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        riwayat_table = new javax.swing.JTable() {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        riwayat_table.setAutoCreateRowSorter(true);
        riwayat_table.setModel(new javax.swing.table.DefaultTableModel(
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
        riwayat_table.setRowHeight(25);
        riwayat_table.getTableHeader().setReorderingAllowed(false);
        riwayat_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                riwayat_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(riwayat_table);

        ZeroLayout.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 630, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ZeroLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ZeroLayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        new Master().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseClicked
        if(tgl_mulai.getDate() != null && tgl_akhir.getDate() != null && txt_status.getSelectedIndex() != 0) {
            this.resetDetailTable();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID");
            tbl.addColumn("Nama Petugas");
            tbl.addColumn("Nama Anggota");
            tbl.addColumn("Total Harga");
            tbl.addColumn("Total Buku");
            tbl.addColumn("Status");
            tbl.addColumn("Tanggal Dibuat");
            tbl.addColumn("Tanggal Kembali");
            tbl.addColumn("Tanggal Dikembalikan");
            riwayat_table.setModel(tbl);
            try {
                String query = "SELECT transaksi.*, petugas.nama AS nama_petugas, anggota.nama AS nama_anggota, COUNT(detail_transaksi.id_transaksi) AS total_buku FROM transaksi JOIN petugas ON transaksi.id_petugas = petugas.id_petugas  JOIN anggota ON transaksi.id_anggota = anggota.id_anggota JOIN detail_transaksi ON transaksi.id_transaksi = detail_transaksi.id_transaksi WHERE transaksi.status = '" + txt_status.getSelectedItem() + "' AND tanggal_dibuat BETWEEN '" + sdf.format(tgl_mulai.getDate()) + "' AND '" + sdf.format(tgl_akhir.getDate()) + "' GROUP BY transaksi.id_transaksi ORDER BY id_transaksi DESC";
                Connection conn = (Connection)Database.GetConnection();
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet result = ps.executeQuery();
                while(result.next()) {
                    tbl.addRow(new Object[] {
                        result.getString("id_transaksi"),
                        result.getString("nama_petugas"),
                        result.getString("nama_anggota"),
                        result.getString("harga_total"),
                        result.getString("total_buku"),
                        result.getString("status"),
                        result.getString("tanggal_dibuat"),
                        result.getString("tanggal_kembali"),
                        result.getString("tanggal_dikembalikan"),
                    });
                    riwayat_table.setModel(tbl);
                }
                ps.close();
                conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan saat mengambil data");
            }
        } else {
                JOptionPane.showMessageDialog(rootPane, "Input data tidak boleh kosong!");
        }
    }//GEN-LAST:event_btn_cariMouseClicked

    private void riwayat_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwayat_tableMouseClicked
        int row = riwayat_table.getSelectedRow();
        this.selectedTrxID = (String)riwayat_table.getValueAt(row, 0);
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Buku");
        tbl.addColumn("Nama Buku");
        detail_table.setModel(tbl);
        try {
            String query = "SELECT detail_transaksi.*, buku.* FROM detail_transaksi JOIN buku ON detail_transaksi.id_buku = buku.id_buku WHERE detail_transaksi.id_transaksi = '" + this.selectedTrxID + "'";
            Connection conn = (Connection)Database.GetConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            while(result.next()) {
                tbl.addRow(new Object[] {
                    result.getString("buku.id_buku"),
                    result.getString("buku.nama"),
                });
            }
            detail_table.setModel(tbl);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan saat mengambil data");
        }
    }//GEN-LAST:event_riwayat_tableMouseClicked

    private void btn_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseClicked
        this._datatables();
        this.resetDetailTable();
        tgl_mulai.setDate(null);
        tgl_akhir.setDate(null);
        txt_status.setSelectedIndex(0);
    }//GEN-LAST:event_btn_resetMouseClicked

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
            java.util.logging.Logger.getLogger(RiwayatTrx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiwayatTrx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiwayatTrx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiwayatTrx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiwayatTrx().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Topbar;
    private javax.swing.JPanel ZeroLayout;
    private javax.swing.JPanel btn_back;
    private javax.swing.JPanel btn_cari;
    private javax.swing.JPanel btn_reset;
    private javax.swing.JTable detail_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable riwayat_table;
    private javax.swing.JLabel tanggal_hari_ini;
    private com.toedter.calendar.JDateChooser tgl_akhir;
    private com.toedter.calendar.JDateChooser tgl_mulai;
    private javax.swing.JComboBox<String> txt_status;
    // End of variables declaration//GEN-END:variables
}