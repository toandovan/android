package com.example.androideatitserver.Model;

public class User {

    private  String Name,Password,Phone,IsStaff;

    public User(String name,String password){
        Name=name;
        Password=password;
    }
    public User(){

    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public void setIsStaff(String isStaff) {
        IsStaff = isStaff;
    }

    public String getIsStaff() {
        return IsStaff;
    }
}
