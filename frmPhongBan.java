package quanlynhansu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class frmPhongBan extends javax.swing.JFrame {
   
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmPhongBan.class.getName());

    
    public frmPhongBan() {
        initComponents();
        setTitle("Quản Lý Phòng Ban");
        setLocationRelativeTo(null);
        
        loadData(); 
    }

    private void loadData() {
    DefaultTableModel model = (DefaultTableModel) tblPhongBan.getModel();
    model.setColumnIdentifiers(new Object[]{"Mã PB", "Tên Phòng Ban", "Điện Thoại"});
    model.setRowCount(0);

    String sql = "SELECT MaPB, TenPB, DienThoai FROM PhongBan";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("MaPB"),
                rs.getString("TenPB"),
                rs.getString("DienThoai")
            });
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi tải dữ liệu: " + ex.getMessage());
    }
    }
    private void lamMoi() {
    txtMaPB.setText("");
    txtTenPB.setText("");
    txtDienThoai.setText("");
    txtMaPB.setEditable(true);
    txtMaPB.requestFocus();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMaPB = new javax.swing.JLabel();
        lblTenPB = new javax.swing.JLabel();
        lblDienThoai = new javax.swing.JLabel();
        txtMaPB = new javax.swing.JTextField();
        txtTenPB = new javax.swing.JTextField();
        txtDienThoai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnMnv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhongBan = new javax.swing.JTable();
        btnLamMoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMaPB.setText("Mã PB:");

        lblTenPB.setText("Tên PB:");

        lblDienThoai.setText("Điện Thoại:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(this::btnThemActionPerformed);

        btnSua.setText("Sửa");
        btnSua.addActionListener(this::btnSuaActionPerformed);

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(this::btnXoaActionPerformed);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(this::btnThoatActionPerformed);

        btnMnv.setText("Quản lý nhân viên >>");
        btnMnv.addActionListener(this::btnMnvActionPerformed);

        tblPhongBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã PB", "Tên Phòng Ban"
            }
        ));
        tblPhongBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhongBan);

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(this::btnLamMoiActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDienThoai)
                                    .addComponent(lblTenPB, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaPB, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaPB)
                                    .addComponent(txtTenPB)
                                    .addComponent(txtDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSua)
                                .addGap(12, 12, 12)
                                .addComponent(btnXoa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLamMoi)
                        .addGap(18, 18, 18)
                        .addComponent(btnThoat)
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMnv, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPB)
                    .addComponent(txtMaPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMnv))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenPB)
                    .addComponent(txtTenPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDienThoai)
                            .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThoat)
                            .addComponent(btnLamMoi)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        lamMoi();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (txtMaPB.getText().trim().isEmpty() || txtTenPB.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ Mã PB và Tên PB!");
        return;
    }
    String sql = "INSERT INTO PhongBan(MaPB, TenPB, DienThoai) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, txtMaPB.getText().trim());
        ps.setString(2, txtTenPB.getText().trim());
        ps.setString(3, txtDienThoai.getText().trim());
        ps.executeUpdate();

        JOptionPane.showMessageDialog(this, "Thêm phòng ban thành công!");
        loadData();
        lamMoi();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi thêm (kiểm tra trùng Mã PB): " + ex.getMessage());
    }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (txtMaPB.getText().trim().isEmpty() || txtTenPB.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn phòng ban cần sửa!");
        return;
    }
    String sql = "UPDATE PhongBan SET TenPB = ?, DienThoai = ? WHERE MaPB = ?";
    try (Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, txtTenPB.getText().trim());
        ps.setString(2, txtDienThoai.getText().trim());
        ps.setString(3, txtMaPB.getText().trim());

    if (ps.executeUpdate() > 0) {
        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        loadData();
        lamMoi();
    }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi cập nhật: " + ex.getMessage());
    }
    
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
    String maPB = txtMaPB.getText().trim();
    if (maPB.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn phòng ban cần xóa!");
        return;
    }
    int confirm = JOptionPane.showConfirmDialog(this, "Xóa phòng ban [" + maPB + "]?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) return;

    String sql = "DELETE FROM PhongBan WHERE MaPB = ?";
    try (Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {

    ps.setString(1, maPB);
    if (ps.executeUpdate() > 0) {
        JOptionPane.showMessageDialog(this, "Xóa thành công!");
        loadData();
        lamMoi();
    }
    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Không thể xóa (phòng ban đang có nhân viên): " + ex.getMessage());
    }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát chương trình?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
        System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnMnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMnvActionPerformed
        JOptionPane.showMessageDialog(this, "Chuyển sang giao diện Quản lý Nhân viên!");
        new frmNhanVien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMnvActionPerformed

    private void tblPhongBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongBanMouseClicked
        int row = tblPhongBan.getSelectedRow();
        if (row >= 0) {
        txtMaPB.setText(tblPhongBan.getValueAt(row, 0).toString());
        txtTenPB.setText(tblPhongBan.getValueAt(row, 1).toString());
        Object sdt = tblPhongBan.getValueAt(row, 2);
        txtDienThoai.setText(sdt != null ? sdt.toString() : "");
        txtMaPB.setEditable(false);
        }
    }//GEN-LAST:event_tblPhongBanMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frmPhongBan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnMnv;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDienThoai;
    private javax.swing.JLabel lblMaPB;
    private javax.swing.JLabel lblTenPB;
    private javax.swing.JTable tblPhongBan;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtMaPB;
    private javax.swing.JTextField txtTenPB;
    // End of variables declaration//GEN-END:variables
}
