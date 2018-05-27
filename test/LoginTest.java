/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import stock.Methods;

/**
 *
 * @author ONURPC
 */
public class LoginTest {
    
     @Test
     public void LoginTest() throws SQLException {
         assertEquals(true, Methods.Login("admin", "zerone"));
     }
     @Test
     public void LoginTest2() throws SQLException {
         assertEquals(false, Methods.Login("admin", "asdasd"));
     }
     @Test
     public void LoginTest3() throws SQLException {
         assertEquals(false, Methods.Login("asda", "asdasd"));
     }
     @Test
     public void LoginTest4() throws SQLException {
         assertEquals(false, Methods.Login("", "zerone"));
     }
     
}
