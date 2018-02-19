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
    private int address;
    private String password;
    private String nick;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int phone, String eMail, String sex, int address, String password, String nick) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.eMail = eMail;
        this.sex = sex;
        this.address = address;
        this.password = password;
        this.nick = nick;
    }
    public Customer(String firstName, String lastName, int phone, String eMail, String sex, String password, String nick) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.eMail = eMail;
        this.sex = sex;
        this.password = password;
        this.nick = nick;
    }
}
