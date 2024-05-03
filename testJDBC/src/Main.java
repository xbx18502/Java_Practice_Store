import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/apsfc?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "user001";
        String password = "user001";  // 使用新设置的密码


        // 加载MySQL JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 建立连接
            Connection conn = DriverManager.getConnection(url, user, password);
        Statement sta = conn.createStatement();
        System.out.println("Connected to database!");
        ResultSet res= sta.executeQuery("show databases;");
        while(res.next()){
            System.out.println(res.getString("database"));
        }


        // 如果连接成功，做一些数据库

            // 关闭连接
        sta.close();
            conn.close();



    }
}