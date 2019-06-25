package com.backend.metalink.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class MetaLinkUser {
	@Id
	@GeneratedValue
	private int userId;
	private String password;
	private String username;
	private String email;
	private String secondemail;
	private String phone;
	private String secondphone;
	private String status;
	private String macaddress;
	private String ipaddress;
	private String accounttype;

	private String firstname;
	private String lastname;
	private String dob;
	private String address;
	private String district;

	private String zone;

	private String state;
	private String city;
	private String zip;
	private String companyname;
	private String companyaddress;
	private String monthlysalary;
	private String monthlyexpense;
	@Lob
    private String customerimage;


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSecondemail() {
		return secondemail;
	}

	public void setSecondemail(String secondemail) {
		this.secondemail = secondemail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSecondphone() {
		return secondphone;
	}

	public void setSecondphone(String secondphone) {
		this.secondphone = secondphone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMacaddress() {
		return macaddress;
	}

	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getCustomerimage() {
		return customerimage;
	}

	public void setCustomerimage(String customerimage) {
		this.customerimage = customerimage;
	}

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
