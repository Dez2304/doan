/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class menuthoikhoabieu {

    /**
     * @param args the command line arguments
     * @param sv
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Login lg = new Login();
        boolean exit1 = false;
        boolean exit2 = false;
        while (!exit1) {
            System.out.println("==== MENU LOGIN & REGISTER ====");
            System.out.println("1. login");
            System.out.println("2. register");
            System.out.println("3. exit");
            System.out.print("Please choose (1-3): ");
            int choice1 = sc.nextInt();
            sc.nextLine();
            switch (choice1) {
                case 1:
                    lg.MenuLogin();
                   
                    while (!exit2) {
                        System.out.println();
                        System.out.println("--- MENU ---");
                        System.out.println("1. Dang ki mon hoc");
                        System.out.println("2. Xoa mon hoc");
                        System.out.println("3. Hien thi thoi khoa bieu");
                        System.out.println("4. exit");
                        System.out.print("Please choose (1-4): ");

                        int choice2 = sc.nextInt();
                        sc.nextLine();
                        switch (choice2) {
                                case 1:
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("MSSV:" + "\t" + "\t" + "Ho va Ten:");
                               
                                System.out.println("Thoi khoa bieu cua ban:");
                                break;
                            case 4:
                                System.out.println("Cam on ban da dung phan mem nay");
                                exit2 = true; // Thoát khỏi chương trình
                                break;
                            default:
                                System.out.println("Nhap so sai vui lòng nhap lai");
                                break;

                        }

                    }
                    break;
                case 2:
                    lg.MenuRegister();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    exit1 = true; // Thoát khỏi chương trình
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }

            System.out.println("\n");

        }
    }
}
