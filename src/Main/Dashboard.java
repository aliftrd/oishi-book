package Main;

import Config.Database;
import javax.swing.JOptionPane;
import Main.Date.CurrentDate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Illuminate
 */
public class Dashboard extends javax.swing.JFrame {
    /**
     * Creates new form Login
     */
    public Dashboard() {
        initComponents();
        welcome.setText("Halo, " + Model.User.getName() + "!");
        side_name.setText(Model.User.getName());
        
        setExtendedState(1280);
        _setDate();
        _setPinjamBox();
        _setAnggotaBox();
        _setBukuBox();
    }
    
    private void _setDate() {
        CurrentDate cd = new CurrentDate();
        tanggal_hari_ini.setText(cd.getCurDate());
    }
    
    private void _setPinjamBox() {
        try {
            String query = "SELECT COUNT(detail_transaksi.id_transaksi) AS ttl_dipinjam FROM transaksi, detail_transaksi WHERE transaksi.status = 'Dipinjam'";
            Connection conn = (Connection)Database.GetConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            if(result.next()) {
               peminjamCounter.setText(result.getString("ttl_dipinjam") + " Buku");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    private void _setAnggotaBox() {
        try {
            String query = "SELECT COUNT(*) AS ttl_anggota FROM anggota";
            Connection conn = (Connection)Database.GetConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            if(result.next()) {
               anggotaCounter.setText(result.getString("ttl_anggota") + " Orang");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    private void _setBukuBox() {
        try {
            String query = "SELECT COUNT(*) AS ttl_buku FROM buku";
            Connection conn = (Connection)Database.GetConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            if(result.next()) {
               bukuCounter.setText(result.getString("ttl_buku") + " Buku");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
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
        Sidebar = new javax.swing.JPanel();
        side_logo = new javax.swing.JLabel();
        side_name = new javax.swing.JLabel();
        side_role = new javax.swing.JLabel();
        paneDashboard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        paneTransaksi = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        paneMaster = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        paneLogout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Topbar = new javax.swing.JPanel();
        tanggal_hari_ini = new javax.swing.JLabel();
        totalBookBox = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bukuCounter = new javax.swing.JLabel();
        peminjamanBox = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        peminjamCounter = new javax.swing.JLabel();
        totalAnggotaBox = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        anggotaCounter = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        ZeroLayout.setBackground(new java.awt.Color(255, 255, 255));
        ZeroLayout.setMaximumSize(new java.awt.Dimension(1920, 1080));
        ZeroLayout.setMinimumSize(new java.awt.Dimension(1280, 720));
        ZeroLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sidebar.setBackground(new java.awt.Color(22, 30, 84));
        Sidebar.setMinimumSize(new java.awt.Dimension(0, 720));
        Sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo_x1.png"))); // NOI18N
        Sidebar.add(side_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 50, -1, -1));

        side_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        side_name.setForeground(new java.awt.Color(255, 255, 255));
        side_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        side_name.setText("Rihanna");
        Sidebar.add(side_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 261, 299, -1));

        side_role.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        side_role.setForeground(new java.awt.Color(255, 255, 255));
        side_role.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        side_role.setText("Administrator");
        Sidebar.add(side_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 287, 299, -1));

        paneDashboard.setBackground(new java.awt.Color(20, 39, 155));
        paneDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dashboard_x1.png"))); // NOI18N
        paneDashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dashboard");
        paneDashboard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 20));

        Sidebar.add(paneDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 299, 39));

        paneTransaksi.setBackground(new java.awt.Color(22, 30, 84));
        paneTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneTransaksiMouseClicked(evt);
            }
        });
        paneTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/transaksi_x1.png"))); // NOI18N
        paneTransaksi.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 30, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Transaksi");
        paneTransaksi.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 20));

        Sidebar.add(paneTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 299, 39));

        paneMaster.setBackground(new java.awt.Color(22, 30, 84));
        paneMaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneMasterMouseClicked(evt);
            }
        });
        paneMaster.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/master_x1.png"))); // NOI18N
        paneMaster.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Master");
        paneMaster.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 20));

        Sidebar.add(paneMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 299, 39));

        paneLogout.setBackground(new java.awt.Color(22, 30, 84));
        paneLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneLogoutMouseClicked(evt);
            }
        });
        paneLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout_x1.png"))); // NOI18N
        paneLogout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 30, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Log out");
        paneLogout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 20));

        Sidebar.add(paneLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 299, 39));

        ZeroLayout.add(Sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 299, 720));

        Topbar.setBackground(new java.awt.Color(20, 39, 155));
        Topbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tanggal_hari_ini.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tanggal_hari_ini.setForeground(new java.awt.Color(255, 255, 255));
        tanggal_hari_ini.setText("24 Desember 2077");
        Topbar.add(tanggal_hari_ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 26, -1, -1));

        ZeroLayout.add(Topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 990, 66));

        totalBookBox.setBackground(new java.awt.Color(250, 173, 128));
        totalBookBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(251, 198, 164));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dark_dashboard_x1.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        totalBookBox.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 81, 81));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Total buku");
        totalBookBox.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        bukuCounter.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bukuCounter.setText("56 Buku");
        totalBookBox.add(bukuCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        ZeroLayout.add(totalBookBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 100, 239, 81));

        peminjamanBox.setBackground(new java.awt.Color(255, 92, 88));
        peminjamanBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(254, 143, 143));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buku_x1.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        peminjamanBox.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 81, 81));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("Buku yang dipinjam");
        peminjamanBox.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        peminjamCounter.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        peminjamCounter.setText("56 Buku");
        peminjamanBox.add(peminjamCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        ZeroLayout.add(peminjamanBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 239, 81));

        totalAnggotaBox.setBackground(new java.awt.Color(87, 204, 153));
        totalAnggotaBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(128, 237, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/people_x1.png"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        totalAnggotaBox.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 81, 81));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setText("Total anggota");
        totalAnggotaBox.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        anggotaCounter.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        anggotaCounter.setText("8 Orang");
        totalAnggotaBox.add(anggotaCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        ZeroLayout.add(totalAnggotaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 239, 81));

        jPanel1.setBackground(new java.awt.Color(22, 30, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(20, 39, 155));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Kotak Informasi");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 50));

        welcome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("Halo!");
        jPanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Selamat datang di aplikasi OISHI BOOK");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        ZeroLayout.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 840, 130));

        getContentPane().add(ZeroLayout, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paneTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneTransaksiMouseClicked
        new Transaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_paneTransaksiMouseClicked

    private void paneMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneMasterMouseClicked
        new Master().setVisible(true);
        dispose();
    }//GEN-LAST:event_paneMasterMouseClicked

    private void paneLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneLogoutMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin keluar?", "Peringatan", JOptionPane.OK_CANCEL_OPTION);
        if(confirm == 0) {
            new Login().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_paneLogoutMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sidebar;
    private javax.swing.JPanel Topbar;
    private javax.swing.JPanel ZeroLayout;
    private javax.swing.JLabel anggotaCounter;
    private javax.swing.JLabel bukuCounter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel paneDashboard;
    private javax.swing.JPanel paneLogout;
    private javax.swing.JPanel paneMaster;
    private javax.swing.JPanel paneTransaksi;
    private javax.swing.JLabel peminjamCounter;
    private javax.swing.JPanel peminjamanBox;
    private javax.swing.JLabel side_logo;
    public javax.swing.JLabel side_name;
    private javax.swing.JLabel side_role;
    private javax.swing.JLabel tanggal_hari_ini;
    private javax.swing.JPanel totalAnggotaBox;
    private javax.swing.JPanel totalBookBox;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
