/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CountryDao;
import java.util.List;
import models.Country;

/**
 *
 * @author Rizky
 */
public class CountryController {
    private CountryDao countryDao;

    public CountryController() {
        this.countryDao = new CountryDao();
    }

    public CountryController(CountryDao countryDao) {
        this.countryDao = countryDao;
    }
    
    public List<Country> getAll(){
        return this.countryDao.selectCountries();
    }
    
    
}
