package com.MacbookStore.model;

//import com.sun.source.tree.BinaryTree;

import java.util.Date;

public class Customer {

    public int CustomerID;

    public String FirstName;

    public String LastName;

    public String Account ;

    public String Password;

    public String Email;

    public Date Birth;

    public String  Address;

    public String PhoneNumber;


    public Customer() {

    }

    public Customer(int CustomerID, String FirstName, String LastName, String Account, String Password, String Email, Date Birth, String Address, String PhoneNumber) {
        this.CustomerID = CustomerID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Account = Account;
        this.Password = Password;
        this.Email = Email;
        this.Birth = Birth;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }

}
