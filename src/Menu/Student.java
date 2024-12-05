/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Student {

    String name;
    int mssv;

    public Student() {
        
    }

    public Student(String name, int mssv) {
        this.name = name;
        this.mssv = mssv;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student Fullname: ");
        this.name = scanner.nextLine();
        System.out.print("Enter student MSSV: ");
        this.mssv = scanner.nextInt();

    }

    public String getName() {
        return name;
    }

    public int getMssv() {
        return mssv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public void output() {
        System.out.println(mssv + "\t" + name);
    }

    @Override
    public String toString() {
        return mssv + "\t " + name;
    }

}
