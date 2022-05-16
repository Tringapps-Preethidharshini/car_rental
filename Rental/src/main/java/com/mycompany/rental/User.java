/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rental;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

public class User {

    Scanner s = new Scanner(System.in);
    Scanner c = new Scanner(System.in);
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> password = new ArrayList<>();
    static ArrayList<String> new_name = new ArrayList<>();
    static ArrayList<String> new_password = new ArrayList<>();
    ArrayList<String> Show_category = new ArrayList<>();
    ArrayList<String> Show_rent = new ArrayList<>();
    static ArrayList<Car> car_info = new ArrayList<Car>();
    int login;
    static int approve;
    int login_new;
    int login_signup;
    int exit;

    void login_sign_up() {
        System.out.println("Do you want to 1.Login or 2.Sign up");
        login_signup = c.nextInt();
        if (login_signup == 1) {

            User_Login();
        } else {
            Sign_up();
        }
    }

    void User_Login() {

        login = 0;
        System.out.println("*********LOGIN*********");
        System.out.println("Enter Name");
        for (int i = login; i <= login; i++) {
            name.add(s.next());
        }
        System.out.println("Enter Password");
        for (int i = login; i <= login; i++) {
            password.add(s.next());
        }

        login++;

        for (int i = 0; i < name.size(); i++) {
            if (new_name.get(i).equals(name.get(i)) && new_password.get(i).equals(password.get(i))) {
                User_operation();
            } else {
                System.out.println("Invalid Input");
                return;
            }

        }

    }

    public void Sign_up() {

        System.out.println("*******Sign up*******");
        System.out.println("Enter your name :");
        for (int i = login; i <= login; i++) {
            new_name.add(s.next());
        }

        System.out.println("Enter your password");
        for (int i = login; i <= login; i++) {
            new_password.add(s.next());
        }

        login++;

        User_Login();

    }

    public void User_operation() {

        for (int i = 0; i <= new_name.size(); i++) {
            if (Admin.allow[i] == i + 1) {

                Browse();

                int Choice;
                while (true) {
                    System.out.println("*******Choose********");
                    System.out.println("1.Rent Option");
                    System.out.println("2. Pay Rent");
                    System.out.println("3.Log Out");
                    System.out.println("Enter your Choice");
                    Choice = c.nextInt();
                    switch (Choice) {
                        case 1:
                            Rent_option();
                            break;
                        case 2:
                            Pay_rent();
                            break;
                        case 3:
                            Rental.main(null);
                            break;

                        default:
                            System.out.println("Invalid Input");
                            break;
                    }

                }

            }

            else {

                Browse();

                System.out.println("Do you want to exit.......");
                System.out.println("1.Yes/2.No");
                exit = s.nextInt();
                switch (exit) {
                    case 1:
                        return;
                    case 2:
                        System.out.println("Wait Until the user Approve you");
                        break;
                    default:
                        System.out.println("Invalid Input");

                }

            }
        }
    }

    public int start_date;
    public int end_date;

    public void Browse() {
        int count = 0;
        int count2 = 0;
        System.out.println("********BROWSE HERE*******");

        boolean found = false;

        System.out.println("Enter your pickup location:");
        String browse_pickup = s.next();
        System.out.println("Enter your starting date:");
        String browse_start_date = s.next();

        String User_start_date[] = browse_start_date.split("/");
        start_date = Integer.parseInt(User_start_date[0]);
        // int start_month = Integer.parseInt(start_date[1]);
        // int start_year = Integer.parseInt(start_date[2]);

        System.out.println("Enter your ending date:");
        String browse_end_date = s.next();
        String User_end_date[] = browse_end_date.split("/");
        end_date = Integer.parseInt(User_end_date[0]);
        // int end_month = Integer.parseInt(end_date[1]);
        // int end_year = Integer.parseInt(end_date[2]);
        System.out.println(browse_pickup);
        System.out.println(start_date);
        System.out.println(end_date);
        for (Car info : car_info) {
            count2++;
            System.out.println(info.New_pick_up);
            System.out.println(info.date);
            if (info.New_pick_up.equals(browse_pickup) && (start_date <= info.date) &&
                    (end_date >= info.date)) {
                count += count2++;
                count -= 1;
                System.out.println(car_info.get(count));

            }
        }

        /*
         * Iterator<Car> info = car_info.iterator();
         * 
         * while (info.hasNext()) {
         * System.out.println("hi");
         * Car item = info.next();
         * String pickup_location = item.New_pick_up();
         * int check_date = item.date();
         * System.out.println(item);
         * System.out.println(pickup_location);
         * System.out.println(check_date);
         * }
         * 
         * 
         * Iterator<Car> information = car_info.iterator();
         * 
         * while (information.hasNext()) {
         * System.out.println("hi");
         * Car item = information.next();
         * String pickup_location = item.New_pick_up();
         * int check_date = item.date();
         * System.out.println(item);
         * System.out.println(pickup_location);
         * System.out.println(check_date);
         * 
         * if (pickup_location.equals(browse_pickup) && (start_date <= check_date) &&
         * (end_date >= check_date)) {
         * System.out.println(item);
         * found = true;
         * }
         * 
         * }
         */
        if (!found) {
            System.out.println("The Car if not found");
        }

    }

    public void Rent_option() {

    }

    public void Pay_rent() {

    }

}
