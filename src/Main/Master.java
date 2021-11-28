package Main;

import Main.Date.CurrentDate;
import Main.MasterData.Buku;
import Main.MasterData.Member;
import Main.MasterData.Penerbit;
import Main.MasterData.Pengarang;
import Main.MasterData.Petugas;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Illuminate
 */
public class Master extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Master() {
        initComponents();
        side_name.setText(Model.User.getName());
        
        setExtendedState(1280);
        _setDate();
    }
    
    private void _setDate() {
        CurrentDate cd = new CurrentDate();
        tanggal_hari_ini.setText(cd.getCurDate());
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
        PenerbitLyt = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        PetugasLyt = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        MemberLyt = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        PengarangLyt = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BukuLyt = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        RiwayatTrxLyt = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Master");
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

        paneDashboard.setBackground(new java.awt.Color(22, 30, 84));
        paneDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneDashboardMouseClicked(evt);
            }
        });
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

        paneMaster.setBackground(new java.awt.Color(20, 39, 155));
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

        PenerbitLyt.setBackground(new java.awt.Color(250, 173, 128));
        PenerbitLyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PenerbitLytMouseClicked(evt);
            }
        });
        PenerbitLyt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Penerbit");
        PenerbitLyt.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 130));

        ZeroLayout.add(PenerbitLyt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 240, 130));

        PetugasLyt.setBackground(new java.awt.Color(87, 204, 153));
        PetugasLyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PetugasLytMouseClicked(evt);
            }
        });
        PetugasLyt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Petugas");
        PetugasLyt.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 130));

        ZeroLayout.add(PetugasLyt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 240, 130));

        MemberLyt.setBackground(new java.awt.Color(255, 92, 88));
        MemberLyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberLytMouseClicked(evt);
            }
        });
        MemberLyt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Member");
        MemberLyt.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 130));

        ZeroLayout.add(MemberLyt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 240, 130));

        PengarangLyt.setBackground(new java.awt.Color(250, 173, 128));
        PengarangLyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengarangLytMouseClicked(evt);
            }
        });
        PengarangLyt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Pengarang");
        PengarangLyt.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 130));

        ZeroLayout.add(PengarangLyt, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, 240, 130));

        BukuLyt.setBackground(new java.awt.Color(87, 204, 153));
        BukuLyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BukuLytMouseClicked(evt);
            }
        });
        BukuLyt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Buku");
        BukuLyt.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 130));

        ZeroLayout.add(BukuLyt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 240, 130));

        RiwayatTrxLyt.setBackground(new java.awt.Color(255, 92, 88));
        RiwayatTrxLyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RiwayatTrxLytMouseClicked(evt);
            }
        });
        RiwayatTrxLyt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Riwayat Transaksi");
        RiwayatTrxLyt.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 130));

        ZeroLayout.add(RiwayatTrxLyt, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 300, 240, 130));

        getContentPane().add(ZeroLayout, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paneTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneTransaksiMouseClicked
        new Transaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_paneTransaksiMouseClicked

    private void paneDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneDashboardMouseClicked
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_paneDashboardMouseClicked

    private void paneLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneLogoutMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin keluar?", "Peringatan", JOptionPane.OK_CANCEL_OPTION);
        if(confirm == 0) {
            new Login().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_paneLogoutMouseClicked

    private void MemberLytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberLytMouseClicked
        new Member().setVisible(true);
        dispose();
    }//GEN-LAST:event_MemberLytMouseClicked

    private void PetugasLytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PetugasLytMouseClicked
        new Petugas().setVisible(true);
        dispose();
    }//GEN-LAST:event_PetugasLytMouseClicked

    private void PenerbitLytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PenerbitLytMouseClicked
        new Penerbit().setVisible(true);
        dispose();
    }//GEN-LAST:event_PenerbitLytMouseClicked

    private void PengarangLytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengarangLytMouseClicked
        new Pengarang().setVisible(true);
        dispose();
    }//GEN-LAST:event_PengarangLytMouseClicked

    private void BukuLytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BukuLytMouseClicked
        new Buku().setVisible(true);
        dispose();
    }//GEN-LAST:event_BukuLytMouseClicked

    private void RiwayatTrxLytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiwayatTrxLytMouseClicked
        JOptionPane.showMessageDialog(this, "Fitur ini sedang tahap pengembangan");
    }//GEN-LAST:event_RiwayatTrxLytMouseClicked

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
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BukuLyt;
    private javax.swing.JPanel MemberLyt;
    private javax.swing.JPanel PenerbitLyt;
    private javax.swing.JPanel PengarangLyt;
    private javax.swing.JPanel PetugasLyt;
    private javax.swing.JPanel RiwayatTrxLyt;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JPanel Topbar;
    private javax.swing.JPanel ZeroLayout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel paneDashboard;
    private javax.swing.JPanel paneLogout;
    private javax.swing.JPanel paneMaster;
    private javax.swing.JPanel paneTransaksi;
    private javax.swing.JLabel side_logo;
    public static final javax.swing.JLabel side_name = new javax.swing.JLabel();
    private javax.swing.JLabel side_role;
    private javax.swing.JLabel tanggal_hari_ini;
    // End of variables declaration//GEN-END:variables
}
