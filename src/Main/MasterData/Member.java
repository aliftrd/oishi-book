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
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Illuminate
 */
public class Member extends javax.swing.JFrame {

    /**
     * Creates new form Member
     */
    public Member() {
        initComponents();
        _setDate();
        _datatables();
    }
    
    private void _setDate() {
        CurrentDate cd = new CurrentDate();
        tanggal_hari_ini.setText(cd.getCurDate());
    }
    
    protected void _datatables() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nama");
        tbl.addColumn("Nomor");
        tbl.addColumn("Alamat");
        tbl.addColumn("Gender");
        member_table.setModel(tbl);
        try {
            String query = "SELECT * FROM anggota";
            Connection conn = (Connection)Database.GetConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            while(result.next()) {
                tbl.addRow(new Object[] {
                    result.getString("id_anggota"),
                    result.getString("nama"),
                    result.getString("nomor"),
                    result.getString("alamat"),
                    result.getString("gender"),
                });
                member_table.setModel(tbl);
            }
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

        ZeroLayout = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        btn_back = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Topbar = new javax.swing.JPanel();
        tanggal_hari_ini = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_nomor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_jk = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        member_table = new javax.swing.JTable();
        btnBook_reset = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnBook_delete = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnBook_submit = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Master - Member");
        setResizable(false);

        ZeroLayout.setBackground(new java.awt.Color(255, 255, 255));
        ZeroLayout.setMaximumSize(new java.awt.Dimension(1920, 1080));
        ZeroLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_alamat.setColumns(20);
        txt_alamat.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txt_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_alamat);

        ZeroLayout.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 250, -1));

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
        ZeroLayout.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 250, 29));
        ZeroLayout.add(txt_nomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, 29));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Alamat");
        ZeroLayout.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Nama");
        ZeroLayout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));

        txt_jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Pria", "Wanita" }));
        txt_jk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ZeroLayout.add(txt_jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 250, 29));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Nomor");
        ZeroLayout.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Jenis Kelamin");
        ZeroLayout.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

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
        jScrollPane2.setViewportView(member_table);

        ZeroLayout.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 890, -1));

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
        btnBook_reset.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        ZeroLayout.add(btnBook_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 80, 30));

        btnBook_delete.setBackground(new java.awt.Color(22, 30, 84));
        btnBook_delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Hapus");
        btnBook_delete.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        ZeroLayout.add(btnBook_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 70, 30));

        btnBook_submit.setBackground(new java.awt.Color(22, 30, 84));
        btnBook_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBook_submitMouseClicked(evt);
            }
        });
        btnBook_submit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Simpan");
        btnBook_submit.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        ZeroLayout.add(btnBook_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ZeroLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ZeroLayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        new Master().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void btnBook_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook_resetMouseClicked
        this._resetField();
    }//GEN-LAST:event_btnBook_resetMouseClicked

    private void btnBook_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBook_submitMouseClicked
        if(!txt_nama.getText().equals("") && !txt_nomor.getText().equals("") && txt_jk.getSelectedIndex() != 0 && !txt_alamat.getText().equals("")) {
            
        } else {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");   
        }
    }//GEN-LAST:event_btnBook_submitMouseClicked
    
    protected void _resetField() {
        txt_nama.setText("");
        txt_nomor.setText("");
        txt_jk.setSelectedIndex(0);
        txt_alamat.setText("");
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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Topbar;
    private javax.swing.JPanel ZeroLayout;
    private javax.swing.JPanel btnBook_delete;
    private javax.swing.JPanel btnBook_reset;
    private javax.swing.JPanel btnBook_submit;
    private javax.swing.JPanel btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable member_table;
    private javax.swing.JLabel tanggal_hari_ini;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JComboBox<String> txt_jk;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nomor;
    // End of variables declaration//GEN-END:variables
}
