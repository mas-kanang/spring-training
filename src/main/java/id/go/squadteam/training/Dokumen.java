package id.go.squadteam.training;

import java.util.Date;

public class Dokumen {
    private String nama;
    private String nomor;
    private Date tanggal;
    private int ukuranFile;
    private String typeFile;
    private String alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getUkuranFile() {
        return ukuranFile;
    }

    public void setUkuranFile(int ukuranFile) {
        this.ukuranFile = ukuranFile;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
