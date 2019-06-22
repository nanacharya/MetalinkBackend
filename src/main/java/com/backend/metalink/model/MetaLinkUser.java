package com.backend.metalink.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MetaLinkUser {
    @Id
    @GeneratedValue
    private int userId;
    private String firstname;
    private String lastname;
    private String dob;
    private String state;
    private String city;
    private String zip;
    private String companyname;
    private String companyaddress;
    private String monthlysalary;
    private String monthlyexpense;

    public int getUserId() {
        return userId;
    }

    public MetaLinkUser setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public MetaLinkUser setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public MetaLinkUser setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getDob() {
        return dob;
    }

    public MetaLinkUser setDob(String dob) {
        this.dob = dob;
        return this;
    }

    public String getState() {
        return state;
    }

    public MetaLinkUser setState(String state) {
        this.state = state;
        return this;
    }

    public String getCity() {
        return city;
    }

    public MetaLinkUser setCity(String city) {
        this.city = city;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public MetaLinkUser setZip(String zip) {
        this.zip = zip;
        return this;
    }

    public String getCompanyname() {
        return companyname;
    }

    public MetaLinkUser setCompanyname(String companyname) {
        this.companyname = companyname;
        return this;
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public MetaLinkUser setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress;
        return this;
    }

    public String getMonthlysalary() {
        return monthlysalary;
    }

    public MetaLinkUser setMonthlysalary(String monthlysalary) {
        this.monthlysalary = monthlysalary;
        return this;
    }

    public String getMonthlyexpense() {
        return monthlyexpense;
    }

    public MetaLinkUser setMonthlyexpense(String monthlyexpense) {
        this.monthlyexpense = monthlyexpense;
        return this;
    }
}
