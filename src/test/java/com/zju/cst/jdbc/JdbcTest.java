package com.zju.cst.jdbc;

import org.junit.Before;
import org.junit.Test;

import java.sql.*;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.*;

public class JdbcTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void connect() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {



        Connection conn = null;
        PreparedStatement ps = null;
        //配置基础信息
        try {
            String driverClass = "com.mysql.jdbc.Driver";
            String jdbcUrl = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String psword = "123456";

            //通过反射创建对象
            Driver driver = (Driver) Class.forName(driverClass).newInstance();
            Properties properties = new Properties();
            properties.put("user", user);
            properties.put("password",psword);

            //建立连接
            conn =  driver.connect(jdbcUrl,properties);
            System.out.println(conn);
//            String sql = "insert into info values (?,?,?,?)";
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1,3);
//            ps.setString(2,"jack");
//            ps.setString(3,"male");
//            ps.setDate(4,new java.sql.Date(20190914));
//            ps.executeUpdate();
            String selectSql = "select * from info";
            ps = conn.prepareStatement(selectSql);
            ResultSet rs = ps.executeQuery();
//            List<T>
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String sex = rs.getString(3);
                Date date = rs.getDate(4);
                System.out.println("id :" + id + "  name  : "+ name +"  sex  : "+ sex + "  date  : " + date);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            if (ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null)

                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }


    }

    @Test
    public void statementTest() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        connect();

    }
}