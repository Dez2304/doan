/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author Quan Pham
 */
public class TimeandPlace {
    
    String address;
    int time;
    String monhoc;
    
    public TimeandPlace(String address, int time, String monhoc)
    {
        this.address = address;
        this.time = time;
        this.monhoc = monhoc;
    }

    public TimeandPlace()
    {
        
    }
    
    public String getaddress()
    {
        return address;
    }
    
    public void setaddress(String address)
    {
        this.address = address;
    }
    
    public String gettime(String time)
    {
        return time;
    }
    
    public void settime(int time)
    {
        this.time = time;
    }
    
    public String getmonhoc()
    {
        return monhoc;
    }
    
    public void setmonhoc(String monhoc)
    {
        this.monhoc = monhoc;
    }
    
    public void setTime(int time) throws Exception
    {
        if (time < 1 || time > 3) {
        throw new Exception("Địa chỉ không hợp lệ. Chỉ được phép nhập các giá trị từ 1 đến 3.");
        }
    }
    
    
    
    public void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon mon hoc:  ");
        monhoc = sc.nextLine();
        
        System.out.println("Chon thoi gian:1 ; 2 ; 3 ");
        System.out.println("Cac moc thoi gian: \n"
                + "  sang  1.7h-9h30 ; 2.10h-12h30  \n"
                + "  chieu 3.1h-3h30 ");
        time = Integer.parseInt(sc.nextLine());
        
        System.out.println("nhap dia diem: ");
        address = sc.nextLine();  
        
       
    }
    
    public void xuatthongtin()
    {
        System.out.println("Mon hoc: " + monhoc + ", Thoi gian: " + time + ", Đia diem: " + address);
    }
            
    @Override
      public String toString() {
        return "Môn học: " + monhoc + ", Thời gian: " + time + ", Địa điểm: " + address;
    }
    
}
