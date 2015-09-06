/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gms.model;

/**
 *
 * @author janaka
 */
public class Person_details_model {

    private int person_id;
    private String fname;
    private String lname;
    private String contact;
    private String email;
    private String password;

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public Person_details_model() {
    }

    public Person_details_model(int person_id, String fname, String lname, String email, String contact, String password) {
        this.person_id = person_id;
        this.fname = fname;
        this.lname = lname;
        this.contact = contact;
        this.email = email;
        this.password = password;
    }

    public String getFname() {
        System.out.println("fsdfs,nvsd");
        return fname;
    }

    public void setFname(String fname) {
        System.out.println("fsdfs,nvsd");
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
