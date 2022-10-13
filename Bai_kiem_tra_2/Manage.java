package Bai_kiem_tra_2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    File file = new File("C:\\Users\\Asus\\Desktop\\New folder\\Case2module\\src\\Bai_kiem_tra_2\\File_Sinhvien.csv");
    Doc_ghi doc_ghi = new Doc_ghi();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Sinh_Vien> sinhViens = Doc_ghi.reader();
    public void Menu() {
        int choice;
        do {
            System.out.println("╔===================================================╗");
            System.out.println("║        ▂ ▃ ▅ ▆ █ QUẢN LÝ SINH VIÊN █ ▆ ▅ ▃ ▂      ║");
            System.out.println("╠===================================================╣");
            System.out.println("║[1]. XEM DANH SÁCH                                 ║");
            System.out.println("║[2]. THÊM MỚI                                      ║");
            System.out.println("║[3]. CẬP NHẬT                                      ║");
            System.out.println("║[4]. XÓA                                           ║");
            System.out.println("║[5]. Tăng                                          ║");
            System.out.println("║[6]. Giảm                                          ║");
            System.out.println("║[0]. Thoát                                         ║");
            System.out.println("╚===================================================╝");
            System.out.println("Nhập lựa chọn:");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 0 || choice > 8) {
                    System.out.println();
                    System.out.println("Lựa chọn không tồn tại, mời bạn nhập lại !!!");
                }
                switch (choice) {
                    case 1:
                        Show();
                        break;
                    case 2:
                        add();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                       delete();
                        break;
                    case 5:
                        ascending();
                        break;
                    case 6:
                        decrease();
                    case 0:
                        return;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public Sinh_Vien SV() {

        System.out.println("Nhập mã sinh viên: ");
        int MaSinhVien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ và tên sinh viên: ");
        String HoVaTen = scanner.nextLine();
        System.out.println("Nhập tuổi của sinh viên: ");
        int Tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính sinh viên: ");
        String GioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên: ");
        String DiaChi = scanner.nextLine();
        System.out.println("nhập điểm trung bình:");
        int DiemTrungBinh = Integer.parseInt(scanner.nextLine());
        Sinh_Vien sinhVien = new Sinh_Vien(MaSinhVien, HoVaTen, Tuoi, GioiTinh, DiaChi, DiemTrungBinh);
        System.out.println(sinhVien);
        return sinhVien;
    }

    public void Show() {
        for (Sinh_Vien sinh_vien : sinhViens) {
            System.out.println(sinh_vien.toString());
        }
    }

    public void add() {
        Sinh_Vien sinhVien = SV();
        sinhViens.add(sinhVien);
        Doc_ghi.Write(file,sinhViens);
    }

    public void update() {
        System.out.println("Nhập ID sinh viên muốn sửa:");
        int MaSinhVien = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getMaSinhVien() == MaSinhVien) {
                sinhViens.set(i, SV());
            }
            Doc_ghi.Write(file,sinhViens);
        }
    }

    public void delete() {
        System.out.println("Nhập Mã sinh viên muốn xóa:");
        int MaSinhVien = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getMaSinhVien() == MaSinhVien) {
                sinhViens.remove(i);
                break;
            }
        }
        Doc_ghi.Write(file,sinhViens);
    }

    public void sort() {
        int chon = 2;
        System.out.println("1.Sắp xếp điểm trung bình tăng dần:");
        System.out.println("2.Sắp xếp điểm trung bình giảm dần:");
        System.out.println("3. Thoát");
        do {
            if (chon > 2) {
                System.out.println("Vui lòng chọn lại!!");
            }
             }while (chon > 2);
        switch (chon) {
            case 1 -> ascending();
            case 2 -> decrease();
        }
        }

    public void ascending() {
        Sinh_Vien temp;
        for (int i = 0; i < sinhViens.size() - 1; i++) {
            for (int j = i + 1; j < sinhViens.size(); j++) {
                if (sinhViens.get(i).getDiemTrungBinh() > sinhViens.get(j).getDiemTrungBinh()) {
                    temp = sinhViens.get(i);
                    sinhViens.set(i, sinhViens.get(j));
                    sinhViens.set(j, temp);
                }
            }
        }
        Show();
    }
    public void decrease() {

        Sinh_Vien temp;
        for (int i = 0; i < sinhViens.size() - 1; i++) {
            for (int j = i + 1; j < sinhViens.size(); j++) {
                if (sinhViens.get(i).getDiemTrungBinh() < sinhViens.get(j).getDiemTrungBinh()) {
                    temp = sinhViens.get(i);
                    sinhViens.set(i, sinhViens.get(j));
                    sinhViens.set(j, temp);
                }
            }
        }
        Show();
    }
}