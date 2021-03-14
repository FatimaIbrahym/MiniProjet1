package com.company.views;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Gestiondesabsence {

    public static JFrame frame;
    public JTextField txtGestiondesabsences;
    private JTextField lblNom;
    private JTextField lblPrenom;
    private JTextField lblCne;
    private JTextField lblModule;
    private JTextField txtnom;
    private JTextField txtprenom;
    private JTextField txtcne;
    private JTextField lblchercherparcne;
    private JTextField lblcherchermodule;
    private JTextField lblnbredabsence;
    private JTextField txtcherchercne;
    private JTextField txtnbredabsence;
    public JComboBox<String> combomodule;
    public JComboBox<String> comboseance;
    public JComboBox<String> combopresence;
    public JComboBox<String> combomodule2;
    public JButton btnAjouter,btncalcule;
    private JScrollPane scrollPane;
    public JTable tableabsence;
    public static DefaultTableModel modelabsence;
    public static String seance1,seance2,seance3,seance4,seance5,seance6,seance7,seance8;
    public JButton btnback;

    /**
     * Create the application.
     */
    public Gestiondesabsence() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setSize(1000,730);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(32, 30, 45));
        frame.getContentPane().setLayout(null);

        txtGestiondesabsences = new JTextField();
        txtGestiondesabsences.setEnabled(false);
        txtGestiondesabsences.setDisabledTextColor(new Color(192,192,192));
        txtGestiondesabsences.setBackground(new Color(235, 42, 83));
        txtGestiondesabsences.setFont(new Font("Tahoma", Font.BOLD, 18));
        txtGestiondesabsences.setBorder(new EmptyBorder(0, 0, 0, 0));
        txtGestiondesabsences.setHorizontalAlignment(SwingConstants.CENTER);
        txtGestiondesabsences.setText("Gestion des absences LP-SIGL 2020 - 2021");
        txtGestiondesabsences.setBounds(50, 11, 877, 45);
        frame.getContentPane().add(txtGestiondesabsences);
        txtGestiondesabsences.setColumns(10);

        JLabel lblMarquerLabsence = new JLabel("Marquer l'absence");
        lblMarquerLabsence.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblMarquerLabsence.setHorizontalAlignment(SwingConstants.CENTER);
        lblMarquerLabsence.setBounds(70, 65, 170, 22);
        lblMarquerLabsence.setForeground(new Color(192,192,192));
        frame.getContentPane().add(lblMarquerLabsence);

        JLabel lblStatistique = new JLabel("Statistique");
        lblStatistique.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblStatistique.setHorizontalAlignment(SwingConstants.CENTER);
        lblStatistique.setBounds(580, 65, 111, 22);
        lblStatistique.setForeground(new Color(192,192,192));
        frame.getContentPane().add(lblStatistique);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(32, 30, 45));
        panel.setBounds(50, 98, 380, 243);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        lblNom = new JTextField();
        lblNom.setText("Nom");
        lblNom.setEnabled(false);
        lblNom.setDisabledTextColor(Color.BLACK);
        lblNom.setBounds(10, 11, 116, 27);
        lblNom.setBackground(new Color(192,192,192));
        panel.add(lblNom);
        lblNom.setColumns(10);

        lblPrenom = new JTextField();
        lblPrenom.setText("Prenom");
        lblPrenom.setEnabled(false);
        lblPrenom.setDisabledTextColor(Color.BLACK);
        lblPrenom.setBounds(10, 49, 116, 27);
        lblPrenom.setBackground(new Color(192,192,192));
        panel.add(lblPrenom);
        lblPrenom.setColumns(10);

        lblCne = new JTextField();
        lblCne.setText("CNE");
        lblCne.setEnabled(false);
        lblCne.setDisabledTextColor(Color.BLACK);
        lblCne.setBounds(10, 87, 116, 27);
        lblCne.setBackground(new Color(192,192,192));
        panel.add(lblCne);
        lblCne.setColumns(10);

        lblModule = new JTextField();
        lblModule.setText("Module");
        lblModule.setEnabled(false);
        lblModule.setDisabledTextColor(Color.BLACK);
        lblModule.setBounds(10, 125, 116, 27);
        lblModule.setBackground(new Color(192,192,192));
        panel.add(lblModule);
        lblModule.setColumns(10);

        txtnom = new JTextField();
        txtnom.setBounds(159, 11, 116, 27);
        panel.add(txtnom);
        txtnom.setColumns(10);

        txtprenom = new JTextField();
        txtprenom.setColumns(10);
        txtprenom.setBounds(159, 49, 116, 27);
        panel.add(txtprenom);

        txtcne = new JTextField();
        txtcne.setColumns(10);
        txtcne.setBounds(159, 87, 116, 27);
        panel.add(txtcne);

        combomodule = new JComboBox<String>();
        combomodule.addItem("");
        combomodule.setBounds(159, 125, 116, 27);
        panel.add(combomodule);

        comboseance = new JComboBox<String>();
        comboseance.addItem("Seance 1");
        comboseance.addItem("Seance 2");
        comboseance.addItem("Seance 3");
        comboseance.addItem("Seance 4");
        comboseance.addItem("Seance 5");
        comboseance.addItem("Seance 6");
        comboseance.addItem("Seance 7");
        comboseance.addItem("Seance 8");
        comboseance.setBounds(10, 163, 116, 27);
        comboseance.setBackground(new Color(192,192,192));
        panel.add(comboseance);
        combopresence = new JComboBox<String>();
        combopresence.addItem("Oui");
        combopresence.addItem("Non");
        combopresence.setBounds(159, 163, 116, 27);
        panel.add(combopresence);

        btnAjouter = new JButton("Ajouter");
        btnAjouter.setBackground(new Color(235, 42, 83));
        btnAjouter.setForeground(new Color(192,192,192));
        btnAjouter.setBounds(84, 205, 116, 34);
        btnAjouter.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel.add(btnAjouter);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(32, 30, 45));
        panel_1.setBounds(560, 98, 363, 243);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        lblchercherparcne = new JTextField();
        lblchercherparcne.setHorizontalAlignment(SwingConstants.CENTER);
        lblchercherparcne.setText("Rechercher par CNE");
        lblchercherparcne.setEnabled(false);
        lblchercherparcne.setDisabledTextColor(Color.BLACK);
        lblchercherparcne.setColumns(10);
        lblchercherparcne.setBounds(10, 11, 116, 27);
        lblchercherparcne.setBackground(new Color(192,192,192));
        panel_1.add(lblchercherparcne);

        lblcherchermodule = new JTextField();
        lblcherchermodule.setHorizontalAlignment(SwingConstants.CENTER);
        lblcherchermodule.setText("Module");
        lblcherchermodule.setEnabled(false);
        lblcherchermodule.setDisabledTextColor(Color.BLACK);
        lblcherchermodule.setColumns(10);
        lblcherchermodule.setBackground(new Color(192,192,192));
        lblcherchermodule.setBounds(10, 64, 116, 27);
        panel_1.add(lblcherchermodule);

        lblnbredabsence = new JTextField();
        lblnbredabsence.setHorizontalAlignment(SwingConstants.CENTER);
        lblnbredabsence.setText("Nbre d'abscences");
        lblnbredabsence.setEnabled(false);
        lblnbredabsence.setDisabledTextColor(Color.BLACK);
        lblnbredabsence.setColumns(10);
        lblnbredabsence.setBounds(10, 115, 116, 27);
        lblnbredabsence.setBackground(new Color(192,192,192));
        panel_1.add(lblnbredabsence);

        txtcherchercne = new JTextField();
        txtcherchercne.setColumns(10);
        txtcherchercne.setBounds(150, 11, 116, 27);
        panel_1.add(txtcherchercne);

        txtnbredabsence = new JTextField();
        txtnbredabsence.setColumns(10);
        txtnbredabsence.setBounds(150, 115, 116, 27);
        panel_1.add(txtnbredabsence);

        combomodule2 = new JComboBox<String>();
        combomodule2.addItem("");
        combomodule2.setBounds(150, 64, 116, 27);
        panel_1.add(combomodule2);

        btncalcule = new JButton("calculer absence");
        btncalcule.setBackground(new Color(235, 42, 83));
        btncalcule.setForeground(new Color(192,192,192));
        btncalcule.setBounds(75, 190, 132, 34);
        btncalcule.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel_1.add(btncalcule);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(50, 352, 877, 320);
        tableabsence = new JTable();
        scrollPane.setViewportView(tableabsence);
        modelabsence = new DefaultTableModel();
        modelabsence.addColumn("Id");
        modelabsence.addColumn("CNE");
        modelabsence.addColumn("Nom");
        modelabsence.addColumn("Prenom");
        modelabsence.addColumn("seance1");
        modelabsence.addColumn("seance2");
        modelabsence.addColumn("seance3");
        modelabsence.addColumn("seance4");
        modelabsence.addColumn("seance5");
        modelabsence.addColumn("seance6");
        modelabsence.addColumn("seance7");
        modelabsence.addColumn("seance8");

        tableabsence.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableabsence.setRowHeight(30);
        tableabsence.setModel(modelabsence);
        frame.getContentPane().add(scrollPane);

        btnback = new JButton("<< Back");
        btnback.setBackground(new Color(235, 42, 83));
        btnback.setForeground(new Color(192,192,192));
        btnback.setBounds(797, 62, 128, 30);
        btnback.setBorder(new EmptyBorder(0, 0, 0, 0));
        frame.getContentPane().add(btnback);
    }


}
