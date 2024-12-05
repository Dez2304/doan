/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author Administrator
 */
public class MonHoc {
    String maMonHoc;      
    String tenMonHoc;     // Tên môn học
    int soTinChi;         // Số tín chỉ
    String giangVien;     // Tên giảng viên
    int soLuongToiDa;     // Số lượng sinh viên tối đa
    int soLuongDangKy;    // Số lượng sinh viên đã đăng ký

    // Constructor
    public MonHoc(String maMonHoc, String tenMonHoc, int soTinChi, String giangVien, int soLuongToiDa) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.giangVien = giangVien;
        this.soLuongToiDa = soLuongToiDa;
        this.soLuongDangKy = 0; // Ban đầu lớp trống
    }

    // Getter và Setter
    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public int getSoLuongToiDa() {
        return soLuongToiDa;
    }

    public int getSoLuongDangKy() {
        return soLuongDangKy;
    }

    public boolean dangKySinhVien() {
        if (soLuongDangKy < soLuongToiDa) {
            soLuongDangKy++;
            return true; // Đăng ký thành công
        } else {
            return false; // Lớp đã đầy
        }
    }

    public void hienThiThongTinMonHoc() {
        System.out.println("Mã môn học: " + maMonHoc);
        System.out.println("Tên môn học: " + tenMonHoc);
        System.out.println("Số tín chỉ: " + soTinChi);
        System.out.println("Giảng viên: " + giangVien);
        System.out.println("Số lượng sinh viên: " + soLuongDangKy + "/" + soLuongToiDa);
    }
}
