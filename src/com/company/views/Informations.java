package com.company.views;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Informations {

    public static JFrame frame;
    private JTextField lblCNE;
    private JTextField lblnom;
    private JTextField lblprenom;
    private JTextField lblDiplome;
    private JTextField lblEmail;
    private JTextField cne;
    private JTextField nom;
    private JTextField prenom;
    private JTextField diplome;
    private JTextField email;
    private JTextField infoetu;
    private JButton btnAjouter;
    private JButton btnModifier;
    private JButton btnSupprimer;
    private JTextField lblEntrerVotreCne;
    private JTextField entrer_cne;
    private JButton btnRechercher;
    private JButton btnBack;
    public static DefaultTableModel model;
    public JTable tableEtudiant;
    public JScrollPane scrollPane;

    public Informations() {
        initialize();
    }

    private void initialize() {

        frame = new JFrame();
        frame.setSize(1000,520);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(32, 30, 45));
        frame.getContentPane().setLayout(null);

        lblnom = new JTextField();
        lblnom.setEnabled(false);
        lblnom.setText("  Nom");
        lblnom.setDisabledTextColor(Color.BLACK);
        lblnom.setBounds(50, 123, 140, 28);
        lblnom.setBackground(new Color(192,192,192));
        frame.getContentPane().add(lblnom);
        lblnom.setColumns(10);

        lblprenom = new JTextField();
        lblprenom.setText("  Prenom");
        lblprenom.setEnabled(false);
        lblprenom.setDisabledTextColor(Color.BLACK);
        lblprenom.setColumns(10);
        lblprenom.setBounds(50, 171, 140, 28);
        lblprenom.setBackground(new Color(192,192,192));
        frame.getContentPane().add(lblprenom);

        lblCNE = new JTextField();
        lblCNE.setText("  CNE");
        lblCNE.setEnabled(false);
        lblCNE.setDisabledTextColor(Color.BLACK);
        lblCNE.setColumns(10);
        lblCNE.setBounds(50, 75, 140, 28);
        lblCNE.setBackground(new Color(192,192,192));
        frame.getContentPane().add(lblCNE);

        lblDiplome = new JTextField();
        lblDiplome.setText("  Diplome");
        lblDiplome.setEnabled(false);
        lblDiplome.setDisabledTextColor(Color.BLACK);
        lblDiplome.setColumns(10);
        lblDiplome.setBounds(50, 219, 140, 28);
        lblDiplome.setBackground(new Color(192,192,192));
        frame.getContentPane().add(lblDiplome);

        lblEmail = new JTextField();
        lblEmail.setText("  Email");
        lblEmail.setEnabled(false);
        lblEmail.setDisabledTextColor(Color.BLACK);
        lblEmail.setColumns(10);
        lblEmail.setBounds(50, 267, 140, 28);
        lblEmail.setBackground(new Color(192,192,192));
        frame.getContentPane().add(lblEmail);

        nom = new JTextField();
        nom.setBounds(213, 123, 140, 28);
        nom.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(nom);
        nom.setColumns(10);

        prenom = new JTextField();
        prenom.setColumns(10);
        prenom.setBounds(213, 171, 140, 28);
        prenom.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(prenom);

        cne = new JTextField();
        cne.setColumns(10);
        cne.setBounds(213, 75, 140, 28);
        cne.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(cne);

        diplome = new JTextField();
        diplome.setColumns(10);
        diplome.setBounds(213, 219, 140, 28);
        diplome.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(diplome);

        email = new JTextField();
        email.setColumns(10);
        email.setBounds(213, 267, 140, 28);
        email.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(email);


        infoetu = new JTextField();
        infoetu.setEnabled(false);
        infoetu.setDisabledTextColor(new Color(192,192,192));
        infoetu.setBackground(new Color(235, 42, 83));
        infoetu.setFont(new Font("Tahoma", Font.BOLD, 18));
        infoetu.setBorder(new EmptyBorder(0, 0, 0, 0));
        infoetu.setHorizontalAlignment(SwingConstants.CENTER);
        infoetu.setText("Informations des Etudiants LP SIGL 2020 - 2021");
        infoetu.setBounds(50, 11, 877, 45);
        frame.getContentPane().add(infoetu);
        infoetu.setColumns(10);


        btnAjouter = new JButton("Ajouter");
        btnAjouter.setBackground(new Color(235, 42, 83));
        btnAjouter.setForeground(new Color(192,192,192));
        btnAjouter.setBounds(50, 363, 95, 28);
        btnAjouter.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnAjouter.setFont(new Font("Tahoma", Font.BOLD, 15));
        frame.getContentPane().add(btnAjouter);

        btnModifier = new JButton("Modifier");
        btnModifier.setBackground(new Color(235, 42, 83));
        btnModifier.setForeground(new Color(192,192,192));
        btnModifier.setBounds(155, 363, 95, 28);
        btnModifier.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnModifier.setFont(new Font("Tahoma", Font.BOLD, 15));
        frame.getContentPane().add(btnModifier);

        btnSupprimer = new JButton("Supprimer");
        btnSupprimer.setBackground(new Color(235, 42, 83));
        btnSupprimer.setForeground(new Color(192,192,192));
        btnSupprimer.setBounds(260, 363, 95, 28);
        btnSupprimer.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 15));
        frame.getContentPane().add(btnSupprimer);

        lblEntrerVotreCne = new JTextField();
        lblEntrerVotreCne.setText("  Entrer votre CNE");
        lblEntrerVotreCne.setEnabled(false);
        lblEntrerVotreCne.setDisabledTextColor(Color.BLACK);
        lblEntrerVotreCne.setColumns(10);
        lblEntrerVotreCne.setBounds(450, 420, 140, 28);
        lblEntrerVotreCne.setBackground(new Color(192,192,192));
        frame.getContentPane().add(lblEntrerVotreCne);

        entrer_cne = new JTextField();
        entrer_cne.setColumns(10);
        entrer_cne.setBounds(610, 420, 140, 28);
        entrer_cne.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(entrer_cne);

        btnRechercher = new JButton("Rechercher");
        btnRechercher.setBackground(new Color(235, 42, 83));
        btnRechercher.setForeground(new Color(192,192,192));
        btnRechercher.setBounds(770, 420, 101, 28);
        btnRechercher.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnRechercher.setFont(new Font("Tahoma", Font.BOLD, 15));
        frame.getContentPane().add(btnRechercher);

        btnBack = new JButton("<< Back");
        btnBack.setBackground(new Color(235, 42, 83));
        btnBack.setForeground(new Color(192,192,192));
        btnBack.setBounds(50, 411, 140, 37);
        btnBack.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
        frame.getContentPane().add(btnBack);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(400, 75, 527, 320);

        tableEtudiant=new JTable();
        scrollPane.setViewportView(tableEtudiant);
        model=new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("CNE");
        model.addColumn("Nom");
        model.addColumn("Prenom");
        model.addColumn("Email");
        model.addColumn("Diplome");

        tableEtudiant.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableEtudiant.setRowHeight(30);
        tableEtudiant.setModel(model);
        DefaultTableCellRenderer rendererColumn2 = new DefaultTableCellRenderer();
        rendererColumn2.setBackground(new Color(235, 42, 83));
        tableEtudiant.getColumnModel().getColumn(0).setCellRenderer(rendererColumn2);
        frame.getContentPane().add(scrollPane);


    }


}

