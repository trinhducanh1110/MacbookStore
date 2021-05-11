package com.MacbookStore.model;

import java.sql.*;

public class CustomerQuery extends Customer{
    public boolean tryLogin(Customer customer) throws SQLException {
        boolean result;
        String jdbcURL = "jdbc:mysql://localhost:3306/macbookstore";
        String username = "admin";
        String password = "admin";
        Connection connection = DriverManager.getConnection(jdbcURL, username, password);

        String sql = "select * from Customer where username = '"+customer.Account+"', password = '"+customer.Password+"'";
        Statement state = connection.createStatement();
        ResultSet rs = state.executeQuery(sql);
        if(!rs.wasNull()){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

}
