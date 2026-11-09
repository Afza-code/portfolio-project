package com.ayomaju.karyawan.view;

import com.ayomaju.karyawan.model.Karyawan;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 * View class (GUI) for the AyoMaju Karyawan management app.
 * Matches the structure and components requested in the PDF.
 */
public class KaryawanView extends javax.swing.JFrame {

    // Component Declarations
    private JTextField txtId;
    private JTextField txtNama;
    private JComboBox<String> cbDivisi;
    private JTextField txtGaji;
    private JCheckBox chkTetap;
    
    private JButton btnSimpan;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnClear;
    
    private JTextField txtCari;
    private JButton btnCari;
    
    private JTable tabelKaryawan;

    public KaryawanView() {
        initComponents();
    }

    /**
     * Initializes all UI components and sets up the layout beautifully.
     */
    private void initComponents() {
        setTitle("AyoMaju");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(650, 700));
        setLocationRelativeTo(null); // Center on screen

        // Main Panel with some margins
        JPanel mainPanel = new JPanel(new BorderLayout(10, 15));
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15));

        // 1. Form Panel at the top
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Labels and Fields initialization
        JLabel lblId = new JLabel("ID Karyawan");
        txtId = new JTextField(30);

        JLabel lblNama = new JLabel("Nama");
        txtNama = new JTextField(30);

        JLabel lblDivisi = new JLabel("Divisi");
        String[] divisiOptions = {"IT", "Marketing", "Finance", "HRD", "Operations"};
        cbDivisi = new JComboBox<>(divisiOptions);

        JLabel lblGaji = new JLabel("Gaji");
        txtGaji = new JTextField(15);

        JLabel lblStatus = new JLabel("Status");
        chkTetap = new JCheckBox("Karyawan Tetap");

        // Layout the components
        // ID Karyawan row
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0.1; formPanel.add(lblId, gbc);
        gbc.gridx = 1; gbc.gridy = 0; gbc.weightx = 0.9; formPanel.add(txtId, gbc);

        // Nama row
        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 0.1; formPanel.add(lblNama, gbc);
        gbc.gridx = 1; gbc.gridy = 1; gbc.weightx = 0.9; formPanel.add(txtNama, gbc);

        // Divisi row
        gbc.gridx = 0; gbc.gridy = 2; gbc.weightx = 0.1; formPanel.add(lblDivisi, gbc);
        gbc.gridx = 1; gbc.gridy = 2; gbc.weightx = 0.9; formPanel.add(cbDivisi, gbc);

        // Gaji row
        gbc.gridx = 0; gbc.gridy = 3; gbc.weightx = 0.1; formPanel.add(lblGaji, gbc);
        gbc.gridx = 1; gbc.gridy = 3; gbc.weightx = 0.9; gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.NONE; // Keep Gaji input smaller as in mockup
        txtGaji.setPreferredSize(new Dimension(120, txtGaji.getPreferredSize().height));
        formPanel.add(txtGaji, gbc);

        // Status row
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 4; gbc.weightx = 0.1; formPanel.add(lblStatus, gbc);
        gbc.gridx = 1; gbc.gridy = 4; gbc.weightx = 0.9; formPanel.add(chkTetap, gbc);

        // 2. Action Buttons Panel (Simpan, Update, Delete, Clear)
        JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        btnSimpan = new JButton("Simpan");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnClear = new JButton("Clear");

        actionPanel.add(btnSimpan);
        actionPanel.add(btnUpdate);
        actionPanel.add(btnDelete);
        actionPanel.add(btnClear);

        // 3. Search Panel (txtCari and btnCari)
        JPanel searchPanel = new JPanel(new BorderLayout(10, 0));
        txtCari = new JTextField();
        btnCari = new JButton("Cari");
        searchPanel.add(txtCari, BorderLayout.CENTER);
        searchPanel.add(btnCari, BorderLayout.EAST);

        // Combine top parts in a vertical layout panel
        JPanel topContainerPanel = new JPanel(new BorderLayout(5, 10));
        topContainerPanel.add(formPanel, BorderLayout.NORTH);
        topContainerPanel.add(actionPanel, BorderLayout.CENTER);
        topContainerPanel.add(searchPanel, BorderLayout.SOUTH);

        // 4. JTable Panel
        tabelKaryawan = new JTable();
        DefaultTableModel model = new DefaultTableModel(
            new Object[][]{},
            new String[]{"ID", "Nama", "Divisi", "Gaji", "Karyawan Tetap"}
        ) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false; // Read-only
            }
        };
        tabelKaryawan.setModel(model);
        JScrollPane tableScrollPane = new JScrollPane(tabelKaryawan);
        tableScrollPane.setPreferredSize(new Dimension(580, 300));

        // Add components to main container
        mainPanel.add(topContainerPanel, BorderLayout.NORTH);
        mainPanel.add(tableScrollPane, BorderLayout.CENTER);

        setContentPane(mainPanel);
        pack();

        // 5. Connect View internal events
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tabelKaryawan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                tabelKaryawanMouseClicked(evt);
            }
        });
    }

    // Getters and helper methods as specified in page 3
    
    public String getId() {
        return txtId.getText().trim();
    }

    public String getNama() {
        return txtNama.getText().trim();
    }

    public String getDivisi() {
        return cbDivisi.getSelectedItem() != null ? cbDivisi.getSelectedItem().toString() : "";
    }

    public String getGaji() {
        return txtGaji.getText().trim();
    }

    public boolean getStatusTetap() {
        return chkTetap.isSelected();
    }

    public String getCari() {
        return txtCari.getText().trim();
    }

    public void clearForm() {
        txtId.setText("");
        txtNama.setText("");
        cbDivisi.setSelectedIndex(0);
        txtGaji.setText("");
        txtCari.setText("");
        chkTetap.setSelected(false);
    }

    // Set Table Data as specified in page 4
    public void setTabelData(ArrayList<Karyawan> list) {
        DefaultTableModel tabelModel = (DefaultTableModel) tabelKaryawan.getModel();
        tabelModel.setRowCount(0);
        for (Karyawan k : list) {
            tabelModel.addRow(new Object[]{
                k.getIdKaryawan(), 
                k.getNama(), 
                k.getDivisi(), 
                k.getGaji(), 
                k.isStatusTetap() ? "Ya" : "Tidak"
            });
        }
    }

    // Register event listeners from controller as specified in page 4
    public void addSimpanListener(ActionListener listener) {
        btnSimpan.addActionListener(listener);
    }

    public void addUpdateListener(ActionListener listener) {
        btnUpdate.addActionListener(listener);
    }

    public void addDeleteListener(ActionListener listener) {
        btnDelete.addActionListener(listener);
    }

    public void addCariListener(ActionListener listener) {
        btnCari.addActionListener(listener);
    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        clearForm();
    }

    private void tabelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int baris = tabelKaryawan.getSelectedRow();
        if (baris != -1) {
            txtId.setText(tabelKaryawan.getValueAt(baris, 0).toString());
            txtNama.setText(tabelKaryawan.getValueAt(baris, 1).toString());
            cbDivisi.setSelectedItem(tabelKaryawan.getValueAt(baris, 2).toString());
            txtGaji.setText(tabelKaryawan.getValueAt(baris, 3).toString());
            String status = tabelKaryawan.getValueAt(baris, 4).toString();
            chkTetap.setSelected(status.equals("Ya"));
        }
    }
}
