package com.ayomaju.karyawan;

import com.ayomaju.karyawan.view.KaryawanView;
import com.ayomaju.karyawan.controller.KaryawanController;

/**
 * Main application entry point for AyoMaju employee management system.
 * Based on step 9 from the PDF.
 */
public class MainApp {
    public static void main(String[] args) {
        // Set Look and Feel to System standard for a premium native layout look
        try {
            javax.swing.UIManager.setLookAndFeel(
                javax.swing.UIManager.getSystemLookAndFeelClassName()
            );
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Initialize MVC components
        // Run in event dispatch thread for Swing thread safety
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                KaryawanView view = new KaryawanView();
                KaryawanController controller = new KaryawanController(view);
                controller.view(); // Make visible
            }
        });
    }
}
