package com.chenyun.jdbc;

import java.sql.*;

/**
 * Created by thomas.wang on 2016/12/7.
 */
public class SelectDate {
    public void mains() {
        String url =
                "jdbc:mysql://localhost:3306/acess?username=root" +
                        "&password=tiger&serverTimezone=UTC&charcterEncoding=UTF-8";
        Connection con = null;
        Statement stmt = null;
        try {
            //加载MySql的驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("ok");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到驱动程序类 ，加载驱动失败！");
            e.printStackTrace();
        }
         /*连接数据库*/
        try {
            con =
                    DriverManager.getConnection(url);
            stmt = con.createStatement();
            String sql = "select * from acess";
            ResultSet set = stmt.executeQuery(sql);
            while (set.next()) {
                //判断是否为空
                System.out.println(set.getString(
                        "as_name") + "," + set.getInt("as_id") + "," + set.getInt("as_acess"));
            }
            System.out.println(set);
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("出现异常");
            }
        } catch (SQLException se) {
            System.out.println("数据库连接失败！");
            se.printStackTrace();
        }
        //动态使用例如带有问号？？
//    PreparedStatement pstmt = con.prepareStatement(sql) ;
        //储存过程
//    CallableStatement cstmt =
        //          con.prepareCall("{CALL demoSp(? , ?)}") ;
    }
}