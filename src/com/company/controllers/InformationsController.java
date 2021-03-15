package com.company.controllers;

import com.company.dao.DaoEtudiant;
import com.company.models.Etudiant;
import com.company.views.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;

public class InformationsController {
    Informations informations;
    Acceuil acc;
    List<Etudiant> etudiants;
    DaoEtudiant daoEtudiant = new DaoEtudiant();

    public InformationsController(Informations informations, Acceuil acc) {
        this.informations = informations;
        this.acc = acc;
        informations.frame.setVisible(true);
        acc.frame.setVisible(false);

        initView();
    }

    private void initView() {
        MyActionListener m1 = new MyActionListener();
        informations.getBtnAjouter().addActionListener(m1);
        informations.getBtnBack().addActionListener(m1);
        informations.getBtnSupprimer().addActionListener(m1);
        informations.getBtnModifier().addActionListener(m1);
        informations.tableEtudiant.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                int SelectRowIndex=informations.tableEtudiant.getSelectedRow();
                String s=informations.getModel().getValueAt(SelectRowIndex, 1).toString();
                informations.getCne().setText(s);

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        updateTable();
    }
    private void updateTable(){
        try {
            etudiants = daoEtudiant.getAllStudents();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        DefaultTableModel m = informations.getModel();
        m.setRowCount(0);
        for (int i = 0; i < etudiants.size(); i++) {
            Object[] o = {etudiants.get(i).getId(), etudiants.get(i).getCne(), etudiants.get(i).getNom(), etudiants.get(i).getPrenom(), etudiants.get(i).getEmail(), etudiants.get(i).getDiplome()};
            m.addRow(o);
        }
        informations.tableEtudiant.setModel(m);
    }
    private void cleanAllBtn(){
        informations.getCne().setText("");
        informations.getNom().setText("");
        informations.getPrenom().setText("");
        informations.getEmail().setText("");
        informations.getDiplome().setText("");
    }

    private class MyActionListener implements ActionListener {


        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == informations.getBtnAjouter()) {
                if (!informations.getCne().getText().equals("") || !informations.getDiplome().getText().equals("") || !informations.getEmail().getText().equals("") || !informations.getNom().getText().equals("") || !informations.getPrenom().getText().equals("")) {
                    try {
                        daoEtudiant.addStudent(new Etudiant((long)0, informations.getCne().getText(), informations.getNom().getText(), informations.getPrenom().getText(), informations.getDiplome().getText(), informations.getEmail().getText()));
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    updateTable();
                    cleanAllBtn();
                }


            }else if(event.getSource()==informations.getBtnBack()) {
                informations.frame.dispose();
                acc.frame.setVisible(true);

            }
            else if(event.getSource()==informations.getBtnSupprimer()) {
                if (!informations.getCne().getText().equals("")){
                    try {
                        daoEtudiant.deleteStudent(informations.getCne().getText());
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    informations.getCne().setText("");
                    updateTable();
                    cleanAllBtn();
                }
            }
            else if(event.getSource()==informations.getBtnModifier()) {
                if (!informations.getCne().getText().equals("") || !informations.getDiplome().getText().equals("") || !informations.getEmail().getText().equals("") || !informations.getNom().getText().equals("") || !informations.getPrenom().getText().equals("")) {
                    try {
                        daoEtudiant.updateStudent(new Etudiant((long)0, informations.getCne().getText(), informations.getNom().getText(), informations.getPrenom().getText(), informations.getDiplome().getText(), informations.getEmail().getText()));
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    updateTable();
                    cleanAllBtn();
                }
            }

        }
    }
}