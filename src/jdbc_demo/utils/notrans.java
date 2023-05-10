package jdbc_demo.utils;

import java.sql.*;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class notrans {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306"; // 数据库连接URL
        String user = "root"; // 数据库登录用户名
        String password = "root"; // 数据库登录密码
        String sql1="show databases";
        String sql2="show databases";
        Connection conn = null;
        Statement stmt = null;
        try {
             conn = DriverManager.getConnection(url, user, password);
            // 连接数据库
             stmt = conn.createStatement();
            // 创建Statement对象
            stmt.addBatch(sql1);
            stmt.addBatch(sql2);

            ResultSet results = stmt.executeQuery(sql1);
            //            ResultSet rs = stmt.executeQuery(sql1);
//            // 执行SQL查询语句并获取结果集
//
//            while (rs.next()) {
//                // 遍历结果集并输出每个数据库名
//                System.out.println(rs.getString(1));
//            }
//
//            rs.close(); // 关闭结果集
            System.out.println("Results:");

            stmt.close(); // 关闭Statement对象
            conn.close(); // 关闭数据库连接
        } catch (SQLException e) {
            e.printStackTrace();
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
