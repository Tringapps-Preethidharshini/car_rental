/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rental;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DLIB
 */
public class Admin extends User {
    Scanner s = new Scanner(System.in);
    Scanner c = new Scanner(System.in);
    static ArrayList<String> category = new ArrayList<>();
    static ArrayList<String> rent = new ArrayList<>();
    ArrayList<String> pickup = new ArrayList<>();
    public static ArrayList<Car> Car_details = new ArrayList<Car>();
    static ArrayList<Car> Car_info = new ArrayList<Car>();
    static int[] allow = new int[50];
    int category_rent = 0;
    int Choose_category;
    String approve;
    // static int allow;
    int found = 0;
    int quantity = 0;

    public void Admin_Login() {
        System.out.println("*********LOGIN*********");
        String user_name = "preethi";
        String pass_word = "180804";
        System.out.println("Enter the username:");
        String admin_name = s.nextLine();
        System.out.println("Enter the password:");
        String admin_password = s.nextLine();
        if (user_name.equals(admin_name) && pass_word.equals(admin_password)) {
            Admin_operation();
        } else {
            System.out.println("Invalid input");
        }
    }

    public void Admin_operation() {
        int choice;
        while (true) {
            System.out.println("*********ADMIN********");
            System.out.println("1. Add category");
            System.out.println(" 2. Add pickup locations ");
            System.out.println("3. Add Cars");
            System.out.println("4. Update pickup location ");
            System.out.println("5. Delete Cars Validate ");
            System.out.println("6. Set penalty ");
            System.out.println("7. Approve user");
            System.out.println("8. Extend rental ");
            System.out.println("9. upgrade car category");
            System.out.println("10. Update current date, all business log ");
            System.out.println("11.Logout");
            System.out.println("enter your choice:");
            choice = c.nextInt();
            switch (choice) {
                case 1:
                    Add_category();
                    break;
                case 2:
                    Add_pickup_loc();
                    break;
                case 3:
                    Add_Cars();
                    break;
                case 4:
                    Add_Pickup_loc();
                    break;
                case 5:
                    Add_Del_car();
                    break;
                case 6:
                    Set_penalty();
                    break;
                case 7:
                    Approve_user();
                    break;
                case 8:
                    Extend_rental();
                    break;
                case 9:
                    Update_car_catagory();
                    break;
                case 10:
                    Update_date();
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Invalid Input");
            }
        }

    }

    void Add_category() {
        System.out.println("Enter Category");
        for (int i = category_rent; i <= category_rent; i++) {
            category.add(s.next());
        }
        System.out.println("Enter the Rent");
        for (int i = category_rent; i <= category_rent; i++) {
            rent.add(s.next());
        }

        for (int j = 0; j < category.size(); j++) {
            System.out.println(category.get(j));
            System.out.println(rent.get(j));
        }
        category_rent++;
    }

    void Add_pickup_loc() {
        category_rent = 0;
        System.out.println("Enter Pick Up Location");
        for (int i = category_rent; i <= category_rent; i++) {
            pickup.add(s.next());
        }
        category_rent++;

        for (int j = 0; j < pickup.size(); j++) {
            System.out.println(pickup.get(j));
        }

    }

    void Add_Cars() {
        System.out.println("******Category********");
        for (int i = 0; i < category.size(); i++) {
            System.out.print(category.get(i));
            System.out.println(rent.get(i));
        }
        category_rent++;
        System.out.println("Choose Which category you want :");
        Choose_category = c.nextInt();
        for (int j = 0; j < category.size(); j++) {
            if (Choose_category == j + 1) {
                System.out.println("Enter Cars model");
                String New_car = s.next();

                System.out.println("Enter Average mileage");
                String Mileage = c.next();

                System.out.println("Enter Manufature date");
                String manufature_date = s.next();
                user_date(manufature_date);

                System.out.println("Enter pick up Location");
                String New_pick_up = s.next();

                System.out.println("Availabilty date");
                String availabilty_date = s.next();
                user_date(availabilty_date);

                // System.out.println(New_car);
                // System.out.println(Mileage);
                // System.out.println(New_pick_up);
                // System.out.println(availabilty_date);

                Car_details.add(
                        new Car(Car_details, New_car, Mileage, New_pick_up, manufature_date, date));

            }

            else {
                found = 1;
            }
            /*
             * int l = 0;
             * if (l == 0) {
             * System.out.println("hello");
             * Iterator<Car> info = car_info.iterator();
             * 
             * while (info.hasNext()) {
             * System.out.println(info.next());
             * }
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
             * }
             */

        }
        if (found == 1)
            System.out.println("Invalid Entry");

    }

    public int date;
    public int month;
    public int year;

    public String user_date(String split_date) {
        String date_array[] = split_date.split("/");
        date = Integer.parseInt(date_array[0]);
        month = Integer.parseInt(date_array[1]);
        year = Integer.parseInt(date_array[2]);
        boolean isLeap = false;
        if ((year % 4 == 0 && year % 400 == 0)) {
            isLeap = true;
        }
        int no_of_days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                no_of_days = 31;
                break;
            case 4:
            case 6:
            case 9:
                no_of_days = 30;
                break;
            case 2:
                no_of_days = (isLeap) ? 29 : 28;
                break;
        }
        if (date <= no_of_days) {
            System.out.println("valid date");
        } else {
            System.out.println("Please Enter valid date");
        }
        return split_date;
    }

    void Add_Pickup_loc() {

    }

    void Add_Del_car() {

    }

    void Set_penalty() {

    }

    int loop_value = 0;

    void Approve_user() {

        System.out.println("List of Users");
        for (int j = 0; j < new_name.size(); j++) {
            System.out.print(j + 1 + "." + new_name.get(j));
            System.out.println("-" + new_password.get(j));
        }
        System.out.println("Do you want to Approve the User.....?");
        System.out.println("1.Yes \n 2.No");
        int exit = c.nextInt();
        if (exit == 2) {
            return;
        } else {
            System.out.println("Select the User:");
            for (int k = loop_value; k <= loop_value; k++) {
                allow[k] = s.nextInt();
            }
            System.out.println("User are approved");
        }
    }

    void Extend_rental() {

    }

    void Update_car_catagory() {

    }

    void Update_date() {

    }

    static void Show_category() {

        for (int j = 0; j < category.size(); j++) {
            System.out.println(category.get(j));
            System.out.println(rent.get(j));
        }

    }

}
