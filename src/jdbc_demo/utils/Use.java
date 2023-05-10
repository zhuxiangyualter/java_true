package jdbc_demo.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class Use {
        public void testSelect(){
            Connection connection = null;
            String sql = "update tb_user1 set name = ? where id = ?";
            PreparedStatement preparedStatement = null;
            ResultSet set = null;
            try {
                connection = Util.getConnection();
                preparedStatement = connection.prepareStatement(sql);
                
                //需要提到try外面去  否则不能finally识别
                set = preparedStatement.executeQuery();
                while (set.next()){
                   int id = set.getInt("id");
                   String name = set.getString("name");
                   String sex = set.getString("sex");
                   // etc...
                    System.out.println(id+"\t"+name+"\t"+sex+"\t");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                Util.close(null,preparedStatement,connection);
            }
        }
        public void testDML(){
            Connection connection = null;
            String sql = "update tb_user1 set name = ? where id = ?";
            PreparedStatement preparedStatement = null;
            try {
                connection = Util.getConnection();
                 preparedStatement = connection.prepareStatement(sql);
                //需要提到try外面去  否则不能finally识别
                preparedStatement.setString(1,"zhuxaingyu");
                preparedStatement.setInt(2,4);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                Util.close(null,preparedStatement,connection);
            }
        }

    public static void main(String[] args) {


    }


}
