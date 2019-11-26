/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Country;
import tools.Connections;

/**
 *
 * @author Rizky
 */
public class CountryDao {
    
    private Connection connection;

    public CountryDao(Connection connection) {
        this.connection = connection;
    }

    public CountryDao() {
        this.connection = new Connections().getConnection();
    }
    
    public List<Country> selectCountries(){
        List<Country> countries = new ArrayList<>();
        String query = "SELECT * FROM COUNTRIES";
        try {
            PreparedStatement ps = this.connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Country country = new Country();
                country.setId(rs.getString("country_id"));
                country.setName(rs.getString("country_name"));
                country.setReg_id(rs.getInt("region_id"));
                countries.add(country);
                
            }
        } catch (Exception e) {
        }
        return countries;
    }
    
    
    
}
