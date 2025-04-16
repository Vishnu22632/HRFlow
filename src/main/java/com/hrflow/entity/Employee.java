package com.hrflow.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Vishnu
 */
@Entity
@Table(name = "employee")
public class Employee extends AbstractEntityChangeTracker {

    @Column(name="name")
    private String name;

    @Column(name="code")
    private String code;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="gender")
    private String gender;

    @Column(name="dob")
    private Date dob;

    @Column(name="joining_date")
    private Date joiningDate;

    @Column(name="citizenShip")
    private String citizenShip;

    @Column(name="prev_comp_name")
    private String prevCompanyName;

    @Column(name="pf_number")
    private String pfNumber;

    @Column(name="salary")
    private BigDecimal salary;

    @Column(name="curr_address")
    private String currentAddress;

    @Column(name="perm_address")
    private String permanentAddress;

    @Column(name="active")
    private Boolean active = Boolean.FALSE;

    public Employee() {
    }

    public Employee(String name, String code, String email, String phone, String gender, Date dob, Date joiningDate, String citizenShip, String prevCompanyName, String pfNumber, BigDecimal salary, String currentAddress, String permanentAddress) {
        this.name = name;
        this.code = code;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.dob = dob;
        this.joiningDate = joiningDate;
        this.citizenShip = citizenShip;
        this.prevCompanyName = prevCompanyName;
        this.pfNumber = pfNumber;
        this.salary = salary;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getCitizenShip() {
        return citizenShip;
    }

    public void setCitizenShip(String citizenShip) {
        this.citizenShip = citizenShip;
    }

    public String getPrevCompanyName() {
        return prevCompanyName;
    }

    public void setPrevCompanyName(String prevCompanyName) {
        this.prevCompanyName = prevCompanyName;
    }

    public String getPfNumber() {
        return pfNumber;
    }

    public void setPfNumber(String pfNumber) {
        this.pfNumber = pfNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "" + getId();
    }

}
