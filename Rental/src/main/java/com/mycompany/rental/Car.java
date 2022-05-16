package com.mycompany.rental;

public class Car {
    Object Car_info;
    String New_car;
    String Mileage;
    String New_pick_up;
    String manufature_date;
    int date;

    public Car(Object Car_info, String New_car, String Mileage, String New_pick_up, String manufature_date,
            int date) {
        this.Car_info = Car_info;
        this.New_car = New_car;
        this.Mileage = Mileage;
        this.New_pick_up = New_pick_up;
        this.manufature_date = manufature_date;
        this.date = date;
    }

    public Object Car_info() {
        return Car_info;
    }

    public String New_car() {
        return New_car;
    }

    public String Mileage() {
        return Mileage;
    }

    public String New_pick_up() {
        return New_pick_up;
    }

    public String manufature_date() {
        return manufature_date;
    }

    public int date() {
        return date;
    }

    public String toString() {
        return "Car_info" + " " + Car_info + "\n" + "New_car" + " " + New_car + "\n" + " Mileage" + " " + Mileage + "\n"
                + "New_pick_up" + " " + New_pick_up + "\n" + "manufature_date" + " " + manufature_date + "\n"
                + "date" + " " + date + "\n";
    }

}
