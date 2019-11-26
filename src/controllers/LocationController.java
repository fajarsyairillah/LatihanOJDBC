/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.LocationDao;
import java.util.List;
import models.Location;

/**
 *
 * @author Rizky
 */
public class LocationController {
    private LocationDao locdao;
    
    /**
     * memanggil LocationDao agar bisa di load di controller
     */
    public LocationController() {
        this.locdao = new LocationDao();
    }

    /**
     * memanggil LocationDao agar bisa di load di controller
     */
    public LocationController(LocationDao locdao) {
        this.locdao = locdao;
    }
    
    /**
     * fungsi parsing create data
     * @param location parameter dari model location.java
     * @return tampilan berhasil atau tidak dalam eksekusi data
     */
    public String create(String id, String street, String postal, String city, 
            String state, String country){
        return this.locdao.createLocation(new Location(Integer.parseInt(id), street, postal, city, state, country)) ?
                "Success to create new location" : "Failed Create Data!";
    }
    
    /**
     * fungsi parsing update data
     * @param location parameter dari model location.java
     * @return tampilan berhasil atau tidak dalam eksekusi data
     */
    public String update(String id, String street, String postal, String city, 
            String state, String countryname){
        return this.locdao.updateLocation(new Location(Integer.parseInt(id), 
                street, postal, city, state, countryname)) ?
                "Success Update Data Location" : "Failed Update Data!";
    }
    
    /**
     * fungsi parsing delete data
     * @param location parameter dari model location.java
     * @return tampilan berhasil atau tidak dalam eksekusi data
     */
    public String delete(String id){
        return this.locdao.deleteLocation(new Location(Integer.parseInt(id)))?
                "Success Delete Data Location" : "Failed Delete Data!";
    }
    
    /**
     * controller untuk menampilkan data
     * @return data location dari daos
     */
    public List<Location> getAll(){
        return this.locdao.selectJoinLocations();
    }
    
//    public List<Location> getAllJoin(){
//        return this.locdao.selectJoinLocations();
//    }
    
    /**
     * controller untuk menampilkan data sesuai id inputan
     * @param location parameter dari model location.java
     * @return dta location dari daos sesuai id inputan
     */
    public Location selectId(String id){
        return this.locdao.selectLocById(new Location(Integer.parseInt(id)));
        
    }
    
    /**
     * controller untuk menampilkan data sesuai inputan
     * @param key parameter pencarian
     * @return data location sesuai inputan
     */
    public List<Location> searchLoc(String key){
        return this.locdao.searchLocation(key);
    }
    
}
