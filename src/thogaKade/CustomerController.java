/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thogaKade;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class CustomerController {

    public static boolean AddCustomer(String id, String name,
            String address, double salary) throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getDBConnection().getConnection();
        String sql = "Insert into Customer values('" + id + "','" + name + "','" + address + "'," + salary + ")";
        Statement stm = connection.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;

    }
}
