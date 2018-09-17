package com.dao;

import com.model.login;

public interface loginDao {
    //public ResultSet getPasswd(Connection conn, String login) throws SQLException;
    public login getPasswd(String username);
}
