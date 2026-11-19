package quanlynhansu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class frmNhanVien extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmNhanVien.class.getName());

    
    public frmNhanVien() {
        initComponents();
        setTitle("Quản Lý Nhân Viên");
        setLocationRelativeTo(null);
        loadComboBoxPhongBan();
        loadData("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblMaNV = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblSĐT = new javax.swing.JLabel();
        lblLuongCB = new javax.swing.JLabel();
        lblMaPB = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        cboGioiTinh = new javax.swing.JComboBox<>();
        txtDienThoai = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        cboMaPB = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("<< Về Phòng Ban");
        btnBack.addActionListener(this::btnBackActionPerformed);

        lblMaNV.setText("Mã NV:");

        lblHoTen.setText("Họ Tên:");

        lblGioiTinh.setText("Giới tính:");

        lblSĐT.setText("Điện Thoại:");

        lblLuongCB.setText("Lương CB:");

        lblMaPB.setText("Mã PB:");

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", " " }));

        btnThem.setText("Thêm");
        btnThem.addActionListener(this::btnThemActionPerformed);

        btnSua.setText("Sửa");
        btnSua.addActionListener(this::btnSuaActionPerformed);

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(this::btnXoaActionPerformed);

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(this::btnLamMoiActionPerformed);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(this::btnThoatActionPerformed);

        btnTim.setText("Tìm");
        btnTim.addActionListener(this::btnTimActionPerformed);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên", "Giới Tính", "SĐT", "Lương CB", "Mã PB"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGioiTinh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaNV)
                                    .addComponent(lblHoTen))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoTen)
                                    .addComponent(txtMaNV)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaPB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboMaPB, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSĐT)
                                    .addComponent(lblLuongCB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(txtDienThoai)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnLamMoi)
                        .addGap(18, 18, 18)
                        .addComponent(btnThoat)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTim)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaNV)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoTen)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGioiTinh)
                            .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSĐT)
                            .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLuongCB)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaPB)
                            .addComponent(cboMaPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLamMoi)
                            .addComponent(btnThoat)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        cboMaPB.removeAllItems();
        String sql = "SELECT MaPB FROM PhongBan";
        new frmPhongBan().setVisible(true);
        this.dispose();
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            cboMaPB.addItem(rs.getString("MaPB"));
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi tải danh sách phòng ban: " + ex.getMessage());
    } 
    }//GEN-LAST:event_btnBackActionPerformed
    private void lamMoi() {
    txtMaNV.setText("");
    txtHoTen.setText("");
    cboGioiTinh.setSelectedIndex(0);
    txtDienThoai.setText("");
    txtLuong.setText("");
    if (cboMaPB.getItemCount() > 0) {
        cboMaPB.setSelectedIndex(0);
    }
    txtTimKiem.setText("");
    txtMaNV.setEditable(true);
    txtMaNV.requestFocus();
    }
    private void loadComboBoxPhongBan() {
    cboMaPB.removeAllItems();
    String sql = "SELECT MaPB FROM PhongBan ORDER BY MaPB";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            cboMaPB.addItem(rs.getString("MaPB"));
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi tải danh sách phòng ban: " + ex.getMessage());
    }
    }
    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        lamMoi();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (!kiemTraDuLieu(true)) return;

        String sql = "INSERT INTO NhanVien(MaNV, HoTen, GioiTinh, DienThoai, LuongCoBan, MaPB) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, txtMaNV.getText().trim());
        ps.setString(2, txtHoTen.getText().trim());
        ps.setString(3, cboGioiTinh.getSelectedItem().toString());
        ps.setString(4, txtDienThoai.getText().trim());
        ps.setDouble(5, Double.parseDouble(txtLuong.getText().trim()));
        ps.setString(6, cboMaPB.getSelectedItem().toString());
        ps.executeUpdate();

        JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
        loadData("");
        lamMoi();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi thêm nhân viên (kiểm tra trùng Mã NV): " + ex.getMessage());
    }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (!kiemTraDuLieu(true)) return;

        String sql = "UPDATE NhanVien SET HoTen = ?, GioiTinh = ?, DienThoai = ?, LuongCoBan = ?, MaPB = ? WHERE MaNV = ?";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, txtHoTen.getText().trim());
        ps.setString(2, cboGioiTinh.getSelectedItem().toString());
        ps.setString(3, txtDienThoai.getText().trim());
        ps.setDouble(4, Double.parseDouble(txtLuong.getText().trim()));
        ps.setString(5, cboMaPB.getSelectedItem().toString());
        ps.setString(6, txtMaNV.getText().trim());

        if (ps.executeUpdate() > 0) {
            JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thành công!");
            loadData("");
            lamMoi();
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy Mã NV cần sửa!");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi cập nhật nhân viên: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String maNV = txtMaNV.getText().trim();
    if (maNV.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn hoặc nhập Mã NV cần xóa!");
        return;
    }

    int chon = JOptionPane.showConfirmDialog(this, "Xóa nhân viên [" + maNV + "]?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    if (chon != JOptionPane.YES_OPTION) return;

    String sql = "DELETE FROM NhanVien WHERE MaNV = ?";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, maNV);
        if (ps.executeUpdate() > 0) {
        JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công!");
        loadData("");
        lamMoi();
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy Mã NV cần xóa!");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi xóa nhân viên: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        String tuKhoa = txtTimKiem.getText().trim();
        loadData(tuKhoa);
        if (tblNhanVien.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên phù hợp!");
    }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát chương trình?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (chon == JOptionPane.YES_OPTION) {
        System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        int row = tblNhanVien.getSelectedRow();
        if (row >= 0) {
        txtMaNV.setText(tblNhanVien.getValueAt(row, 0).toString());
        txtHoTen.setText(tblNhanVien.getValueAt(row, 1).toString());
        cboGioiTinh.setSelectedItem(tblNhanVien.getValueAt(row, 2).toString());
        Object sdt = tblNhanVien.getValueAt(row, 3);
        txtDienThoai.setText(sdt != null ? sdt.toString() : "");
        txtLuong.setText(tblNhanVien.getValueAt(row, 4).toString());
        cboMaPB.setSelectedItem(tblNhanVien.getValueAt(row, 5).toString());
        txtMaNV.setEditable(false);
    }
    }//GEN-LAST:event_tblNhanVienMouseClicked
    private void loadData(String keyword) {
    DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
    model.setColumnIdentifiers(new Object[]{"Mã NV", "Họ Tên", "Giới Tính", "SĐT", "Lương CB", "Mã PB"});
    model.setRowCount(0);

    boolean timKiem = !keyword.isEmpty();
    String sql = timKiem
            ? "SELECT MaNV, HoTen, GioiTinh, DienThoai, LuongCoBan, MaPB FROM NhanVien WHERE MaNV LIKE ? OR HoTen LIKE ?"
            : "SELECT MaNV, HoTen, GioiTinh, DienThoai, LuongCoBan, MaPB FROM NhanVien";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        if (timKiem) {
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
        }

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("MaNV"),
                    rs.getString("HoTen"),
                    rs.getString("GioiTinh"),
                    rs.getString("DienThoai"),
                    rs.getDouble("LuongCoBan"),
                    rs.getString("MaPB")
                });
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi tải danh sách nhân viên: " + ex.getMessage());
    }
    }
    private boolean kiemTraDuLieu(boolean kiemTraLuong) {
    if (txtMaNV.getText().trim().isEmpty() || txtHoTen.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ Mã NV và Họ Tên!");
        return false;
    }
    if (kiemTraLuong) {
        try {
            double luong = Double.parseDouble(txtLuong.getText().trim());
            if (luong < 0) {
                JOptionPane.showMessageDialog(this, "Lương cơ bản phải lớn hơn hoặc bằng 0!");
                return false;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Lương cơ bản phải là số hợp lệ!");
            return false;
        }
    }
    return true;
    }
    
    
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
        java.awt.EventQueue.invokeLater(() -> new frmNhanVien().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JComboBox<String> cboMaPB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLuongCB;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaPB;
    private javax.swing.JLabel lblSĐT;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
