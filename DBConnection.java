package quanlynhansu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    public static Connection getConnection() {
            String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;"
                    + "databaseName=DuongVietAnh_QLNhanSu;"
                    + "encrypt=true;trustServerCertificate=true;";
            String user = "sa";
            String password = "123456";
            
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối CSDL thành công!");
            return conn;
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại: " + e.getMessage());
            return null;
        }
    }
public static void main(String[] args) {
    try (Connection conn = getConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("Kết nối SQL Server thành công!");
            } else {
                System.out.println("Kết nối thất bại (conn == null).");
            }
        } catch (SQLException e) {
            System.err.println("Lỗi khi kiểm tra kết nối: " + e.getMessage());
        }
    }
}
    

    
