/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rental;

import java.util.Scanner;

public class Rental {

    static Scanner c = new Scanner(System.in);

    public static void main(String[] args) {

        Admin Admin_obj = new Admin();
        User User_obj = new User();
        while (true) {
            System.out.println("*********CAR RENTAL*********");
            System.out.println("1.Admin");
            System.out.println("2.User");
            System.out.println("3.Exit");
            System.out.println("Enter your Choice");
            int Admin_or_User = c.nextInt();
            switch (Admin_or_User) {
                case 1:
                    Admin_obj.Admin_Login();
                    break;
                case 2:
                    User_obj.login_sign_up();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}