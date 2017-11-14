package com.homeShop.customer;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private int phone;
    private String eMail;
    private String sex;
    private String address;
    private String password;
    private String nick;

    /*public Customer(int id, String firstName, String lastName, int phone, String eMail, String sex, String address, String password, String nick) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.eMail = eMail;
        this.sex = sex;
        this.address = address;
        this.password = password;
        this.nick = nick;
    }

    public Customer(String firstName, String lastName, int phone, String eMail, String sex, String address, String password, String nick) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.eMail = eMail;
        this.sex = sex;
        this.address = address;
        this.password = password;
        this.nick = nick;
    }*/
}
