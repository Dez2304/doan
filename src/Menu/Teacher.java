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
public class Teacher {

    int id;
    String name;

    public Teacher(String name,int id ) {
        this.name = name;
        this.id = id;

    }

    public Teacher() {
    }

    public int getMssv() {
        return id;
    }

    public void setMssv(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputteacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teacher Fullname:");
        name = sc.nextLine();
        System.out.println("Enter teacher ID:");
        id = Integer.parseInt(sc.nextLine());
    }

    public void outputteacher() {
        System.out.println(id + "\t" + name);
    }

    @Override
    public String toString() {
        return id + "\t" + name;
    }

}
