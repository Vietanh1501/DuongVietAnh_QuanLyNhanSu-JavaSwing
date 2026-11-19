package quanlynhansu;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class frmFormChinh extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmFormChinh.class.getName());

    
    public frmFormChinh() {
        initComponents();
        setTitle("Phần mềm Quản lý Nhân sự");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }
    private void hienThiTieuDeGiuaForm() {
    javax.swing.JLabel lblChu = new javax.swing.JLabel("PHẦN MỀM QUẢN LÝ NHÂN SỰ");
    lblChu.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 28));
    lblChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.JPanel pnlGiua = new javax.swing.JPanel(new java.awt.GridBagLayout());
    pnlGiua.add(lblChu);

    getContentPane().setLayout(new java.awt.BorderLayout());
    getContentPane().add(pnlGiua, java.awt.BorderLayout.CENTER);
    revalidate();
    repaint();
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTieuDeChinh = new javax.swing.JPanel();
        lblQuanLyNhanSu = new javax.swing.JLabel();
        jMenuQuanLyNhanSu = new javax.swing.JMenuBar();
        jMenuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniThoat = new javax.swing.JMenuItem();
        jMenuQuanLy = new javax.swing.JMenu();
        mniQuanLyPhongBan = new javax.swing.JMenuItem();
        mniQuanLyNhanVien = new javax.swing.JMenuItem();
        jMenuTroGiup = new javax.swing.JMenu();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTieuDeChinh.setBackground(new java.awt.Color(0, 0, 255));

        lblQuanLyNhanSu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuanLyNhanSu.setForeground(new java.awt.Color(51, 51, 51));
        lblQuanLyNhanSu.setText("                   PHẦN MỀM QUẢN LÝ NHÂN SỰ");

        javax.swing.GroupLayout lblTieuDeChinhLayout = new javax.swing.GroupLayout(lblTieuDeChinh);
        lblTieuDeChinh.setLayout(lblTieuDeChinhLayout);
        lblTieuDeChinhLayout.setHorizontalGroup(
            lblTieuDeChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuanLyNhanSu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        lblTieuDeChinhLayout.setVerticalGroup(
            lblTieuDeChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTieuDeChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuanLyNhanSu, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuHeThong.setText("Hệ thống");

        mniDangNhap.setText("Đăng nhập");
        mniDangNhap.addActionListener(this::mniDangNhapActionPerformed);
        jMenuHeThong.add(mniDangNhap);

        mniThoat.setText("Thoát");
        mniThoat.addActionListener(this::mniThoatActionPerformed);
        jMenuHeThong.add(mniThoat);

        jMenuQuanLyNhanSu.add(jMenuHeThong);

        jMenuQuanLy.setText("Quản lý");

        mniQuanLyPhongBan.setText("Quản lý phòng ban");
        mniQuanLyPhongBan.addActionListener(this::mniQuanLyPhongBanActionPerformed);
        jMenuQuanLy.add(mniQuanLyPhongBan);

        mniQuanLyNhanVien.setText("Quản lý nhân viên");
        mniQuanLyNhanVien.addActionListener(this::mniQuanLyNhanVienActionPerformed);
        jMenuQuanLy.add(mniQuanLyNhanVien);

        jMenuQuanLyNhanSu.add(jMenuQuanLy);

        jMenuTroGiup.setText("Trợ giúp");

        mniGioiThieu.setText("Giới thiệu");
        mniGioiThieu.addActionListener(this::mniGioiThieuActionPerformed);
        jMenuTroGiup.add(mniGioiThieu);

        jMenuQuanLyNhanSu.add(jMenuTroGiup);

        setJMenuBar(jMenuQuanLyNhanSu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTieuDeChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTieuDeChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        frmDangNhap f = new frmDangNhap();
        f.setLocationRelativeTo(this);
        f.setVisible(true);
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThoatActionPerformed
        int chon = JOptionPane.showConfirmDialog(
                this,
                "Bạn có muốn thoát chương trình?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION
        );
        if (chon == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mniThoatActionPerformed

    private void mniQuanLyPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQuanLyPhongBanActionPerformed
        frmPhongBan f = new frmPhongBan();
        f.setLocationRelativeTo(this);
        f.setVisible(true);
    }//GEN-LAST:event_mniQuanLyPhongBanActionPerformed

    private void mniQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQuanLyNhanVienActionPerformed
        frmNhanVien f = new frmNhanVien();
        f.setLocationRelativeTo(this);
        f.setVisible(true);
    }//GEN-LAST:event_mniQuanLyNhanVienActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
        JOptionPane.showMessageDialog(
                this,
                "PHẦN MỀM QUẢN LÝ NHÂN SỰ\nQLNhanSu - Java Swing & SQL Server\nPhiên bản 1.0",
                "Giới thiệu",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    public static void main(String args[]) {
        
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> new frmFormChinh().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuHeThong;
    private javax.swing.JMenu jMenuQuanLy;
    private javax.swing.JMenuBar jMenuQuanLyNhanSu;
    private javax.swing.JMenu jMenuTroGiup;
    private javax.swing.JLabel lblQuanLyNhanSu;
    private javax.swing.JPanel lblTieuDeChinh;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniQuanLyNhanVien;
    private javax.swing.JMenuItem mniQuanLyPhongBan;
    private javax.swing.JMenuItem mniThoat;
    // End of variables declaration//GEN-END:variables
}
