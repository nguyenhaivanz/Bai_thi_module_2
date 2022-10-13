package Bai_kiem_tra_2;

import java.io.Serializable;

public class Sinh_Vien implements Serializable {
    private int MaSinhVien;
    private String HoVaTen;
    private int Tuoi;
    private String GioiTinh;
    private String DiaChi;
    private int DiemTrungBinh;

    public Sinh_Vien() {
    }

    public Sinh_Vien(int maSinhVien, String hoVaTen, int tuoi, String gioiTinh, String diaChi, int diemTrungBinh) {
        MaSinhVien = maSinhVien;
        HoVaTen = hoVaTen;
        Tuoi = tuoi;
        GioiTinh = gioiTinh;
        DiaChi = diaChi;
        DiemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        MaSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        HoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public void setDiemTrungBinh(int diemTrungBinh) {
        DiemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return  "MaSinhVien=" + MaSinhVien +
                ", HoVaTen='" + HoVaTen + '\'' +
                ", Tuoi=" + Tuoi +
                ", GioiTinh='" + GioiTinh + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", DiemTrungBinh=" + DiemTrungBinh;
    }

    public String write() {
        return MaSinhVien + "," + HoVaTen + "," + Tuoi +"," + GioiTinh + "," + DiaChi + "," + DiemTrungBinh;
    }
}