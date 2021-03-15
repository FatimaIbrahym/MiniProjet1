package com.company.dao;

import com.company.models.Etudiant;
import com.company.models.Module;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoModule {
    public List<Module> getAllModules() throws SQLException {
        List<Module> modules = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = MySQL.getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String sql= "SELECT * FROM module";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Long id = rs.getLong("id");
            String name = rs.getString("name");
            modules.add(new Module(id,name));
        }
        return modules;
    }
}
