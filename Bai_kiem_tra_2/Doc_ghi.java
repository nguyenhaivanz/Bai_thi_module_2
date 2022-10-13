package Bai_kiem_tra_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Doc_ghi {
    static File file = new File("C:\\Users\\Asus\\Desktop\\New folder\\Case2module\\src\\Bai_kiem_tra_2\\File_Sinhvien.csv");
public static void Write(File file ,List<Sinh_Vien> sinhViens){
try{
    FileOutputStream fileOutputStream = new FileOutputStream(file);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

    objectOutputStream.writeObject(sinhViens);
}catch (Exception e){
    e.printStackTrace();
}
}
public static  ArrayList<Sinh_Vien> reader(){
    try{
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (ArrayList<Sinh_Vien>) objectInputStream.readObject();
    }catch (Exception e){
        e.printStackTrace();
        return new ArrayList<>();
    }
}
}