package com.example.lab3;

public class User {
    public String first_name;
    public String last_name;
    public String phone_number;

    //getter Method
    public String getFirst_Name() {
        return first_name;
    }
    public String getLast_Name() {
        return last_name;
    }
    public String getPhone_Number() {
        return phone_number;
    }

    //setter Method
    public void setFirst_Name(String First_Name){
        this.first_name = First_Name;
    }
    public void setLast_Name(String Last_Name){
        this.last_name = Last_Name;
    }
    public void setPhone_Number(String phone_Number) {
        this.phone_number = phone_Number;
    }

    //Method
    public void view_profile() {
        System.out.println(first_name);
        System.out.println(last_name);
        System.out.println(phone_number);
    }
}