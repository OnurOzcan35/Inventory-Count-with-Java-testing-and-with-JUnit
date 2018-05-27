/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import org.junit.Test;

/**
 *
 * @author ONURPC
 */
public class ConnectionTest {
     
    @Test
     public void ConnectTest1() throws SQLException{
         stock.Connector.connect();
     }
      
     @Test(expected = SQLException.class)
     public void ConnectTest2() throws SQLException{
         stock.Connector.connect2();
     }
}
