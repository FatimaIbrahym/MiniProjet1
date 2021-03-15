package com.company.controllers;

import com.company.views.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcceuilController {
    private Acceuil acceuil;

    public AcceuilController(Acceuil acceuil) {
        this.acceuil = acceuil;
        initView();
    }
    public void initView() {
        acceuil.frame.setVisible(true);
        MyActionListener m =new MyActionListener();
        this.acceuil.getBtnInformationsEtudiants().addActionListener(m);
        this.acceuil.getBtnGestionDesNotes().addActionListener(m);
        this.acceuil.getBtnGestionDesMoyennes().addActionListener(m);
        this.acceuil.getBtnGestionDesAbsences().addActionListener(m);
    }

    private class MyActionListener implements ActionListener {


        public void actionPerformed(ActionEvent event) {
            if(event.getSource()==acceuil.getBtnInformationsEtudiants()) {
                Informations window = new Informations();
                InformationsController c = new InformationsController(window,acceuil);


            }else if(event.getSource()==acceuil.getBtnGestionDesNotes()) {
                Gestiondesnotes g =new Gestiondesnotes();
                GestionNoteController gestionNoteController = new GestionNoteController(g,acceuil);


            }else if(event.getSource()==acceuil.getBtnGestionDesMoyennes()) {
                Gestiondesmoyenne m= new Gestiondesmoyenne();
                acceuil.frame.setVisible(false);
                m.frame.setVisible(true);
            }else if(event.getSource()==acceuil.getBtnGestionDesAbsences()) {
                Gestiondesabsence t = new Gestiondesabsence();
                acceuil.frame.setVisible(false);
                t.frame.setVisible(true);
            }
        }
    }


}
