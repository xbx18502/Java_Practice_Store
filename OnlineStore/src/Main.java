import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("1: search goods");
        System.out.println("2: show all goods");
        System.out.println("3: delete goods");
        System.out.println("4: exit goods");
        Scanner sn = new Scanner(System.in);

        //int choice = sn.nextInt();

       while(true){
           System.out.println("please input your option");
           int choice = sn.nextInt();
           //commodity com = null;
           if(choice==1){
               System.out.println("please input commodity number");
                int bno = sn.nextInt();
                commodity com = FindBook(bno);
                if(com == null) System.out.println("not found");
           }
           else if(choice==2){
               commodity AllCommodity = ShowBook();
           }
           else if(choice==3){

           }
           else if(choice==4){
               System.out.println("exit");
                break;
           }
           else{
               System.out.println("error: wrong command");
           }

       }


    }

    public static commodity FindBook(int bno) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/store?useSSL=false&" +
                "allowPublicKeyRetrieval=true";
        String user = "user001";
        String password = "user001";  // 使用新设置的密码


        // 加载MySQL JDBC驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 建立连接
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement sta = conn.createStatement();
        System.out.println("Connected to database!");
        ResultSet res= sta.executeQuery("select * from commodities where id="+bno+";");
        commodity com = null;
        if(res.next()){
            System.out.println(res.getInt("id")+"  "+
                    res.getString("name")+" "+
                    res.getString("brand")+" "+
                    res.getFloat("price"));
            int id = res.getInt("id");
            String name  = res.getString("name");
            String brand = res.getString("brand");
            float price = res.getFloat("price");

            com = new commodity();
            com.setId(id);
            com.setName(name);
            com.setBrand(brand);
            com.setPrice(price);



        }



        sta.close();
        conn.close();
        return com;
    }
    public static commodity ShowBook() throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/store?useSSL=false&" +
                "allowPublicKeyRetrieval=true";
        String user = "user001";
        String password = "user001";  // 使用新设置的密码


        // 加载MySQL JDBC驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 建立连接
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement sta = conn.createStatement();
        System.out.println("Connected to database!");
        ResultSet res= sta.executeQuery("select * from commodities;");
        commodity com = new commodity();
        while(res.next()){
            System.out.println(res.getInt("id")+"  "+
                    res.getString("name")+" "+
                    res.getString("brand")+" "+
                    res.getFloat("price"));
            int id = res.getInt("id");
            String name  = res.getString("name");
            String brand = res.getString("brand");
            float price = res.getFloat("price");


            com.setId(id);
            com.setName(name);
            com.setBrand(brand);
            com.setPrice(price);



        }



        sta.close();
        conn.close();
        return com;
    }
    
}