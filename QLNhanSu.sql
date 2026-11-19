use DuongVietAnh_QLNhanSu
GO
CREATE DATABASE DuongVietAnh_QLNhanSu
GO
CREATE TABLE PhongBan (
    MaPB VARCHAR(10) PRIMARY KEY,
    TenPB NVARCHAR(50) NOT NULL,
    DienThoai VARCHAR(15)
);
CREATE TABLE ChucVu (
    MaCV VARCHAR(10) PRIMARY KEY,
    TenCV NVARCHAR(50) NOT NULL,
    PhuCap FLOAT DEFAULT 0
);
CREATE TABLE NhanVien (
    MaNV VARCHAR(10) PRIMARY KEY,
    HoTen NVARCHAR(50) NOT NULL,
    GioiTinh NVARCHAR(5) CHECK (GioiTinh IN (N'Nam', N'Nữ')),
    NgaySinh DATE,
    DienThoai VARCHAR(15) UNIQUE,
    LuongCoBan DECIMAL(18,2) DEFAULT 0,
    MaPB VARCHAR(10),
    MaCV VARCHAR(10),
    CONSTRAINT FK_NhanVien_PhongBan FOREIGN KEY (MaPB) REFERENCES PhongBan(MaPB),
    CONSTRAINT FK_NhanVien_ChucVu FOREIGN KEY (MaCV) REFERENCES ChucVu(MaCV)
);
-- 1.Dữ liệu bảng PhongBan
INSERT INTO PhongBan VALUES ('PB03', N'Phòng Kế Toán - Tài Chính', '0243555666');
INSERT INTO PhongBan VALUES ('PB04', N'Phòng Nhân Sự (HR)', '0243777888');
INSERT INTO PhongBan VALUES ('PB05', N'Phòng Kinh Doanh & Marketing', '0243999000');
-- 2.Dữ liệu bảng ChucVu
INSERT INTO ChucVu VALUES ('CV03', N'Phó Trưởng Phòng', 1.2);
INSERT INTO ChucVu VALUES ('CV04', N'Kế Toán Viên', 0.8);
INSERT INTO ChucVu VALUES ('CV05', N'Chuyên Viên Marketing', 0.9);
--3.Dữ liệu bảng NhanVien (Đa dạng phòng ban và chức vụ)
INSERT INTO NhanVien VALUES ('NV03', N'Lê Văn C', N'Nam', '1992-03-15', '0933111222', 12000000, 'PB03', 'CV03');
INSERT INTO NhanVien VALUES ('NV04', N'Phạm Thị D', N'Nữ', '1996-07-25', '0944333444', 9500000, 'PB03', 'CV04');
INSERT INTO NhanVien VALUES ('NV05', N'Hoàng Văn E', N'Nam', '1994-11-05', '0955555666', 14000000, 'PB05', 'CV01');
INSERT INTO NhanVien VALUES ('NV06', N'Vũ Thị F', N'Nữ', '1999-01-30', '0977888999', 8500000, 'PB04', 'CV02');
INSERT INTO NhanVien VALUES ('NV07', N'Đỗ Minh G', N'Nam', '1993-09-18', '0988222333', 11000000, 'PB05', 'CV05');
