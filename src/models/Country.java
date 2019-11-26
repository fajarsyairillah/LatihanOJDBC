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
public class Country {
    
    private String id, name;
    private int reg_id;

    public Country(String id, String name, int reg_id) {
        this.id = id;
        this.name = name;
        this.reg_id = reg_id;
    }

    public Country() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReg_id() {
        return reg_id;
    }

    public void setReg_id(int reg_id) {
        this.reg_id = reg_id;
    }
    
    
    
    
            
    
}
