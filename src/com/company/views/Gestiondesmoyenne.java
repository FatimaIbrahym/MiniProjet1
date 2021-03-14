package com.company.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Gestiondesmoyenne {

    public static JFrame frame;
    public JTextField txtGestiondesmoyennes;
    private JTextField lblcne;
    private JTextField txtcne;
    public JButton buttonBack;
    public JButton btnRechercher;
    private JScrollPane scrollPane;
    public static JTable tablemoyenne;
    public static DefaultTableModel modelmoyenne;

    /**
     * Create the application.
     */
    public Gestiondesmoyenne() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setSize(800,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(32, 30, 45));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);

        txtGestiondesmoyennes = new JTextField();
        txtGestiondesmoyennes.setEnabled(false);
        txtGestiondesmoyennes.setDisabledTextColor(new Color(192,192,192));
        txtGestiondesmoyennes.setBackground(new Color(235, 42, 83));
        txtGestiondesmoyennes.setFont(new Font("Tahoma", Font.BOLD, 18));
        txtGestiondesmoyennes.setBorder(new EmptyBorder(0, 0, 0, 0));
        txtGestiondesmoyennes.setHorizontalAlignment(SwingConstants.CENTER);
        txtGestiondesmoyennes.setText("Gestion des moyennes LP-SIGL 2020 - 2021");
        txtGestiondesmoyennes.setBounds(10, 11, 765, 45);
        frame.getContentPane().add(txtGestiondesmoyennes);
        txtGestiondesmoyennes.setColumns(10);

        lblcne = new JTextField();
        lblcne.setDisabledTextColor(new Color(0, 0, 0));
        lblcne.setBackground(new Color(192,192,192));
        lblcne.setEnabled(false);
        lblcne.setText("Taper votre CNE");
        lblcne.setBounds(130, 520, 149, 28);
        frame.getContentPane().add(lblcne);
        lblcne.setColumns(10);

        txtcne = new JTextField();
        txtcne.setColumns(10);
        txtcne.setBounds(330, 520, 149, 28);
        txtcne.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(txtcne);

        btnRechercher = new JButton("Rechercher");
        btnRechercher.setBackground(new Color(235, 42, 83));
        btnRechercher.setForeground(new Color(192,192,192));
        btnRechercher.setBounds(530, 520, 121, 28);
        btnRechercher.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(btnRechercher);

        buttonBack = new JButton("<< Back");
        buttonBack.setBackground(new Color(235, 42, 83));
        buttonBack.setForeground(new Color(192,192,192));
        buttonBack.setBounds(56, 565, 149, 30);
        buttonBack.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(buttonBack);


        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 80, 765, 400);

        tablemoyenne = new JTable();
        scrollPane.setViewportView(tablemoyenne);
        modelmoyenne = new DefaultTableModel();
        modelmoyenne.addColumn("Id");
        modelmoyenne.addColumn("CNE");
        modelmoyenne.addColumn("Nom");
        modelmoyenne.addColumn("Prenom");
        modelmoyenne.addColumn("Moyenne");
        modelmoyenne.addColumn("Mention");
        modelmoyenne.addColumn("Valide");
        tablemoyenne.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablemoyenne.setRowHeight(30);
        tablemoyenne.setModel(modelmoyenne);
        DefaultTableCellRenderer rendererColumn2 = new DefaultTableCellRenderer();
        rendererColumn2.setBackground(new Color(235, 42, 83));
        tablemoyenne.getColumnModel().getColumn(0).setCellRenderer(rendererColumn2);
        frame.getContentPane().add(scrollPane);
    }
}
