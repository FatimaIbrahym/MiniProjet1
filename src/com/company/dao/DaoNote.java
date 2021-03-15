package com.company.dao;

import com.company.models.Etudiant;
import com.company.models.Note;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoNote {
    public List<Note> getNoteByModule(Long moduleId) throws SQLException {
       List<Note> notes = new ArrayList<>();
       DaoEtudiant daoEtudiant=new DaoEtudiant();
        Statement stmt = null;
        try {
            stmt = MySQL.getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String sql= "SELECT * FROM note WHERE module_id="+moduleId;
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Long id = rs.getLong("id");
            double note = rs.getDouble("note");
            Etudiant etudiant=daoEtudiant.getEtudiantById(rs.getLong("etudiant_id"));
            notes.add(new Note(id,null,etudiant,note));
        }

       return notes;
    }
}
