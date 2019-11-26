/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


/**
 *
 * @author Rizky
 */
public class Location {
    
    private int id;
    private String street,postal,city,state,countryid,countryname;

    public Location() {
    }
    
    

    public Location(int id) {
        this.id = id;
    }

    public Location(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public Location(int id, String street, String postal, String city, String state, String countryid) {
        this.id = id;
        this.street = street;
        this.postal = postal;
        this.city = city;
        this.state = state;
        this.countryid = countryid;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
    
    
    
    
}
