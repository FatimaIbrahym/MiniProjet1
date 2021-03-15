package com.company.dao;

import com.company.models.Etudiant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoEtudiant {
    public List<Etudiant> getAllStudents() throws SQLException {
        List<Etudiant> etudiants = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = MySQL.getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String sql= "SELECT * FROM etudiant";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Long id = rs.getLong("id");
            String cne = rs.getString("cne");
            String diplome = rs.getString("diplome");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String email = rs.getString("email");
            etudiants.add(new Etudiant(id, cne, nom, prenom, diplome, email));
        }
   return etudiants;
    }
    public void addStudent(Etudiant e) throws SQLException {
        Statement stmt = null;
        try {
            stmt = MySQL.getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String insertSql = "INSERT INTO etudiant(cne, diplome, email,nom,prenom) VALUES('"+ e.getCne() +"','"+ e.getDiplome() +"','"+ e.getEmail() +"','"+ e.getNom() +"','"+ e.getPrenom()+"')";
        stmt.executeUpdate(insertSql);
    }
    public void updateStudent(Etudiant e) throws SQLException {
        Statement stmt = null;
        String sql = "UPDATE etudiant SET nom='"+e.getNom()+"', prenom='"+e.getPrenom()+"', email='"+e.getEmail()+"', diplome='"+e.getDiplome()+"' WHERE cne='"+e.getCne()+"'";
        try {
            stmt = MySQL.getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        System.out.printf(stmt.toString());
        stmt.executeUpdate(sql);
    }
    public void deleteStudent(String cne) throws SQLException {
        Statement stmt = null;
        try {
            stmt = MySQL.getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String insertSql = "delete from etudiant where cne='"+cne +"'";
        stmt.executeUpdate(insertSql);
    }
    public Etudiant getEtudiantById(Long idE) throws SQLException {
        Etudiant e=null;
        Statement stmt = null;
        try {
            stmt = MySQL.getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String sql= "SELECT * FROM etudiant where id="+idE;
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Long id = rs.getLong("id");
            String cne = rs.getString("cne");
            String diplome = rs.getString("diplome");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String email = rs.getString("email");
             e=new Etudiant(id, cne, nom, prenom, diplome, email);
        }
        return e;
    }
}