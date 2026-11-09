package com.ayomaju.karyawan.controller;

import com.ayomaju.karyawan.model.Karyawan;
import com.ayomaju.karyawan.model.KaryawanModel;
import com.ayomaju.karyawan.view.KaryawanView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Controller class to manage MVC communication for the AyoMaju application.
 * Integrates event handling and business logic.
 */
public class KaryawanController {
    private KaryawanView view;
    private KaryawanModel model;

    public KaryawanController(KaryawanView view) {
        this.view = view;
        this.model = new KaryawanModel();

        // Register Action Listeners
        this.view.addSimpanListener(new SimpanListener());
        this.view.addUpdateListener(new UpdateListener());
        this.view.addDeleteListener(new HapusListener());
        this.view.addCariListener(new CariListener());

        // Initial table load
        updateTabel();
    }

    public void view() {
        view.setVisible(true);
    }

    private void updateTabel() {
        ArrayList<Karyawan> list = model.ambilSemua();
        view.setTabelData(list);
    }

    // Inner class SimpanListener as specified in Page 6
    class SimpanListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getId().isEmpty() || view.getNama().isEmpty() || view.getGaji().isEmpty()) {
                JOptionPane.showMessageDialog(view, "Data tidak boleh kosong!");
                return;
            }
            try {
                int gaji = Integer.parseInt(view.getGaji());
                Karyawan k = new Karyawan(
                    view.getId(), 
                    view.getNama(), 
                    view.getDivisi(), 
                    gaji, 
                    view.getStatusTetap()
                );
                model.simpan(k);
                updateTabel();
                view.clearForm();
                JOptionPane.showMessageDialog(view, "Data berhasil disimpan!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view, "Gaji harus berupa angka!");
            }
        }
    }

    // Inner class UpdateListener as specified in Page 6
    class UpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getId().isEmpty() || view.getNama().isEmpty() || view.getGaji().isEmpty()) {
                JOptionPane.showMessageDialog(view, "Data tidak boleh kosong!");
                return;
            }
            try {
                int gaji = Integer.parseInt(view.getGaji());
                Karyawan k = new Karyawan(
                    view.getId(), 
                    view.getNama(), 
                    view.getDivisi(), 
                    gaji, 
                    view.getStatusTetap()
                );
                model.update(k);
                updateTabel();
                view.clearForm();
                JOptionPane.showMessageDialog(view, "Data berhasil diubah!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view, "Gaji harus berupa angka!");
            }
        }
    }

    // Inner class HapusListener as specified in Page 7
    class HapusListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getId().isEmpty()) {
                JOptionPane.showMessageDialog(view, "Pilih data yang akan dihapus!");
                return;
            }
            int option = JOptionPane.showConfirmDialog(
                view, 
                "Apakah Anda yakin ingin menghapus data dengan ID: " + view.getId() + "?", 
                "Konfirmasi Hapus", 
                JOptionPane.YES_NO_OPTION
            );
            if (option == JOptionPane.YES_OPTION) {
                model.hapus(view.getId());
                updateTabel();
                view.clearForm();
                JOptionPane.showMessageDialog(view, "Data berhasil dihapus!");
            }
        }
    }

    // Inner class CariListener as specified in Page 7
    class CariListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String keyword = view.getCari();
            ArrayList<Karyawan> hasilPencarian = model.cariKaryawan(keyword);
            view.setTabelData(hasilPencarian);
        }
    }
}
