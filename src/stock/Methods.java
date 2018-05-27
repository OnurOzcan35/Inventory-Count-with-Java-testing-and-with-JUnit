/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ONURPC
 */
public class Methods {
    public static boolean Login(String id,String pass) throws SQLException{
            boolean control = false;
            Connector.connect();
            PreparedStatement ps = Connector.conn.prepareStatement("select * from login");
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                if (id.equals(resultSet.getString("name")) && pass.equals(resultSet.getString("password"))) {
                      control = true;
                }
            }
            return control;
    }
    public static boolean regexControl(String str){
        String regex = "\\d{1,}(\\d*||((,\\d{1,})||(.\\d{1,})))";
        return str.matches(regex);
    }
    public static boolean regexStringControl(String str){
        String regexString = ".+";
        return str.matches(regexString);
    }
}
