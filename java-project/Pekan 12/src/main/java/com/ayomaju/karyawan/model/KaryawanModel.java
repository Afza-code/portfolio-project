package com.ayomaju.karyawan.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Model class handling database operations for Karyawan.
 * Based on the specified implementation in the PDF.
 */
public class KaryawanModel {
    private Connection conn;

    public KaryawanModel() {
        try {
            // Load driver explicitly just to be safe
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_ayomaju?serverTimezone=Asia/Jakarta";
            conn = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void simpan(Karyawan k) {
        try {
            String sql = "INSERT INTO karyawan (id_karyawan, nama, divisi, gaji, status_tetap) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, k.getIdKaryawan());
            stmt.setString(2, k.getNama());
            stmt.setString(3, k.getDivisi());
            stmt.setInt(4, k.getGaji());
            stmt.setBoolean(5, k.isStatusTetap());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Karyawan k) {
        try {
            String sql = "UPDATE karyawan SET nama=?, divisi=?, gaji=?, status_tetap=? WHERE id_karyawan=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, k.getNama());
            stmt.setString(2, k.getDivisi());
            stmt.setInt(3, k.getGaji());
            stmt.setBoolean(4, k.isStatusTetap());
            stmt.setString(5, k.getIdKaryawan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void hapus(String idKaryawan) {
        try {
            String sql = "DELETE FROM karyawan WHERE id_karyawan=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, idKaryawan);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Karyawan> ambilSemua() {
        ArrayList<Karyawan> list = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM karyawan");
            while (rs.next()) {
                list.add(new Karyawan(
                        rs.getString("id_karyawan"),
                        rs.getString("nama"),
                        rs.getString("divisi"),
                        rs.getInt("gaji"),
                        rs.getBoolean("status_tetap")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Karyawan> cariKaryawan(String keyword) {
        ArrayList<Karyawan> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM karyawan WHERE nama LIKE ? OR divisi LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + keyword + "%");
            stmt.setString(2, "%" + keyword + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(new Karyawan(
                        rs.getString("id_karyawan"),
                        rs.getString("nama"),
                        rs.getString("divisi"),
                        rs.getInt("gaji"),
                        rs.getBoolean("status_tetap")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
