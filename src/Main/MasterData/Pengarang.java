/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.MasterData;

import Config.Database;
import Main.Date.CurrentDate;
import Main.Master;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Illuminate
 */
public class Pengarang extends javax.swing.JFrame {
    protected String selectedPengarangID;
    /**
     * Creates new form Pengarang
     */
    public Pengarang() {
        initComponents();
        _setDate();
        _datatables();
    }
    
    private void _setDate() {
        CurrentDate cd = new CurrentDate();
        tanggal_hari_ini.setText(cd.getCurDate());
    }
    
    private void _datatables() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nama");
        member_table.setModel(tbl);
        try {
            String query = "SELECT * FROM pengarang ORDER BY id_pengarang DESC";
            Connection conn = (Connection)Database.GetConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            while(result.next()) {
                tbl.addRow(new Object[] {
                    result.getString("id_pengarang"),
                    result.getString("nama"),
                });
                member_table.setModel(tbl);
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan saat mengambil data");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ZeroLayout3 = new javax.swing.JPanel();
        btn_back3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Topbar = new javax.swing.JPanel();
        tanggal_hari_ini = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        member_table = new javax.swing.JTable();
        btnBook_reset = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnBook_delete = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnBook_submit = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnBook_save = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Master - Pengarang");
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        ZeroLayout3.setBackground(new java.awt.Color(255, 255, 255));
        ZeroLayout3.setMaximumSize(new java.awt.Dimension(1920, 1080));
        ZeroLayout3.setPreferredSize(new java.awt.Dimension(1280, 720));
        ZeroLayout3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back3.setBackground(new java.awt.Color(22, 30, 84));
        btn_back3.setMinimumSize(new java.awt.Dimension(0, 720));
        btn_back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_back3MouseClicked(evt);
            }
        });
        btn_back3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout_x1.png"))); // NOI18N
        btn_back3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 66, 66));

        ZeroLayout3.add(btn_back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 66, 66));

        Topbar.setBackground(new java.awt.Color(20, 39, 155));
        Topbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tanggal_hari_ini.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tanggal_hari_ini.setForeground(new java.awt.Color(255, 255, 255));
        tanggal_hari_ini.setText("24 Desember 2077");
        Topbar.add(tanggal_hari_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 26, -1, -1));

        ZeroLayout3.add(Topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1240, 66));
        ZeroLayout3.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 300, 29));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Nama");
        ZeroLayout3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        member_table = new javax.swing.JTable() {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        member_table.setAutoCreateRowSorter(true);
        member_table.setModel(new javax.swing.table.DefaultTableModel(
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
        member_table.setRowHeight(25);
        member_table.getTableHeader().setReorderingAllowed(false);
        member_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(member_table);

        ZeroLayout3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 830, -1));

        btnBook_reset.setBackground(new java.awt.Color(22, 30, 84));
        btnBook_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBook_resetMouseClicked(evt);
            }
        });
        btnBook_reset.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Reset");
        btnBook_reset.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 30));

        ZeroLayout3.add(btnBook_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 65, 30));

        btnBook_delete.setBackground(new java.awt.Color(255, 92, 88));
        btnBook_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBook_deleteMouseClicked(evt);
            }
        });
        btnBook_delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(255, 92, 88));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Hapus");
        btnBook_delete.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 30));

        ZeroLayout3.add(btnBook_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 65, 30));

        btnBook_submit.setBackground(new java.awt.Color(87, 204, 153));
        btnBook_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBook_submitMouseClicked(evt);
            }
        });
        btnBook_submit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(87, 204, 153));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Tambah");
        btnBook_submit.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 30));

        ZeroLayout3.add(btnBook_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 65, 30));

        btnBook_save.setBackground(new java.awt.Color(250, 173, 128));
        btnBook_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBook_saveMouseClicked(evt);
            }
        });
        btnBook_save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(250, 173, 128));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Ubah");
        btnBook_save.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 30));

        ZeroLayout3.add(btnBook_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 65, 30));

        txt_cari.setForeground(new java.awt.Color(153, 153, 153));
        txt_cari.setText("Cari berdasarkan nama");
        txt_cari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cariFocusLost(evt);
            }
        });
        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });
        ZeroLayout3.add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 260, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ZeroLayout3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ZeroLayout3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_back3MouseClicked
        new Master().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_back3MouseClicked

    private void member_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_tableMouseClicked
        int row = member_table.getSelectedRow();
        String id = member_table.getValueAt(row, 0).toString();
        String nama = member_table.getValueAt(row, 1).toString();

        this.selectedPengarangID = id;
        txt_nama.setText(nama);
    }//GEN-LAST:event_member_tableMouseClicked

    private void btnBook_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook_resetMouseClicked
        this._resetField();
    }//GEN-LAST:event_btnBook_resetMouseClicked

    private void btnBook_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook_deleteMouseClicked
        if(this.selectedPengarangID != null) {
            int confirm = JOptionPane.showConfirmDialog(this, "Kamu yakin akan menghapus pengarang ini?", "Peringatan", JOptionPane.OK_CANCEL_OPTION);
            if(confirm == 0) {
                int row = member_table.getSelectedRow();
                String id_pengarang = member_table.getValueAt(row, 0).toString();

                try {
                    String query = "DELETE FROM pengarang WHERE id_pengarang = '" + id_pengarang + "'";
                    Connection conn = (Connection)Database.GetConnection();
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.execute();
                    ps.close();
                    conn.close();

                    this._resetField();
                    this._datatables();
                    JOptionPane.showMessageDialog(this, "Berhasil menghapus data");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus data, data sedang terpakai");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silahkan pilih data terlebih dahulu!");
        }
    }//GEN-LAST:event_btnBook_deleteMouseClicked

    private void btnBook_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook_submitMouseClicked
        if(!txt_nama.getText().equals("")) {
            if(this.selectedPengarangID != null) {
                JOptionPane.showMessageDialog(this, "Data sudah ada didatabase!");
            } else {
                String nama = txt_nama.getText();

                try {
                    String query = "INSERT INTO pengarang (id_pengarang, nama) VALUES (NULL, '" + nama + "')";
                    Connection conn = (Connection)Database.GetConnection();
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.execute();
                    ps.close();
                    conn.close();

                    this._datatables();
                    this._resetField();
                    JOptionPane.showMessageDialog(this, "Berhasil menambahkan data");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menambahkan data");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
        }
    }//GEN-LAST:event_btnBook_submitMouseClicked

    private void btnBook_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook_saveMouseClicked
        if(this.selectedPengarangID == null) {
            JOptionPane.showMessageDialog(this, "Error! Silahkan pilih data yang akan diubah");
        } else {
            try {
                String nama = txt_nama.getText();

                String query = "UPDATE pengarang SET nama = '" + nama + "' WHERE id_pengarang = '" + this.selectedPengarangID + "'";
                Connection conn = (Connection)Database.GetConnection();
                PreparedStatement ps = conn.prepareStatement(query);
                ps.execute();
                ps.close();
                conn.close();

                this._datatables();
                this._resetField();
                JOptionPane.showMessageDialog(this, "Berhasil mengubah data");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengubah data");
            }
        }
    }//GEN-LAST:event_btnBook_saveMouseClicked

    private void txt_cariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cariFocusGained
        if(txt_cari.getText().equals("Cari berdasarkan nama")) {
            txt_cari.setText("");
            txt_cari.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txt_cariFocusGained

    private void txt_cariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cariFocusLost
        if(txt_cari.getText().equals("")) {
            txt_cari.setText("Cari berdasarkan nama");
            txt_cari.setForeground(new Color(153, 153, 153));
        } else {
            txt_cari.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txt_cariFocusLost

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        try {
            String input = txt_cari.getText();
            String query = "SELECT * FROM pengarang WHERE CONCAT(id_pengarang, nama) LIKE '%" + input + "%'";
            Connection conn = (Connection)Database.GetConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet result = ps.executeQuery();

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID");
            tbl.addColumn("Nama");
            member_table.setModel(tbl);
            while(result.next()) {
                tbl.addRow(new Object[] {
                    result.getString("id_pengarang"),
                    result.getString("nama"),
                });
                member_table.setModel(tbl);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengambil data");
        }
    }//GEN-LAST:event_txt_cariKeyReleased

    protected void _resetField() {
        this.selectedPengarangID = null;
        txt_nama.setText("");
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
            java.util.logging.Logger.getLogger(Pengarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pengarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Topbar;
    private javax.swing.JPanel ZeroLayout3;
    private javax.swing.JPanel btnBook_delete;
    private javax.swing.JPanel btnBook_reset;
    private javax.swing.JPanel btnBook_save;
    private javax.swing.JPanel btnBook_submit;
    private javax.swing.JPanel btn_back3;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable member_table;
    private javax.swing.JLabel tanggal_hari_ini;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
