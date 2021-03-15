package com.company.controllers;

import com.company.dao.DaoModule;
import com.company.dao.DaoNote;
import com.company.models.Etudiant;
import com.company.models.Module;
import com.company.models.Note;
import com.company.views.Acceuil;
import com.company.views.Gestiondesnotes;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GestionNoteController {
    private Gestiondesnotes gestiondesnotes;
    private Acceuil acceuil;
    List<Module> modules;
    List<Note> notes=new ArrayList<>();
    DaoModule daoModule=new DaoModule();
    DaoNote daoNote= new DaoNote();

    public GestionNoteController(Gestiondesnotes gestiondesnotes, Acceuil acceuil) {
        this.gestiondesnotes = gestiondesnotes;
        this.acceuil = acceuil;
        initView();
    }
 private void initView(){
     acceuil.frame.setVisible(false);
     gestiondesnotes.frame.setVisible(true);
     MyActionListener m = new MyActionListener();
     gestiondesnotes.getBtnAnnuler().addActionListener(m);
     gestiondesnotes.getBtnrechercher().addActionListener(m);

     try {
         modules=daoModule.getAllModules();
     } catch (SQLException throwables) {
         throwables.printStackTrace();
     }
     for (Module mo:modules) {
         gestiondesnotes.getCombomodule().removeAllItems();
         gestiondesnotes.getCombomodule().addItem(mo.getName());
     }

 }
private void updateTable(){
    DefaultTableModel m = gestiondesnotes.getModelnote();
    m.setRowCount(0);
    for (int i = 0; i < notes.size(); i++) {
        Object[] o = {notes.get(i).getEtudiant().getId(), notes.get(i).getEtudiant().getCne(),notes.get(i).getEtudiant().getNom(),notes.get(i).getEtudiant().getPrenom(), notes.get(i).getNoteE()};
        m.addRow(o);
    }
    gestiondesnotes.getTablenote().setModel(m);
}




    private class MyActionListener implements ActionListener {


        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == gestiondesnotes.getBtnrechercher()) {
                System.out.printf("*********");
                for (Module m1:modules) {
                    if (m1.getName().equals(gestiondesnotes.combomodule.getSelectedItem().toString())){
                        System.out.printf("yes");
                        try {
                         notes = daoNote.getNoteByModule(m1.getId());
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }
                    }
                }
                System.out.println(notes.size());
                    updateTable();



            }else
                if(event.getSource()==gestiondesnotes.getBtnAnnuler()) {
                gestiondesnotes.frame.dispose();
                acceuil.frame.setVisible(true);

            }

        }
    }
}
