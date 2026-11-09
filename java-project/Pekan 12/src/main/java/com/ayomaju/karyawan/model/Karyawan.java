package com.ayomaju.karyawan.model;

/**
 * Model class representing a Karyawan (Employee).
 * Based on the specified Class Diagram.
 */
public class Karyawan {
    private String idKaryawan;
    private String nama;
    private String divisi;
    private int gaji;
    private boolean statusTetap;

    /**
     * Constructor to initialize all fields.
     */
    public Karyawan(String idKaryawan, String nama, String divisi, int gaji, boolean statusTetap) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.divisi = divisi;
        this.gaji = gaji;
        this.statusTetap = statusTetap;
    }

    // Getters

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public String getDivisi() {
        return divisi;
    }

    public int getGaji() {
        return gaji;
    }

    public boolean isStatusTetap() {
        return statusTetap;
    }

    // Setters (Added for convenience and completeness)

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setStatusTetap(boolean statusTetap) {
        this.statusTetap = statusTetap;
    }
}
