package jdbc_demo;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class demo2 {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306?rewriteBatchedStatements=true"; // 数据库连接URL
        String user = "root"; // 数据库登录用户名
        String password = "root"; // 数据库登录密码
        String sql1 = "SHOW DATABASES";
        String sql2 = "show databases";
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);

            stmt = conn.createStatement();
//            String sql1 = "SELECT id, name, age FROM Employees";
//            String sql2 = "UPDATE Employees SET age = 30 WHERE id in (100, 101)";

            stmt.addBatch(sql1);
            stmt.addBatch(sql2);

            int[] results = stmt.executeBatch();

            System.out.println("Results: ");
            for(int i=0; i<results.length; i++) {
                System.out.println(results[i]);
            }

            stmt.close();
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null){
                    stmt.close();}
            }catch(SQLException se2){
            }
            try{
                if(conn!=null){
                    conn.close();}
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Done!");
    }
}
