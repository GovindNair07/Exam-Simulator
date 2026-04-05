/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring.hib.soft;


/**
 *
 * @author govindnair
 */
public class Student {
    
    private String id;
    private String password;
    private String fullName;
    private String Course;
    private String contact;
    private String dob;
    private String Country;
    private String city;
    private String Address;
    private String mailid;

    public Student(String id, String password, String fullName, String Course, String contact, String dob, String Country, String city, String Address, String mailid) {
        this.id = id;
        this.password = password;
        this.fullName = fullName;
        this.Course = Course;
        this.contact = contact;
        this.dob = dob;
        this.Country = Country;
        this.city = city;
        this.Address = Address;
        this.mailid = mailid;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }


   
}
