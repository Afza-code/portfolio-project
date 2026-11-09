-- Create the database if it doesn't exist
CREATE DATABASE IF NOT EXISTS db_ayomaju;
USE db_ayomaju;

-- Create the karyawan table
CREATE TABLE IF NOT EXISTS karyawan (
    id_karyawan VARCHAR(50) NOT NULL PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    divisi VARCHAR(50) NOT NULL,
    gaji INT NOT NULL,
    status_tetap BOOLEAN NOT NULL
);

-- Optional: Insert sample data to match the screenshot
INSERT INTO karyawan (id_karyawan, nama, divisi, gaji, status_tetap) VALUES
('123', 'Agus', 'IT', 10000000, TRUE),
('456', 'Budi', 'Marketing', 15000000, TRUE)
ON DUPLICATE KEY UPDATE 
    nama=VALUES(nama), 
    divisi=VALUES(divisi), 
    gaji=VALUES(gaji), 
    status_tetap=VALUES(status_tetap);
