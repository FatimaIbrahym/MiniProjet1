package com.company.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class Acceuil {

    public static JFrame frame;
    private JTextField txtUniversiteSidiMohamed;
    private JTextField txtFaculteDesScience;
    private JTextField txtGestionDesEtudiant;
    public JButton btnGestionDesAbsences;
    public JButton btnGestionDesNotes;
    public JButton btnInformationsEtudiants;
    public JButton btnGestionDesMoyennes;

    /**
     * Create the application.
     */
    public Acceuil() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(32, 30, 45));
        frame.getContentPane().setLayout(null);

        txtUniversiteSidiMohamed = new JTextField();
        txtUniversiteSidiMohamed.setEnabled(false);
        txtUniversiteSidiMohamed.setBackground(new Color(32, 30, 45));
        txtUniversiteSidiMohamed.setDisabledTextColor(new Color(192,192,192));
        txtUniversiteSidiMohamed.setFont(new Font("Book Antiqua", Font.PLAIN, 20));
        txtUniversiteSidiMohamed.setHorizontalAlignment(SwingConstants.CENTER);
        txtUniversiteSidiMohamed.setText("Université Sidi Mohamed Ben Abdellah");
        txtUniversiteSidiMohamed.setBounds(195, 24, 390, 47);
        frame.getContentPane().add(txtUniversiteSidiMohamed);
        txtUniversiteSidiMohamed.setColumns(10);

        txtFaculteDesScience = new JTextField();
        txtFaculteDesScience.setEnabled(false);
        txtFaculteDesScience.setBackground(new Color(32, 30, 45));
        txtFaculteDesScience.setDisabledTextColor(new Color(192,192,192));
        txtFaculteDesScience.setFont(new Font("Book Antiqua", Font.PLAIN, 20));
        txtFaculteDesScience.setHorizontalAlignment(SwingConstants.CENTER);
        txtFaculteDesScience.setText("Faculté des Sciences Dhar El Mahraz");
        txtFaculteDesScience.setBounds(195, 101, 390, 47);
        frame.getContentPane().add(txtFaculteDesScience);
        txtFaculteDesScience.setColumns(10);

        txtGestionDesEtudiant = new JTextField();
        txtGestionDesEtudiant.setEnabled(false);
        txtGestionDesEtudiant.setBackground(new Color(192,192,192));
        txtGestionDesEtudiant.setDisabledTextColor(new Color(11, 7, 17));
        txtGestionDesEtudiant.setFont(new Font("Book Antiqua", Font.PLAIN, 22));
        txtGestionDesEtudiant.setHorizontalAlignment(SwingConstants.CENTER);
        txtGestionDesEtudiant.setText("Gestion des Etudiant LP-SIGL (2020-2021)");
        txtGestionDesEtudiant.setBounds(49, 170, 685, 47);
        frame.getContentPane().add(txtGestionDesEtudiant);
        txtGestionDesEtudiant.setColumns(10);


        JButton btnAcceuil = new JButton("Acceuil");
        btnAcceuil.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        btnAcceuil.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnAcceuil.setBackground(new Color(192,192,192));
        btnAcceuil.setBounds(318, 387, 154, 47);
        frame.getContentPane().add(btnAcceuil);

        btnGestionDesAbsences = new JButton("Gestion des absences");
        btnGestionDesAbsences.setBackground(new Color(235, 42, 83));
        btnGestionDesAbsences.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
        btnGestionDesAbsences.setBounds(532, 321, 202, 47);
        btnGestionDesAbsences.setForeground(new Color(192,192,192));
        btnGestionDesAbsences.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(btnGestionDesAbsences);

        btnGestionDesNotes = new JButton("Gestion des notes");
        btnGestionDesNotes.setBackground(new Color(235, 42, 83));
        btnGestionDesNotes.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
        btnGestionDesNotes.setBounds(532, 244, 202, 47);
        btnGestionDesNotes.setForeground(new Color(192,192,192));
        btnGestionDesNotes.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(btnGestionDesNotes);

        btnInformationsEtudiants = new JButton("informations Etudiants");
        btnInformationsEtudiants.setBackground(new Color(235, 42, 83));
        btnInformationsEtudiants.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
        btnInformationsEtudiants.setBounds(49, 244, 202, 47);
        btnInformationsEtudiants.setForeground(new Color(192,192,192));
        btnInformationsEtudiants.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(btnInformationsEtudiants);

        btnGestionDesMoyennes = new JButton("Gestion des Moyennes");
        btnGestionDesMoyennes.setBackground(new Color(235, 42, 83));
        btnInformationsEtudiants.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
        btnGestionDesMoyennes.setBounds(49, 321, 202, 47);
        btnGestionDesMoyennes.setForeground(new Color(192,192,192));
        btnGestionDesMoyennes.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(btnGestionDesMoyennes);

//        MyActionListener m=new MyActionListener();
//        btnInformationsEtudiants.addActionListener(m);
//        btnGestionDesNotes.addActionListener(m);
//        btnGestionDesMoyennes.addActionListener(m);
//        btnGestionDesAbsences.addActionListener(m);


        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("fsdm.jpg"));
        lblNewLabel.setBounds(41, 24, 145, 124);
        frame.getContentPane().add(lblNewLabel);

        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon("sidi-mohamed.png"));
        label.setBounds(627, 24, 145, 124);
        frame.getContentPane().add(label);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("prev.png"));
        lblNewLabel_1.setBounds(49, 387, 202, 47);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("next.png"));
        lblNewLabel_2.setBounds(532, 387, 202, 47);
        frame.getContentPane().add(lblNewLabel_2);

    }

    public static JFrame getFrame() {
        return frame;
    }

    public static void setFrame(JFrame frame) {
        Acceuil.frame = frame;
    }

    public JTextField getTxtUniversiteSidiMohamed() {
        return txtUniversiteSidiMohamed;
    }

    public void setTxtUniversiteSidiMohamed(JTextField txtUniversiteSidiMohamed) {
        this.txtUniversiteSidiMohamed = txtUniversiteSidiMohamed;
    }

    public JTextField getTxtFaculteDesScience() {
        return txtFaculteDesScience;
    }

    public void setTxtFaculteDesScience(JTextField txtFaculteDesScience) {
        this.txtFaculteDesScience = txtFaculteDesScience;
    }

    public JTextField getTxtGestionDesEtudiant() {
        return txtGestionDesEtudiant;
    }

    public void setTxtGestionDesEtudiant(JTextField txtGestionDesEtudiant) {
        this.txtGestionDesEtudiant = txtGestionDesEtudiant;
    }

    public JButton getBtnGestionDesAbsences() {
        return btnGestionDesAbsences;
    }

    public void setBtnGestionDesAbsences(JButton btnGestionDesAbsences) {
        this.btnGestionDesAbsences = btnGestionDesAbsences;
    }

    public JButton getBtnGestionDesNotes() {
        return btnGestionDesNotes;
    }

    public void setBtnGestionDesNotes(JButton btnGestionDesNotes) {
        this.btnGestionDesNotes = btnGestionDesNotes;
    }

    public JButton getBtnInformationsEtudiants() {
        return btnInformationsEtudiants;
    }

    public void setBtnInformationsEtudiants(JButton btnInformationsEtudiants) {
        this.btnInformationsEtudiants = btnInformationsEtudiants;
    }

    public JButton getBtnGestionDesMoyennes() {
        return btnGestionDesMoyennes;
    }

    public void setBtnGestionDesMoyennes(JButton btnGestionDesMoyennes) {
        this.btnGestionDesMoyennes = btnGestionDesMoyennes;
    }
}
