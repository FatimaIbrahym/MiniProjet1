package com.company.views;


import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Gestiondesnotes {

    public static JFrame frame;
    private JButton btnrechercher;
    private JButton btnAnnuler;
    public JTextField txtGestiondesnotes;
    private JTextField textModule;
    private JScrollPane scrollPane;
    public JTable tablenote;
    public static DefaultTableModel modelnote;
    public static JComboBox<String> combomodule;
    public static JButton btnSauvgarder;

    public Gestiondesnotes() {
        initialize();
    }


    private void initialize() {

        frame = new JFrame();
        frame.setSize(800,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(32, 30, 45));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);

        txtGestiondesnotes = new JTextField();
        txtGestiondesnotes.setEnabled(false);
        txtGestiondesnotes.setDisabledTextColor(new Color(192,192,192));
        txtGestiondesnotes.setBackground(new Color(235, 42, 83));
        txtGestiondesnotes.setFont(new Font("Tahoma", Font.BOLD, 18));
        txtGestiondesnotes.setBorder(new EmptyBorder(0, 0, 0, 0));
        txtGestiondesnotes.setHorizontalAlignment(SwingConstants.CENTER);
        txtGestiondesnotes.setText("Gestion des notes LP-SIGL 2020 - 2021");
        txtGestiondesnotes.setBounds(10, 11, 765, 45);
        frame.getContentPane().add(txtGestiondesnotes);
        txtGestiondesnotes.setColumns(10);

        textModule = new JTextField();
        textModule.setText("Module");
        textModule.setHorizontalAlignment(SwingConstants.CENTER);
        textModule.setEnabled(false);
        textModule.setBackground(new Color(192,192,192));
        textModule.setDisabledTextColor(Color.BLACK);
        textModule.setColumns(10);
        textModule.setBounds(70, 98, 120, 29);
        frame.getContentPane().add(textModule);

        combomodule = new JComboBox<String>();
        combomodule.addItem("");
        combomodule.setBounds(366, 100, 147, 25);
        frame.getContentPane().add(combomodule);

        btnrechercher = new JButton("Rechercher");
        btnrechercher.setBounds(581, 98, 128, 29);
        btnrechercher.setBackground(new Color(235, 42, 83));
        btnrechercher.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnrechercher.setForeground(new Color(192,192,192));
        frame.getContentPane().add(btnrechercher);

        btnAnnuler = new JButton("Annuler");
        btnAnnuler.setBounds(430, 565, 128, 33);
        btnAnnuler.setBackground(new Color(235, 42, 83));
        btnAnnuler.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnAnnuler.setForeground(new Color(192,192,192));
        frame.getContentPane().add(btnAnnuler);

        btnSauvgarder = new JButton("Sauvgarder");
        btnSauvgarder.setBackground(new Color(235, 42, 83));
        btnSauvgarder.setBounds(250, 565, 128, 33);
        btnSauvgarder.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnSauvgarder.setForeground(new Color(192,192,192));
        frame.getContentPane().add(btnSauvgarder);


        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 150, 765, 400);
        tablenote = new JTable();
        scrollPane.setViewportView(tablenote);
        modelnote=new DefaultTableModel();
        modelnote.addColumn("Id");
        modelnote.addColumn("CNE");
        modelnote.addColumn("Nom");
        modelnote.addColumn("Prenom");
        modelnote.addColumn("Note");

        tablenote.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablenote.setRowHeight(30);
        tablenote.setModel(modelnote);
        DefaultTableCellRenderer rendererColumn2 = new DefaultTableCellRenderer();
        rendererColumn2.setBackground(new Color(235, 42, 83));
        tablenote.getColumnModel().getColumn(0).setCellRenderer(rendererColumn2);
        frame.getContentPane().add(scrollPane);

    }

}
